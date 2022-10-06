public class NumericSystems {
    public static void main(String[] args) {

        int decimalNumber = 500;
        System.out.println("numero binario de " + decimalNumber + " = "+ Integer.toBinaryString(decimalNumber));
int intFromBinaryNunber = 0b111110100;//0bnumeroBinario > its integer equivalent. Otherwise, it would be 111,110,100
        System.out.println("intFromBinaryNunber = " + intFromBinaryNunber);
        System.out.println("numero octal de " + decimalNumber + " = "+ Integer.toOctalString(decimalNumber));
int intFromOctalNumber = 0764;
        System.out.println("intFromOctalNumber = " + intFromOctalNumber);
    }
}
