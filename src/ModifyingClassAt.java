class Person{
    private String name;//private or public: visibility or access modifier
    public void modifyingName(String newName){
        this.name = newName;
    }
    public String returnName(){
        return this.name;
    }
}
public class ModifyingClassAt {
    public static void main(String[] args) {
Person person = new Person();
person.modifyingName("Manuel");
        System.out.println(person.returnName());
    }
}
