import java.util.Stack;

public class Test {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    /** initialize your data structure here. */
    public void MinStack() {
        stack = new Stack();
        minStack = new Stack();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.empty()) {
            minStack.push(x);
        } else {
            if (minStack.peek() >= x) {
                minStack.push(x);
            }
        }
    }

    public void pop() {
         if (minStack.peek().equals(stack.peek())) {
             minStack.pop();
         }

         stack.pop();
       /* int ret = stack.pop();

        if (minStack.peek() == ret) {
            minStack.pop();
        }*/

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        Test test = new Test();

        test.MinStack();

        test.push(512);
        test.push(-1024);
        test.push(-1024);
        test.push(512);

        test.pop();
        System.out.println(test.getMin());

        test.pop();
        System.out.println(test.getMin());

        test.pop();
        System.out.println(test.getMin());
    }


    //验证栈序列
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack();
        int j = 0;

        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);

            while (!stack.empty() &&
                    j < popped.length &&
                    popped[j] == stack.peek()) {
                stack.pop();
                j++;
            }
        }

        return stack.empty();
    }



    //逆波兰表达式
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();

        //遍历数组
        for (int i = 0; i < tokens.length; i++) {
            String s = tokens[i];

            //如果对象为整数，就入栈
            if (!s.equals("+") &&
                    !s.equals("-") &&
                    !s.equals("*") &&
                    !s.equals("/")) {

                stack.push(Integer.parseInt(s));
            } else {
                //不是整数，出两个栈中的元素作为操作数
                int right = stack.pop();
                int left = stack.pop();
                int result = 0;

                //计算的结果再进行压栈
                if (s.equals("+")) {
                    result = left + right;
                } else if (s.equals("-")) {
                    result = left - right;
                } else if (s.equals("*")) {
                    result = left * right;
                } else {
                    result = left / right;
                }

                stack.push(result);
            }

        }

        return stack.pop();
    }


    //括号匹配
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            //左括号入栈
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }

            //右括号与栈顶括号匹配
            if (ch == ')' || ch == ']' || ch == '}') {
                //判断栈是否为空
                if (stack.empty()) {
                    return false;
                }

                char top = stack.peek();
                //判断括号是否匹配
                if ((top == '(' && ch != ')') ||
                        (top == '[' && ch != ']') ||
                        (top == '{' && ch != '}')) {

                    return false;
                } else {
                    //匹配就出栈
                    stack.pop();
                }
            }
        }

        //判断栈是否为空
        if (!stack.empty()) {
            return false;
        }

        return true;
    }


    //括号匹配
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            //左括号入栈
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }

            //右括号与栈顶括号匹配
            if (ch == ')' || ch == ']' || ch == '}') {
                //判断栈是否为空
                if (stack.empty()) {
                    return false;
                }

                char top = stack.peek();
                //判断括号是否匹配
                if ((top == '(' && ch != ')') ||
                        (top == '[' && ch != ']') ||
                        (top == '{' && ch != '}')) {

                    return false;
                } else {
                    //匹配就出栈
                    stack.pop();
                }
            }
        }

        //判断栈是否为空
        if (!stack.empty()) {
            return false;
        }

        return true;
    }
}
