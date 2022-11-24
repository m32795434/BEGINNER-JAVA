public class ExecutingAProcess {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process processNotePad;

        try{
            if(System.getProperty("os.name").toLowerCase().startsWith("windows")){
            processNotePad = rt.exec("notepad");
            }else if(System.getProperty("os.name").toLowerCase().contains("mac")){
                processNotePad = rt.exec("textedit");
            }else if(System.getProperty("os.name").toLowerCase().contains("nux")){
                processNotePad = rt.exec("gedit");
            }else{
                processNotePad = rt.exec("gedit");
            }
            processNotePad.waitFor();//wait to be closed
        }catch(Exception e){
System.err.println(e);
System.exit(1);
        }
        System.out.println("Editor closed");
        System.exit(0);
    }
}
