import javax.swing.*;

public class NumericSystemsConversor {
    public static void main(String[] args) {
        String stringFormatResponse = JOptionPane.showInputDialog(null, "insert an integer number");
        int dialogResponse = Integer.parseInt(stringFormatResponse, 10);
        System.out.println("numberResponse = " + dialogResponse);
        String report = "Your number \n in binary is : " + Integer.toBinaryString(dialogResponse) + "\n in octa: " + Integer.toOctalString(dialogResponse) + "\n in hexa: " + Integer.toHexString(dialogResponse);
        JOptionPane.showMessageDialog(null, report);
    }
}
