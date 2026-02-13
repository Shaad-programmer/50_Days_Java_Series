public class day_21 {
    // Check if an array is sorted (strictly increasing). - O(n)
    // public static boolean checkIfIncreasing(int arr[], int idx) {
    //     if(idx == arr.length-1) {
    //     return true;
    //     }
    //     if(!checkIfIncreasing(arr, idx+1)) {
    //     return false;
    //     }
    //     return arr[idx] < arr[idx + 1];
    // }
    //     public static void main(String args[]) {
    //     int arr1[] = {1, 2, 3, 4, 5};
    //     int arr2[] = {1, 6, 3, 4, 5};
    //     if(checkIfIncreasing(arr2, 0)) {
    //     System.out.println("Strictly Increasing");
    //     } else {
    //     System.out.println("NOT Strictly Increasing");
    //     }
    // }

    // Move all ‘x’ to the end of the string. - O(n)
    public static String addX(int count) {
        String newStr = "x";
        for(int i=1;i<count; i++) {
        newStr += 'x';
        }
        return newStr;
        }
        public static String moveAllX(String str, int idx, int count) {
        if(idx == str.length()) {
        return addX(count);
        }
        if(str.charAt(idx) == 'x') {

        return moveAllX(str, idx+1, count+1);
        } else {
        String nextStr = moveAllX(str, idx+1, count);
        return str.charAt(idx) + nextStr;
        }
    }
        public static void main(String args[]) {
        String str = "abcdefxghxixjxxxk";
        int count = 0;
        String newStr = moveAllX(str, 0, count);
        System.out.println(newStr);
    }
}
