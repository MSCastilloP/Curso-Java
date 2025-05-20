package negocio;

// Abstraccion de una Persona
// No se pueden crear instancias tipo Persona porque no interesa el Banco
public abstract class Persona {
    // Encapsulacion
    // En java hay 4 niveles de encapsulacion
    // public, private, protected (herencia), default (paquete)
    // Regla de Oro de la encapsulacion: define los campos privados
    // y los metodos publicos
    private String nombre;
    private Domicilio domicilio;
    private int edad;

    // Un constructor crea un objeto y lo inicializa
    public Persona(String nombre,Domicilio domicilio,int edad){
        this.nombre=nombre;
        this.domicilio=domicilio;
        this.edad=edad;
    }

    public abstract void habla();

    // Encapsulando con los metodos set y get

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void imprime(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Domiciio: "+domicilio);
        System.out.println("Edad: "+edad);
    }

//    public String toString(){
//        return "Nombre:"+nombre+" Domicilio:"+domicilio+" Edad:"+edad;
//    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", edad=" + edad +
                '}';
    }
}
