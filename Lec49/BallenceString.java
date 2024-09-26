package Lec49;
import java.util.Stack;
public class BallenceString {
    public static void main(String[] args) {
                System.out.println(balancedString("if(a(4)>9){foo(a(2));}"));        // Output: -1
                System.out.println(balancedString("for(i=0;i<a(3};i++){foo{);)")); // Output: 13
                System.out.println(balancedString("while(true)foo();}{()"));       // Output: 17
                System.out.println(balancedString("if(x){"));                       // Output: 6
            }
            public static int balancedString(String code) {
                Stack<Character> stack = new Stack<>();
                for (int i = 0; i < code.length(); i++) {
                    char ch = code.charAt(i);

                    // Opening braces ko stack me push karte hain
                    if (ch == '(' || ch == '{') {
                        stack.push(ch);
                    }
                    // Closing braces ko check karte hain
                    else if (ch == ')' || ch == '}') {
                        // Agar stack khali hai, toh imbalance hai
                        if (stack.isEmpty()) {
                            return i; // Return the index of the closing brace
                        }
                        // Top element ko pop karte hain
                        char top = stack.pop();
                        // Match check karte hain
                        if ((ch == ')' && top != '(') || (ch == '}' && top != '{')) {
                            return i; // Return the index of the mismatch
                        }
                    }
                }

                // Agar kuch opening braces bache hain, toh unka length return karein
                return stack.isEmpty() ? -1 : code.length();
            }
        }

