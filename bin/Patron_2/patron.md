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


