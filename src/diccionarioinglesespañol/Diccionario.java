package diccionarioinglesespañol;

/**
 *
 * @author USUARIO
 */
public class Diccionario {
    private String español;
    private String ingles;

    public Diccionario(String español, String ingles) {
        this.español = español;
        this.ingles = ingles;
    }

    public String getEspañol() {
        return español;
    }

    public void setEspañol(String español) {
        this.español = español;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }
    
}
