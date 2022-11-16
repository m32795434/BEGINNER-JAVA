import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Properties;

public class SystemProperties {
    public static void main(String[] args) {

//        READING PROPERTIES

        String username = System.getProperty("user.name");
        System.out.println("username = " + username);
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);
        String lineSeparator = System.getProperty("line.separator");
        System.out.println("Hola, como estas?" + lineSeparator  + "Bien y vos? <le contestó el burro>");
        Properties p = System.getProperties();

//        Properties.list() METHOD!
//        p.list(System.out);//Prints this property list out to the specified output stream. This method is useful for debugging.

        //SETTING PROPERTIES
        try {
            FileInputStream file = new FileInputStream("src/config.properties");

            p.load(file);//we have the (p) System Properties already. So load the news.
            p.setProperty("mi.propiedad.personalizada", "Mi nuevo valor");//we set another one
            System.getProperties().list(System.out);
            System.out.println("\nconfig.autor.email: "+ System.getProperty("config.autor.email"));

            //ANOTHER WAY

            /*Properties p1 =  new Properties(System.getProperties());
            p.load(file);
//            System.setProperties(p);//not necessary but, take into account.
            System.getProperties().list(System.out);*/

        } catch (Exception  e) {//we manage all the Exceptions
            throw new RuntimeException(e);
        }
    }
}
