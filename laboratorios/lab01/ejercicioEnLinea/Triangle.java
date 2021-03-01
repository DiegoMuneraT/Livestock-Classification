
/**
 * Write a description of class Triangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangle
{
    public int triangle(int rows){
        if(rows==0) return 0;
        return rows + triangle(rows-1);
    }
}
