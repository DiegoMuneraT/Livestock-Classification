
/**
 * Write a description of class Factorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Factorial
{
   public int factorial(int n) {
       if(n==1){
           return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}
