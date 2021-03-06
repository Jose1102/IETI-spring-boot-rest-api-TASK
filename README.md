# IETI-spring-boot-rest-api-TASK 馃И

## Autores 鉁掞笍

* **Jose Mar铆a Castro Ortega** - *Estudiante de ingenier铆a de sistemas* - [Jose1102](https://github.com/Jose1102)


### Parte 2: Implementaci贸n de la API RESTFUL del microservicio de tareas

1. Cree un nuevo proyecto usando [Spring Initializr] (https://start.spring.io/)
   * Utilice * Java * o * Kotlin * como lenguaje de programaci贸n.
   * Use Gradle como opci贸n de proyecto (si su computadora es lenta, use Maven)
   * Agregue la dependencia de Spring Web antes de generar el proyecto.
2. Cree un nuevo repositorio en Github y confirme los archivos generados en 1.
3. Cree un nuevo paquete llamado * dto * y dentro defina su objeto * TaskDto * con al menos los siguientes campos:
     * nombre.
     * descripci贸n.
     * estado [TODO, HACIENDO, REVISAR y HECHO].
     * asignado a.
     * fecha de vencimiento.
     * creado.
4. Cree un nuevo paquete llamado * datos * y dentro defina su objeto de datos * Tarea * con al menos los siguientes campos:
     * identificaci贸n.
     * nombre.
     * descripci贸n.
     * estado [TODO, HACIENDO, REVISAR y HECHO].
     * asignado a.
     * fecha de vencimiento.
     * creado.
5. Cree un nuevo paquete llamado * servicio * y, en su interior, cree la siguiente interfaz


* Se realiza petici贸n get de la lista de Task

![Get](https://github.com/Jose1102/IETI-spring-boot-rest-api-TASK/blob/main/images/get.PNG)


* Se realiza petici贸n get donde se le env铆a el id del usuario a buscar

![GetById](https://github.com/Jose1102/IETI-spring-boot-rest-api-TASK/blob/main/images/getById.PNG)


* Se realiza petici贸n post para crear un nuevo usuario

![PostCreate](https://github.com/Jose1102/IETI-spring-boot-rest-api-TASK/blob/main/images/postCreateTask.PNG)


* Se realiza petici贸n put para realizar update de un usuario

![Put](https://github.com/Jose1102/IETI-spring-boot-rest-api-TASK/blob/main/images/put.PNG)



* Se realiza petici贸n delete para eliminar un usuario con un id espec铆fico, retorna true si se elimin贸 satisfactoriamente 

![deleteTrue](https://github.com/Jose1102/IETI-spring-boot-rest-api-TASK/blob/main/images/deleteTrue.PNG)


Al momento de eliminar un usuario que no existe nos retornar谩 false

![deleteFalse](https://github.com/Jose1102/IETI-spring-boot-rest-api-TASK/blob/main/images/deleteFalse.PNG)


## JavaDoc 馃摉

Para consultar la carpeta de [JAVADOC](https://github.com/Jose1102/PicasYFamasGame/tree/master/javadoc) .

## Licencia 馃搶

Este proyecto est谩 bajo la Licencia P煤blica General GNU - consulte el archivo de [LICENCIA](https://github.com/Jose1102/IETI-spring-boot-rest-api-TASK) para obtener m谩s detalles.
