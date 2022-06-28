import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "inplace")
@RequestScoped

public class InplaceC implements Serializable  {

    private String text = "PrimeFaces";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
    

