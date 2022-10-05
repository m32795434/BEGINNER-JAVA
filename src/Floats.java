public class Floats {
   static float floatStatic;
    public static void main(String[] args) {
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

    }
}
