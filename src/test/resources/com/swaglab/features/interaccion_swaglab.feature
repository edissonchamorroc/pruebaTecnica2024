      #language: es
      Característica: Interaccion en la pagina swaglab
      Yo como cliente de SwagLabs
      Necesito explorar la página y los artículos
      Para poder realizar una compra


      Antecedentes: Realizo login en la pagina swaglab
      Dado Que ingreso a la pagina de swaglab
      Y realizo login con usuario "user" and contrasena "password"


      @AgregarArticulo
      Esquema del escenario: Validar que se agregue articulo a carrito de compras
      Cuando selecciono articulo "<nombre>"
      Entonces valida el nombre articulo "<nombre>" su descripcion "<descripcion>" y su precio "<precio>"
      Ejemplos:
      | nombre              | descripcion                                                                                                                            | precio |
      | Sauce Labs Backpack | Sauce Labs Backpack  with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection. | 29.99  |

      @RemoverArticulo
      Esquema del escenario: Validar que se remueva articulo de carrito de compras
      Cuando selecciono articulo "<nombre>"
      Y se remueve el articulo "<nombre>"
      Entonces valida el articulo "<nombre>" no se encuentre en el carrito de compras
      Ejemplos:
      | nombre |
      | hola   |

      @ComprarArticulos
      Esquema del escenario: Validar que se realice compra de articulos
      Cuando se seleccionan los articulos
      | articulo1   | articulo2   | articulo3   |
      | <articulo1> | <articulo2> | <articulo3> |
      Y realiza el proceso de checkout
      | firstName   | lastName   | zipCode   |
      | <firstName> | <lastName> | <zipCode> |
      Entonces valida el "<mensajeOrdenExitosa>" de orden de compra exitoso
      Ejemplos:
      | articulo1 | articulo2 | articulo3 | firstName | lastName | zipCode | mensajeOrdenExitosa |
      | articulo1 | articulo2 | articulo3 | firstName | lastName | zipCode | mensajeOrdenExitosa |
