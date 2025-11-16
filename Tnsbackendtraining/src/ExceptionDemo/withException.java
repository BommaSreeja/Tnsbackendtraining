package ExceptionDemo;

public class withException {

	    public static void main(String[] args) {
	        try {
	            int a = 10;
	            int b = 2;
	            int divide = a / b;
	            System.out.println("The result is " + divide);
	            
                int[] arr = new int[3];
                arr[0] = 84;
                arr[1]= arr[156]; // or some other operation
                arr[2]= arr[223]; // or some other operation
                arr[3]= arr[35]; // This will throw ArrayIndexOutOfBoundsException
                System.out.println("the array data of index 5"+arr[5]);
	        } 
	 
	        catch (ArithmeticException e) {
	            System.out.println("Division by zero is not allowed");
	        }
	     

	        catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("The given index is not existing");
            }
	            }
	        
	    }
	


