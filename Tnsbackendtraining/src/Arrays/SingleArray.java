package Arrays;

public class SingleArray {

	    public static void main(String[] args) {
	        // Create an array
	        int[] arr = new int[5];

	        // Pass elements by index
	        arr[0] = 12;
	        arr[1] = 123;
	        arr[2] = 98;
	        arr[3] = 78;
	        arr[4] = 66;
	        

	        // Iterate using a for loop
	        
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println("Element at index " + arr[i]);
	        }

	        // Iterate using an enhanced for loop
	        System.out.println("enhanced for loop");
	        for (int num : arr) {
	            System.out.println("Element: " + num);
	        }
	    }
	}


