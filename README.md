# Proyecto de automatización

Proyecto de automatización de pruebas funcionales en la cual se plantea probar la compra de uno o varios articulos en una aplicación web.

## Comenzando 🚀

Proyecto construido con:
JAVA
SERENITY
SCREENPLAY
MAVEN

### Pre-requisitos 📋

Para ejecutar el proyecto el equipo debe tener:
Java SE 8
MAVEN 3.6
Conexión a internet

## Ejecutando las pruebas ⚙️

Si va a ejecutar el proyecto desde un IDE de desarrollo debe de insertar en las propiedades de los Runners como argumentos las variables -Duser=standard_user -Dpassword=secret_sauce.

Si va aejecutar el proyecto desde consola debe de ejecutar el siguiente comamdo el la raiz del proyecto
mvn verify -Duser="standard_user" -Dpassword="secret_sauce"
El comando anterior ejecuta todas las pruebas y genera el informe en la carpeta Target del proyecto.

En el proyecto se diseñaron dos Features los cuales puedes ser ejecutados con los tags dispuestos para esto. Ejemplo:

mvn verify -Dtags="@funcionalidad-login" -Duser="standard_user" -Dpassword="secret_sauce"

El comando anterior solo ejeculas los escenarios de @funcionalidad-login, si quiere ejecutar otro de forma indivudual puede mirar el diseño de los features y ejecutar los que esten planteados.
```
Las variables -Duser=standard_user -Dpassword=secret_sauce son planteadas para proteger la información del usuario, se da por entendido que este es un ejercicio y no una prueba real, por lo tanto no era necesario utilizar estas variables pero se proponen por buenas practicas.
```
### Analice las pruebas 🔩

Para analizar el resultado de las pruebas ir a la siguiente del proyecto: target/site/serenity y abrir el archivo index.html despues de ejecutar el script

```
target/site/serenity/index.html
```
## Autores ✒️

* **Cristian Agudelo** cristian.agu14@gmail.com



