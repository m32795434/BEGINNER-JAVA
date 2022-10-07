import javax.swing.*;

public class NumericSystemsConversor {
    public static void main(String[] args) {
        String stringFormatResponse = JOptionPane.showInputDialog(null, "insert an integer number");
        int intDialogResponse = 0;
        try{
        intDialogResponse = Integer.parseInt(stringFormatResponse, 10);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "ERROR: please insert a valid number!");
            System.out.println(e);
            main(args);
            System.exit(0);//with this, we kill the program. We could "return;" too. But exit is more consistent.
        }
        System.out.println("numberResponse = " + intDialogResponse);
        String report = "Your number: "+ intDialogResponse + "\n in binary is : " + Integer.toBinaryString(intDialogResponse) + "\n in octa: " + Integer.toOctalString(intDialogResponse) + "\n in hexa: " + Integer.toHexString(intDialogResponse);
        JOptionPane.showMessageDialog(null, report);
    }
}
