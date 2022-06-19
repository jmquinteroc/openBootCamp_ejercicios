package Ejercicio5;

public class Main{
    
    public static void main (String[] args){
        Persona persona = new Persona(38, "Jose", "+1-407-5555538");

        Cliente cliente= new Cliente();  
        cliente.setCredito(1000);

        Trabajador trabajador =new Trabajador();
        trabajador.setSalario(3000);

       
        persona.setTelefono("+1 4072225588");
        System.out.println("El cliente: "+persona.getNombre());
        System.out.println("de edad: "+persona.getEdad());
        System.out.println("telefono: "+persona.getTelefono());
        System.out.println("tiene un credito de : "+cliente.getCredito());
        System.out.println("y tiene un salario de : "+trabajador.getSalario());
    }

    
}

class Persona{
    public int edad;
    public String nombre;
    public String telefono;

    Persona(){}
    
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


class Cliente extends Persona{
    float credito;
    public float getCredito() {
        return this.credito;
    }
    public void setCredito(float credito) {
        this.credito = credito;
    }
}


class Trabajador extends Persona{
    float salario;
    public float getSalario() {
        return this.salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

}
