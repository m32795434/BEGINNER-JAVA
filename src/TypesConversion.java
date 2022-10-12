import javax.swing.*;

public class TypesConversion {
    public static void main(String[] args) {
       String stringFormatResponse = JOptionPane.showInputDialog(null, "Please insert a decimal number");
        boolean boolVersion = false;
        int intVersion = 0;
        double realDoubleVersion = 0;
       try{
           boolVersion = Boolean.parseBoolean(stringFormatResponse);//it's only "true", if we pass "true".
           intVersion = Integer.parseInt(stringFormatResponse);
           realDoubleVersion = Double.parseDouble(stringFormatResponse);
    }catch(NumberFormatException e){
           if(e.getMessage() == "Cannot parse null string"){
               System.exit(0);
           }
           JOptionPane.showMessageDialog(null, "Neee, invalid!Try again!");
           main(args);
System.exit(0);
    }

JOptionPane.showMessageDialog(null, "your vale: " + stringFormatResponse + "\n" +"boolVersion = " + boolVersion + "\n"+ "intVersion = " + intVersion +"\n"+ "realDoubleVersion = " + realDoubleVersion);
    }
}
