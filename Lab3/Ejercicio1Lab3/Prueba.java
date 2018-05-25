import java.util.ArrayList;
import java.util.Random;

public class Prueba {

    Random random;
    private Banco bancoPreguntas;
    private ArrayList<String> preguntasPrueba;
    private ArrayList<Integer> puntajes;

    public Prueba()
    {
        random = new Random(System.currentTimeMillis());
        bancoPreguntas = new Banco();
        preguntasPrueba = new ArrayList<String>();
        puntajes = new ArrayList<Integer>();
    }

    public void generarPrueba()
    {
        int numeroPregunta;
        String pregunta;
        for (int i = 0 ; i < 5 ; i++)
        {
            numeroPregunta = random.nextInt(13);
            pregunta = bancoPreguntas.getPreguntas().get(numeroPregunta);
            agregarPregunta(pregunta);
            agregarPuntaje(20);
        }
    }
    public void agregarPregunta(String pregunta)
    {
        this.preguntasPrueba.add(pregunta);
    }
    public void agregarPuntaje(int puntaje)
    {
        this.puntajes.add(puntaje);
    }

    public ArrayList<String> getPreguntasPrueba() {
        return preguntasPrueba;
    }

    public ArrayList<Integer> getPuntajes() {
        return puntajes;
    }
}
