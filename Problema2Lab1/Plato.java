import java.util.ArrayList;

public class Plato {
    private String nombre;
    private String tipoPlato;
    private ArrayList<Ingredientes> ingredientes = new ArrayList<Ingredientes>();
    private int numPersonas;

    public Plato(String nombre, String tipoPlato, int numPersonas) {
        this.nombre = nombre;
        this.tipoPlato = tipoPlato;
        this.numPersonas = numPersonas;
    }

    //AGregar ingrediente al plato
    public void agregarIngrediente(Ingredientes x)
    {
        this.ingredientes.add(x);
    }

    //MOSTRAR PLATO
    public void mostrarPlato(){

        System.out.println("--------------------------------------------");
        System.out.println("NOMBRE DEL PLATO : " + getNombre());
        System.out.println("TIPO DE PLATO : " + getTipoPlato());
        System.out.println("PARA " + getNumPersonas() + " PERSONAS");
        System.out.println("INGREDIENTES:");
        for(Ingredientes ingrediente: ingredientes)
        {
            System.out.println(ingrediente.getNombre() +"  ----> "+ ingrediente.getCantidad()+" g ");
        }
        System.out.println("--------------------------------------------");
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoPlato() {
        return tipoPlato;
    }

    public int getNumPersonas() {
        return numPersonas;
    }
}
