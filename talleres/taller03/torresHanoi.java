public class torresHanoi
{
    public static void torresDeHannoi(int n) {
        torresDeHannoi(n, 1, 2, 3);
    }

    private static void torresDeHannoi(int n, int origen, int intermedio, int destino) {
        if (n==1){   
            System.out.println("Mueva el disco 1 de la torre "+ origen + " a la "+ destino);
        } else {
            torresDeHannoi(n-1, origen, destino, intermedio);
            System.out.println("Mueva el disco "+ n + " de la torre "+ origen + " a la "+ destino);
            torresDeHannoi(n-1, intermedio, origen, destino);
        }
    }
}
