
/**
 * Write a description of class Ejercicio1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class Punto
{
    private double x,y;
       
    public Punto (double x, double y){ 
        this.x = x;
        this.y = y;
    }
    public double anguloPolar(Punto p){
        return Math.atan(p.y/p.x);
    }
    public double radioPolar(Punto p){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
    double distanciaEuclidiana(Punto p1,Punto p2){
        return Math.sqrt(Math.pow(p2.x-p1.x,2)+Math.pow(p2.y-p1.y,2)); 
    }  
}

