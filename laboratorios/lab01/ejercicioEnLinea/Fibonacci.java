
/**
 * Write a description of class Fibonacci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fibonacci
{
    public int fibonacci(int n){
        if(n==0 | n==1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
