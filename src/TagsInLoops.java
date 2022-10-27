import javax.swing.*;

public class TagsInLoops {
    public static void main(String[] args) {
        //theory
        /*loop1://we will use it with a break or continue tag;
        for(int i = 0;i<20;i++) {
            loop2:
            for(int j = 0; j<20;j++){
                if(i ==2) continue loop1;
            }
            System.out.println("i = " + i);
        }*/
        // REAL EXAMPLE without continue tag:
/*
        String[] phraseArray = (JOptionPane.showInputDialog(null, "insert a phrase")).split("");
        String charToFind = JOptionPane.showInputDialog(null, "please insert the char to find");
        int cont = 0;
        for(String c: phraseArray){
if(c.equals(charToFind)){
    cont++;
}
        }
        System.out.println("cont = " + cont);
*/
        //WITH THE CONTINUE TAG

        String phrase = JOptionPane.showInputDialog(null, "insert a phrase");
        String[] phraseArray = phrase.split(" ");
        String charToFind = JOptionPane.showInputDialog(null, "please insert the char to find");
        int contChar = 0;
        int contWord = 0;
for(String w:phraseArray){
    if(w.contains(charToFind)){
        contWord++;
        int wordLenght = w.length();
        loop2:
        for(int i=0;i<wordLenght;i++){
            if(!(Character.toString(w.charAt(i)).equals(charToFind))){
                continue loop2;//this is unnecessary if we write the if "backwards"
            }
            contChar++;
        }
    }
}
        System.out.println("contChar :" + contChar);
        System.out.println("contWord :" + contWord);
    }
}
