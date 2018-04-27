import java.util.Random;

public class Termometro {
    private int to;
    private int m1,m2;
    private Random random = new Random(System.currentTimeMillis());

    public Termometro() {
    }

    public int getTo() {
        return to;
    }

    public void setTo() {
        this.to = random.nextInt(11);
    }

    public int getM1() {
        return m1;
    }

    public void setM1() {
        this.m1 = random.nextInt(6)+35;
    }

    public int getM2() {
        return m2;
    }

    public void setM2() {
        this.m2 = random.nextInt(6)+35;
    }
}
