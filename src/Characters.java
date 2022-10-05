public class Characters {
    public static void main(String[] args) {
        var charUnicode = '\u0040';// char por la literal
        System.out.println("charUnicode = " + charUnicode);
        char charDecimal = 64;
        System.out.println("charDecimal = " + charDecimal);
        System.out.println("charDecimal = charUnicode? = " + (charDecimal == charUnicode));
        System.out.println("Character MAX_VALUE : " + Character.MAX_VALUE);
        System.out.println("Character MIN_VALUE : " + Character.MIN_VALUE);
        System.out.println("Character BYTES : " + Character.BYTES);//FOR UNICODE EXPRESSIONS?
        System.out.println("Character  SIZE: " + Character.SIZE);

    }
}
