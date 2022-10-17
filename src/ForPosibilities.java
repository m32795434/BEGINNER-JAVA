public class ForPosibilities {
    public static void main(String[] args) {
        int i = 0;
        for(;i<=5;i++) System.out.println("i = " + i);
        System.out.println("i = " + i);//6
        for(int a = 10, b = 0;a<=20 && b>=0; a++,b++){
            if((a%2)==0){//don't show the odds
                continue;//step to the next iteration; break:quit the for
            }
            System.out.println("a = " + a);
        }
        for(;;){
            System.out.println("i = " + i);
            if(i>=20) break;
            i++;
        }
    }
}
