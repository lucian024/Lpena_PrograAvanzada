import java.util.Scanner;

public class main {
    public static void main(String[] args){

        int nulo = 0 , totalVotos;
        Candidato c1, c2,c3;
        String voto = "si";
        Scanner scanner = new Scanner(System.in);
        c1 = new Candidato("Javier Rosales");
        c2 = new Candidato("Claudio Guevara");
        c3 = new Candidato("Matias Rojas");

        System.out.println("ELECCIONES CAIBI 2018");
        System.out.println("Los candidatos son");
        System.out.println("***" + c1.getNombre()+"***");
        System.out.println("***" + c2.getNombre()+"***");
        System.out.println("***" + c3.getNombre()+"***");

        System.out.println("---------VOTACION INICIADA-------");
        System.out.println("Ingrese F para terminar votacion");
        System.out.println("Ingrese el nombre de su candidato");
        System.out.println("javier, claudio o matias :");

        while ( !voto.equals("F"))
        {
            voto = scanner.nextLine();

            switch(voto)
            {
                case "javier": c1.setVotos(); break;
                case "claudio": c2.setVotos(); break;
                case "matias": c3.setVotos(); break;
                default: if (!voto.equals("F"))
                {
                    nulo++;
                } ;break;
            }

        }

        System.out.println("VOTACION FINALIZADA");

        if (c1.getVotos()>c2.getVotos())
        {
            if (c1.getVotos() > c3.getVotos())
            {
                if (c2.getVotos() > c3.getVotos())
                {
                    System.out.println("Primero lugar:" + c1.getNombre());
                    System.out.println("Segundo lugar:" + c2.getNombre());
                    System.out.println("Tercer lugar:" + c3.getNombre());
                } else
                    {
                    System.out.println("Primero lugar:" + c1.getNombre());
                    System.out.println("Segundo lugar:" + c3.getNombre());
                    System.out.println("Tercer lugar:" + c2.getNombre());
                    }

            } else
                {
                System.out.println("Primero lugar:" + c3.getNombre());
                System.out.println("Segundo lugar:" + c1.getNombre());
                System.out.println("Tercer lugar:" + c2.getNombre());
                }
        } else
            { if (c3.getVotos()>c1.getVotos())
                {
                    if (c3.getVotos() > c2.getVotos())
                    {
                        System.out.println("Primero lugar:" + c3.getNombre());
                        System.out.println("Segundo lugar:" + c2.getNombre());
                        System.out.println("Tercer lugar:" + c1.getNombre());
                    } else
                        {
                            System.out.println("Primero lugar:" + c2.getNombre());
                            System.out.println("Segundo lugar:" + c3.getNombre());
                            System.out.println("Tercer lugar:" + c1.getNombre());
                        }
                } else
                    {
                        if (c2.getVotos() > c3.getVotos())
                        {
                            System.out.println("Primero lugar:" + c2.getNombre());
                            System.out.println("Segundo lugar:" + c1.getNombre());
                            System.out.println("Tercer lugar:" + c3.getNombre());
                        }
                    }

            }


        totalVotos = c1.getVotos()+c2.getVotos()+c3.getVotos();
        System.out.println("TOTAL VOTOS:" + totalVotos);
        System.out.println("VOTOS NULOS:" + nulo);
        System.out.println("Votos para Javier : " + c1.getVotos());
        System.out.println("Votos para Claudio : " + c2.getVotos());
        System.out.println("Votos para Matias : " + c3.getVotos());



    }
}
