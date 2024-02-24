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
                  | nombre                | descripcion                                                                                                                                                     | precio |
                  | Sauce Labs Bike Light | A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included. | 9.99   |

                  @RemoverArticulo
                  Esquema del escenario: Validar que se remueva articulo de carrito de compras
                  Cuando selecciono articulo "<nombre>"
                  Y se remueve el articulo "<nombre>"
                  Entonces valida el articulo "<nombre>" no se encuentre en el carrito de compras
                  Ejemplos:
                  | nombre                |
                  | Sauce Labs Bike Light |

                  @ComprarArticulos
                  Esquema del escenario: Validar que se realice compra de articulos
                  Cuando se seleccionan los articulos
                  | articulo1 | <articulo1> |
                  | articulo2 | <articulo2> |
                  | articulo3 | <articulo3> |
                  Y realiza el proceso de checkout
                  | firstName | <firstName> |
                  | lastName  | <lastName>  |
                  | zipCode   | <zipCode>   |
                  Entonces valida el "<mensajeOrdenExitosa>" de orden de compra exitoso
                  Ejemplos:
                  | articulo1             | articulo2               | articulo3                | firstName | lastName | zipCode | mensajeOrdenExitosa                                                                     |
                  | Sauce Labs Bike Light | Sauce Labs Bolt T-Shirt | Sauce Labs Fleece Jacket | Edisson   | Chamorro | 050014  | Your order has been dispatched, and will arrive just as fast as the pony can get there! |
