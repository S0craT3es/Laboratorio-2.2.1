public class Main {
    public static void main(String[] args) {
        // Crear objeto Persona
        Persona persona = new Persona();
        
        // Capturar datos de la persona usando métodos set
        persona.setNombre("Ana Maria");
        persona.setEdad(30);
        persona.setGenero("Femenino");
        persona.setNacionalidad("Mexicana");
        persona.setEstadoCivil("Soltera");
        
        // Imprimir datos de la persona usando métodos get
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Género: " + persona.getGenero());
        System.out.println("Nacionalidad: " + persona.getNacionalidad());
        System.out.println("Estado Civil: " + persona.getEstadoCivil());
        
        // Usar los métodos comer, dormir, hacerEjercicio
        persona.comer("tacos");
        persona.dormir(8);
        persona.hacerEjercicio("yoga");
    }
}
