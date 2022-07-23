public class sub_Array_Of_An_Array {
    public static void main(String[] args) {

        int[] a = {1,2,3};

        for (int i = 0; i<a.length ; i++){
            for (int j = i; j<a.length ; j++){
                for (int k = i; k<=j ; k++){
                    System.out.print(a[k]+ "\t");
                }
                System.out.println();
            }
        }
    }
}
