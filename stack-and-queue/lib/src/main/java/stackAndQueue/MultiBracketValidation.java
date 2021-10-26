package stackAndQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultiBracketValidation {

    public static boolean validateBrackets(String input){
        if (input.length()==0)return true;   //edge case

        Pattern openBracket = Pattern.compile("[\\{\\(\\[]");
        Pattern closeBracket = Pattern.compile("[\\}\\)\\]]");
        Pattern matchBrackets = Pattern.compile("(\\{\\})|(\\[\\])|(\\(\\))");

        Stack<Character> stackOfChar = new Stack<>();

        for (int i = 0; i < input.length() ; i++) {
            char ch = input.charAt(i);
            if(openBracket.matcher(ch+"").find()){
                stackOfChar.push(ch);
            } else if (closeBracket.matcher(ch+"").find()) {
                if (stackOfChar.isEmpty()) {
                    return false;
                } else {
                    char currentOpenBracket = stackOfChar.pop();
                    String currentBrackets = currentOpenBracket + "" + ch;
                    if (matchBrackets.matcher(currentBrackets).find())
                        continue;
                    return false;
            }}}
        if(stackOfChar.isEmpty()) {
            return true;
        }else {
            return false;
        }}}

