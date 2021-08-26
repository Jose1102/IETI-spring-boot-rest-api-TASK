# IETI-spring-boot-rest-api-TASK 🧪

## Autores ✒️

* **Jose María Castro Ortega** - *Estudiante de ingeniería de sistemas* - [Jose1102](https://github.com/Jose1102)


### Parte 2: Implementación de la API RESTFUL del microservicio de tareas

1. Cree un nuevo proyecto usando [Spring Initializr] (https://start.spring.io/)
   * Utilice * Java * o * Kotlin * como lenguaje de programación.
   * Use Gradle como opción de proyecto (si su computadora es lenta, use Maven)
   * Agregue la dependencia de Spring Web antes de generar el proyecto.
2. Cree un nuevo repositorio en Github y confirme los archivos generados en 1.
3. Cree un nuevo paquete llamado * dto * y dentro defina su objeto * TaskDto * con al menos los siguientes campos:
     * nombre.
     * descripción.
     * estado [TODO, HACIENDO, REVISAR y HECHO].
     * asignado a.
     * fecha de vencimiento.
     * creado.
4. Cree un nuevo paquete llamado * datos * y dentro defina su objeto de datos * Tarea * con al menos los siguientes campos:
     * identificación.
     * nombre.
     * descripción.
     * estado [TODO, HACIENDO, REVISAR y HECHO].
     * asignado a.
     * fecha de vencimiento.
     * creado.
5. Cree un nuevo paquete llamado * servicio * y, en su interior, cree la siguiente interfaz


* Se realiza petición get de la lista de Task

![Get](https://github.com/Jose1102/IETI-spring-boot-rest-api-TASK/blob/main/images/get.PNG)


* Se realiza petición get donde se le envía el id del usuario a buscar

![GetById](https://github.com/Jose1102/IETI-spring-boot-rest-api-TASK/blob/main/images/getById.PNG)


* Se realiza petición post para crear un nuevo usuario

![PostCreate](https://github.com/Jose1102/IETI-spring-boot-rest-api-TASK/blob/main/images/postCreateTask.PNG)


* Se realiza petición put para realizar update de un usuario

![Put](https://github.com/Jose1102/IETI-spring-boot-rest-api-TASK/blob/main/images/put.PNG)



* Se realiza petición delete para eliminar un usuario con un id específico, retorna true si se eliminó satisfactoriamente 

![deleteTrue](https://github.com/Jose1102/IETI-spring-boot-rest-api-TASK/blob/main/images/deleteTrue.PNG)


Al momento de eliminar un usuario que no existe nos retornará false

![deleteFalse](https://github.com/Jose1102/IETI-spring-boot-rest-api-TASK/blob/main/images/deleteFalse.PNG)


## JavaDoc 📖

Para consultar la carpeta de [JAVADOC](https://github.com/Jose1102/PicasYFamasGame/tree/master/javadoc) .

## Licencia 📌

Este proyecto está bajo la Licencia Pública General GNU - consulte el archivo de [LICENCIA](https://github.com/Jose1102/PicasYFamasGame/blob/master/LICENSE.txt) para obtener más detalles.
