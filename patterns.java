public class patterns {
    public static void main(String[] args) {
        int i = 1;
        int j= 1;
        int n=4;
        int m=5;


        //Outer loop 
        for (i=1; i<=n; i++) {
            //Inner Loop
            for (j=1; j<=m; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        
    }
}
  