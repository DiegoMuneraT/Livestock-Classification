/*
 *Solución a los problemas planteados en el laboratorio #1 de Estructuras de datos
 */
 

/**
 *
 * @author Diego Múnera, Maria Antonia Velásquez
 * Esta clase contiene los métodos que resuelven el punto 1.1 del laboratorio 1
 * 
 */
public class LaboratorioP1{
    
    /**
     * En este método se calcula la longitud de la subsecuencia más larga en común entre 2 cadenas
     * @param string1 Primera cadena
     * @param string2 Segunda cadena
     * @return longitud de la subsecuencia más larga en común
     */
    public static int lcsDNA(String string1, String string2){
        return lcsDNAAux(string1,string2,string1.length(),string2.length());
    }
    /**
     * Este es un método auxiliar para lcsDNA
     * @param string1 primera cadena de caracteres
     * @param string2 segunda cadena de caracteres
     * @param m longitud de la cadena 1
     * @param n longitud de la cadena 2
     * @return longitud de la subsecuencia más larga entre ambas cadenas
     */
    private static int lcsDNAAux(String string1, String string2, int m, int n) {
        if(n==0 | n==0){
            return 0;
        }
        if(string1.charAt(m-1)==string2.charAt(n-1)){
            return 1 + lcsDNAAux(string1,string2, m-1, n-1);
        }
        return Math.max(lcsDNAAux(string1, string2, m-1,n), lcsDNAAux(string1, string2, m, n-1));
    }
    

}
