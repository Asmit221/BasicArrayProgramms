public class SpanOfAnArray {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};

        int max = a[0];
        int min = a[0];

        for(int i = 0; i<a.length; i++){
           if(a[i]>max){
               max = a[i];
           }
           if(a[i]<min){
               min = a[i];
           }
        }
        int span = max - min;
        System.out.println(span);
    }
}
