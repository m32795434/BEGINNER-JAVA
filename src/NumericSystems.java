public class NumericSystems {
    public static void main(String[] args) {
        int decimal = 500;
        System.out.println("decimal = " + decimal);
        System.out.println("binaryStringVersionOfDecimal = " + Integer.toBinaryString(decimal));
        int intFromBinaryNumber = 0b111110100;
        System.out.println("intFromBinaryNumber = " + intFromBinaryNumber);
        int intFromBinaryString = Integer.parseInt((Integer.toBinaryString(decimal)), 2);
        System.out.println("intFromBinaryString = " + intFromBinaryString);
        System.out.println("octalStringVersionOfDecimal = " + Integer.toOctalString(decimal));
        int  intFromOctalNumber = 0764;
        System.out.println("intFromOctalNumber = " + intFromOctalNumber);
        System.out.println("hexaStringVersionOfDecimal =" + Integer.toHexString(decimal));
        int intFromHexaNumber = 0x1f4;
        System.out.println("intFromHexaNumber = " + intFromHexaNumber);
    }
}
