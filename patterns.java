public class patterns {
    public static void main(String[] args) {
        
        char ch = 'A';
        int n = 4;

    //inverted star Pattern
        //outer loop.....
        for (int i=1; i<=n; i++) {
            //inner loop......
            for (int j=1; j<=i; j++) {     //  printed the Characters.... 
                System.out.print( ch );  // by syso of ( ch ),  ch++;
                ch++;                          
            }                                                    
        System.out.println();
        }
      
    } 
}
