import javax.swing.*;

public class TakeFileExtension {
    public static void main(String[] args) {
        String filePath = JOptionPane.showInputDialog(null, "insert file path");
        int index = filePath.lastIndexOf(".");
        String fileExt = filePath.substring(index+1);
        System.out.println("fileExt = " + fileExt);
    }
}
