import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;

        do{
            System.out.println("¡Bienvenido querido usuario! \n" +
                    "Selecciona una opción: \n");
            System.out.println("1. Calcular Circulo");
            System.out.println("2. Calcular Cuadrado");
            System.out.println("3. Calcular Triangulo");
            System.out.println("0. Salir \n");
            try {
                System.out.println("Escribe una de las opciones");
                int opcion = sn.nextInt();
                // Con lo que dijite el usuario se aplicara el caso con Switch
                switch (opcion) {
                    case 0:
                        salir = true;
                        break;
                    case 1:
                        System.out.println("Ingresa el valor del radio: ");
                        double radio = sn.nextInt();

                        System.out.println("\n¿Qué deseas calcular? \n" +
                                "Selecciona una opción: \n");
                        System.out.println("1. Calcular Area");
                        System.out.println("2. Calcular Perimetro");

                        Circle circle = new Circle(radio);
                        int submenu = sn.nextInt();

                        switch (submenu){
                            case 1:
                                System.out.println("\nEl area es un total de: " + circle.getArea() + "\n");
                                break;
                            case 2:
                                System.out.println("\nEl perimetro es un total de: " + circle.getPerimetro() + "\n");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Ingresa el valor del lado: ");
                        double lado = sn.nextInt();

                        System.out.println("\n¿Qué deseas calcular? \n" +
                                "Selecciona una opción: \n");
                        System.out.println("1. Calcular Area");
                        System.out.println("2. Calcular Perimetro");

                        Square square = new Square(lado);
                        submenu = sn.nextInt();
                        switch (submenu){
                            case 1:
                                System.out.println("\nEl area es un total de: " + square.getArea() + "\n");
                                break;
                            case 2:
                                System.out.println("\nEl perimetro es un total de: " + square.getPerimetro() + "\n");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Ingresa el valor de la base: ");
                        double base = sn.nextInt();
                        System.out.println("Ingresa el valot de la altura: ");
                        double altura = sn.nextInt();

                        System.out.println("\n¿Qué deseas calcular? \n" +
                                "Selecciona una opción: \n");
                        System.out.println("1. Calcular Area");
                        System.out.println("2. Calcular Perimetro");

                        Triangle triangle = new Triangle(altura, base);
                        submenu = sn.nextInt();
                        switch (submenu){
                            case 1:
                                System.out.println("\nEl area es un total de: " + triangle.getArea() + "\n");
                                break;
                            case 2:
                                System.out.println("\nEl perimetro es un total de: " + triangle.getPerimetro() + "\n");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3 \n");
                }
            } catch (InputMismatchException e) { //Este es el tipo de error que puede salir
                System.out.println("Opción no valida, debes insertar un número \n");
                sn.next();
            }
        }
        while (!salir);
    }
}
