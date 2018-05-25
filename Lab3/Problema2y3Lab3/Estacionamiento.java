import java.util.ArrayList;

public class Estacionamiento {
    private ArrayList<Automovil> automoviles;
    private Libro libroEstadisticas;

    public Estacionamiento() {
        automoviles = new ArrayList<Automovil>();
        libroEstadisticas = new Libro();
    }

    public void agregarAutoEstacionamiento(Automovil x)
    {
        this.automoviles.add(x);
    }
    public void autosDisponibles()
    {
        int opcion = 1;
        for (Automovil x: automoviles)
        {
            if (x.isEstacionado())
            {
                System.out.println("---------------------------------------------------------");
                System.out.println("Automovil " + "[" + opcion + "] :" + x.getMarcaModelo());
                System.out.println("Capacidad estanque : " + x.getCapacidadEstanque() + " L");
                System.out.println("Kilometraje: " + x.getKilometraje() + " km");
                System.out.println("---------------------------------------------------------");
            }
            else
            {
                System.out.println("AUTO " + opcion + " ARRENDADO");
            }
            opcion++;
        }
    }
    public void autosArrendados()
    {
        int opcion = 1;
        for (Automovil x: automoviles)
        {
            if (!x.isEstacionado())
            {
                System.out.println("---------------------------------------------------------");
                System.out.println("Automovil " + "[" + opcion + "] :" + x.getMarcaModelo());
                System.out.println("Capacidad estanque : " + x.getCapacidadEstanque() + " L");
                System.out.println("Kilometraje: " + x.getKilometraje() + " km");
                System.out.println("---------------------------------------------------------");
            }
            else
            {
                System.out.println("------------------------------------");
                System.out.println("AUTO " + opcion + " NO ARRENDADO");
                System.out.println("------------------------------------");
            }
            opcion++;
        }
    }

    public void arrendarAuto(int opcion, String nombre, String fecha)
    {
        opcion = opcion-1;
        this.automoviles.get(opcion).setEstacionado(false);
        this.automoviles.get(opcion).setNombreArrendatario(nombre);
        this.automoviles.get(opcion).setArrendado(true);
        this.automoviles.get(opcion).setFechaArrendado(fecha);
        System.out.println("Usted ha arrendado un automovil marca :" + automoviles.get(opcion).getMarcaModelo());
        System.out.println("Capacidad de combustible para " + automoviles.get(opcion).getCapacidadEstanque() + " L");
        System.out.println("Con "+ automoviles.get(opcion).getKilometraje() + " kilometros");
        System.out.println("Por favor al termino de la jornada devolver el automovil en el lugar " + (opcion+1));

    }
    public void devolverAuto(int opcion)
    {
        opcion--;
        this.libroEstadisticas.agregarAutoArrendado(this.automoviles.get(opcion));
        this.automoviles.get(opcion).setFechaArrendado(null);
        this.automoviles.get(opcion).setArrendado(false);
        this.automoviles.get(opcion).setNombreArrendatario(null);
        this.automoviles.get(opcion).setEstacionado(true);
        System.out.println("GRACIAS POR SU PREFERENCIA");


    }
    public void getEstadistica()
    {
        this.libroEstadisticas.estadisticas();
    }
}
