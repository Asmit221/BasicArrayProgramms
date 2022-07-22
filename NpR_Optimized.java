public class NpR_Optimized {

    public static int factorial(int x){
        if(x==0){
            return 1;
        }
        return x*factorial(x-1);
    }
    public static void main(String[] args) {
        int n = 5;
        int r = 3;

        int numerator = factorial(n);
        int denominator = factorial(n-r);

        int npr = numerator/denominator;
        System.out.println(npr);

    }
}
