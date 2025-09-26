package co.ean.hospital;

import java.util.Date;
/**
 * Clase que nos permite el control de estados y fechas del paciente*/
public class Cita {
    private Date fechaCita;
    private String estadoCita;

    /**
     * Constructor con sus respectivos getters y setters el cual se encarga de construir el objeto cita
     * @param fechaCita -- la fecha actual importada de la libreria Date
     * @param estadoCita -- se encarga de determinar en cual de los 3 estados esta la cita (asignada, reprogramada, cancelada)*/
    public Cita(Date fechaCita, String estadoCita) {
        this.fechaCita = fechaCita;
        this.estadoCita = estadoCita;
    }
    public Date getFechaCita() {
        return fechaCita;
    }
    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }
    public String getEstadoCita() {
        return estadoCita;
    }
    public void setEstadoCita(String estadoCita) {
        this.estadoCita = estadoCita;
    }
    public void mostrarCita(){
        System.out.println("Asignada para el " + estadoCita+" "+fechaCita);
    }

}
