import co.ean.hospital.Cita;
import co.ean.hospital.CitaServicio;
import co.ean.hospital.Paciente;

import java.util.Date;

/**
 * Clase principal de la aplicación.
 * Aquí se simula el flujo completo de gestión de citas médicas:
 * 1. Asignar cita
 * 2. Mostrar detalles
 * 3. Consultar datos de contacto del paciente
 * 4. Reprogramar cita
 * 5. Cancelar cita
 *
 * Finalmente se imprime el estado final de la cita.
 *
 * Diseñado por: [Felipe Alfonso Oyola, Adriana Beltra, Sebastion rico, Camilo Andres Arevalo Leon]
 */

public class App {
    public static void main(String[] args) throws Exception {
        // Crear un paciente de ejemplo con nombre, teléfono y documento
        Paciente paciente = new Paciente("sebastian pepe de tangamandapio", 302527890, 1029890134);
        // Crear el servicio que permite asignar, reprogramar y cancelar cita
        CitaServicio servicio = new CitaServicio();

        // 1. Asignar cita inicial al paciente con la fecha actual
        Cita c = servicio.asignarCita(paciente , new Date());
        // 2. Mostrar detalles de la cita asignada
        c.mostrarCita();
        // 3. Mostrar los datos de contacto del paciente
        paciente.datosContacto();

        // 4. Reprogramar la cita para el día siguiente (+ 86,400,000 ms = 1 día)
        Date nuevaFecha = new Date(System.currentTimeMillis() + 86400000);
        servicio.reprogramarCita( c, nuevaFecha );

        // 5. Cancelar la cita (pasando la cita y el paciente
        servicio.cancelarCita( c, paciente);

        // Mensaje final con el estado de la cita
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("- Estado final de la cita: " + c.getEstadoCita() + ",si quiero agendar una cita de nuevo llame al: No se donde xd -");
        System.out.println("----------------------------------------------------------------------------------------------------");
    }
}
