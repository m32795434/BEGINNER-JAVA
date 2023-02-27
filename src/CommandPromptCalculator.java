public class CommandPromptCalculator {
    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println("Please insert 3 args. The first the operation name, and then 2 integers");
            System.exit(-1);
        }
String operation = args[0];
int a = Integer.parseInt(args[1]);
int b = Integer.parseInt(args[2]);
double result = 0;
        switch (operation) {
            case "suma" -> {
                result = a + b;
                break;
            }
            case "resta" -> {
                result = a - b;
                break;
            }
            default -> {
            }
        }
        System.out.println("result of the operation " + args[0] + "= " + result);
    }
}

