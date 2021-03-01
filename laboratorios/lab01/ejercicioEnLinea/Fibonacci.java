
/**
 * Write a description of class Fibonacci here.
 * 
 * @author Diego Munera, Maria Antonia Velasquez 
 * Sucesión de fibonacci para un n dado 
 */
public class Fibonacci
{
    public int fibonacci(int n){
        if(n==0 | n==1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
