package udla.allanos.abstraccion_interfaz.modelo;

public class Pagina extends Hoja /*implements Imprimible*/{
    public Pagina(String contenido){

        super(contenido);

    }
    //metodo abstracto
    @Override
    public String imprimir() {
        return this.contenido;
    }
}