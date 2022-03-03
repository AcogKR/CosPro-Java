package test1;

import java.util.ArrayList;

public class Test1 {

    public long solution(long num) {
        long answer = num + 1;
        String numberString = Long.toString(answer);

        while (numberString.contains("0")) {
            answer++;
            numberString = Long.toString(answer);
        }
        return answer;
    }
    Integer func_a(ArrayList<Integer> stack) {
        Integer item = stack.remove(stack.size() - 1);
        return item;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Test1 sol = new Test1();
        long num = 9949999;
        long ret = sol.solution(num);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret + " .");
    }

}
