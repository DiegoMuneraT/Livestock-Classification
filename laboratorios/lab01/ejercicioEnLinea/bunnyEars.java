
/**
 * @author Diego Munera, Maria Antonia Velasquez
 * 
 * El ejercicio bunnyEars calcula el numero total de orejas de los conejos dados de forma recursiva. 
 * 
 * @param bunnies, numero de conejos
 * @return numero de orejas que tienen en total los conejos (teniendo en cuenta que basicamente cuentan con 2 cada uno)
 * 
 * Complejidad: O(n) lineal.
 */
public class bunnyEars
{
    public int bunnyEars(int bunnies){
        if(bunnies==0) return 0;
        return 2 + bunnyEars(bunnies-1);
    }
}
