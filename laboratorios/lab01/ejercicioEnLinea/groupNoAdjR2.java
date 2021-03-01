public class groupNoAdjR2
{
    /* Ejercicio 4, groupNoAdj
    * Dada una matriz de enteros, ¿es posible elegir un grupo de algunos de los enteros,
    * de modo que el grupo sume al objetivo dado con esta restricción adicional: 
    * si se elige un valor en la matriz para que esté en el grupo, el valor inmediatamente seguirlo en la matriz no debe ser elegido. 
    * (No se necesitan bucles).
   */
   public boolean groupNoAdj(int start, int[] nums, int target) {
        if(start >= nums.length){
            return target == 0;
        } else {
            return groupNoAdj(start+1, nums, target) || groupNoAdj(start+2, nums, target-nums[start]);
        }
   }
   // Complejidad: O(2^n) exponencial.
}
