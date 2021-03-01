public class split53R2
{
    /* Ejercicio 3, split53
    * Dada una matriz de ints, ¿es posible dividir las ints en dos grupos, de modo que la suma de los dos grupos sea la misma,
    * con estas restricciones: todos los valores que son múltiplos de 5 deben estar en un grupo, y todos los los valores que son múltiplos de 3 
    * (y no múltiplos de 5) deben estar en el otro. (No se necesitan bucles).
   */
   public boolean split53(int start, int a, int b, int[] nums) {
        if(start>=nums.length){
            return a==b;
        } else {
            if(nums[start]%5==0){
                return split53(start+1, a+nums[start], b, nums);
            } else if(nums[start]%3==0){
                return split53(start+1, a, b+nums[start], nums);
            } else {
                return split53(start+1, a+nums[start], b, nums) || split53(start+1, a, b+nums[start], nums);
            }
        }
   }
   // Complejidad: O(2^n) exponencial.
}
