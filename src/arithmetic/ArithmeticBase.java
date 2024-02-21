/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sanjeev paudel
 * 
 */
public class ArithmeticBase {
    public double x, y;

    public enum Operation {
        PLUS,
        MINUS,
        TIMES,
        DIVIDE
    }

    public double calculate(double x, double y, Operation operation) {
        switch (operation) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Unknown operation " + operation);
        }
    }

    public static void main(String[] args) {
        ArithmeticBase arithmetic = new ArithmeticBase();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double x = sc.nextDouble();

        System.out.println("Enter the second number: ");
        double y = sc.nextDouble();

        System.out.println("Enter arithmetic operation to Perform (PLUS, MINUS, TIMES, DIVIDE): ");
        ArithmeticBase.Operation operation = ArithmeticBase.Operation.valueOf(sc.next().toUpperCase());

        double result = arithmetic.calculate(x, y, operation);
        System.out.println("Result: " + result);
    }
}