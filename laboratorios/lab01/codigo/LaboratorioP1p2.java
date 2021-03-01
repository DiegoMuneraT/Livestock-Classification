/*
 *Solución a los problemas planteados en el laboratorio #1 de Estructuras de datos
 */
 

/**
 *
 * @author Maria Antonia Velásquez, Diego Múnera
 * Esta clase contiene los métodos que resuelven el punto 1.2 del laboratorio 1
 * 
 */
public class LaboratorioP1p2{
    /**
     * Este método calcula cuántas maneras hay para completar un rectangulo de
     * dimensiones 1x2 en un rectangulo de 2*n
     * @param n lado n del rectangulo 2*n
     * @return numero de maneras en la que puede ser organizado un rectangulo 2*n
     */
    public static int ways(int n){
        if(n<=2){
            return n;
        }
        return ways(n-2) + ways(n-1);
    }
}