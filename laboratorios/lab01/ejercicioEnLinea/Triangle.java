
/**
 * Write a description of class Triangle here.
 * 
 * @author Diego Munera, Maria Antonia Velasquez 
 * Numero de cuadros que puede tener un triangulo dado cierta cantidad de rows
 */
public class Triangle
{
    public int triangle(int rows){
        if(rows==0) return 0;
        return rows + triangle(rows-1);
    }
}
