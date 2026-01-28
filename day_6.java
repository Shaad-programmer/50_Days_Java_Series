public class day_6 {
    public static void main(String[] args) {
        // 1st problem
        // int n=4;
        // for(int i= 1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        // 2nd problem
        // int n=4;
        // for(int i= n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 3rd problem
        // int n=4;
        // for(int i=1; i<=n; i++){
        //     //spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     // stars
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

        // 4th problem
        int n=5;
        for(int i=1; i<=n; i++){
            for( int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
