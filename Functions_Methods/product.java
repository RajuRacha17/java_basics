package Functions_Methods;

public class product {

    public static int multiply (int a , int b ){
        // multiplying a and b stored in Variable product 
        int product = a*b;
        return product;
    }

    public static void main(String[] args) {
        // initialising variables and storing the values 
        int a = 5;
        int b = 4;
        int prod = multiply(a, b);
        System.out.println("the product a * b is : " + prod);


    }
    
}
