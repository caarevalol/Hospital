package co.ean.hospital;
import co.ean.hospital.citaServicio.*;

import java.util.Date;

/**
 * Clase la cual se encarga de administar el servicio el cual se implementa de las 3 interfaces*/
public class CitaServicio implements AsignarCita, CancelarCita, ReprogramarCita {
    /**
     * Constructores de la clase que utilizan las sobre escritura de las interfaces
     * Constructor asignarCita
     * @param paciente --  es el paciente al cual se le hacen las citas
     * @param fecha -- fecha a la cual van a quedar las respectivas citas o cancelaciones*/
    @Override
    public Cita asignarCita(Paciente paciente, Date fecha) {
        System.out.println("-----------------");
        System.out.println("- asignando cita para " + paciente.getNombre() + " por favor espera unos momentos turututuru -");
        System.out.println("-----------------");
        return new Cita (fecha, "=");

    }

    /**
     * Constructor cancelarCita
     * @param cita -- Cita asigna al paciente
     * @param p -- Paciente creado*/
    @Override
    public void cancelarCita(Cita cita, Paciente p) {
        cita.setEstadoCita("Cancelado");
        System.out.println("cancelando cita......" );
        System.out.println("Estado: " +  cita.getEstadoCita());
        System.out.println("Informando a " + p.getNombre());
        System.out.println("---------------");
    }
    /**
     * Constructor reprogramarCita
     * @param cita -- Cita asigna al paciente
     * @param nuevaFecha -- Dia disponible a la cual se le pospuso la cita*/
    @Override
    public void reprogramarCita(Cita cita, Date nuevaFecha) {
        cita.setFechaCita(nuevaFecha);
        cita.setEstadoCita("cita reprogramada");
        System.out.println("reprogramando cita......");
        System.out.println(cita.getEstadoCita() + " para el "+cita.getFechaCita()  );
        System.out.println("-----------------");

    }


}
