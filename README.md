
# Sistema de Gestión de Proyectos

Este proyecto es una aplicación orientada a objetos en Java que permite gestionar proyectos de software, utilizando conceptos clave de Programación Orientada a Objetos (POO) como **clases abstractas, herencia, interfaces, excepciones y colecciones**.

El sistema permite **registrar, actualizar y eliminar proyectos**, además de validar la información ingresada, como evitar nombres duplicados y garantizar que las fechas de inicio y fin sean correctas.
## **Funcionalidades Principales**

1.  **Administración de Proyectos**
    
    -   ***Registrar*** nuevos proyectos asegurando que no haya nombres repetidos.
    -   ***Validar*** que la fecha de fin no sea anterior a la fecha de inicio.
    -   ***Actualizar*** proyectos modificando sus fechas y estado.
    -   ***Eliminar*** proyectos existentes.
    
2. **Estructura del Proyecto**
    - ***Proyecto*** (Clase abstracta): Representa un proyecto con atributos como **nombre, descripción, estado, fecha de inicio y fecha de fin**.
    - ***ProyectoDesarrollo*** y ***ProyectoPrioridad*** (Clases hijas): Representan tipos específicos de proyectos con su propia lógica para **actualizar el estado** según el presupuesto o el progreso.
    - ***AdministracionDeProyecto*** (Clase de gestión): Contiene una lista de proyectos y maneja su registro, actualización y eliminación.
	
3. **Manejo de Excepciones**
	- ***ProyectoNoValidoException***: Se utiliza para manejar errores como nombres repetidos o fechas inválidas en los proyectos.
	
4. **Uso de Colecciones**
	- Se usa **Set < Proyecto >** para almacenar y gestionar los proyectos de manera dinámica.
	 
## **Tecnologías Utilizadas**

-   **Java** (*POO*, *Excepciones*, *Colecciones*).
-   *Clases Abstractas* e *Interfaces*.
-   *LocalDate*.
