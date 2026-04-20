Refactorización de Spaghetti Code aplicando Strategy y Command

 Descripción general

Este proyecto implementa la refactorización de un sistema de procesamiento de pedidos originalmente diseñado con **Spaghetti Code**, caracterizado por múltiples estructuras condicionales anidadas y alta complejidad ciclomatica. El objetivo principal es transformar dicho diseño en una arquitectura modular mediante la aplicación de los patrones de diseño **Strategy** y **Command**, mejorando la mantenibilidad, extensibilidad y testabilidad del sistema.

El desarrollo sigue un enfoque incremental, donde primero se implementa el antipatrón, posteriormente se encapsulan las reglas de negocio mediante Strategy, y finalmente se desacopla la ejecución mediante Command.



 Evidencia de ejecución

Ejemplo de salida del sistema:

```text id="u4tbkn"
Procesando pedido: P001
 Estrategia: VIP | Descuento: 45%
 Total final: $660.00
 [ALERTA] Pedido de alto valor: P001
Pedido P001 procesado.

Procesando pedido: P002
 Estrategia: VIP | Descuento: 30%
 Total final: $420.00
Pedido P002 procesado.

Procesando pedido: P003
 Estrategia: PREMIUM | Descuento: 15%
 Total final: $255.00
Pedido P003 procesado.

Procesando pedido: P004
 Estrategia: ESTANDAR | Descuento: 8%
 Total final: $138.00
Pedido P004 procesado.
```
<img width="1674" height="1038" alt="image" src="https://github.com/user-attachments/assets/2c2c8924-1ffa-4913-b5cb-9bf92dffd27f" />



La salida es equivalente a la versión original, garantizando que la refactorización no altera el comportamiento funcional .

Proceso de desarrollo (commits)

El desarrollo se realizó en tres etapas principales:

1. Implementación del Spaghetti Code
2. Aplicación del patrón Strategy
3. Aplicación del patrón Command y refactorización final



 Conclusión

La refactorización permitió transformar un sistema con alta complejidad ciclomatica en una arquitectura modular basada en patrones de diseño reconocidos. La aplicación de Strategy y Command reduce el acoplamiento, mejora la cohesión y facilita la evolución futura del sistema.

Este ejercicio demuestra la importancia de identificar y eliminar antipatrones de diseño, aplicando principios formales de ingeniería de software para mejorar la calidad del código.

