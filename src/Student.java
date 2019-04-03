public class Student extends Person {

    String department;

    String faculty;

    int level;

    int matriculationnumber;

    double currentgp;

    int currenttotalunits;

    int currenttotalpoints;

public double cgpa(double points, double units){

    currentgp = points/units;

    return currentgp;






}

    public void checkmethod(){

        System.out.println("Yes! child class method takes precedence because its the object name that matters not type ");
    }

}
