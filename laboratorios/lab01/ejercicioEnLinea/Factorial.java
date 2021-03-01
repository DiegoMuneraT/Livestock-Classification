
/**
 * Write a description of class Factorial here.
 * 
 * @author Diego Munera, Maria Antonia Velasquez
 * Factorial de un numero
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
