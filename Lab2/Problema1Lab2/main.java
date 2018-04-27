import java.util.Scanner;

public class main {
    public  static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Container container = new Container();
        String nombreBuscador;
        int menuOn=1 , opcion;

        //MENU
        while(menuOn==1)
        {
            System.out.println("INGRESE (1) PARA AGREGAR NUEVA FICHA");
            System.out.println("INGRESE (2) PARA BUSCAR FICHA POR NOMBRE");
            System.out.println("INGRESE (3) PARA BUSCAR FICHA POR ALTURA");

            opcion = scanner.nextInt();

            //AGREGAR FICHA
            if (opcion==1)
            {
                container.crearFicha();
                System.out.println("FICHA CREADA EXITOSAMENTE!");
            }
            if (opcion==2)
            {
                System.out.println("INGRESE NOMBRE DE LA PERSONA A BUSCAR: ");
                scanner.nextLine();
                nombreBuscador = scanner.nextLine();
                container.buscarNombre(nombreBuscador);
            }

        }
    }
}
