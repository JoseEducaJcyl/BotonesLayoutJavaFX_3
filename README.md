# BotonesLayoutJavaFX_3

Ejemplos prácticos de **diálogos emergentes y validación de datos** en JavaFX.

## ¿Qué incluye?

- **Alertas**: Muestra ventanas de información, advertencia y error.
- **Entrada de texto**: Diálogo (`TextInputDialog`) para que el usuario escriba su nombre.
- **Selección de opciones**: Diálogo (`ChoiceDialog`) para elegir entre varias opciones predefinidas.
- **Validación de campos**: Comprueba que los campos no estén vacíos en un formulario.
- **Validación de formato**: Verifica que un teléfono tenga exactamente 9 dígitos usando una expresión regular (`\\d{9}`).

## ¿Cómo funciona?

1. Cada ejemplo es independiente (se puede ejecutar por separado).
2. Los botones disparan diferentes tipos de diálogos.
3. Los formularios validan los datos antes de mostrarlos o procesarlos.
4. Si hay errores (campos vacíos o formato incorrecto), se muestra una alerta de advertencia o error.

## ¿Para qué sirve?

Aprender a interactuar con el usuario mediante:
- Mensajes emergentes (`Alert`).
- Captura de texto (`TextInputDialog`).
- Selección de opciones (`ChoiceDialog`).
- Validación básica de datos en interfaces gráficas.

## Requisitos y ejecución

- Java 11 o superior.
- Maven.

```bash
mvn javafx:run
