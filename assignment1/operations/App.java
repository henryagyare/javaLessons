package assignment1.operations;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static double add(double operand1, double operand2) {
        // throw new RuntimeException("Not implemented");
        double additionResult = operand1 + operand2;
        return additionResult;
    }

    public static double subtract(double operand1, double operand2) {
        // throw new RuntimeException("Not implemented");
        double subtractResults = operand2 - operand1;
        return subtractResults;
    }

    public static double multiply(double operand1, double operand2) {
        // throw new RuntimeException("Not implemented");
        double multiplyResults = operand1 * operand2;
        return multiplyResults;
    }

    public static Boolean areEqual(double operand1, double operand2) {
        // throw new RuntimeException("Not implemented");
        boolean areEqualResults = operand1 == operand2;
        return areEqualResults;
    }

    public static Boolean isLessThan(double operand1, double operand2) {
        // throw new RuntimeException("Not implemented");
        boolean isLessThanResults = operand1 < operand2;
        return isLessThanResults;
    }

    public static Boolean isMoreThan(double operand1, double operand2) {
        // throw new RuntimeException("Not implemented");
        boolean isMoreThanResults = operand1 > operand2;
        return isMoreThanResults;
    }
}