public class Array3CB
{
    /*
     * En la siguiente clase se presentan soluciones a ejercicios propuestos en la página de código en línea Codingbat bajo los temas Array2 y Array3
     * @author Maria Antonia Velasquez, Diego Alexander Munera
     * @see <a href="https://www.youtube.com/watch?v=ht4B00lCejM&list=PLmNBlRdifvGpK9lP3brrINyYDhcO6K8lK"> Soluciones propuestas </a>
    */
   
   
    /* Ejercicio 3, linearIn
     * Dadas dos matrices de enteros ordenados en orden creciente, exterior e interior , 
     * devuelve verdadero si todos los números del interior aparecen en el exterior
    */
    public boolean linearIn(int[] outer, int[] inner){
        int indexInner = 0, indexOuter = 0;
        while(indexInner<inner.length && indexOuter<outer.length){
            if(outer[indexOuter] == inner[indexInner]){
                indexOuter++;
                indexInner++;
            } else {
                indexOuter++;
            }
        }
        return (indexInner == inner.length);
    }
    // Complejidad: O(n)
    // n=longitud de la matriz de enteros exterior
    
    
    /* Ejercicio 1, canBalance
     * Dada una matriz no vacía, devuelve verdadero si hay un lugar para dividir la matriz 
     * de modo que la suma de los números de un lado sea igual a la suma de los números del otro lado
     */
    public boolean canBalance(int[] nums){
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = 0; j < i; j++)
                sum += nums[j];
            for(int j = i; j < nums.length; j++)
                sum -= nums[j];
            if(sum == 0){
                return true;
            }
        }
        return false;
    }
    // Complejidad: O(n)
    // n=longitud del arreglo nums
    
    
    /* Ejercicio 2, countClumps
     * Supongamos que un "grupo" en una matriz es una serie de 2 o más elementos adyacentes del mismo valor. 
     * Devuelve el número de grupos en la matriz dada
     */
    public int countClumps(int[] nums){
        int clumps = 0;
        boolean isClump = false;
        for(int i = 0; i < nums.length; i++){
            if(isClump){
                if(nums[i] != nums[i+1]){
                    isClump = false;
                } else if(nums[i] == nums[i+1]){
                    isClump = true;
                    clumps++;
                }
            }
        }
        return clumps;
    }
    // Complejidad O(n)
    // n=longitud del arreglo nums
    
    
    /* Ejercicio 4, maxSpan
     * Considere las apariencias más a la izquierda y más a la derecha de algún valor en una matriz. 
     * Diremos que el "intervalo" es el número de elementos entre los dos inclusive. Un solo valor tiene un intervalo de 1. 
     * Devuelve el intervalo más grande encontrado en la matriz dada
    */
    public int maxSpan(int[] nums){
        int ans = 0;
        for(int k = 0; k < nums.length; k++){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == nums[k]){
                    int temp = k - i + 1;
                    if(temp > ans){
                        ans = temp;
                    }
                }
            }
        }
        return ans;
    }
    // Complejidad O(n^2)
    // n=longitud del arreglo nums
    
    
    /* Ejercicio 5, seriesUp
     * Dado n> = 0, cree una matriz con el patrón {1, 1, 2, 1, 2, 3, ... 1, 2, 3 .. n} 
     * (espacios agregados para mostrar la agrupación)
    */
    public int[] seriesUp(int n){
        int[] array = new int[n*(n+1)/2];
        int j = 0;
        for(int i = 1; i <= n; i++){
            for(int k = 1; k < (i+1); k++){
                array[j] = k;
                j++;
            }
        }
        return array;
    }
    // Complejidad O(n^2)
    // n=numero enésimo de la serie
}
