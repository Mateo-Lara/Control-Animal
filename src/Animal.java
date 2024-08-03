public class Animal {
    private String nombre;
    private String Tipo;
    private String genero;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Animal() {
    }

    
    public Animal(String nombre, String Tipo, String genero) {
        this.nombre = nombre;
        this.Tipo = Tipo;
        this.genero = genero;
    }
    
}
