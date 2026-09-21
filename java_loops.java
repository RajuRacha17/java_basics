import java.util.ArrayList;

public class java_loops {
    static ArrayList<Integer> getSum(int N) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        
        int even =0;
        int odd =0;
        
         for(int i =0; i<=N;i++){
            if(i%2==0){
                even =even+i;
            }else{
                odd = odd+i;
            }
     }
        res.add(even);
        res.add(odd);
        return res;
    }
    public static void main(String[] args) {
        getSum(6);
        ArrayList<Integer> result = getSum(6);
        System.out.println(result);
    }
}
