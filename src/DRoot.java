public class DRoot {
    public static int digital_root(int n) {
        int sum = n;
        while (sum>9){
            sum = returnSum(sum);
        }
        return sum;
    }

    public static int returnSum(int n){
        int a = 0;
        while (n!=0){
            a+= n%10;
            n=n/10;
        }
        return a;
    }
}