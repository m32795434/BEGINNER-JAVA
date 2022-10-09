import java.util.Scanner;
//import java.util.InputMismatchException;

public class NumericSystemsConversorScannerVersion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert an integer number");
//        String stringFormatResponse = scanner.nextLine();
        int intDialogResponse = 0;
        try {
//            intDialogResponse = Integer.parseInt(stringFormatResponse, 10);
            intDialogResponse = scanner.nextInt();
//        }catch(NumberFormatException e){
//        }catch(InputMismatchException e){
        }catch(Exception e){
            System.out.println(e);
            System.out.println("ERROR: please insert a valid number!");
            main(args);
            System.exit(0);//with this, we kill the program. We could "return;" too. But exit is more consistent.
        }
        String report = "Your number: "+ intDialogResponse + "\n in binary is : " + Integer.toBinaryString(intDialogResponse) + "\n in octa: " + Integer.toOctalString(intDialogResponse) + "\n in hexa: " + Integer.toHexString(intDialogResponse);
       System.out.println( report);
    }
}
