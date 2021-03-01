
/**
 * @author Diego Munera, Maria Antonia Velasquez 
 * Serie de fibonacci para un n dado 
 * 
 * @param n numero 
 * @return nesimo numero fibonacci
 * 
 * Complejidad: O(2''n) exponencial. 
 */
public class Fibonacci
{
    public int fibonacci(int n){
        if(n==0 | n==1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
