package com.mycompany.operadoresenjava;

public class OperadoresEnJava {

    public static void main(String[] args) {
        
        System.out.println("OPERADORES BASICOS");
        int $a = 6, $b = 5;
        var $resultado = $a + $b;
        System.out.println("resultado a+b = " + $resultado);
        $resultado = $a - $b;
        System.out.println("resultado a-b = " + $resultado);
        $resultado = $a * $b;
        System.out.println("resultado a*b = " + $resultado);
        var $Division = 3D / $b;
        System.out.println("division = " + $Division);
        $resultado = $a % $b;
        System.out.println("resultado a%b= " + $resultado);
        
        
        System.out.println("\nSABER SI UN NUMERO ES PAR O IMPAR:");
        if ($b % 2 == 0) {
            System.out.println("Es un numero par");
        } else {
            System.out.println("Es un numero impar");
        }
        
        
        System.out.println("INCREMENTOS DE LAS VARIABLES CON SINTAXIS MAS CORTA:");
        System.out.println("Preincremento: primeto incrementa la variable y luego usa el valor");
        var e = 3;
        var f = ++e;
        System.out.println("El valor de e es: " + e);
        System.out.println("El valor incrementado de F es: " + f);
        System.out.println("Postincremento: se aumenta despues, primero se utiliza la varialbe y luego se incrementa");
        var g = 5;
        var h = g++;
        System.out.println("El valor de g es: " + g);
        System.out.println("El valor incrementado de h es:" + h);
        
        
        System.out.println("OPERADORES CONDICIONALES");
        var DiaDescanso = true;
        var Vacaciones = false;
        if (Vacaciones || DiaDescanso) {
            System.out.println("El padre puede asistir al juego de su hijo");
        } else {
            System.out.println("El padre no puede asistir al juego de su hijo");
        }
        
        
        System.out.println("OPERADOR TERNARIO: SIMPLIFICA LA SINTAXIS DEL IF-ELSE");
        var ternario = (3 > 2) ? "El numero es mayor" : "El numero es menor";
        System.out.println("La condicional en ternario es: " + ternario);
    }
}
