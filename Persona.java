public class Persona {
// Atributos
    String nombre;
    String apellido;
    int edad;
    float altura;
    
// Constructor
    public Persona(String nombre, String apellido, int edad, float altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
// THIS: Se utiliza para acceder a variables de instancia o métodos de la clase actual.
    }

// Métodos
    public String darInformacionCompleta() {
        return nombre + " " + apellido + " Tiene " + edad + " años." + " mide " + altura;
    }
}