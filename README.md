# Challenge ONE Java Sprint 01: Conversor de moneda con API

![dsads](https://github.com/CamiloPJ/ConversorDeMoneda/assets/126632936/0794af09-2c93-4c7f-9886-130c55db4654)

## Descripcion del programa 
El Conversor de Moneda es una aplicación Java diseñada para permitir a los usuarios convertir diferentes tipos de moneda utilizando la API de tasas de cambio de ExchangeRate-API. Este proyecto proporciona una manera rápida y sencilla de realizar conversiones de moneda en tiempo real, ayudando a los usuarios a comprender y comparar los valores de diferentes monedas de manera eficiente.
Las conversiones de divisas que estan disponibles son las siguientes:

* Dólar [USD] → Peso argentino [ARS]
* Peso argentino [ARS] → Dólar [USD]
* Dólar [USD] → Real brasileño [BRL]
* Real brasileño [BRL] → Dólar [USD]
* Dólar [USD] → Peso colombiano [COP]
* Peso colombiano [COP] → Dólar [USD]

## Funcionalidades
* Menú: La aplicación presenta un menú interactivo en la consola que permite al usuario seleccionar una acción mediante la introducción de un número del 1 al 7. Una vez que se ha seleccionado la acción deseada, se solicita al usuario que ingrese un número para indicar el valor que desea convertir.
* Pair Conversion Requests: El Conversor de Moneda utiliza la API de tasas de cambio de ExchangeRate-API, que ofrece un endpoint específico llamado Pair Conversion. Este endpoint es útil para aplicaciones donde solo deseas convertir entre dos monedas específicas y no estás interesado en ninguna otra.

  El endpoint Pair Conversion proporciona una respuesta JSON mínima con exactamente los datos que necesitas. Es una respuesta mucho más pequeña que la que obtendrías del endpoint Standard, lo que lo hace rápido y fácil de desarrollar.

* Entrada por teclado: Se implementó un proceso de análisis de entrada utilizando expresiones regulares para garantizar que la cantidad de moneda ingresada por el usuario sea válida. Esto asegura que solo se acepten valores que sean números enteros o decimales, lo que mejora la robustez y la usabilidad de la aplicación al evitar errores de formato en la entrada del usuario.

* Acción de salida: Si el usuario decide finalizar el programa, simplemente debe ingresar la opción correspondiente (opción 7) cuando se le solicite en el menú. En respuesta a esta acción, se mostrará un mensaje de despedida al usuario que indica "Gracias por usar nuestros servicios".

## Modo de uso
1. Al iniciar el programa se muestra el menu con las opciones disponibles:

    ![image](https://github.com/CamiloPJ/ConversorDeMoneda/assets/126632936/9ad0965e-6d55-4a5a-9483-51958ff8541a)


2. Se digita la opción correspondiente a la conversion de divisas que se deseé y seguidamente se pregunta por la cantidad que se requiere convertir:

    ![image](https://github.com/CamiloPJ/ConversorDeMoneda/assets/126632936/9eb187e5-d9fa-4e33-8e70-294bddff9bf2)

NOTA: Solo se pueden ingresar numeros enteros del 1 al 7.

3. Se ingresa la cantidad que se busca convertir y se muestra el resultado seguido de nuevamente la lista de opciones.

    ![image](https://github.com/CamiloPJ/ConversorDeMoneda/assets/126632936/bf2d83cf-8bad-49e6-83e3-915fcda6ef5d)

4. Digitando el número 7 se da fin al programa mostrando un mensaje de despedida:

    ![image](https://github.com/CamiloPJ/ConversorDeMoneda/assets/126632936/3643822f-9d28-44cf-9445-f13b67889810)

## Autor
[<img src="https://avatars.githubusercontent.com/u/126632936?v=4" width=115><br><sub>Camilo Paternina Jiménez</sub>](https://github.com/CamiloPJ)

  
