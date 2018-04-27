import java.util.Random;

public class Rana {
    Random random = new Random(System.currentTimeMillis());
    private String dueño, color;
    private int dRecorrida = 0 ,saltito;

    public Rana(String dueño, String color) {
        this.dueño = dueño;
        this.color = color;
    }

    public void salto()
    {
        saltito = random.nextInt(4)+1;
        this.dRecorrida = this.dRecorrida + saltito;
        System.out.println("La rana de" + getDueño() + " ha saltado "+ saltito);
    }

    public String getDueño() {
        return dueño;
    }

    public int getdRecorrida() {
        return dRecorrida;
    }

    public String getColor() {
        return color;
    }
}
