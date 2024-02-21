/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sanjeev paudel
 * 
 */
public class Arithmetic {
    public static void main(String[] args) {
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double n = in.nextDouble();

        System.out.println("Enter the second number: ");
        double m = in.nextDouble();

        System.out.println("Enter arithmetic operation to Perform (PLUS, MINUS, TIMES, DIVIDE): ");
        ArithmeticBase.Operation operation = ArithmeticBase.Operation.valueOf(in.next().toUpperCase());

        double result = r.calculate(n, m, operation);
        System.out.println("Result: " + result);
    }
}