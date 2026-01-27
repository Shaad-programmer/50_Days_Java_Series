public class day_5 {
    public static void main(String[] args) {
            {
                // 1st problem
            int x= 4;
            int y= 5;
            for(int i=1; i<=x; i++){
                for(int j=1; j<=y; j++){
                System.out.print("*");
                }
                System.out.println("*");
            }
            System.out.println("\n");
            // 2nd problem
            int n=4;
            int m=5;
            //outer loop
            for(int p=1; p<=n; p++){
                //inner loop
                for(int q=1; q<=m; q++){
                    //cell -> (i,j)
                    if(p == 1 || q == 1 || p == n || q == m){
                        System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
                }
                System.out.println();    
            }
        }
    }
}
