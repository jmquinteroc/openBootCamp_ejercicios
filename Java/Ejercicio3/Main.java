package Ejercicio4;

public class Main {
    public static void main(String[] args){
      Persona persona= new Persona(); 
      persona.setEdad(38);
      persona.setNombre("Jose");
      persona.setTelefono("+1-407-5555551");



      Persona persona1= new Persona(40, "Carla", "+1-407-5555552");

      System.out.println("Nombre: "+persona.getNombre());
      System.out.println("Edad: "+persona.getEdad());
      System.out.println("Telefono: "+persona.getTelefono());
      persona.setEdad(39);
      
      System.out.println("Nombre: "+persona1.getNombre());
      System.out.println("Edad: "+persona1.getEdad());
      System.out.println("Telefono: "+persona1.getTelefono());
      
      System.out.println("La nueva edad de "+ persona.getNombre()+" es: " + persona.getEdad());
    }

}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;
    
    Persona (){

    }

    Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre= nombre;
        this.telefono = telefono;
    } 
    
    public int getEdad() {
        return this.edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
