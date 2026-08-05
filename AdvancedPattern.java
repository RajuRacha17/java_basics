public class AdvancedPattern {
       public static void Floyds_Triangle (int n ) {
        int count = 1;    
        /// Outer loop...
        for (int i = 1; i<=n ; i++) {
         
          ///Inner Loop...
          for (int j =1; j<=i; j++){
            System.out.print(count + " ");
            count++;
          }
          System.out.println();
        }
       }
      
    
    public static void main(String[] args) {
    
      Floyds_Triangle (5);

    }
}
