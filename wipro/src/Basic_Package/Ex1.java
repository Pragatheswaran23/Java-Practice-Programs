package Basic_Package;

public class Ex1 {
	public static void main (String [] args) {
	        // Check if exactly two command line arguments are provided
	        if (args.length != 2) {
	            System.out.println("Please provide exactly two command line arguments.");
	            return;
	        }

	        // Get the command line arguments
	        String firstArgument = args[0];
	        String secondArgument = args[1];

	        // Generate the required output format
	        String result = firstArgument + " technologies " + secondArgument;

	        // Print the result
	        System.out.println(result);
	    
	} 

}