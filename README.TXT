# BibliotecaEscolar

## Descripción del proyecto

BibliotecaEscolar es un sistema de escritorio desarrollado en Java utilizando NetBeans y una base de datos MySQL. Su objetivo es facilitar la administración de una biblioteca escolar mediante una interfaz gráfica sencilla.

## Funcionalidades

- **Gestión de libros:** registrar, listar y eliminar libros.
- **Gestión de categorías:** registrar y listar categorías.
- **Gestión de estudiantes:** registrar, listar y eliminar estudiantes.
- **Gestión de préstamos:** registrar y consultar préstamos de libros.
- **Gestión de devoluciones:** registrar la devolución de préstamos y actualizar su estado.
- **Base de datos:** almacenar la información mediante MySQL.

## Tecnologías utilizadas

- Java
- Java Swing
- Apache NetBeans IDE
- MySQL
- MySQL Connector/J
- SQL

## Estructura del proyecto

El proyecto se organiza en paquetes que separan las responsabilidades de la aplicación:

- `modelo`: clases que representan los datos del sistema.
- `vista`: ventanas e interfaces gráficas.
- `dao`: clases para realizar operaciones de acceso a datos.
- `conexion`: configuración de la conexión con MySQL.
- `controlador`: paquete destinado a la coordinación de acciones, cuando corresponda.

## Base de datos

La base de datos utilizada se llama `biblioteca_escolar`.

Entre las tablas principales se encuentran:

- `libros`
- `categorias`
- `estudiantes`
- `prestamos`
- `usuarios`

El repositorio incluye el archivo SQL de respaldo para facilitar la preparación de la base de datos.

## Requisitos

Para ejecutar el proyecto se necesita:

- Java JDK compatible con el proyecto.
- Apache NetBeans IDE.
- MySQL Server.
- MySQL Connector/J.

## Instalación y ejecución

1. Clonar o descargar este repositorio.
2. Abrir el proyecto en Apache NetBeans.
3. Crear la base de datos `biblioteca_escolar` en MySQL.
4. Importar el archivo `biblioteca_escolar.sql` desde MySQL Workbench o mediante la línea de comandos de MySQL.
5. Verificar la configuración de conexión en la clase `ConexionBiblioteca`.
6. Comprobar que el conector MySQL esté agregado al proyecto.
7. Ejecutar el proyecto desde NetBeans.

## Autor

Proyecto académico desarrollado como sistema de gestión de biblioteca escolar.

## Propósito académico

Este proyecto permite aplicar conocimientos de programación Java, interfaces gráficas, bases de datos relacionales y organización del código mediante separación de responsabilidades.
