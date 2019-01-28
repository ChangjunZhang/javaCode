import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        String oStr = "How Are you";
        String[] strs = oStr.split(" ");
        Stack<String> strStack =  new Stack<>();
        for (String str:strs) {
            strStack.push(str);
        }
        while (!strStack.isEmpty()) {
            System.out.print(strStack.pop()+" ");
        }

    }
}
