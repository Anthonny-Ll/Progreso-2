package udla.allanos.abstraccion_interfaz;


import udla.allanos.abstraccion_interfaz.modelo.Curriculo;
import udla.allanos.abstraccion_interfaz.modelo.Hoja;
import udla.allanos.abstraccion_interfaz.modelo.Informe;

public class EjemploImprenta {
    public static void main (String[] args){
        Curriculo cv = new Curriculo("Anthonny", "Ing. Software","Valiendo");
        cv.experiencia("Java");
        cv.experiencia("Oracle DBA");
        cv.experiencia("SpringBoot");
        cv.experiencia("ola bola");
        cv.experiencia("viner profesional");
        Informe informe = new Informe("Autor: JJJ","Revisor: Kha Kha Kha","Contenido: Estudio Microservicios");

        imprimir(cv);
        imprimir(informe);
    }
    //le estamos pasando como parametro la clase Hoja
    //tenemos que importar porque le estamos pasando como paquete
    public static void imprimir(Hoja imprime){
        //le estamos pasando una variable, y luego le llamamos al metodo imprimir

        System.out.println(imprime.imprimir());

    }
}
//Main afuera del package principal
//Se crea paquete interno, y creamos clase abstracta llamada hoja
//a esa clase hoja se crea un metodo abstracto (metodo abstracto vuelve abstracta a la clase)
// se puede poner metodos abstractos y metodos no abstractos
//Se pone abstracto cuando tenemos comportamientos comunes, osea metodos
//Utilizamos metodos cuando estan asociados,
//Las clases que HEREDAN de unas clases abstractas si se pueden instanciar
// si queremos hacer algo que nada que ver con el CV y el Informe, ahi viene la interfaz

//--------TEMAS IMPORTANTES PARA EXAMEN TEORICO-------------
//La clase abstracta puede tener metodos que pueden ser abstractos o no, pero tambien tiene atributos
//en la interfaz no se puede tener atributos
//Las interfaces solo puede teneer metodos abstractos
//las interfaces no tienen herencia pero si pueden heredarse entre ellas
// osea solo entre interfaces se puede heredar, y osea solo se heredarian los métodos
//un metodo abstracto no es implementado en la clase abstracta, es implementado en las clases abstractas
//cada implementación puede ser distinta
//ahi si hay polimorfismo, y por ende hay sobrecarga