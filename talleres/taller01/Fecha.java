public class Fecha 
{
    private final int dia;
    private final int mes;
    private final int año;
    public Fecha(int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.año = a;
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
    public int comparar(Fecha otra){
        if (this.dia < otra.dia || this.mes < otra.mes || this.año < otra.año){
            return -1;
        } else if (this.dia == otra.dia || this.mes == otra.mes || this.año == otra.año){
            return 0;
        } else {
            return 1;
        } 
    }
    public String toString(){
        return (this.dia)+"/"+(this.mes)+"/"+(this.año);
    }
}