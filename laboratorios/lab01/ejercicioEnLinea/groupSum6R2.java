public class groupSum6R2
{
    /* Ejercicio 2, groupSum6
    * Dada una matriz de ints, ¿es posible elegir un grupo de algunos de los ints, comenzando por el índice de inicio,
    * de modo que el grupo sume al objetivo dado? Sin embargo, con la restricción adicional de que se deben elegir los 6.
    * (No se necesitan bucles).
   */
   public boolean groupSum6(int start, int[] nums, int target) {
        if(start==nums.length){
            return target == 0;
        } else {
           if(nums[start] == 6){
                return groupSum6(start+1, nums, target-6);
           }
           return groupSum6(start+1, nums, target) || groupSum6(start+1, nums, target-nums[start]);
        }
   }
   // Complejidad: O(2^n) exponencial.
}
