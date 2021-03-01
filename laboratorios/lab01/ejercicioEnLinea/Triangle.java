
/**
 * @author Diego Munera, Maria Antonia Velasquez 
 * 
 * El ejercicio Triangle calcula de forma recursiva el numero total de bloques que ocupan dicho triangulo dado un numero de filas.
 * @param rows numero de filas
 * @return numero de bloques en el triangulo 
 * 
 * Complejidad: O(n) lineal.
 */
public class Triangle
{
    public int triangle(int rows){
        if(rows==0) return 0;
        return rows + triangle(rows-1);
    }
}
