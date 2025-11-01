package demo;

public class Employee {
    int empid;
    String empName;
    String department;
    static String companyName = "TechWave Solutions";

    void print(){
        System.out.println("Employee Details:"+ empid + " " +empName + " " +department +" "+companyName);
    }
}