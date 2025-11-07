package Operators;

public class DemoonOperators {
	
    public static void main(String[] args) {
        // Arithmetic operators
        int x = 19, y = 21;
        boolean a=true, b=false;
        System.out.println("The addition value: " + (x + y)); //40
        System.out.println("The subtraction value: " + (x - y)); //-2
        System.out.println("The division value: " + (x / y)); //0
        System.out.println("The multiplication value: " + (x * y)); //399

        // Assignment operators
        int z = x;
        System.out.println("The value of z: " + z); //19
         z += y;
             System.out.println("The value of z: " + z); //40

        // Relational operators(<=,>=,==,!=)
        System.out.println(x == y); //false
        System.out.println(x < y); //True

        // Logical operators(&,^,&&,|)
   
        System.out.println("The result of AND operation: " + (x & y)); 
        System.out.println("The result of OR operation: " + (x | y)); 

        // Unary operators
        int d = 10;
        //post increment
        d++;
        System.out.println("Post-increment: " + d++); //11
        System.out.println(d); //12
        //pre increment
        ++d;
        System.out.println("Pre-increment: " + ++d);  //14
        d--;
        System.out.println(d);//13
        --d;
        System.out.println(d); //12
        

        // Ternary operator
        int al = 10, bl = 5;
        int max = (al > bl) ? al : bl;
        System.out.println("The maximum value is: " + max); //10
    }
}
