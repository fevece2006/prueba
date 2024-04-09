Prueba de ingreso a INDRA

#Puerto de la aplicación
Puerto: 8081

#Servicios
Obtiene todos los productos
Mètodo: GET
http://localhost:8081/products


Crea un nuevo producto
Mètodo: POST
http://localhost:8081/products

{
    "name": "Papel bond el millar",
    "price": 20
}


Obtiene un producto por el id
Mètodo: GET
http://localhost:8081/products/id


Elimina un producto por el id
Mètodo: DELETE
http://localhost:8081/products/id


Modifica un producto por el id
Mètodo: PUT
http://localhost:8081/products/id

{
    "name": "Gaseosa de 3LT",
    "price": 10
}

#Base de datos mongodb
Usuario: fevece
Pasword: fevece
BD: bdprueba
Puerto: 27017
URI: mongodb://fevece:fevece@localhost:27017/bdprueba