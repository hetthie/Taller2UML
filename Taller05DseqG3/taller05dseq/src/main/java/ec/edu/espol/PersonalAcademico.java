package ec.edu.espol;
import java.util.List;

public class PersonalAcademico extends Usuario {
    protected List<Incidente> incidentes;
    
    public void reportarError(String email, String contenido) {
        // Lógica para reportar errores
    }
    
    public void solicitarAsesoramientoDelSistema(String email, String contenido) {
        // Lógica para solicitar asesoramiento
    }
    
    public void comentarEnForo(Foro foro, String comentario) {
        // Lógica para comentar en foro
    }
}
