package pl.akademiakodu.calculator.calculator;


public class DivideZeroException extends Exception {

    @Override
    public String getMessage(){
        return "Problem with 0";
    }

    public String getPolishMessage(){
        return "Nie dziel przez 0";
    }

}
