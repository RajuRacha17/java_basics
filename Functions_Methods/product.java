package Functions_Methods;

public class product {

    public static int multiply (int a , int b ){
        int product = a*b;
        return product;
    }

    public static void main(String[] args) {
        int a = 100;
        int b = 300;
        int prod = multiply(a, b);
        System.out.println("the product a * b is : " + prod);


    }
    
}
