public class CompilingFromCommandPrompt {
    public static void main(String[] args) {
        int length = args.length;
        if(length == 0){
            System.err.print("You must pass some args");
            System.exit(-1);
        }
        for(int i=0;i<length;i++){
            System.out.println("arg nº ".concat(Integer.toString(i)).concat("= ").concat(args[i]));
        }
        //javac filename -encoding utf8 --> to encode the file correctly
    }
}
