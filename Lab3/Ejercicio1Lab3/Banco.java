import java.util.ArrayList;

public class Banco {
    private ArrayList<String> preguntas;
    private int puntajePregunta = 20;

    public Banco() {
        preguntas = new ArrayList<String>();
        setPreguntas();
    }

    public void setPreguntas() {
        this.preguntas.add("¿Capital de Francia?");
        this.preguntas.add("¿Raiz de 10?");
        this.preguntas.add("¿Año de fundacion de Fruna?");
        this.preguntas.add("¿Cuantos chocolitos es capaz de comer es una hora?");
        this.preguntas.add("¿Programacion es el futuro del mundo?");
        this.preguntas.add("¿Color de pelo?");
        this.preguntas.add("¿Como obtener el pelo de goku?");
        this.preguntas.add("¿Cual es su telefono?");
        this.preguntas.add("¿Marca de su reloj?");
        this.preguntas.add("¿Color de su pelo?");
        this.preguntas.add("¿Cuantos hijos pleanea tener?");
        this.preguntas.add("(3x+1) al cubo?");
    }


    public ArrayList<String> getPreguntas() {
        return preguntas;
    }

    public int getPuntajePregunta() {
        return puntajePregunta;
    }

}

