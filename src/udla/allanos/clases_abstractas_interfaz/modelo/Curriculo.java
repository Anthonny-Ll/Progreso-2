package udla.allanos.clases_abstractas_interfaz.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja {

    private String persona;
    private String carrera;
    private List<String> experiencia;

    public Curriculo(String persona, String carrera, String contenido) {
        super(contenido);
        this.persona=persona;
        this.carrera=carrera;
        this.experiencia = new ArrayList<>();
    }

    //metodo para incluir informacion a esa lista

    public Curriculo /*void*/ experiencia(String exp){
        experiencia.add(exp); //aqui es lo que reciba de parametro
        //manera de encadenar de manera automatica:
        return this; //estoy retornando a la misma clase, la estamos haciendo recursiva
    }
    //el error sale porque debemos de usar el  metodo y el constructor, mientras no lo utilicemos, aparece el error.
    @Override
    public String imprimir() {
        //podriamos usar stringbuilder para encadenar
        StringBuilder sb = new StringBuilder("Nombre:  ");
        sb.append(persona).append("\n").append("Resumen:  ")
                .append(this.contenido).append("\n")
                .append("Profesión;  ").append(this.carrera).append("\n")
                .append("Experiencia :  \n "); //la experiencia puede ser variada
        //usamos un for
        //este for  va a recorrer toda la lista de experiancia
        //el exp esta en curriculo
        for(String exp:this.experiencia){
            sb.append("-").append(exp).append("\n");
        }
        return sb.toString();
    }
}