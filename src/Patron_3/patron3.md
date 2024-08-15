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

