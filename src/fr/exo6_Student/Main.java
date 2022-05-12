package fr.exo6_Student;


public class Main {
    public static void main(String[] args) {

        Student Mila = new Student();
        Mila.displayAge();

        Teacher Frankoi = new Teacher();
        Frankoi.sayHello();
        System.out.println(Frankoi.getAge());
        Frankoi.displayAge();
        Frankoi.explain();
        Frankoi.setAge(40);
        Frankoi.displayAge();
        System.out.println(Frankoi.getAge());

        Student Marco = new Student(21);
        Marco.sayHello();
        Marco.displayAge();
        Marco.setAge(99);
        System.out.println(Marco.getAge());
        Marco.displayAge();


    }
}
