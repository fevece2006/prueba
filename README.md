# **INDRA: Prueba de ingreso** 
La aplicación utiliza las tecnologías:
Java 17, gradle, sprint boot, webflux, Resilience4j, mongodb, drools, lombok, circuit breaker, Junit, arquitectura hexagonal.

## **Drools: Aplicaci[on de reglas de negocio**
Si el producto es de la clase Vehiculo, tiene 10% de descuento
Si el producto es de otras clases, tiene 20% de descuento

## **Puerto de la aplicación**
Puerto: 8081

## **Servicios**
Obtiene todos los productos
Mètodo: GET
http://localhost:8081/products


Crea un nuevo producto
Mètodo: POST
http://localhost:8081/products
```
{
    "name": "Arroz",
    "price": 5,
    "clase": "Consumo"
}
```

Obtiene un producto por el id
Mètodo: GET
http://localhost:8081/products/id


Elimina un producto por el id
Mètodo: DELETE
http://localhost:8081/products/id


Modifica un producto por el id
Mètodo: PUT
http://localhost:8081/products/id
```
{
    "name": "Arroz",
    "price": 5,
    "clase": "Consumo"
}
```
## **Base de datos mongodb**
Usuario: fevece
Pasword: fevece
BD: bdprueba
Puerto: 27017
URI: mongodb://fevece:fevece@localhost:27017/bdprueba
Collecion: products