import java.lang.reflect.Method;

public class GetClassExample {
    public static void main(String[] args) {
        String text1 = "some text!";
        Class StrClass = text1.getClass();
        
        /*
        for(Method m:StrClass.getMethods()){
            System.out.println("m = " + m);
            System.out.println("m.getName() = " + m.getName());
        }*/
        Integer int1 = 127;
        Class IntClass = int1.getClass();
        System.out.println("IntClass.getSuperclass() = " + IntClass.getSuperclass());
        System.out.println("IntClass.getSuperclass().getSuperclass() = " + IntClass.getSuperclass().getSuperclass());
        /*
        for(Method m: IntClass.getMethods()){
            System.out.println("m = " + m);
        }*/
        for(Method m:IntClass.getMethods()){
            System.out.println("m = " + m);
        }
    }
}
