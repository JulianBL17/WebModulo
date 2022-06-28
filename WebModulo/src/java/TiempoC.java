import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;


@Named(value = "tiempoC")
@ViewScoped
public class TiempoC implements Serializable {

    
    private int number;

    public void increment() {
        number++;
    }

    public int getNumber() {
        return number;
    }
    
}
