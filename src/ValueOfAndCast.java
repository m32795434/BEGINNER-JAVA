public class ValueOfAndCast {
    public static void main(String[] args){
        String doubleStr = Double.toString(1.25000e20);
        System.out.println("doubleStr = " + doubleStr);
        String floatStr = String.valueOf(1.05e-15f);
        System.out.println("floatStr = " + floatStr);
        double d = 10000e100;
        System.out.println("d = " + d);
        short s = (short)d; // CASTING - converting this numbers to each other's type
        //loosing data
        System.out.println("s = " + s);
        int i = (int)d;
        System.out.println("i = " + i);
        long l = (long)d;
        System.out.println("l = " + l);
        float f = (float)d;
        System.out.println("f = " + f);
    }
}
