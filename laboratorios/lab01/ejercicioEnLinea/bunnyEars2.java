
/**
 * Write a description of class bunnyEars2 here.
 * 
 * @author Diego Munera, Maria Antonia Velasquez 
 * Este ejercicio retorna las orejas de los conejos dependiendo si estos son 
 * pares o impares. 
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
