import java.util.Scanner;

public class main {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        Termometro termometro;
        int termOn = 0;
        float tf;
        termometro = new Termometro();

        while (termOn != 1) {

            System.out.println("INGRESE 1 PARA AGITAR");
            termOn = scanner.nextInt();
        }

        if (termOn ==1)
        {
            termometro.setTo();
            System.out.println("LA TEMPERATURA INCIAL DEL TERMOMETRO ES : " + termometro.getTo() +"°C");
            System.out.println("REALIZANDO MEDICION...");
            termometro.setM1();
            System.out.println("PRIMERA MEDICION = " + termometro.getM1()+ "°C");
            System.out.println("REALIZANDO MEDICION...");
            termometro.setM2();
            System.out.println("SEGUNDA MEDICION = "+ termometro.getM2()+ "°C");
            tf = ( termometro.getM1()+termometro.getM2() ) / 2 ;
            System.out.println("SU TEMPERATURA FINAL ES: " + tf + "°C");
        }
        System.out.println("****FIN DEL PROGRAMA****");
    }
}
