#language: es
#Author: cristian.agu14@gmail.com
@funcionalidad-login
Característica: Funcionalidad para ingresar al aplicativo swaglabs con credenciales

  @login-exitoso
  Escenario: Como analista de certificacion deseo validar la funcionalidad de login exitoso
    Dado que  el Analista accede al portal saucedemo
    Cuando se ingresan las credenciales correctas
    Entonces se observa el ingreso al aplicativo swaglabs
