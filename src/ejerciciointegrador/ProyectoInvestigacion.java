package ejerciciointegrador;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class ProyectoInvestigacion extends Proyecto implements IAsignable {

    private int presupuesto;
    List<String> tareas = new ArrayList<>();

    public ProyectoInvestigacion(int presupuesto, String nombre, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, String estado) throws ProyectoNoValidoException {
        super(nombre, descripcion, fechaInicio, fechaFin, estado);
        this.presupuesto = presupuesto;
        if (fechaFin.isBefore(fechaInicio)) {
            throw new ProyectoNoValidoException("La fecha de fin no puede ser anterior a la fecha de inicio.");
        }
    }

    @Override
    public void actualizarEstado() {

        if (fechaFin.isBefore(LocalDate.now())) {
            setEstado("Finalizado");
        } else {
            setEstado("En progreso");
        }

    }

    @Override
    public void asignarTarea(String tarea) {

        if (tareas.size() < 7) {
            tareas.add(tarea);
            System.out.println("Tarea agregada");
        } else {
            System.out.println("Limite alcanzado de tareas");
        }
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

}
