package udla.allanos.abstraccion_interfaz.modelo;
//esto es nuestra primer clase abstracta
//la palabra abstract se puede poner antes del public
abstract public class Hoja {
    protected String contenido;
    //protected es manera de acceder a los atributos sin utilizar los getter y setter


    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    abstract public String imprimir();

    //una clase abstracta puede o no tener metodos abstractos
    //no se puede crear un metodo abstracto dentro de una clase que no sea abstracta

}