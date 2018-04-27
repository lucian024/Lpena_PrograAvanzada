import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args){

        Random aleatorio = new Random(System.currentTimeMillis());
        Scanner scanner = new Scanner(System.in);
        Participante p1,p2,p3;
        String nom1,nom2,nom3;
        int adivinar;

        //Peticion nombre a participantes
        System.out.println("Ingrese nombre de los 3 participantes :");
        nom1 = scanner.nextLine();
        nom2 = scanner.nextLine();
        nom3 = scanner.nextLine();

        //Instanciacion de jugadores
        p1 = new Participante(nom1);
        p2 = new Participante(nom2);
        p3 = new Participante(nom3);

        //Asignacion de valor al numero para adivinar
        adivinar = aleatorio.nextInt(11);

        //Instrucciones usuario
        System.out.println("Cada uno ingrese un numero entre 0 y 10 en el orden que se indicara");
        System.out.println();
        System.out.println(p1.getNombre());
        p1.setNumero(scanner.nextInt());

        System.out.println(p2.getNombre());
        p2.setNumero(scanner.nextInt());

        System.out.println(p3.getNombre());
        p3.setNumero(scanner.nextInt());

        //RESULTADOS DEL JUEGO
        System.out.println("EL numero que debian adivinar era el numero :" + adivinar);

        if (p1.getNumero() == adivinar)
        {
            System.out.println(p1.getNombre() + "ha adivinado ");
        } else {
            System.out.println(p1.getNombre() + " no ha adivinado ");
        }

        if (p2.getNumero() == adivinar)
        {
            System.out.println(p2.getNombre() + "ha adivinado ");
        } else{

            System.out.println(p2.getNombre() + " no ha adivinado ");
        }

        if (p3.getNumero() == adivinar)
        {
            System.out.println(p3.getNombre() + "ha adivinado ");
        } else{

            System.out.println(p3.getNombre() + " no ha adivinado ");
        }

        System.out.println("*******FIN*********");


    }
}
