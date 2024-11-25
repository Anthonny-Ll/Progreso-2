package udla.allanos.clases_abstractas_interfaz.modelo;

public class Informe extends Hoja {

    //tengo que utilizar los metodos de la clase abstracta

    private String autor; //se podria poner final si es que no utilizamos getter y setter
    private String revisor;

    //cuando no me dan ningun atributo
    //cuando existe la palabra final

    public Informe(String autor, String revisor, String contenido) {
        //super se hereda los atributos de la superclase
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por: " + this.autor +
                "Revisado por   :" +this.revisor +
                "\n" + this.contenido; //se puede acceder al contenido porque tiene protected

    }
}