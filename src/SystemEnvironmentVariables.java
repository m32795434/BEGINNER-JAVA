import java.security.Key;
import java.sql.SQLOutput;
import java.util.Map;
import java.util.Set;

public class SystemEnvironmentVariables {
    public static void main(String[] args) {
       Map<String, String> varEnv = System.getenv();
       /*for(Map.Entry set: varEnv.entrySet()){
           System.out.println("set: " + set);
       }*/

        //ANOTHER WAY

        for(String key: varEnv.keySet()){
            System.out.println(key + " => " + varEnv.get(key));
        }

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);
        String userName = System.getenv("USERNAME");
        System.out.println("userName = " + userName);
        String path = System.getenv("PATH");//case insensitive
        System.out.println("path = " + path);
        System.out.println("THE SAME AS ABOVE: "+ varEnv.get("Path"));//case sensitive
        System.out.println(varEnv.get("NUMBER_OF_PROCESSORS"));
        System.out.println(System.getenv("MY_VARIABLE"));
        //with setx we can set in command Prompt a new environment variable on Windows.
        System.out.println(System.getenv("SALUDAR"));
    }
}
