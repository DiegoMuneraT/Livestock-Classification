
/**
 * @author Diego Munera, Maria Antonia Velasquez
 * 
 * Este ejercicio calcula el factorial de n de forma recursiva. 
 * @param  n numero a calcular
 * @return factorial de n
 * 
 * Complejidad: O(n) lineal. 
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
