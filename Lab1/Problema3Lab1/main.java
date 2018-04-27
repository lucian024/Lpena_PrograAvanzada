import java.util.Scanner;

public class main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Taximetro taximetro;
        double bajadaBandera, km, minutos;
        int viajeActivo;

        System.out.println("BIENVENIDO AL SERVICIO DE TAXI");
        System.out.println("Cual es la bajada de bandera");
        bajadaBandera = scanner.nextDouble();
        taximetro = new Taximetro(bajadaBandera);

        System.out.println("¿Iniciar viaje? : (0) NO ; (1) SI");
        viajeActivo = scanner.nextInt();

        while (viajeActivo==1){
            System.out.println("Ingrese 1 para actualizar kilometros y tiempo");
            System.out.println("Ingrese 0 para finalizar viaje");

            viajeActivo = scanner.nextInt();
            if (viajeActivo ==1){
                System.out.println("Kilometros:");
                km = scanner.nextDouble();
                System.out.println("Minutos");
                minutos = scanner.nextDouble();
                taximetro.actualizar(km,minutos);
            }
        }

        System.out.println("El monto a pagar es de : " + taximetro.finViaje());

        System.out.println("FIN DEL PROGRAMA");


    }
}
