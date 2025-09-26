package co.ean.hospital.citaServicio;
import co.ean.hospital.Cita;
import co.ean.hospital.Paciente;

import java.util.Date;
/**
*Interface que define el comportamiento de asignar una cita
 */
public interface AsignarCita {
    /**
     * Metodo que asigna una nueva cita al paciente
     * param paciente -- paciente al cual se le asigna la cita
     * param fecha -- fecha la cual se asigna la cita
     * return cita creada*/


    Cita asignarCita(Paciente paciente, Date fecha);
}
