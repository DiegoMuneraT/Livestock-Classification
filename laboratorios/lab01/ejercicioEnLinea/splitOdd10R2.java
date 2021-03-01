public class splitOdd10R2
{
   /* Ejercicio 1, splitOdd10
     * Dada una matriz de enteros, ¿es posible dividirlos en dos grupos,
     * de modo que la suma de un grupo sea múltiplo de 10 y la suma del otro grupo sea impar? 
     * Cada int debe estar en un grupo u otro. Escriba un método auxiliar recursivo que tome 
     * los argumentos que desee y realice la llamada inicial a su ayudante recursivo desde splitOdd10 ().
     * (No se necesitan bucles).
    */
   public boolean splitOdd10(int start, int a, int b, int[] nums){
       if(start >= nums.length){ 
           return (a%10==0 && b%2!=0 || b%10==0 && a%2!=0);
       } else { 
            return (splitOdd10(start+1, a+nums[start], b, nums) ||  splitOdd10(start+1, a, b+nums[start], nums));
       }
   }
   // Complejidad: O(2^n) exponencial.
}

