

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


@Named(value = "validaciones")
@RequestScoped

public class CValidaciones {

    private String Nombre;
    private String Apellido;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre= nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }

    public void save() {
        FacesContext.getCurrentInstance().addMessage(null,
        new FacesMessage("Welcome " + Nombre + " " + Apellido));
    }
}
    

