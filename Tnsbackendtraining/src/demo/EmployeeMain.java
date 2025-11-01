package demo;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.empid = 101;
        e1.empName = "Sreeja";
        e1.department = "AI & ML";
        e1.print();

        Employee e2 = new Employee();
        e2.empid = 102;
        e2.empName = "samatha";
        e2.department = "CSE";
        e2.print();
        
        Employee e3 = new Employee();
        e3.empid = 102;
        e3.empName = "deekshitha";
        e3.department = "CSD";
        e3.print();
    }
}
