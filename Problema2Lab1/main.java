import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Plato plato;
        Ingredientes ingrediente;
        Libro libro;
        String nombrePlato, tipoPlato;
        String nomIngrediente;
        int AgregarPlato, agregarIngrediente, numPersonas;
        int cantidadIngrediente;

        libro = new Libro();
        System.out.println("CREA TU LIBRO DE RECETAS!");
        System.out.println("INGRESE; (1) PARA AGREGAR PLATO: ");
        AgregarPlato = scanner.nextInt();

        while (AgregarPlato ==1)
        {

            scanner.nextLine();
            //SE PIDEN DATOS SOBRE EL PLATO
            System.out.print("NOMBRE DEL PLATO: ");
            nombrePlato = scanner.nextLine();
            System.out.print("ENTRADA, ALMUERZO O CENA :");
            tipoPlato = scanner.nextLine();
            System.out.print("¿PARA CUANTAS PERSONAS SERA? : ");
            numPersonas =  scanner.nextInt();
            plato = new Plato(nombrePlato,tipoPlato,numPersonas );

            //SE AGREGAN LOS INGREDIENTES
            agregarIngrediente = 1;
            while (agregarIngrediente ==1)
            {
                scanner.nextLine();
                System.out.print("Ingrese nombrePlato ingrediente: ");
                nomIngrediente = scanner.nextLine();

                System.out.print("Ingrese cantidad: ");
                cantidadIngrediente = scanner.nextInt();

                ingrediente = new Ingredientes(nomIngrediente,cantidadIngrediente);
                plato.agregarIngrediente(ingrediente);

                System.out.println("INGRESE ; (0) FIN DEL PLATO ; (1) AGREGAR OTRO INGREDIENTE");
                agregarIngrediente = scanner.nextInt();
            }
            System.out.println("FIN DEL PLATO");
            System.out.println("---------------------");
            libro.agregarPlato(plato);
            //SOLICITUD A USUARIO
            System.out.println("INGRESE; (1) PARA AGREGAR PLATO ; (2) TERMINAR LIBRO ");
            AgregarPlato = scanner.nextInt();

        }

        System.out.println("FIN DEL LIBRO");
        System.out.println("LOS PLATOS CREADOS SON: ");
        libro.mostrarRecetas();

        System.out.println("****FIN DEL PROGRAMA****");



    }
}
