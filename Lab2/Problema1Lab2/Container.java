import java.util.ArrayList;
import java.util.Scanner;

public class Container {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Ficha> fichas = new ArrayList<Ficha>();
    private Ficha ficha;
    private Medico medico;
    private String nombre, sangre, nombreMedico;
    private float peso, altura, BMI;
    private int nFichas=0 , medOn = 1;

    public void agregarFicha(Ficha x)
    {
        if (nFichas <20) {
            this.fichas.add(x);
            nFichas++;
        }
        else
        {
            System.out.println("*****ERROR*****");
            System.out.println("NUMERO DE FICHAS MAXIMO (20)");
        }
    }
    public void crearFicha()
    {
        //PETICION DATOS DEL CLIENTE
        System.out.println("INGRESE NOMBRE DEL PACIENTE: ");
        nombre = scanner.nextLine();
        System.out.println("INGRESE TIPO DE SANGRE DEL PACIENTE: ");
        sangre = scanner.nextLine();
        System.out.println("INGRESE PESO DEL PACIENTE: ");
        peso = scanner.nextFloat();
        System.out.println("INGRESE ALTURA DEL PACIENTE: ");
        altura = scanner.nextFloat();
        System.out.println("INGRESE BMI DEL PACIENTE: ");
        BMI = scanner.nextFloat();
        ficha = new Ficha(nombre, sangre , peso, altura, BMI);

        System.out.println("INGRESE NOMBRE DEL MEDICO QUE LO HA TRATADO: ");
        System.out.println("INGRESE 0 PARA TERMINAR: ");
        scanner.nextLine();
        while(medOn==1)
        {
            nombreMedico = scanner.nextLine();
            if (!nombreMedico.equals(nombre))
            {
                medico = new Medico(nombreMedico);
                ficha.agregarMedico(medico);
            }
            if(nombreMedico.equals(nombre)){
                System.out.println("NO VALIDO, EL PACIENTE NO PUEDE SER SU PROPIO MEDICO");
            }
            if (nombreMedico.equals("0"))
            {
                medOn = 0;
            }
        }
        //AGREGANDO FICHA
        agregarFicha(ficha);
    }
    public void buscarNombre(String nombre){
        System.out.println("HOLA");
        for (Ficha x: fichas)
        {
            System.out.println(x.getNombre());
            if (x.getNombre().equals(nombre))
            {
                ficha.impresionFicha();
            }
        }
    }

}
