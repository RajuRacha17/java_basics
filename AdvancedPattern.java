public class AdvancedPattern {
    public static void Hollow_Rectangle (int totRows , int totCol ) {
      //outer loop...
      for(int i =1; i<=totRows;i++) {
        //Inner loop....
        for ( int j=1; j<=totCol; j++) {

           if (i ==1 || i == totRows || j ==1 ||j ==totCol ) {
            System.out.print("*");
           } else {
            System.out.print(" ");
           }
        }
        System.out.println();
      }
    }
    public static void main(String[] args) {
    Hollow_Rectangle(4,5);

    }
}
