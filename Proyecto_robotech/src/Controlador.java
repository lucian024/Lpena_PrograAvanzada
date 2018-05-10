
import java.util.Scanner;
public class Controlador
{
    Scanner scanner = new Scanner(System.in);
    Contenedor contenedor;
    int menu;

    /*
     Modelo 1 ---> 1 arma (cañon de misiles )
     Modelo 2 ---> 2 armas (cañon de misiles y laser)
     Modelo 3 ---> 4 arma (cañon de misiles y 3 lasers)
   */
    void eleccionModelo()
    {
        int  modelo = 0 ;
        System.out.println("Seleccione el modelo de Valkyrie (1)(2)(3)");
        System.out.println("Modelo 1 ---> 1 arma (cañon de misiles ) |" +
                " Modelo 2 ---> 2 armas (cañon de misiles y laser) |" +
                " Modelo 3 ---> 4 arma (cañon de misiles y 3 lasers)");
        modelo = scanner.nextInt();
        contenedor= new Contenedor();
        while ( modelo > 3 || modelo < 1)
        {
            System.out.println("MODELO INVALIDO");
            modelo = scanner.nextInt();
        }
        if (modelo==3)
        {
            modelo=modelo+1;
        }
        contenedor.creacionArmas(modelo);
        menu = contenedor.modoFighter();
    }

    void menu()
    {
        while(true)
        {
            int opcion;
            //menu del modo fighter
            while (menu == 1) {
                System.out.println("--------------------------------------------------");
                contenedor.impresionEstado();
                System.out.println("--------------------------------------------------");
                System.out.println("(1) Establecer modo G.E.R.W.A.L.K ");
                System.out.println("(2) Establecer modo BATTROID ");
                System.out.println("(3) Aumentar velocidad 90 km/h ");
                System.out.println("(4) Disminuir velocidad 90 km/h ");
                System.out.println("(5) Despegar ");
                System.out.println("(6) Aumentar altura de vuelo en 10 metros");
                System.out.println("(7) Disminuir altura de vuelo en 10 metros");
                System.out.println("(8) Disparar");
                opcion = scanner.nextInt();
                switch (opcion)
                {
                    case 3: contenedor.aumentarVelocidad(); break;
                    case 4: contenedor.disminuirVelocidad(); break;
                    case 5: contenedor.despegar(); break;
                    case 6: contenedor.aumentarAlturaVuelo(); break;
                    case 7: contenedor.disminuirAlturaVuelo(); break;
                    case 8: contenedor.menuDisparar();break;

                }

            }
            while (menu == 2) {

            }
        }

    }

}
