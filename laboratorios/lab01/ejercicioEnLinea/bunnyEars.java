
/**
 * Write a description of class bunnyEars here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bunnyEars
{
    public int bunnyEars(int bunnies){
        if(bunnies==0) return 0;
        return 2 + bunnyEars(bunnies-1);
    }
}
