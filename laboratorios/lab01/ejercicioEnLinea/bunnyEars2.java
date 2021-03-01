
/**
 * @author Diego Munera, Maria Antonia Velasquez 
 * 
 * El ejercicio bunnyEars2 devuelve de forma recursiva el numero de orejas en la linea que le corresponda al conejo.
 * @param bunnies numero de conejos en la fila
 * @return suma de orejas en la linea del conejo
 * 
 * Complejidad: O(n) lineal. 
 */
public class bunnyEars2
{
    public int bunnyEars2(int bunnies) {
        if(bunnies==0) return 0;
        else if(bunnies%2==0){
            return 3+bunnyEars2(bunnies-1);
        }
        return 2+bunnyEars2(bunnies-1);
    }
}
