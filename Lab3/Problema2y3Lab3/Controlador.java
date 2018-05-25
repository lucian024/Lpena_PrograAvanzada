
import java.util.Random;
import java.util.Scanner;

public class Controlador {

    Random random;
    Automovil auto;
    Scanner scanner;
    Estacionamiento estacionamiento;

    Controlador()
    {
        random = new Random(System.currentTimeMillis());
        estacionamiento = new Estacionamiento();
        scanner = new Scanner(System.in);
    }

    public void generarAutos()
    {
        int cantidadTotalAuto = 7 ,crearAuto = 0 , kilometraje;

        kilometraje = random.nextInt(2001);
        auto =  new Automovil("Jeep Full" , 60 , kilometraje);
        estacionamiento.agregarAutoEstacionamiento(auto);

        kilometraje = random.nextInt(2001);
        auto = new Automovil("Mazda 2", 20 , kilometraje);
        estacionamiento.agregarAutoEstacionamiento(auto);

        kilometraje = random.nextInt(2001);
        auto = new Automovil("Peugeot 207", 40, kilometraje);
        estacionamiento.agregarAutoEstacionamiento(auto);

        while (cantidadTotalAuto > 0)
        {
            crearAuto = random.nextInt(3);
            kilometraje = random.nextInt(2001);
            switch (crearAuto)
            {
                case 0: auto = new Automovil("Peugeot 207", 40, kilometraje);
                        estacionamiento.agregarAutoEstacionamiento(auto);
                        cantidadTotalAuto--;
                        break;
                case 1: auto = new Automovil("Mazda 2", 20 , kilometraje);
                        estacionamiento.agregarAutoEstacionamiento(auto);
                        cantidadTotalAuto--;
                        break;
                case 2: auto =  new Automovil("Jeep Full" , 60 , kilometraje);
                        estacionamiento.agregarAutoEstacionamiento(auto);
                        cantidadTotalAuto--;
                        break;
            }

        }
    }

    public void menu()
    {
        int opcion = 0;
        while(true)
        {
            System.out.println("BIENVENIDO A Hertz TALCA");
            System.out.println("[1] Mostrar automoviles disponibles");
            System.out.println("[2] Arrendar automovil");
            System.out.println("[3] Devolver automovil");
            System.out.println("[4] Mostrar estadisticas");
            System.out.println("[5] Salir");
            opcion =  scanner.nextInt();
            if (opcion == 1)
            {
                estacionamiento.autosDisponibles();
            }
            if (opcion == 2)
            {
                int autoArrendado;
                String nombre, fecha;
                System.out.println("Ingrese su nombre");
                scanner.nextLine();
                nombre = scanner.nextLine();
                System.out.println("Ingrese numero del auto que desea arrendar");
                autoArrendado = scanner.nextInt();
                System.out.println("Ingrese fecha");
                scanner.nextLine();
                fecha = scanner.nextLine();
                estacionamiento.arrendarAuto(autoArrendado, nombre, fecha);
            }
            if (opcion == 3)
            {
                int opcionDevuelta = 0;
                estacionamiento.autosArrendados();
                System.out.println("Ingrese numero del auto que desea devolver");
                opcionDevuelta = scanner.nextInt();
                estacionamiento.devolverAuto(opcionDevuelta);
            }
            if (opcion == 4)
            {
                estacionamiento.getEstadistica();
            }
            if (opcion == 5)
            {
                break;
            }
        }
        System.out.println("GRACIAS POR VISITAR Hertz");
    }

}
