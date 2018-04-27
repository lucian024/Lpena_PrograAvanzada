public class Taximetro {
    private double bajadaDeBandera, Kms, tiempo;

    public Taximetro(double bajadaDeBandera) {
        this.bajadaDeBandera = bajadaDeBandera;
    }
    public void actualizar(double km, double time){
        this.Kms = this.Kms + km;
        this.tiempo = this.tiempo + time;
    }
    public double finViaje(){
        return (this.bajadaDeBandera + this.Kms*150 + tiempo*60);

    }
}
