package graph;

import java.util.*;
import java.util.stream.Collectors;

public class Graph <T> {

    private List<Node> vertices = new ArrayList<>();
    private HashMap<T,Integer> dictionary = new HashMap<>();
    private int size = 0 ;


    public Node addNode (T value){
        int index;
        if (isNodeExist(value)){
            index = dictionary.get(value);
        }
        else {
            dictionary.put(value, this.size);
            Node newNode = new Node(value);
            vertices.add(newNode);
            index = this.size;
            this.size++;
        }
        return vertices.get(index);
    }

    public void addEdge( T value1, T value2, int weight) throws NodeNotFoundException {
        if( isNodeExist(value1) && isNodeExist(value2)){
            int indexOfNode1 = dictionary.get(value1);
            int indexOfNode2 = dictionary.get(value2);
            Node node1 = vertices.get(indexOfNode1);
            Node node2 = vertices.get(indexOfNode2);
            Neighbor neighborForNode1 = new Neighbor(node2,weight);
            Neighbor neighborForNode2 = new Neighbor(node1,weight);
            node1.addNeighbor(neighborForNode1);
            node2.addNeighbor(neighborForNode2);
        }
        else {
            throw new NodeNotFoundException("\n---------------------------------------------\n!!---  one of the following nodes or both of them are not found! : ( "
                    + value1.toString() +", "+value2.toString()+" ) ---!! \n --------------------------------------------\n");
        }
    }

    private boolean isNodeExist(T value){
        return dictionary.containsKey(value);
    }

    public List<Neighbor> getNeighbors(T value) throws NodeNotFoundException {
        if (isNodeExist(value)){
            int index = dictionary.get(value);
            Node currentNode = vertices.get(index);
            return currentNode.getNeighbors();
        }
        else{
            throw new NodeNotFoundException("\n---------------------------------------------\n!!---  Node: (" + value.toString() + "), not found!  ---!! \n --------------------------------------------\n");
        }
    }

    ////// code challenge Bf**************************
    public List<String> BFT(T root) throws NodeNotFoundException {
        if( nodeNotFound(root) )
            throw new NodeNotFoundException("Node not found..( "+root.toString()+" )!");
        Set<T> visited = new HashSet<>();
        List<String> output = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        Node rootNode = getNode(root);
        queue.add(rootNode);
        visited.add((T)rootNode.getValue());

        while( ! queue.isEmpty()){
            Node node = queue.poll();
            output.add(node.getValue().toString());

            List<Neighbor> neighbors = node.getNeighbors();
            Iterator<Neighbor> neighborsItr = neighbors.iterator();

            while(neighborsItr.hasNext()){

                Node neighborNode = neighborsItr.next().getNode();
                if(visited.contains(neighborNode.getValue())){
                    continue;
                }
                queue.add(neighborNode);
                visited.add((T)neighborNode.getValue());
            }
        }
        return output;
    }

    private Node getNode(T node) throws NodeNotFoundException {

        if( nodeNotFound(node) )
            throw new NodeNotFoundException("Node not found..( "+node.toString()+" )!");

        int index = dictionary.get(node);
        return  vertices.get(index);
    }
    private boolean nodeNotFound(T root) {
        return  ! dictionary.containsKey(root);
    }

    ////// code challenge Bf*******************************************

    ////// code challenge business trip*******************************************
    public String businessTrip(T[] cityNames) throws NodeNotFoundException {
        int cost = 0 ;
        if(cityNames.length <=1)
            return "False, $0";

        for(int i = 0 ; i < cityNames.length -1; i++) {

            Node sourceNode = getNode(cityNames[i]);
            Node destNode = getNode(cityNames[i+1]);

            Neighbor edge = getEdge(sourceNode, destNode);
            if ( edge == null)
                return "False, $0";

            cost += edge.getWeight();
        }
        return "True, $"+cost;
    }


    private Neighbor getEdge(Node sourceNode, Node destNode) {

        int indexOfEdge = isThereDirectFlightbetweenTheCity(sourceNode, destNode);
        if(indexOfEdge == -1)
            return null;
        else {
            Neighbor edge = (Neighbor) (sourceNode.getNeighbors().get(indexOfEdge));
            return edge;
        }
    }

    private int isThereDirectFlightbetweenTheCity(Node sourceNode, Node destNode) {
        List<Neighbor> neighborsOfSource = sourceNode.getNeighbors(); // git neigbor list for the source city
        List<Node> nodes = neighborsOfSource.stream().map(Neighbor::getNode).collect(Collectors.toList()); // to collect the nodes from the list of neighbors
        return nodes.indexOf(destNode); // it returns -1 if the element not in the list
    }
    ////// code challenge business trip*******************************************

    ////// code challenge graph-depth-first*******************************************
    public List<T> DFT(T root) throws NodeNotFoundException {
        if(nodeNotFound(root))
            return null;
        List<T> visited = new ArrayList<T>();
        visited = DFT(root, visited);
        return visited;
    }
    private List<T> DFT(T root, List<T> visited) throws NodeNotFoundException {
        visited.add(root);
        Node currentNode = getNode(root);
        List<Neighbor> neighbors = currentNode.getNeighbors();
        List<Node> nodes = neighbors.stream().map(n->n.getNode()).collect(Collectors.toList());
        Iterator<Node> nodesItr = nodes.iterator();
        while(nodesItr.hasNext()){
            Node<T> node = nodesItr.next();
            if(visited.contains(node.getValue()))
                continue;
            DFT(node.getValue(), visited);
        }
        return visited;
    }
    ////// code challenge graph-depth-first*******************************************


    public List<Node> getNodes() {
        return vertices;
    }

    public int getSize() {
        return size;
    }

    private boolean graphIsEmpty() {
        return this.size ==0;
    }
}
