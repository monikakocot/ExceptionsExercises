package pl.akademiakodu.calculator.calculator;


public class Calculator {

    public static void main(String[] args) {

        try {
            System.out.println(Number.divide(3.0, 4.0));
            System.out.println(Number.divide(3.0,0));
        } catch (DivideZeroException e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("I will be always printed! With or without exception :)");
        }
    }
}
