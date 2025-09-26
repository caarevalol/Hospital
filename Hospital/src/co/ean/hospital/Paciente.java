package co.ean.hospital;

/** Clase paciente que recibe datos particulares del paciente, ayudando a la reformulacion de subclase*/
public class Paciente {
    
/**Atributo que especifica datos básicos del paciente: nombre, cedula, numero celular*/
    
    private String nombre;
    private long cedula;
    private long numero;
    
    /** Constructor que asigna los datos del paciente
     * @param nombre
     * @param numero
     * @param cedula
     */
    public Paciente (String nombre, long numero, long cedula){
        this.nombre = nombre; 
        this.numero = numero;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCedula() {
        return cedula;
    }

    public double getNumero() {
        return numero;
    }

    /**
     * Metodo el cual se encarga de informar al paciente la asignacion de su cita*/
    public void datosContacto(){
        System.out.println("-----------------");
        System.out.println("- Informando al contacto "+nombre+" identificado con cc:"+cedula+" y numero de celular:"+numero + "-");
        System.out.println("-----------------");
    }
}