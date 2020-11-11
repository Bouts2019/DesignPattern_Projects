package com.martini.demo01;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author martini at 2020/11/11 7:18
 */
public class InterpreterDemo01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String exp = scan.next();
        HashMap<String, Integer> var = new HashMap<String, Integer>();
        for (char c : exp.toCharArray()) {
            if (c != '+' && c != '-') {
                System.out.println("Enter the value of " + c + ": ");
                int val = scan.nextInt();
                var.put(String.valueOf(c), val);
            }
        }
        Calculator calc = new Calculator(exp);
        System.out.println("Result of " + exp + " is: " + calc.calc(var));
    }
}
