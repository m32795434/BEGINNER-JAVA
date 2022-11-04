public class ClassesWrapper {
    public static void main(String[] args) {
        int intPrimitive1 = 1245;

        //from literal - auto BOXING
        Integer intObject1  = 1245;

        //from a primitive - literal
        Integer intObject2 = intPrimitive1;

        //from an Object - literal
        int intPrimitive3 = intObject2;//int intPrimitive = intObject2.intValue();

        //from a string
        String tvPrice = "1245";
        Integer tvPriceValue = Integer.valueOf(tvPrice);//Static M.

        //to a string
        String tvPriceString = tvPriceValue.toString();//Instance M.

        //DANGER! - Doesn't display an advice - possible bug!
        Short shortObject2 = intObject2.shortValue();//it could happen a data lost.//Instance M.
        //Short shortPrimitive3 = intPrimitive3; // literal will display an advice. (Cast)

        //RELATIONAL OPERATORS in Wrappers - for <=,>=,<,>, runs the auto-unboxing
        Integer int1, int2;
        int1 = 127;
        int2 = 127;
        // Integer int2 = 127;
        System.out.println("int2 = int1?: " + (int2 == int1));//([0-127] is TRUE - AUTO-UNBOXING)
        System.out.println("int1 tiene el mismo valor que int2?: "+ int1.equals(int2));//true

        //BOOLEAN
        boolean bool1, bool2;
        bool1 = false;
        bool2 = false;
        //from a string
        Boolean boolObject1 = Boolean.valueOf("false");
        //from an object
        boolean boolPrimitive = boolObject1;//auto unboxing

        //the "==" operator, WORK DIFFERENT IN BOOLEANS. HERE COMPARE THE VALUES. NOT THE REFERENCES.
        System.out.println("bool1 == boolObject1?: "+ (bool1 == boolObject1));
        System.out.println("boolObject1.equals(bool2)?: "+ (boolObject1.equals(bool2)));//look at this. bool2 is not an object
    }
}
