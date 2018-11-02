package accesoadatos.AccesoADatos;


public class Cursada {
    private Alumno alumno;
    private Materia materia;
    private int nota;
    private int id_Cursada;

    public Cursada(Alumno alumno, Materia materia, int nota, int id_Cursada) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
        this.id_Cursada = id_Cursada;
    }
    public Cursada(Alumno alumno, Materia materia, int nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;    
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getId_Cursada() {
        return id_Cursada;
    }

    public void setId_Cursada(int id_Cursada) {
        this.id_Cursada = id_Cursada;
    }
}
