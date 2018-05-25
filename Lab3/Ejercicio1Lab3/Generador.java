import java.util.ArrayList;
import java.util.Scanner;

public class Generador {

    Scanner scanner;
    private Prueba prueba;

    public Generador()
    {
        scanner = new Scanner(System.in);
        prueba = new Prueba();
    }

    public void menu()
    {
        int opcion = 0;
        while (true)
        {
            System.out.println("BIENVENDIDO AL GENERADOR DE PRUEBAS");
            System.out.println("[1] Generar prueba");
            opcion = scanner.nextInt();
            while (opcion != 1)
            {
                opcion = scanner.nextInt();
            }
            if (opcion == 1)
            {
                prueba.generarPrueba();
                for(int i = 0 ; i < 5 ; i++)
                {
                    System.out.println("Pregunta "+ (i+1) + ": " + prueba.getPreguntasPrueba().get(i));
                    System.out.println("Puntaje : " + prueba.getPuntajes().get(i));

                }
                break;
            }
        }
        System.out.println("FIN DEL PROGRAMA");
    }

}
