package fr.exo6_Student;

public class Person {

    //Attributs
    protected int age =777;



    //Constructeur
    public Person() {
    }

    public Person(int age){

    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int Newage){
        this.age = Newage;
    }

    public static void sayHello(){
        System.out.println("Hello");
    }

    public void displayAge(){
        System.out.println("My age is "+ getAge()+" years old");
    }
}
