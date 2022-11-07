public class PassingArgumentsAndReferences {
    public static void main(String[] args) {
int i  = 0;
        System.out.println(" initiate main with int i = " + i);
        test(i); //if we pass, a primitive, or an instance of String, or either a Number subclass object, it passes the value, not the reference
        System.out.println("int i ends in main, with value: " + i);
        //---References to an array
        int[] age = {10,11,12};
        System.out.println("start values of the int[] age in main...");
        for(int e:age){
            System.out.print(" " + e);
        }
        testArray(age);
        System.out.println("end values of int[] age in main...");
        for(int e:age){
            System.out.print(" "+e);
        }
    }
    public static void test(int i){
        System.out.println(" initiate method test with i = " + i);
        i = 3;
        System.out.println("int i ends in test, with value : " + i);
    }
    public static void testArray(int[] age){
        System.out.println("initial values of int[] age in testArray...");
        for(int e: age){
            System.out.print(" "+e);
        }
        for(int i=0; i< age.length; i++){
            age[i]+=10;
        }
        System.out.println("end values of int[] age in testArray...");
        for(int e: age){
            System.out.print(" "+e);
        }
    }

}
