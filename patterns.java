public class patterns {
    public static void main(String[] args) {
        int i = 1;
        int j= 1;
        int n=4;
        int m=5;


         //outer loop...
        for(i=1; i<=n;i++) {
            //inner loop....
             for(j=1; j<=m;j++) {
                 System.out.print(" * ");
             }
            System.out.println();
        }
        
    }
}
