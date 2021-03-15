public class Array2CB
{
    /*
     * En la siguiente clase se presentan soluciones a ejercicios propuestos en la página de código en línea Codingbat bajo los temas Array2 y Array3
     * @author Maria Antonia Velasquez, Diego Alexander Munera
     * @see <a href="https://www.youtube.com/watch?v=axtGlP4pY1s&list=PLmNBlRdifvGriOJBKdYT7B2q7r39cJrtV"> Soluciones propuestas </a>
    */
   
    
    /* Ejercicio 1, countEvens
     * Devuelve el número de ints pares en la matriz dada. 
     * Nota: el operador% "mod" calcula el resto, por ejemplo, 
     * 5% 2 es 1
    */
    public int countEvens(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i]%2 == 0){
                count++;
            }
        }
        return count;
    }
    // Complejidad: O(n)
    // n=longitud del arreglo nums
    
    
    /* Ejercicio 2, fizzArray
     * Dado un número n, cree y devuelva una nueva matriz int de longitud n, 
     * que contenga los números 0, 1, 2, ... n-1. La n dada puede ser 0, 
     * en cuyo caso solo devuelve una matriz de longitud 0
    */
    public int[] fizzArray(int n){
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = i;
        }
        return ans;
    }
    // Complejidad: O(n)
    // n=longitud del arreglo a crear
    
    
    /* Ejercicio 3, lucky13 
     * Dada una matriz de enteros, devuelve verdadero si la matriz no contiene 1 ni 3.
    */
    public boolean lucky13(int[] nums){
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==1 || nums[i]==3){
                return false;
            }
        }
        return true;
    }
    // Complejidad: O(n)
    // n=longitud del arreglo nums
    
    
    /* Ejercicio 4, notAlone
     * Diremos que un elemento en una matriz está "solo" si hay valores antes y después, 
     * y esos valores son diferentes de él. 
     * Devuelve una versión de la matriz dada donde cada instancia del valor dado que está solo 
     * se reemplaza por el valor a su izquierda o derecha que sea mayor.
    */
    public int[] notAlone(int[] nums, int val){
        for(int i = 1; i < nums.length - 1; i++){
            if(nums[i]==val && nums[i-1]!=nums[i] && nums[i+1]!=nums[i]){
                nums[i] = Math.max(nums[i-1], nums[i+1]);
            }
        }
        return nums;
    }
    // Complejidad: O(n)
    // n=cantidad de elementos del arreglo nums
    
    
    /* Ejercicio 5, sum13
     * Devuelve la suma de los números de la matriz, devolviendo 0 para una matriz vacía. 
     * Excepto que el número 13 es muy desafortunado, por lo que no cuenta y los números que vienen 
     * inmediatamente después del 13 tampoco cuentan.
    */
    public int sum13(int[] nums){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 13){
                i++;
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }
    // Complejidad: O(n)
    // n=cantidad de elementos del arreglo nums
    
}
