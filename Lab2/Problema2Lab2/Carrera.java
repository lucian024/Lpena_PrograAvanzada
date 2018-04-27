public class Carrera {
    private Rana r1 ;
    private Rana r2 ;
    private int largoCarril;
    private String colorGanadora;

    public Carrera(int largoCarril) {
        this.largoCarril = largoCarril;
    }
    public void creacionR1(String dueño,String color)
    {
        r1 = new Rana(dueño, color);
    }

    public void creacionR2(String dueño,String color)
    {
        r2 = new Rana(dueño, color);
    }

    public void compitiendo()
    {
        while ( ( r1.getdRecorrida() < largoCarril ) || r2.getdRecorrida() < largoCarril)
        {
            r1.salto();
            r2.salto();
            System.out.println("--------------------------------------------------");
            System.out.println("La rana de "+ r1.getDueño() + " ha recorrido " + r1.getdRecorrida());
            System.out.println("La rana de "+ r2.getDueño() + " ha recorrido " + r2.getdRecorrida());
            System.out.println("--------------------------------------------------");
        }
        if (r1.getdRecorrida()>=30)
        {
            this.colorGanadora = r1.getColor();
        }
        else
        {
            this.colorGanadora = r2.getColor();
        }
    }
    public void ganadora()
    {
        System.out.println("****************************************************");
        System.out.println("LA RANA GANADORA ES LA COLOR :" + colorGanadora);
        System.out.println("****************************************************");
    }
}
