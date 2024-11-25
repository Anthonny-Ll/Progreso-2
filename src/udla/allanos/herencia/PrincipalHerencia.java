package udla.allanos.herencia;

public class PrincipalHerencia {
    public static void main(String[] args) {
        Persona persona = new Persona();
        //Persona alumno = new Alumno(); esto se puede por el extend de la clase padre

        Alumno alumno = new Alumno();
        alumno.setNombre("Julio");
        alumno.setApellido("Jaramillo");
        //Set para poner y get para asignar
        alumno.setCarrera("Ing. Software");
        alumno.setEdad(22);
        alumno.setCorreo("jjaramillo@udla.edu.ec");
        alumno.setNotap1(7D);
        System.out.println("Datos del alumno ");
        System.out.println("Nombre y apellido: "+ alumno.getNombre()+" " + alumno.getApellido());
        //Primera forma no recomendada para instanciar, declarar los atributos como protected
        //Segunda forma recomendada por getter y setter
        //final puede ir en clase y metodos, basicamente esa clase no permite herencia
        //Polimorfismo reutilizar el codigo
        //API conjunto de metodos, de clases abstractas

        Profesor profesor = new Profesor();
        //Debug del codigo: ir viendo lo que pasa en el codigo

        //AlumnoInt alumnoInt = new Alumno();

    }
}
