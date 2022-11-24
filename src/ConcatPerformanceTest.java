public class ConcatPerformanceTest {
    public static void main(String[] args) {
        String a  = "a";
        String b  = "b";
        String c  = "c";
        String d = "";
StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();
        for(short i = 0; i<10000; i++){// with only one char. With more chars, the difference between + and .concat() happens before.
//           d =  d.concat(a).concat(b).concat(c);//100->0ms; 200-> 1; 400->2; 800-> 3; 1200-> 5ms; 2000-> 14; 4500-> 37; 5000-> 43;10000 ->130
//           d +=  a+b+c; //100->15ms; 200-> 15; 200->18; 800-> 18; 1200->19; 2000 ->24; 4500-> 36; 5000 ->35; 10000 -> 98;
            sb = sb.append(a).append(b).append(c);//100->0ms; 200-> 1; 400->1;800-> 0;1200-> 0; 2000-> 1; 4500-> 1; 5000-> 2;10000 ->3;
        }
System.gc();//garbage collector
        long end = System.currentTimeMillis();
        System.out.println("elapsed time running the for loop and the System.gc():" + (end-start));
        System.out.println(d);
        System.out.println(sb.toString());
System.exit(0);
    }
}
