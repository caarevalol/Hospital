package co.ean.hospital.citaServicio;

import co.ean.hospital.Cita;
import co.ean.hospital.Paciente;
/**
 * Interfaz encargada de cancelar citas ya asignadas*/
public interface CancelarCita {
    /**
     * Metodo que cancela una cita
     * param cita -- cita a cancelar
     * */

    void cancelarCita(Cita cita, Paciente paciente);
}
