package studio7;

public class fraction {

    private int numerator;
    private int denominator;

    public fraction(int initnumerator, int initdenominator){
        numerator = initnumerator;
        denominator = initdenominator;


    }
    public fraction multiply(fraction f1){
        int newNumerator = f1.numerator * numerator;
        int newDenominator = f1.denominator * denominator;
        return new fraction(newNumerator, newDenominator);

    }
    public fraction reciprocal(){
        int recNumerator = denominator;
        int recDenominator = numerator;
        return new fraction(recNumerator,recDenominator);
    }
    public fraction add(fraction f1){
        int addNumerator = numerator * f1.denominator + denominator * f1.numerator;
        int addDenominator = denominator * f1.denominator;
        return new fraction(addNumerator,addDenominator);
    }
    public static void main(String[] args){

    }
    public void print(){
        System.out.println("Add: " + add(null));
    }
}
