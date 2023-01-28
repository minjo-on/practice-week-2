/*
import java.util.Scanner;

public class InfixToPostfixConversion {
    public String evaluatePostfix(String postfixLine){
        String dab = "";
        ArrayStack stack = new ArrayStack(100);
        Scanner scan = new Scanner(postfixLine);
        while(scan.hasNext()){
            String find_token = scan.next();
            if(isStringDouble(find_token))
                dab += find_token+" ";
            else if(find_token.equals("+") || find_token.equals("-")){
                if(!stack.empty()&&!stack.peek().equals("(")){
                    while(!stack.empty()){
                        Object temp = stack.pop();
                        if(temp.equals("(")){
                            stack.push("(");
                            break;
                        }
                        dab += temp+" ";
                    }
                }
                stack.push(find_token);
            }
            else if(find_token.equals("*")||find_token.equals("/")){
                if(!stack.empty()&&(stack.peek().equals("*")||stack.peek().equals("/"))){
                    while(!stack.empty()){
                        Object temp = stack.pop();
                        if(temp.equals("(")){
                            stack.push("(");
                            break;
                        }
                        else if(temp.equals("-")){
                            stack.push("-");
                            break;
                        }
                        else if(temp.equals("+")){
                            stack.push("+");
                            break;
                        }
                        dab += temp+" ";
                    }
                }
                stack.push(find_token);
            }
            else if(find_token.equals("(")){
                stack.push(find_token);
            }
            else if(find_token.equals(")")){
                Object temp;
                while(true){
                    temp = stack.pop();
                    if(temp.equals("("))
                        break;
                    dab += temp + " ";
                }
            }
        }
        while(!stack.empty())
            dab += stack.pop()+" ";
        return dab;
    }

    public static boolean isStringDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
*/


/*
import java.io.File;
        import java.io.FileNotFoundException;
        import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String postfixLine;
        PostfixEvaluation postfixEval; // PostfixEvaluation 클래스 사용
        double result;
        Scanner inFile = null;
        try {
            inFile = new Scanner(new File("input.txt"));
        }
        catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
            System.exit(1);
        }
        while (inFile.hasNextLine()) {
            postfixLine = inFile.nextLine();
            System.out.println(postfixLine);
            InfixToPostfixConversion postfix = new InfixToPostfixConversion();
            postfixLine = postfix.evaluatePostfix(postfixLine);
            System.out.println("==> "+postfixLine);
            postfixEval = new PostfixEvaluation();
            result = postfixEval.evaluatePostfix(postfixLine);
            if(result != 0)
                System.out.printf("= %.2f\n", result);
            System.out.println();
        }
        inFile.close();
    }
}
*/