public class Persona {
    // Atributos de la clase
    private String nombre;
    private int edad;
    private String genero;
    private String nacionalidad;
    private String estadoCivil;
    
    // Métodos set y get para cada atributo
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getGenero() {
        return this.genero;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    public String getNacionalidad() {
        return this.nacionalidad;
    }
    
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public String getEstadoCivil() {
        return this.estadoCivil;
    }
    
    // Métodos comer, dormir, hacerEjercicio
    public void comer(String comida) {
        System.out.println(nombre + " está comiendo " + comida);
    }
    
    public void dormir(int horas) {
        System.out.println(nombre + " está durmiendo " + horas + " horas");
    }
    
    public void hacerEjercicio(String ejercicio) {
        System.out.println(nombre + " está haciendo " + ejercicio);
    }
}
