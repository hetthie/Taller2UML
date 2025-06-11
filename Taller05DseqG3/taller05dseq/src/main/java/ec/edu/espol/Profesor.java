package ec.edu.espol;
import java.util.List;

public class Profesor extends PersonalAcademico {
    private List<Curso> cursosACargo;
    
    public void cargarActividadSumativa(Curso Curso, ActividadSumativa actividadSumativa) {
        // Lógica para cargar actividad sumativa
    }
    
    public void calificarActividadSumativa(Curso curso, Estudiante Estudiante, ActividadSumativa actividadSumativa) {
        // Lógica para calificar actividad sumativa
    }
    
    public void aceptarInscripcion(Curso curso, String usuarioEstudiante) {
        // Lógica para aceptar inscripción
    }
    
    public void crearNuevoForo(Foro foro) {
        // Lógica para crear nuevo foro.
    }
    
}
