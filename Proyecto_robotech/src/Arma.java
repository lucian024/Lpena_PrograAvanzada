public class Arma
{
    private String tipo_arma;
    private boolean estado = false;

    public Arma(String nombre) {
        this.tipo_arma = nombre;
    }


    public String getTipo_arma() {
        return tipo_arma;
    }

    public void setTipo_arma(String tipo_arma) {
        this.tipo_arma = tipo_arma;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
