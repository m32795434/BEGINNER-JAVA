public class FloatsAndOtherTypesNumbers {
   static float floatStatic = 120.0e12f;
    public static void main(String[] args) {
        Number number1 = 12.0e12f;
        System.out.println("number1 = " + number1);
        System.out.println("number1 is a Float instance?= " + (number1 instanceof Float));
        System.out.println("number1 is a Number instance?= " + (number1 instanceof Number));
        Number number2 = Float.valueOf(12.0e12f);
        System.out.println(("number2 : " + number2).concat(" is a Float instance, created from the static method Float.valueOf()"));
        float float1 = 2;
        System.out.println("float1 = " + float1);//2.0
        float float2 = 2.0f;
        System.out.println("float2 = " + float2);//2.0
        Float floatObj1 = 2f;
        System.out.println("floatObj1 = " + floatObj1 + " is an object");//an object
        System.out.println("floatObj1.MAX_VALUE = " + floatObj1.MAX_VALUE);
        System.out.println("floatObj1.MIN_VALUE = " + floatObj1.MIN_VALUE);
        System.out.println("floatObj1.BYTES = " + floatObj1.BYTES);
        System.out.println("floatObj1.SIZE = " + floatObj1.SIZE);
        float float4 = 15e20f;
        System.out.println("float4 = " + float4);//1500000000000000000000
        //all float values are "double" by defect.
        System.out.println(Double.MAX_VALUE);//MAX DOUBLE VALUE
        System.out.println("floatStatic it's a static attribute of the class & = " + floatStatic);
        int bag = 123;
        int pencil = 2;
        double average = (bag+(double)pencil)/2;//With (cast), or with a "f", "d", in somewhere, we need to convert this to a floating point expression.
        System.out.println("average = " + average);

    }
}
