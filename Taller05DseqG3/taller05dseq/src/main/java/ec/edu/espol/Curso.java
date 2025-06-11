package ec.edu.espol;
import java.util.List;

public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;
    private List<Estudiante> estudiantesInscritos;
    private List<Estudiante> estudiantesEnEsperaDescripcion;
    private List<ActividadSumativa> actividadesSumativas;
    private List<Foro> foros;
    private Profesor responsable;
}
