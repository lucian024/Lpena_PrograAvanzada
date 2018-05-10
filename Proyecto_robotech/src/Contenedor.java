
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Contenedor
{
    // creacion de las partes que contiene el robot
    private  Brazo brazo_L, brazo_R;
    private  Pierna pierna_L,pierna_R;
    private  Ala ala_L,ala_R;
    private  Arma arma_misiles = new Arma("Arma de misiles");
    private  Cabina cabina;
    private ArrayList <Arma>  armas_lasers= new ArrayList<Arma>();
    private Pista pista;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random(System.currentTimeMillis());
    //metodo que crea todas las partes
    Contenedor()
    {
        brazo_L = new Brazo();
        brazo_R = new Brazo();
        pierna_L = new Pierna();
        pierna_R = new Pierna();
        ala_L = new Ala();
        ala_R = new Ala();
        cabina = new Cabina();
        arma_misiles.setEstado(true);
        pista = new Pista(1000);
        System.out.println("-------------------------");
        System.out.println("|   Ensamblaje exitoso   |");
        System.out.println("|    Alfa Trofymchuk     |");
        System.out.println("|   Listo para operar    |");
        System.out.println("--------------------------");
    }
    //establecimiento modo fighter
    public int modoFighter()
    {
        ala_R.setEstado(true);
        ala_L.setEstado(true);
        brazo_R.setEstado(false);
        brazo_L.setEstado(false);
        pierna_R.setEstado(false);
        pierna_L.setEstado(false);
        return 1;

    }

    //Segun el modelo que eliga el usuario se crean las armas
    void creacionArmas(int x)
    {
        for(int i = 0 ; i < (x-1) ; i++)
        {
            Arma arma_laser = new Arma("Arma laser "+(i+1) );
            agregarLasers(arma_laser);
        }
    }

    void agregarLasers(Arma x)
    {
        this.armas_lasers.add(x);//En el Arraylist tipo arma agregamos los objetos creados
    }
    //se establece el modo gerwalk
    void modoGerwalk(int opcion_brazo_arma)
    {
        brazo_R.setEstado(true);
        brazo_L.setEstado(true);
        pierna_R.setEstado(true);
        pierna_L.setEstado(true);

        if(opcion_brazo_arma == 1)
        {
            brazo_L.setEstado_arma(true);
        }
        if(opcion_brazo_arma == 2)
        {
            brazo_R.setEstado_arma(true);
        }
    }
    //se establece el modo battroid
    void modoBattroid()
    {
        ala_L.setEstado(false);
        ala_R.setEstado(false);
        pierna_L.setEstado(true);
        pierna_R.setEstado(true);
        brazo_L.setEstado(true);
        brazo_R.setEstado(true);

    }
    //IMPRESION DEL ESTADO ACTUAL DEL ROBOT
    void impresionEstado()
    {
        if(ala_L.isEstado())
        {
            if(pierna_L.isEstado())
            {
                System.out.println(" El modo de VARIABLE FIGHTER VALKYRIE es : G.E.R.W.A.L.K.");
            }
            else
            {
                System.out.println(" El modo de VARIABLE FIGHTER VALKYRIE es : FIGHTER");
            }
        }
        else
        {
            System.out.println(" El modo de VARIABLE FIGHTER VALKYRIE es : BATTROID");
        }
        if(cabina.isEstacionado())
        {
            System.out.println("Se encuentra estacionado");
            System.out.println("SUGERENCIA : Aumente velocidad para salir ");
        }
        else {
            if (cabina.getAltura() > 0) {
                System.out.println("Vuelo a :" + cabina.getAltura() + " metros");
            } else {
                System.out.println(" VARIABLE FIGHTER VALKYRIE se encuentra en tierra ");
            }
        }
        System.out.println("Velocidad :" + cabina.getVelocidad() + " km/h");

        if (cabina.isEstacionado())
        {
            System.out.println("Existe una pista de " + pista.getLongitud() + " metros");
        }
    }
    // METODOS PARA AUMENTAR Y DISMINUIR ALTURA/VELOCIDAD
    public void aumentarVelocidad()
    {
        cabina.setVelocidad(90);
        if (cabina.getVelocidad()>0)
        {
            cabina.setEstacionado(false);
        }
    }
    public void disminuirVelocidad()
    {
        cabina.setVelocidad(-90);
        if(cabina.getVelocidad() == 0)
        {
            cabina.setEstacionado(true);
        }
    }
    public void despegar()
    {
        if ( ( cabina.getVelocidad() >= 350 ) && ( cabina.getAltura() == 0 ) )
        {
            cabina.setAltura(1);
        }
        if (cabina.getVelocidad() < 350)
        {
            System.out.println("--------------------------------------------------");
            System.out.println("IMPOSIBLE DESPEGAR CON ESA VELOCIDAD");
            System.out.println("--------------------------------------------------");
        }
    }
    public void aumentarAlturaVuelo()
    {
        if (cabina.getAltura() > 0)
        {
            cabina.setAltura(10);
        }
        else
        {
            System.out.println("--------------------------------------------------");
            System.out.println("DEBE DESPEGAR PARA AUMENTAR LA ALTURA DE VUELO");
            System.out.println("--------------------------------------------------");
        }

    }
    public void disminuirAlturaVuelo()
    {
        cabina.setAltura(-10);
    }
    //////////////////////////////

    ///MENU DISPAROS
    public void menuDisparar()
    {
        int opcionArma =1, objetivo;

        while (opcionArma != 0)
        {
            System.out.println("--------------------------------------------------");
            System.out.println("   | "+"(1) "+ arma_misiles.getTipo_arma()+" |  ");
            for (int x = 0 ; x < armas_lasers.size() ; x++)
            {
                System.out.println("   | "+"("+ (x+2) +") " + armas_lasers.get(x).getTipo_arma() + "    |   ");
            }
            System.out.println("--------------------------------------------");
            System.out.println("| Ingrese 0 para volver a menu principal   |");
            System.out.println("--------------------------------------------");
            System.out.println("¿Con cual arma desea disparar?");
            opcionArma = scanner.nextInt();
            while (opcionArma > armas_lasers.size()+1 || opcionArma < 1 )
            {
                System.out.println("|ARMA NO VALIDA|");
                opcionArma = scanner.nextInt();
            }
            objetivo = random.nextInt(2);
            System.out.println("--------------------------------------------------");
            switch (opcionArma)
            {
                case 1: System.out.println("DISPARANDO ARMA MISILES...");
                        System.out.println("WHRRRRRRRRRRRRRRR!");
                        break;
                case 2: System.out.println("DISPARANDO ARMA LASER 1...");
                        System.out.println("ZAAAAAAAAAAAAAAAP!");
                        break;
                case 3: System.out.println("DISPARANDO ARMA LASER 2...");
                        System.out.println("ZAAAAAAAAAAAAAAAP!");
                        break;
                case 4: System.out.println("DISPARANDO ARMA LASER 3...");
                        System.out.println("ZAAAAAAAAAAAAAAAP!");
                        break;
            }
            System.out.println("--------------------------------------------------");
            if(objetivo == 1)
            {
                System.out.println("SUCESS : OBJETIVO DERRIBADO");
            }
            else
            {
                System.out.println("OBJETIVO NO DERRIBADO");
            }
        }


    }
}
