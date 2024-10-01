
Este ejercicio requiere configurar el entorno del motor de base de datos; para ello, el docente suministrará el contenedor para MySQL. Para subir el contenedor, siga el manual de serve-mysql.

Luego, proceda a construir la base de datos.

Para este ejercicio práctico, se requiere la base de datos `estudiante`, que deberá contener las siguientes entidades:

- **Estudiante**
- **Materia**
- **Nota**
- **Matrícula**

Se requiere que la base de datos siga el estándar de nombres en *snake_case*, con todas las entidades y atributos en singular.

Es importante tener en cuenta que cada materia tiene obligatoriamente tres cortes, y solo se puede registrar una única nota por cada corte. La entidad `matrícula` recibirá la nota definitiva, que depende de las notas registradas en la entidad `nota`.
