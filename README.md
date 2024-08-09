# **Diseño y Arquitectura de Software**

*Fabian Moya, Juan Daniel González & Valentina López*

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


 



