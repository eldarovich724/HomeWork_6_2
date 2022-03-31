public class HW_6_2 {


    public static void main(String[] args) {

        Person person1 = new Person("Eldar V.", 38, "male");
        Person person2 = new Person("Natalya V.", 34, "female");

//        person1.name = "Eldar";
//        person1.age = 38;
//        person1.sex = "male";

//        person2.name = "Natalya";
//        person2.age = 34;
//        person2.sex = "female";

        System.out.println(person1.getSex() + person1.name);
        System.out.println(person1.age);
        System.out.println(person1.sex);
        System.out.println();
        System.out.println(person2.getSex() + person2.name);
        System.out.println(person2.age);
        System.out.println(person2.sex);

//        Person.getSex("male");
//        System.out.println(person.getSex("male"));


    }
}
