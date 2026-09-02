public class Java_Exception_Handling { 
    // Changed return type to void so it runs as a standard main method
    public static void main(String[] args) { 
        int a = 5; 
        int b = -5; 
        int min = a + b; 
        
        try { 
            min = a - b < min ? a - b : min; 
            min = a * b < min ? a * b : min; 
            min = a / b < min ? a / b : min; 
        } catch (Exception e) { 
            System.out.println("Exception caught!");
        } 
        
        // Prints the final calculated value: -25
        System.out.println( min); 
    } 
}
