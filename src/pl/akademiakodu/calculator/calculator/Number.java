package pl.akademiakodu.calculator.calculator;


public class Number {

    static double divide(double a, double b) throws DivideZeroException {
        if (b == 0)
            throw new DivideZeroException();
        else
            return a / b;
    }

}
