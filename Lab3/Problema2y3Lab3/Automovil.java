public class Automovil {
    private String marcaModelo;
    private int capacidadEstanque;
    private int kilometraje;
    private boolean estacionado = true;
    private boolean arrendado = false;
    private String nombreArrendatario;
    private String fechaArrendado;

    public Automovil(String marcaModelo, int capacidadEstanque, int kilometraje) {
        this.marcaModelo = marcaModelo;
        this.capacidadEstanque = capacidadEstanque;
        this.kilometraje = kilometraje;
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    public void setMarcaModelo(String marcaModelo) {
        this.marcaModelo = marcaModelo;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isEstacionado() {
        return estacionado;
    }

    public void setEstacionado(boolean estacionado) {
        this.estacionado = estacionado;
    }

    public String getNombreArrendatario() {
        return this.nombreArrendatario;
    }

    public void setNombreArrendatario(String nombreArrendatario) {
        this.nombreArrendatario = nombreArrendatario;
    }

    public boolean isArrendado() {
        return arrendado;
    }

    public void setArrendado(boolean arrendado) {
        this.arrendado = arrendado;
    }

    public String getFechaArrendado() {
        return this.fechaArrendado;
    }

    public void setFechaArrendado(String fechaArrendado) {
        this.fechaArrendado = fechaArrendado;
    }
}
