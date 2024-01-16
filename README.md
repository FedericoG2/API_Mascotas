
# API Mascotas




![Logo](https://media.licdn.com/dms/image/C5612AQEzIUKfbUUNWw/article-cover_image-shrink_600_2000/0/1640701919659?e=2147483647&v=beta&t=_GgQWOSDG_nklkJef1XqFVHk68CKCsKIBohmCzkJk-Q)


## Modelado

 Las siguientes clases son los modelos:

* Persona
* Mascota
### Relacion
#### OneToMany
En donde una persona puede tener varias mascotas y varias mascotas pueden pertenecer a una persona.

## Endpoints


#### Lista de personas

```http
  GET localhost:8080/personas/traer
```

#### Crear una persona

```http
  POST localhost:8080/personas/crear
```

| Descripcion              | Requerido                      |
| :--------------------- | :----------------------------- |
| Se requiere un objeto para crear un registro | **Objeto por Body**        |

#### Eliminar una persona

```http
  DELETE localhost:8080/personas/eliminar/{id}
```

| Descripcion              | Requerido                      |
| :--------------------- | :----------------------------- |
| Se requiere un id para eliminar un registro | **Id de tipo Long**        |


#### Actualizar una persona

```http
  PUT  localhost:8080/personas/editar/
```
| Descripcion              | Requerido                      |
| :--------------------- | :----------------------------- |
| Se edita un registro ya creado | **Objeto por Body**        |


#### Lista de Mascotas

```http
  GET localhost:8080/mascotas/traer
```

#### Crear una persona

```http
  POST localhost:8080/mascota/crear
```

| Descripcion              | Requerido                      |
| :--------------------- | :----------------------------- |
| Se requiere un objeto para crear un registro | **Objeto por Body**        |

#### Eliminar una persona

```http
  DELETE localhost:8080/mascotas/eliminar/{id}
```

| Descripcion              | Requerido                      |
| :--------------------- | :----------------------------- |
| Se requiere un id para eliminar un registro | **Id de tipo Long**        |


#### Actualizar una persona

```http
  PUT  localhost:8080/mascota/editar/
```
| Descripcion              | Requerido                      |
| :--------------------- | :----------------------------- |
| Se edita un registro ya creado | **Objeto por Body**        |








