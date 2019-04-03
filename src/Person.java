import java.util.Scanner;

public class Person {

    String name;

    int age;

    String gender;

    String address;

    String nationality;

    public static void main(String[]args){


        /* Polymorphism is the ability to treat objects of different behaviours or character in a uniform way.

        Polymorphism enables us to write programs that process objects that share the same superclass (directly or indirectly)

        as if they are all members of the superclass
         */



        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your matriculation number : ");


        Student seun = new Student();

        Person ayo = new Student(); // called UPCASTING in java,where a parentclass type refers to the object of child

        System.out.println(ayo instanceof Student); // used to check the correctness of instance.


        Person segun = new Person();
        Student femi = new GraduateStudent();

        Person jumoke = new GraduateStudent();

        double cummulativeresult = ((GraduateStudent) jumoke).cgpa(88, 20);

        System.out.println(cummulativeresult);

        ayo.checkmethod();

        jumoke.checkmethod();

        segun.checkmethod();

        //Dynamic method dispatch is an aspect of polymorphism where methods are called by object and not by type








    }

    public void checkmethod(){

        System.out.println("Yes! Parent class method takes precedence");
    }

}
