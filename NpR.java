public class NpR {

    public static int numerator(int num){
        if(num==1){
            return 1;
        }
        int up = num*numerator(num-1);
        return up;
    }
    public static int dinominator(int den){
        if(den==1){
            return 1;
        }
        int dn = den*dinominator(den-1);
        return dn;
    }
    public static void main(String[] args) {

        int n = 5;
        int r = 3;
        int num = n;
        int den = n-r;
       int cn = numerator(num);
       int cdn = dinominator(den);
        System.out.println(cn/cdn);

    }
}
