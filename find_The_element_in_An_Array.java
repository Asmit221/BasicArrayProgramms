import java.util.Scanner;

public class find_The_element_in_An_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int e = sc.nextInt();
        int[] a = new int[e];

        for(int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        for(int i = 0;i<a.length;i++){
            if(a[i] == target){
                System.out.println(i);
            }else
                System.out.println(-1);
                break;
        }
    }
}
