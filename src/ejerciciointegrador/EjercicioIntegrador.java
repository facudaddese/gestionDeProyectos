package ejerciciointegrador;

import java.time.LocalDate;
import java.time.Month;

public class EjercicioIntegrador {

    public static void main(String[] args) {

        AdministracionProyecto adm = new AdministracionProyecto();
        Proyecto p1 = new ProyectoPrioridad(5, "CodeSphere", "Plataforma colaborativa para compartir código en la nube", LocalDate.of(2025, 1, 1), LocalDate.of(2025, 2, 13), "En planificación");
        Proyecto p2 = new ProyectoInvestigacion(7000, "AI Debugger", "Sistema de IA para detectar errores en código automáticamente", LocalDate.of(2025, 1, 15), LocalDate.of(2025, 10, 20), "Investigación avanzada");
        Proyecto p3 = new ProyectoPrioridad(5, "DevOpsSync", "Herramienta para automatización y monitoreo de CI/CD", LocalDate.of(2025, 5, 10), LocalDate.of(2026, 1, 5), "En desarrollo");
        Proyecto p4 = new ProyectoInvestigacion(10000, "CyberSentinel", "Sistema de detección de vulnerabilidades en software", LocalDate.of(2025, 1, 20), LocalDate.of(2025, 2, 10), "Investigación en curso");
        Proyecto p5 = new ProyectoPrioridad(3, "APIForge", "Generador automático de APIs REST basado en IA", LocalDate.of(2025, 2, 5), LocalDate.of(2025, 11, 25), "En planificación");

        try {
            adm.registrarProyecto(p1);
            adm.registrarProyecto(p2);
            adm.registrarProyecto(p3);
            adm.registrarProyecto(p4);
            adm.registrarProyecto(p5);
            System.out.println("\nQuiero agregar proyecto existente");
            adm.registrarProyecto(p5);
        } catch (ProyectoNoValidoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        adm.mostrarProyectos();

        try {
            System.out.println("\nQuiero eliminar al proyecto APIForge");
            adm.eliminarProyectos("APIForge");
            System.out.println("Quiero eliminar al proyecto APIForge nuevamente");
            adm.eliminarProyectos("APIForge");
        } catch (ProyectoNoValidoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        adm.mostrarProyectos();

        try {
            System.out.println("\nActualizo las fechas de CodeSphere");
            adm.actualizarProyectos("CodeSphere", LocalDate.of(2025, 1, 1), LocalDate.of(2025, 4, 30));
            System.out.println("Actualizo las fechas de DevOpsSync");
            adm.actualizarProyectos("DevOpsSync", LocalDate.of(2026, 1, 3), LocalDate.of(2025, 5, 17));
        } catch (ProyectoNoValidoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        adm.mostrarProyectos();

       /* System.out.println("\n--- CAMBIAMOS LOS ESTADOS DE TODOS LOS PROYECTOS --- \n");
        p1.actualizarEstado();
        p2.actualizarEstado();
        p3.actualizarEstado();
        p4.actualizarEstado();
        p5.actualizarEstado();
        adm.mostrarEstado();*/
    }

}
