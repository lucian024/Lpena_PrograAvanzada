public class Candidato   {
    private String nombre;
    private int votos ;

    public Candidato(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos() {
        this.votos = this.votos + 1  ;
    }
}
