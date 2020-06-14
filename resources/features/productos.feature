#language: es
#Author: cristian.agu14@gmail.com
@funcionalidad-productos
Característica: Funcionalidad para ver y agregar productos al carrito para su posterior compra

  Antecedentes: 
    Dado que  el Analista accede al portal saucedemo
    Cuando se ingresan las credenciales correctas
    Entonces se observa el ingreso al aplicativo swaglabs

  @login-exitoso
  Esquema del escenario: Como analista de certificacion deseo validar la funcionalidad de agregar productos al carrito y su respectiva compra
    Dado que  el Analista agrega los siguientes productos al carrito
      | Sauce Labs Backpack | Sauce Labs Bolt T-Shirt | Sauce Labs Fleece Jacket |
    Cuando se valida que el contador del carrito sea correcto
    Cuando se ingresa al carrito de compra se ven los productos seleccionados anteriormente
    Cuando se realiza el checkout con nombre<nombre> apellido<apellido> y codigo postal<codigoPostal>
