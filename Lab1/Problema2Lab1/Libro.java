import java.util.ArrayList;

public class Libro {
    private ArrayList<Plato> platos = new ArrayList<Plato>();

    public Libro() {
    }

    public void agregarPlato(Plato p){
        this.platos.add(p);
    }
    public void mostrarRecetas(){
        for (Plato plato: platos)
        {
            plato.mostrarPlato();
        }
    }
}
