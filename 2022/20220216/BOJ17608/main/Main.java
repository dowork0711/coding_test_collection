package BOJ17608.main;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int sticks = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < sticks; i++) {
            stack.add(sc.nextInt());
        }

        // System.out.println(stack);

        int max = 0;
        int count = 0;

        for(int i = 0; i < stack.size(); i++) {
            int st = stack.pop();

            if (max < st) {
                count+=1;
                max = st;
            }
        }

        System.out.println(count);

    }
}