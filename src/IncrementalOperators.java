public class IncrementalOperators {
    public static void main(String[] args) {
        //PRE-INCREMENT
        int i = 1;
        int j = ++i;//increment and assign
        System.out.println("i = "+i+" j = "+ j);
        //POST-INCREMENT
        int a = 1;
        int b = a++; //assign and increment.
        System.out.println("a = "+a+" b = "+b);

        //WITH DECREMENTS!
        int c = 3;
        int d = --c;
        System.out.println("c = "+ c + " d = "+ d);
        int e = 10;
        int f = e--;
        System.out.println("e = "+ e + " f = " + f );//e =9; f = 10
        System.out.println("f = " + (f++));//10
        System.out.println("f = " + f);//11
    }
}
