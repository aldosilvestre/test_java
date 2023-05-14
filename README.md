Test java transferencias
======

## Constitución de la solución
1. El usuario A realiza una transferencia al usuario B.
2. Se obtiene los datos del cbu de destino (B).
3. Realiza el pedido de transferencia al sistema.
4. Revalida la información del cbu origen(A) al cbu destino(B).
5. Sustrae los fondos de la cuenta origen.
6. Genera en el sistema una solicitud de transferencia en estado pending (BD).
7. Envia a una cola de mensajes la transferencia a realizar esperando el ack.
8. Se obtiene mediante consumer de una cola las transferencias realizadas.
9. En caso de efectivizar, se pasa el estado de la transacción de pending a done.

## Aclaraciones
***Aclaración 1:*** Para el seguimiento de las transferencias se gestiona por un transaction ID, esto se registra en los logs para contingencias.

***Aclaración 2:*** Las politicas de notificación, como notificaciones push pueden ser implementadas pero no estan contempladas en la solución.
