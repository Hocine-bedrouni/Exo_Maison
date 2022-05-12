package fr.exo6_Student;

public class Student extends Person{

    protected int age = 15;



    public Student(){

    }
    public Student(int age){
        this.age= age;


    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

//    public void displayAge(){
//        System.out.println("My age is "+ getAge() +" years old");
//    }

    public void goToClass(){
        System.out.println("I go to class");
    }

}
