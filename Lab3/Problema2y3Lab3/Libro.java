import java.util.ArrayList;

public class Libro {
    private ArrayList<Automovil> autosArrendados;

    Libro()
    {
        this.autosArrendados = new ArrayList<Automovil>();
    }

    public void agregarAutoArrendado(Automovil auto)
    {
        this.autosArrendados.add(auto);
    }
    public void estadisticas()
    {
        for(Automovil i: this.autosArrendados)
        {
            System.out.println("-----------------------------------------------------");
            System.out.println("El automovil marca: " + i.getMarcaModelo());
            System.out.println("Lo arrendó : " + i.getNombreArrendatario());
            System.out.println("Con fecha: " + i.getFechaArrendado());
            System.out.println("-----------------------------------------------------");
        }
    }
}
