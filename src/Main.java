public class Main {
    public static void main(String[] args) {
        int intOperandA = 70;
        int intOperandB = 68;
        int intSum = intOperandA + intOperandB;
        int intDifference = intOperandA + intOperandB;
        int intProduct = intOperandA * intOperandB;
        int intQuotient = intOperandA / intOperandB;
        int intModulo = intOperandA % intOperandB;

        double doubleOperandA = 70;
        double doubleOperandB = 68;
        double doubleSum = doubleOperandA + doubleOperandB;
        double doubleProduct = doubleOperandA + doubleOperandB;
        double doubleDifference = doubleOperandA - doubleOperandB;
        double doubleQuotient = doubleOperandA / doubleOperandB;
        double doubleModulo = doubleOperandA % doubleOperandB;

        System.out.println(String.format("The sum of using ints of %d + %d is %d", intOperandA, intOperandB, intSum));
        System.out.println(String.format("The difference of using ints of %d - %d is %d", intOperandA, intOperandB, intDifference));
        System.out.println(String.format("The product of using ints of %d * %d is %d", intOperandA, intOperandB, intProduct));
        System.out.println(String.format("The quotient of using ints of %d / %d is %d", intOperandA, intOperandB, intQuotient));
        System.out.println(String.format("The modulo of using ints of %d %% %d is %d", intOperandA, intOperandB, intModulo));

        System.out.println(String.format("The sum of using doubles of %,.2f + %,.2f is %,.2f", doubleOperandA, doubleOperandB, doubleSum));
        System.out.println(String.format("The sum of using doubles of %,.2f - %,.2f is %,.2f", doubleOperandA, doubleOperandB, doubleDifference));
        System.out.println(String.format("The sum of using doubles of %,.2f * %,.2f is %,.2f", doubleOperandA, doubleOperandB, doubleProduct));
        System.out.println(String.format("The sum of using doubles of %,.2f / %,.2f is %,.2f", doubleOperandA, doubleOperandB, doubleQuotient));
        System.out.println(String.format("The sum of using doubles of %,.2f %% %,.2f is %,.2f", doubleOperandA, doubleOperandB, doubleModulo));
    }
}