import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        /*String[] usernames = new String[2];
        String[] passwords = new String[2];
        usernames[0]  = "Manuel";
        passwords[0] = "12345";
        usernames[1] = "Bravard";
        passwords[1] = "12345";*/
        String[] usernames = {"Manuel", "Bravard"};
        String[] passwords = {"12345", "12345"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert your username");
        String u = scanner.next();
        System.out.println("Insert your password");
        String p = scanner.next();
        for(int i = 0; i < usernames.length; i++){
        if(u.equals(usernames[i]) && p.equals(passwords[i])){
            System.out.println("LOGIN " + u + " ...");
            System.out.println("usernames[i] = " + usernames[i]);
           System.exit(0);//break;return

        }
        }
            System.out.println("rejected!");
    }
}
        //I could use a separate if to check the authenticated's truthy and display the message:
        /*if(authenticated){//a boolean
            System.out.println("Welcome user".concat(u).concat("!"));
        }else{
          System.out.println("username or password invalid. You require valid credentials");
        }*/
