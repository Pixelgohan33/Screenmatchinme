import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int fdl = 2014;
        double evaluacion=2;
        //Incluido en el plan basico
        boolean InclPB=true;
        double mediaeval = (1 + 5 + 3) / 3;
        double mediaflash = 0;
        String nombre= "The flash";
        String Sinopsis= """
                         
                         """;
        System.out.println("Titulo: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fdl);
        System.out.println("Calificacion: " + evaluacion);
        System.out.println("Empezar a ver: " + InclPB);
        System.out.println("La evaluacion media de la pelicula " + nombre + "es: " + mediaeval);

        if (fdl >= 2019) {
            System.out.println("La mejor serie del momento");
        } else{
            System.out.println("Serie retro popular del momento");
        }
        while (count < 3 ) {
            count++;
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la calificacion que le das a " + nombre);
            double calflash = teclado.nextDouble();

            mediaflash = mediaflash + calflash;
        }
        System.out.println("La media de la calificacion es: " + mediaflash / 3);
    }
}
