
/**
 * Write a description of class Fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fecha
{
    private final int dia;
    private final int mes;
    private final int año;
    
    public Fecha(int dia, int mes, int año){
        this.dia = dia;
        this.año = año;
        this.mes = mes;
    }
    public int dia(){
        return dia;
    }
    public int mes(){
        return mes;
    }
    public int año(){
        return año;
    }
    /** -1 Menor, 0 Igual, 1 Mayor*/
    public int comparar(Fecha otro){
        if(this.año<otro.año){
            return -1;
    }else if(this.mes<otro.mes){
        return -1;
    }else if(this.dia<otro.dia){
        return -1;
    }else{return 1;}
}
    public String toString(){
        return (this.dia)+"/"+(this.mes)+"/"+(this.año);
    }
}
