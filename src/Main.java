import java.util.Scanner;

public class Main {

    public static void main (String [] args){

        // Creacion de las variables
        double altura = 0;
        double angulo = 0;
        double longitud = 0;

        //Metodo para lectura de los valores
        Scanner lectura = new Scanner(System.in);

        // Captura de la altura requerida
        System.out.println("Ingrese la altura donde requiere la escalera: ");
        altura = Double.parseDouble(lectura.next());

        // Captura del angulo de inclinacion
        System.out.println("Ingrese el angulo de inclinacion de la escalera (valor en grados)");
        angulo = Double.parseDouble(lectura.next());

        //Evaluacion de la formula
        longitud =Math.round(altura / Math.sin(angulo*Math.PI/180));

        //Presentacion de los resultados
        System.out.println("Se requiere una escalera con una longitud de: "+longitud);

    }
}
