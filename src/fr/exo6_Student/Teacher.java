package fr.exo6_Student;

public class Teacher extends Person{

  private String subject;
    protected int age = 47;

    public Teacher() {
    }

    public Teacher(int age){
        this.age= age;
    }

    @Override
    public int getAge() {
        return age;
    }

    public static void explain(){
        System.out.println("Explanaton begin");
    }

}
