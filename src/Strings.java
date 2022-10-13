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
        //EQUAL>checking content
        //equal / equalsIgnoreCase()
        equal = name.equals(name2);
        System.out.println("name.equals(name2) = " + equal);//the content is equal.
        String surname = "Bravard";
        String completeName = name +" "+surname;
        //CONCAT> MORE EFFICIENT!(DOESN'T CREATE AN ADDITIONAL STRING BUILDER INSTANCE TO CONCAT)
        //we can nest the .concat()
        String completeName2 = name.concat(surname);
        equal = completeName2.equals(completeName);
        System.out.println("completeName2.equals(completeName) = " + equal);

        //LAMBDA EXPRESSIONS. Like Js arrow functions
        //.TRANSFORM
        String drIzeComplete  = completeName.transform(n-> "Dr. "+ n);
        System.out.println("drIzeComplete = " + drIzeComplete);

        //REPLACE> with '' or "";with "" is like .replaceAll in Js.
        String upDrized = drIzeComplete.replace('r','R');
        System.out.println("upDrized = " + upDrized);
        
        //ISEMPTY
        String emptyStr = "";
        boolean isempty = emptyStr.isEmpty();//or with .length()
        System.out.println("isempty = " + isempty);

        //ISBLANK -> MORE STRICT
        String blankStr = "     ";
        boolean isblank = blankStr.isBlank();
        System.out.println("isblank = " + isblank);

        //CONTAINS
        System.out.println(blankStr.contains(" "));
//.indexOf, .lastIndexOf, .substring, .charAt, .startsWith, .endsWith, .trim exist like in Js.

    }
}
