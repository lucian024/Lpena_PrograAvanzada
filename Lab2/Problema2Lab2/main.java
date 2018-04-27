import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Carrera carrera;
        int largo, carreraOn = 0;
        String dueño, color;

        //CREACION DE LA CARRERA
        System.out.println("***CARRERA DE RANAS!!!***");
        System.out.println("INGRESE LARGO DEL CARRIL (15) ; (20) ; (30) METROS");
        largo = scanner.nextInt();
        carrera = new Carrera(largo);

        //INSCRIPCION RANAS
        System.out.println("INGRESE DUEÑO DE LA PRIMERA COMPETIDORA:");
        scanner.nextLine();
        dueño = scanner.nextLine();
        System.out.println("INGRESE EL COLOR DE LA RANA");
        color = scanner.next();

        carrera.creacionR1(dueño,color);

        System.out.println("INGRESE DUEÑO DE LA SEGUNDA COMPETIDORA:");
        scanner.nextLine();
        dueño = scanner.nextLine();
        System.out.println("INGRESE EL COLOR DE LA RANA");
        color = scanner.next();

        carrera.creacionR2(dueño,color);

        System.out.println("INGRESE 1 PARA INICIAR CARRERA");
        carreraOn = scanner.nextInt();

        //INICIO COMPETICION
        while (carreraOn ==1)
        {
            carrera.compitiendo();
            carreraOn = 0;
        }

        //IMPRESION DATOS GANADORA
        carrera.ganadora();

        System.out.println("**********FIN DE LA CARRERA**********");



    }
}
