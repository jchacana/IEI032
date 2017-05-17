# IEI032
==========

Repositorio para asignatura IEI032 Instituto Santo Tomás

# Descripción problema
# Grupo 1 Es El Mejor
## Magia: El encuentro

Magia: El encuentro, es un juego de cartas coleccionables donde el jugador representa a un hechicero ejecutando hechizos. Para ello, 
requiere maná el cual se obtiene de las "tierras". Con el maná, puede pagar el costo de un hechizo.  Tanto una tierra como un hechizo es representada mediante una carta. A su vez, cada hechizo posee un costo de maná que se encuentra impreso en la carta, representado por un numero. Cada carta posse un nombre, un ilustrador y una edicion a la que pertenece

Los hechizos se dividen en:

 - Instantáneos: Hechizos que pueden jugarse en cualquier momento
 - Conjuros: Hechizos que sólo pueden jugarse durante el turno del jugador activo
 - Criaturas: Hechizos que sólo pueden jugarse durante el turno del jugador activo. Representan distintos tipos de criaturas mitologicas. Poseen atributos de ataque y resistencia

Para jugar **Magia: El encuentro** se necesita de un mazo de 60 cartas compuesto por:

 - Cantidad de hechizos limitada a 4 cartas con el mismo nombre
 - Cantidad de tierras no limitadas

Un juego comienza barajando (aleatorizando) el mazo y luego robando 7 cartas de la parte superior del mazo.
El jugador tiene la opción de realizar **Mulligan**, esto es, devolver sus cartas al mazo, volver a barajar y robar 1 carta menos. 
Se puede realizar tantas veces como el jugador quiera hasta que ya no pueda robar cartas
Cada vez que se diga **robar** carta, se refiere a tomar una carta de la parte superior del mazo

Su tarea como Arquitecto de software es diseñar y programar una solución que permita:

 - Mantener una colección de distintas cartas
 - Mantener distintos mazos (e identificarlos) a partir de las cartas ingresadas en la colección
 - Seleccionar el mazo e iniciar una simulación de juego que permita:
	 -  Barajar mazo
	 -  Robar una mano inicial de 7 cartasRealizar mulligan (debe validar que sea posible hacerlo)
	 -  Robar una carta del mazo

El código fuente del proyecto debe ser entregado en un "branch" en este mismo repositorio. La gestión del proyecto se realizará (para la seccion diurna) en la asignatura de Ingeniería de Software
