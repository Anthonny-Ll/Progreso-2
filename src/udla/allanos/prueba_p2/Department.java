package udla.allanos.prueba_p2;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Professor> professors;
    private Professor director;

    public Professor getDirector() {
        return director;
    }

    public void setDirector(Professor director) {
        this.director = director;
    }


    public Department(String name) {
        this.name = name;
        this.professors = new ArrayList<>();
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void deleteProfessor(Professor professor) {
        professors.remove(professor);
    }

    public Professor getProfessor(int index) {
        return professors.get(index);
    }
}
