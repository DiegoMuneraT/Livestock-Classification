public class splitArrayR2
{
   /* Ejercicio 5, splitArray
    * Dada una matriz de ints, es posible dividir las ints en dos grupos, de modo que las sumas de los dos grupos sean iguales. 
    * Cada int debe estar en un grupo u otro. Escriba un método auxiliar recursivo que tome los argumentos que desee y realice 
    * la llamada inicial a su ayudante recursivo desde splitArray (). (No se necesitan bucles).
   */
   public boolean splitArray(int start, int a, int b, int[] nums){
        if(start >= nums.length){
            return a==b;
        } else {
            return splitArray(start+1, a+nums[start], b, nums) || splitArray(start+1, a, b+nums[start], nums);
        }
   }
   // Complejidad: O(2^n) exponencial.
}
