package secondTry;

public class Person {
    private String name;
    private int age;
    private String gender;

    //constructor
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce(){
        System.out.println("Hallo, I am " + name + " and " + age + " years old");
    }

}
