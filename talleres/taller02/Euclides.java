public class Euclides
{
    public static int gcd (int p, int q){
        int res = p % q;
        if (res == 0){
            return q;
        } else {
            return gcd (q, p % q);
        }
    }
}
