package co.ean.hospital.citaServicio;

import co.ean.hospital.Cita;
import java.util.Date;

/**
 * Interfaz que se encarga de reprogramar una cita a la cual el paciente no puede asistir.
 */

public interface ReprogramarCita {
    /**
     * Reprograma una nueva cita
     * param cita -- cita la cual se va a reprogramar
     * param nuevaFecha -- fecha a la cual el paciente si puede asistir*/
    void reprogramarCita (Cita cita, Date nuevaFecha);


}