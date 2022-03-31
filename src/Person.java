public class Person {

    String name;
    int age;
    String sex;


    Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
//    Person(String name, int age, String sex) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//    }

    public String getSex() {
        String a;
        if (this.sex == "male") {
            return "Mr.";
        } else return "Mrs.";
    }

}
/*
Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод - getName,
метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.
 */