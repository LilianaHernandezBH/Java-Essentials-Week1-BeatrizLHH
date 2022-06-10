/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.variablesenjavaysalidadedatos;

/**
 *
 * @author Liliana
 */
public class VariablesEnJavaYSalidaDeDatos {

    public static void main(String[] args) {
       // System.out.println("Hello World!");
        
    // Mostrar por consola la suma de 3 números enteros creando 3 variables;
    
    System.out.println("""
                       8. Mostrar por consola la suma de 3 numeros enteros 
                       """);
    
     int numero1=5;
     int numero2=9;
     int numero3=2;
     
     int suma=numero1+numero2+numero3;
     System.out.println("La suma de los tres numeros enteros es: "+suma);
     System.out.println("======><======");
     
     // Mostrar por consola tus nombres completos creando más de 2 variables;
     
      System.out.println("""
                         8.1 Mostrar por consola tus nombres completos creando mas de 2 variables
                         """);
       
       String PrimerNombre="Beatriz";
       String SegundoNombre="Liliana";
       String PrimerApellido="Hernandez";
       String SegundoApellido="Hernandez";
    
     
        System.out.println("Mi nombre Completo es: "+PrimerNombre+" "+SegundoNombre+" "+PrimerApellido+" "+SegundoApellido);
        System.out.println("======><======");
        
        
        // Mostrar por consola tu Nombre solo utilizando variables CHAR;
        System.out.println("""
                           8.3 Mostrar por consola tu Nombre solo utilizando variables CHAR
                           """);
       
       char PrimeraLetraNombre='B';
       char SegundaLetraNombre='e';
       char TerceraLetraNombre='a';
       char CuartaLetraNombre='t';
       char QuintaLetraNombre='r';
       char SextaLetraNombre='i';
       char SeptimaLetraNombre='z';
     
        System.out.println("Mi nombre "+PrimeraLetraNombre+SegundaLetraNombre+TerceraLetraNombre+CuartaLetraNombre+
                            QuintaLetraNombre+SextaLetraNombre+SeptimaLetraNombre);
        System.out.println("======><======");
        
        // Mostrar por consola la suma de 2 números flotantes creando 2 variables;
        System.out.println("""
                           8.4 Mostrar por consola la suma de 2 numero flotantes creando 2 variables
                           """);
       
         float numeroFlotante1=31.41f;
         float numeroFlotante2=23.89f;
         
         float sumaNumerosFlotante=numeroFlotante1+numeroFlotante2;
     
        System.out.println("La suma de dos numeros Flotantes es: "+sumaNumerosFlotante);
        System.out.println("======><======");
        
        // Mostrar por consola la suma de 4 números doubles creando 4 variables;
        
        System.out.println("""
                           8.4 Mostrar por consola la suma de 4 numeros doubles
                           """);
       
         double numeroDoubleUno=3.13e3;
         double numeroDoubleDos=2.89e3;
         double numeroDoubleTres=9.25e3;
         double numeroDoubleCuatro=4.72e3;
         
         double sumaNumerosDoubles=numeroDoubleUno+numeroDoubleDos+numeroDoubleTres+numeroDoubleCuatro;
     
        System.out.println("La suma de dos numeros Flotantes es: "+sumaNumerosDoubles);
        System.out.println("======>o<======");
        
        //10.Definir 1 variable tipo Int y una variable de tipo Double, sumarlo, convertirlo a Int y mostrarlo por Consola
        
        System.out.println("""
                           10. Definir 1 variable tipo Int y una variable de tipo Double, sumarlo, convertirlo a Int
                           """);
        
        int    variableEntera=2;
        double variableDouble=30.99;
        int     variableCambioEntero = (int)Math.round(variableDouble);
        
        int conversorSumaDeVariables=variableEntera+variableCambioEntero;
        
        System.out.println("La suma de conversion en Entero es: "+conversorSumaDeVariables);
        
        System.out.println("======>3<======"+"\n");
         
        System.out.println("----> 11. OPERADORES JAVA <----");
        /*Realizar las siguientes operaciones con 4 números y mostrarlo por consola 
        (Utilizar una variable para cada número a calcular)
          o	Suma de números
          o	Resta de números
          o	Multiplicación de números
          o	División de números
          o	Incremento en 1 de la multiplicación
          o	Decremento en 1 de división
        */
    System.out.println("11.1  Suma de números");
    int numeroUnoSuma=10;
    int numeroDosSuma=15;
    int numeroTresSuma=33;
    int numeroCuatroSuma=25;
    
    int SumaDeNumeros=numeroUnoSuma+numeroDosSuma+numeroTresSuma+numeroCuatroSuma;
    System.out.println("La suma de los numeros es: "+SumaDeNumeros);
    
    System.out.println("======>3<======"+"\n");
    System.out.println("11.2  Resta de numeros");
    
    int numeroUnoResta=24;
    int numeroDosResta=6;
    int numeroTresResta=5;
    int numeroCuatroResta=4;
    
    int RestaDeNumeros=numeroUnoResta-numeroDosResta-numeroTresResta-numeroCuatroResta;
    System.out.println("La suma de los numeros es: "+RestaDeNumeros);
    System.out.println("======>3<======"+"\n");
    
    System.out.println("11.3  Multiplicacion de numeros");
    
    int numeroUnoMultiplicacion=2;
    int numeroDosMultiplicacion=4;
    int numeroTresMultiplicacion=8;
    int numeroCuatroMultiplicacion=16;
    
    int MultiplicacionDeNumeros=numeroUnoMultiplicacion*numeroDosMultiplicacion*numeroTresMultiplicacion*numeroCuatroMultiplicacion;
    System.out.println("La suma de los numeros es: "+MultiplicacionDeNumeros);
    
    System.out.println("======>3<======"+"\n");
    
    System.out.println("11.4  Division de numeros");
    
    int numeroUnoDivision=1000;
    int numeroDosDivision=8;
    int numeroTresDivision=4;
    int numeroCuatroDivision=2;
    
    int DivisionDeNumeros=numeroUnoDivision/numeroDosDivision/numeroTresDivision/numeroCuatroDivision;
    System.out.println("La suma de los numeros es: "+DivisionDeNumeros);
    System.out.println("======>3<======"+"\n");
    
    System.out.println("11.5  Incremento en 1 de la multiplicacion");
    int numeroUnoMultiplicacionIncremento=2;
    int numeroDosMultiplicacionIncremento=4;
    int numeroTresMultiplicacionIncremento=8;
    int numeroCuatroMultiplicacionIncremento=16;
    
    int MultiplicacionDeNumerosIncrementandoUno= ++numeroUnoMultiplicacionIncremento*
                                                 ++numeroDosMultiplicacionIncremento*
                                                 ++numeroTresMultiplicacionIncremento*
                                                 ++numeroCuatroMultiplicacionIncremento;
    
   
    System.out.println("La multiplicacion en incremento es: "+ ++MultiplicacionDeNumerosIncrementandoUno);
    System.out.println("======>3<======"+"\n");
    
    System.out.println("11.6   Decremento en 1 de división");
    int numeroUnoDivisionDecrementando=1000;
    int numeroDosDivisionDecrementando=8;
    int numeroTresDivisionDecrementando=4;
    int numeroCuatroDivisionDecrementando=2;
    
    
    int DivisionDeNumerosDecrementandoUno= --numeroUnoDivisionDecrementando/
                                           --numeroDosDivisionDecrementando/
                                           --numeroTresDivisionDecrementando/
                                           --numeroCuatroDivisionDecrementando;
    System.out.println("La division de los  numeros en decremento es: "+ --DivisionDeNumerosDecrementandoUno);
    System.out.println("======>3<======"+"\n");
         
        System.out.println("----> 12.	Cadenas de Texto <----");
        /*
        Realizar los siguientes ejercicios de cadenas de texto y mostrarlos por consola
         o	Crear una variable con tu nombre en minúscula y mostrarlo en mayúscula
         o	Crear 3 variables con tu nombre completo en mayúscula y mostrarlo en minúscula
         o	Crear una variable con la siguiente frase “Java no es tan complicado” y
                  encontrar la posición de la palabra “no” 
        */
        System.out.println("12.1 Crear una variable con tu nombre en minuscula y mostrarlo en mayuscula");
        
        String variableNombre="beatriz";
        System.out.println("Mi nombre en minusculas beatriz");
        System.out.println("Mi nombre en Mayusculas es: "+variableNombre.toUpperCase());
        System.out.println("======>0<======"+"\n");
        
        System.out.println("12.2 Crear 3 variables con tu nombre completo en mayúscula y mostrarlo en minúscula");
        
        String variablePrimerNombre="BEATRIZ";
        String variableSegundoNombre="LILIANA";
        String variableTresApellidos="HERNANDEZ HERNANDEZ";
        
        System.out.println("Mi nombre en MAYUSCULAS ES BEATRIZ LILIANA HERNANDEZ HERNANDEZ");
        System.out.println("Mi nombre en minusculas  es: "+variablePrimerNombre.toLowerCase()+
                                                          variableSegundoNombre.toLowerCase()+
                                                          variableTresApellidos.toLowerCase());
        System.out.println("======>0<======"+"\n");
        
        System.out.println("12.3 Crear una variable con la siguiente frase Java no es tan complicado y \n" +
"                  encontrar la posicion de la palabra no ");
        
        String variableFrase="Java no es tan complicado";
        
        System.out.println("La posicion de la palabra 'no' es: "+variableFrase.indexOf("n")
                                                                +","+variableFrase.indexOf("o"));
            
        System.out.println("======>0<======"+"\n");
        
   System.out.println("======>3<======"+"\n");
         
        System.out.println("---->13.Concatenación de cadenas de textos <----");
        /*
          -	Crear las variables que consideres correspondientes y muestra el siguiente resultado,
                concatenando las variables “nombre(espacio) apellido(espacio)está(espacio) aprendiendo(espacio)Java”
        */
        String variableNombreN= "nombre";
        String variableApellidoAp="apellido";
        String variableEstaE="esta";
        String variableAprendiendoAp="aprendiendo";
        String variableJavaJ="Java";
        
        String espacio=" ";

        
        System.out.println(variableNombreN.concat(espacio)+variableApellidoAp.concat(espacio)+
                            variableEstaE.concat(espacio)+variableAprendiendoAp.concat(espacio)+
                            variableJavaJ.concat(espacio));
    System.out.println("======>3<======"+"\n");
         
        System.out.println("---->15.Caracteres especiales en Java<----");
        /*
          -	Mostrar por consola los siguientes enunciados
            o	Java es un “Lenguaje de Programación”       
        */
        
        String cadenaComillas="Java es un \" Lenguaje de Programacion\"";
     
     System.out.println(cadenaComillas);            
    System.out.println("======>3<======"+"\n");
         
        System.out.println("---->16.Secuencias extras en Java<----");
        /*
         -	Mostrar los siguientes enunciados por consola
        o	Hoy inicia mi camino 
                En JAVA
        o	Hoy inicia	mi camino en Java

        */
     
       //salto de linea
     
     String cadenaSaltoDeLinea1="Hoy inica mi camino";
     String cadenaSaltoDeLinea2="En JAVA";
     System.out.println(cadenaSaltoDeLinea1+"\n"+cadenaSaltoDeLinea2);
       System.out.println("======><======"+"\n");
       
        //Intruccion de Espacio Tab
     String cadenaSecuenciaTab="Hoy inicia \t mi camino en Java";
     System.out.println(cadenaSecuenciaTab);
        System.out.println("======>3<======"+"\n");
        
         
        System.out.println("---->17. Funciones matemáticas en Java<----");
        /*
          -	Mostrar por consola los siguientes resultados
          o	Hallar el número mayor entre 99 y 200
          o	Hallar el número menor entre 10 y 20
          o	Hallar la raíz cuadra de 25
          o	Hallar el valor absoluto de -6.2
          o	Mostrar un número aleatorio entre 10-50

        */
        
        //Hallar el número mayor entre 99 y 200
        System.out.println("El numero Mayor entre 99 y 200 es...");
        System.out.println(Math.max(99,200));
        
        //Hallar el número menor entre 10 y 20
        System.out.println("El numero Menor entre 10 y 20 es...");
        System.out.println(Math.min(10,20));
        
        //Hallar la raíz cuadra de 25
        System.out.println("La raiz Cuadrada de 25 es...");
        System.out.println(Math.sqrt(25));
        
        //Hallar el valor absoluto de -6.2
        System.out.println("El valor absoluto de -6.2 es...");
        System.out.println(Math.abs(-6.2));
        
        //Mostrar un número aleatorio entre 10-50
        System.out.println("Nunero aleatorio entre 10 - 50 es...");
        int numeroAleatorio=(int)(Math.random()*40+1);
        System.out.println(numeroAleatorio);
    
        System.out.println("======>3<======"+"\n");
         
        System.out.println("---->18.Expresiones Booleanas<----");
        /*
          -	Mostrar el resultado por consola las siguientes expresiones Booleanas de las siguientes operaciones
          o	30 >10
          o	30<10
          o	10=10

        */
        
        int valorBooleanoUno=30;
        int valorBooleanoDos=10;
      
      System.out.println("La Expresion 30 > 10 es verdadera o falsa...");
      System.out.println(valorBooleanoUno>valorBooleanoDos);
      System.out.println("La Expresion 30 < 10 es verdadera o falsa...");
      System.out.println(valorBooleanoUno<valorBooleanoDos);
      System.out.println("La Expresion 10 = 10 es verdadera o falsa...");
      //System.out.println(valorBooleanoUno==valorBooleanoDos);
      System.out.println(valorBooleanoDos==valorBooleanoDos);



       /* 14.	Operaciones entre números y cadenas de texto
	¿Muestran el mismo resultado? ¿Si o no y por qué sucede eso?*/
    
	           int numeroSuma1 = 10;
        	   int numeroSuma2 = 20;
        	   int resultadoSuma = numeroSuma1+ numeroSuma2;  
        	   System.out.println(resultadoSuma);
        
	        String cadenaNumero1 = "10";
        	String cadenaNumero2 = "20";
        	String resultadoSumaCdena = cadenaNumero1+ cadenaNumero2;  
        	System.out.println(resultadoSumaCdena);

               
        
     
    }
}
