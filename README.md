# **Diseño y Arquitectura de Software**

*Fabian Moya, Juan Daniel González & Valentina López*

## **Problema 1 – Aplicación de Videojuegos**

**Patrón de Diseño: Prototype**

El problema nos plantea una posible solución haciendo uso del patrón de diseño creacional Prototype por que el ejercicio nos pide que el tipo de los objetos a crear es una instancia prototípica, que se clona para producir nuevos objetos.

Cada heroe en el juego puede actuar como un prototipo, y cuando se clona a este heroe para crear una copia idéntica se duplican igualmente todas sus propiedades (habilidades, experiencia, nivel).

Estos heroes pueden pertenecer a diferentes clases (guerrero, mago, arquero) y cada uno con habilidades únicas, siendo estas habilidades partes del estado cuando se clonan.

Después de la clonaciónn, el jugador puede modificar atributos del héroe, igualmente anterior a eso, las habilidades y otros atributos son copiados del original.

Este patrón asegura la eficiencia en el momento de la clonación, por que no se duplicarán los datos. Los objetos clonados son copias superficiales, y los datos compartidos entre clones pueden ser gestionados, así podemos evitar redundancia.

![image](https://github.com/user-attachments/assets/b858fe49-ecff-4520-b73a-efe283422523)


## **Problema 2 – Aplicación de Mensajería**

**Patrón de Diseño: Observer**

El patrón Observer es ideal para notificar automáticamente a múltiples dispositivos cuando llega un nuevo mensaje, manteniendo la lógica de notificación desacoplada de la lógica principal de la aplicación.

**Justificación:**

1. **Notificación en Tiempo Real:**
   - El sujeto (usuario o servicio de mensajería) mantiene una lista de observadores (dispositivos). Cuando llega un mensaje, notifica automáticamente a todos los observadores registrados.

2. **Desacoplamiento:**
   - El sujeto notifica a los observadores a través de una interfaz común, sin conocer detalles específicos de cada dispositivo, lo que mantiene la lógica de notificación independiente y modular.

3. **Flexibilidad:**
   - Los dispositivos pueden añadirse o eliminarse de la lista de observadores en tiempo de ejecución, lo que permite adaptar el sistema sin modificar la lógica principal.


![image](https://github.com/user-attachments/assets/a3ef148b-e5a4-4422-b50f-b97b6c1fe97c)



## **Problema 3 – Pedidos**

**Patrón de Diseño: Template Method**

El patrón Template Method es ideal cuando se necesita definir un algoritmo general en una clase base, permitiendo que las subclases implementen pasos específicos. Esto es perfecto para manejar la lógica común de procesamiento de pedidos, permitiendo variaciones según el tipo de pedido (comida, bebida, postre).

**Justificación:**

1. **Encapsulación del Algoritmo Común:**
   - El patrón Template Method define el proceso común (por ejemplo, toma de pedido, preparación, verificación de disponibilidad) en una clase base, encapsulando la estructura del algoritmo en un solo lugar.

2. **Flexibilidad para Pasos Específicos:**
   - Las subclases (como OrderFood, OrderBeverage, OrderDessert) sobrescriben pasos específicos del proceso sin alterar la estructura general definida en la clase base. Esto permite que cada tipo de pedido maneje sus particularidades (por ejemplo, preparar un plato vs. servir una bebida) mientras sigue el mismo flujo general.

3. **Reutilización de Código:**
   - El código común se mantiene en la clase base, evitando la duplicación en las subclases. Las subclases reutilizan la lógica común y solo implementan lo que es diferente, lo que simplifica el mantenimiento y reduce errores.


![image](https://github.com/user-attachments/assets/50872cbc-cc2a-40cb-bd88-120324bdf89e)


 ## **Problema 4 – Sistema de Gestión de tareas**
 
 **Patrón de Diseño: Command**

 la razon de usar el patron es "Patrón Command es una excelente elección ya que este patrón se adapta muy bien a los requisitos y ofrece los beneficios que se mencionan en el punto. 
Beneficios del Patrón Command:
- Desacopla el invocador de los objetos que realizan las acciones
- Permite la extensión de nuevas operaciones sin modificar el código existente
- Facilita el registro de acciones para realizar operaciones de reversión


![image](https://github.com/user-attachments/assets/b83de9c2-0c30-4932-bb9d-12946feabc0b)

 ## **Problema 5 – Decoración Habitaciones de Hotel**
 
 **Patrón de Diseño: Decorator**

 El patrón Decorator es ideal para escenarios donde necesitas agregar funcionalidades adicionales a un objeto de manera dinámica, sin alterar su estructura básica. Este patrón permite envolver objetos con otras clases, añadiendo nuevas responsabilidades de forma flexible y extensible, lo que es perfecto para el caso de las habitaciones de hotel que requieren personalización según las preferencias de los huéspedes.

 **Justificación:**

1.  **Agregar Funcionalidades Dinámicamente:**

El patrón Decorator permite agregar servicios adicionales (como flores frescas o chocolate gourmet) a una habitación ya existente de manera dinámica, sin necesidad de modificar la clase base de la habitación.

2. **Alternativa Flexible a la Subclase:**

En lugar de crear una subclase para cada posible combinación de decoraciones, el patrón Decorator ofrece una solución flexible, permitiendo combinar distintas decoraciones y servicios a través de la composición de objetos.

3. **Separación de Responsabilidades:**

El código se vuelve más mantenible y legible, ya que cada Decorator maneja una responsabilidad específica (por ejemplo, agregar flores o vino), manteniendo la lógica central de la habitación independiente de las decoraciones adicionales. Esto facilita la gestión y actualización de los servicios disponibles.


![image](https://github.com/user-attachments/assets/b61706d7-b00c-4945-8cdc-7acaa573baac)





