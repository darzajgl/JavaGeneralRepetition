package ClassesConstructorsInheritance;
/*
Write a class with the name SimpleCalculator. The class needs tow fields(instance variables) with names firstNumber and secondNumber both of type double.

Writhe the following methods(instance methods)
1. Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
2. Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
3. Method named setFirstNumber with one parameter of type double, it needs to set the value of firstNumber field.
4. Method named setSecondNumber with one parameter of type double, it needs to set the value of secondNumber field.
5. Method named setSecondNumber with one parameter of type double, it needs to set the value of secondNumber field.
6. Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
7. Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of firstNumber and secondNumber..
8. Method named getMultiplicationResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
9. Method named getDivisionResult without any parameters, it needs to return the result of subtracting the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.

  */

public class SimpleCalculator {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = "+calculator.getAdditionResult());
        System.out.println("subtract = "+calculator.getSubtractionResult());
        System.out.println("multiply = "+calculator.getMultiplicationResult());
        System.out.println("divide = "+calculator.getDivisionResult());

    }




    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        } else {
            return firstNumber / secondNumber;
        }
    }
}
