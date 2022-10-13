public class Strings {
    public static void main(String[] args) {
        //STRINGS ARE IMMUTABLE!
        String name = "Manuel";
        String name2 = new String("Manuel");
        boolean equal = name == name2;
        System.out.println("name == name2 = " + equal);
        String name3 = "Manuel";
        //true>economizing memory!not in JS. ruby, same as equal??
        equal = name == name3; //two instances using literal string, with the same content, are equals.
        System.out.println("name == name3 = " + equal);
        //equals >checking content
        //equals / equalsIgnoreCase()
        equal = name.equals(name2);
        System.out.println("name.equals(name2) = " + equal);//the content is equal.
        String surname = "Bravard";
        String completeName = name +" "+surname;
        //concat > MORE EFFICIENT!(DOESN'T CREATE AN ADDITIONAL STRING BUILDER INSTANCE TO CONCAT)
        //we can nest the .concat()
        String completeName2 = name.concat(surname);
        equal = completeName2.equals(completeName);
        System.out.println("completeName2.equals(completeName) = " + equal);

        //LAMBDA EXPRESSIONS. Like Js arrow functions
        //.transform
        String drIzeComplete  = completeName.transform(n-> "Dr. "+ n);
        System.out.println("drIzeComplete = " + drIzeComplete);

        //replace> with '' or "";with "" is like .replaceAll in Js.
        String upDrized = drIzeComplete.replace('r','R');
        System.out.println("upDrized = " + upDrized);
        
        //isEmpty
        String emptyStr = "";
        boolean isempty = emptyStr.isEmpty();//or with .length()
        System.out.println("isempty = " + isempty);

        //isBlank -> MORE STRICT
        String blankStr = "     ";
        boolean isblank = blankStr.isBlank();
        System.out.println("isblank = " + isblank);

        //contains
        System.out.println(blankStr.contains(" "));
//.indexOf, .lastIndexOf, .substring, .charAt, .startsWith, .endsWith, .trim exist like in Js.

        //.toCharArray
        String car = "OVV915";
        char[] carCharArray = car.toCharArray();//returns the object's hash
        System.out.println("carCharArray = " + carCharArray);
        for(int i = 0; i<carCharArray.length; i++){
            System.out.print(carCharArray[i]);
        }
            System.out.println();
        //String[]
String address = "Bolivia 556";
//In a regex if we want to use the ".", we have to use "\\." or "[.]"; this for *all* the regex chars
        String[] addressSplited = address.split(" ");//return the hash
        for(int i = 0; i<addressSplited.length; i++){
            System.out.println(addressSplited[i]);
        }
    }
}
