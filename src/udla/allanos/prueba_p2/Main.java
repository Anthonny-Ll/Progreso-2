package udla.allanos.prueba_p2;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de College
        College college = new College("Tech University", "123 University St", "555-1234");

        // Crear estudiantes
        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002");

        // Agregar estudiantes al College
        college.addStudent(student1);
        college.addStudent(student2);

        // Crear departamentos
        Department compSciDepartment = new Department("Computer Science");
        Department mathDepartment = new Department("Mathematics");

        // Agregar departamentos al College
        college.addDepartment(compSciDepartment);
        college.addDepartment(mathDepartment);

        // Crear profesores
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        // Agregar profesores a los departamentos
        compSciDepartment.addProfessor(professor1);
        mathDepartment.addProfessor(professor2);

        // Asignar director a un departamento
        compSciDepartment.setDirector(professor1);

        // Crear materias
        Subject subject1 = new Subject("Data Structures", "CS101");
        Subject subject2 = new Subject("Linear Algebra", "MATH201");

        // Imprimir información de la universidad
        System.out.println("College: " + college.getDepartment(0).getDirector().name);
        System.out.println("Total estudiantes: " + college.getStudent(0).name);
    }
}
