El problema nos plantea una posible solución haciendo uso del patrón de diseño creacional Prototype
por que el ejercicio nos pide que el tipo de los objetos a crear es una instancia prototípica, que se clona
para producir nuevos objetos.

Cada heroe en el juego puede actuar como un prototipo, y cuando se clona a este heroe para crear una copia idéntica
se duplican igualmente todas sus propiedades (habilidades, experiencia, nivel).

Estos heroes pueden pertenecer a diferentes clases (guerrero, mago, arquero) y cada uno con habilidades únicas, siendo 
estas habilidades partes del estado cuando se clonan.

Después de la clonaciónn, el jugador puede modificar atributos del héroe, igualmente anterior a eso, las habilidades y otros 
atributos son copiados del original.

Este patrón asegura la eficiencia en el momento de la clonación, por que no se duplicarán los datos. Los objetos clonados son 
copias superficiales, y los datos compartidos entre clones pueden ser gestionados, así podemos evitar redundancia. 