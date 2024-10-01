package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        int dividend = 73, divisor = 0;
        try {
            int result = dividend / divisor;
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        } finally {
            System.out.println("Fin del programa");
        }
    }
}
