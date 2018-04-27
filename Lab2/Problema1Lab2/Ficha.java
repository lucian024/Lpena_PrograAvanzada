import java.util.ArrayList;

public class Ficha {
    private String nombre, sangre;
    private float peso, altura, BMI;
    private ArrayList<Medico> medicos = new ArrayList<Medico>();

    public Ficha(String nombre, String sangre, float peso, float altura, float BMI) {
        this.nombre = nombre;
        this.sangre = sangre;
        this.peso = peso;
        this.altura = altura;
        this.BMI = BMI;
    }

    public void agregarMedico(Medico x)
    {
        this.medicos.add(x);
    }

    public String getNombre() {
        return nombre;
    }

   public void impresionFicha()
   {
       System.out.println("**************************************");
       System.out.println("NOMBRE PACIENTE : "+ this.nombre);
       System.out.println("SANGRE : "+ this.sangre);
       System.out.println("PESO : "+ this.peso);
       System.out.println("ALTURA : "+ this.altura);
       System.out.println("BMI : "+ this.BMI);
       for (Medico i: medicos)
       {
           System.out.println("MEDICOS QUE LO HAN TRATADO");
           System.out.println(i.getNombre());
       }
       System.out.println("**************************************");
   }
}
