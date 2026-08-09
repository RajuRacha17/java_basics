package Functions_Methods;

public record Fun_Over_datatypes() {
    public static int sum (int a , int b ) {
        return a+b;
    }

    public static float sum (float a , float b) {
        return a+b;
    }
    public static void main(String[] args) {
        int integer = sum(5, 6);
        float float_ = sum(10, 1);
        System.out.println(integer);
        System.out.println(float_);
    }
}
