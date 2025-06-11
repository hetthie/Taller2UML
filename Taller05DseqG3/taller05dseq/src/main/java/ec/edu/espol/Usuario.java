package ec.edu.espol;

import java.util.List;

public class Usuario {
    protected String usuario;
    protected String contraseña;
    protected String nombre;
    protected String apellido;
    protected List<Incidente> incidentes;
    
    protected boolean logIn() {
        boolean x = false;
        //Lógica de LogIn
        return x;
    }
    
    protected boolean logOut() {
        boolean x = false;
        //Lógica de LogOut
        return x;
    }
}