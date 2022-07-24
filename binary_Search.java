public class binary_Search {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50,60,70,80,90,100};

        int target = 73;
        int fc = 0;
        int bc = a.length-1;


        while(fc<=bc){
            int mid = (fc + bc)/2;
            if(target > a[mid]){
                fc = mid + 1;
            } else if (target < a[mid]) {
                bc = mid - 1;
            }else {
                System.out.println(mid);
                break;
            }
        }
        if(fc>bc) {
            System.out.println(-1);
        }
    }
}
