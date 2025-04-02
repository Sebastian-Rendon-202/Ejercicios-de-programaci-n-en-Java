import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nEjercicios de programación en lenguaje Java Elige una Opcion:");
            System.out.println("\n1.Ejercicio Variables");
            System.out.println("2.Ejercicio Variables (Conversor de Moneda)");
            System.out.println("3.Ejercicio Variables (Factura con IVA)");
            System.out.println("4.Ejercicio Condicionales (Día de la Semana)");
            System.out.println("5.Ejercicio Condicionales (Ordenamiento de Números)");
            System.out.println("6.Ejercicio Condicionales (Primera Cifra de un Número)");
            System.out.println("7.Ejercicio Ciclos (Múltiplos de 8)");
            System.out.println("8.Ejercicio Ciclos (Promedio de Números Positivos)");
            System.out.println("9.Ejercicio Ciclos (Conteo de Positivos y Negativos)");
            System.out.println("10.Ejercicio Ciclos (Pirámide Numérica)");
            System.out.println("11.Ejercicio Arreglos (Arreglo de Caracteres)");
            System.out.println("12.Ejercicio Arreglos (Orden Inverso)");
            System.out.println("13.Ejercicio Arreglos (Par o Impar)");
            System.out.println("14.Salir");
            System.out.println("\nSelecciona la opcion que desees: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    operacionesmatematicas();
                    break;
                case 2:
                    conversordeMoneda();
                    break;
                case 3:
                    facturaconIVA();
                    break;
                case 4:
                    condicionalesDíadelaSemana();
                    break;
                case 5:
                    ordenamientodeNúmeros();
                    break;
                case 6:
                    primeraCifradeunNúmero();
                    break;
                case 7:
                    multiplosde8();
                    break;
                case 8:
                    promediodeNúmerosPositivos();
                    break;
                case 9:
                    conteodePositivosyNegativos();
                    break;
                case 10:
                    pirámideNumérica();
                    break;
                case 11:
                    arreglodeCaracteres();
                    break;
                case 12:
                    ordenInverso();
                    break;
                case 13:
                    paroImpar();
                    break;
                case 14:
                    System.out.println("\nSaliendo del programa");
                    break;
                default:
                    System.out.println("\nOpcion no valida, Intenta de nuevo");
            }
        } while (opcion != 14);
        scanner.close();
    }

    public static void operacionesmatematicas() {
        int numeroA = 89;
        int numeroB = 363;
        int suma = numeroA + numeroB;
        int resta = numeroA - numeroB;
        int multiplicacion = numeroA * numeroB;
        double division = (double) numeroA / numeroB;

        System.out.println("Variable A: " + numeroA);
        System.out.println("Variable B: " + numeroB);
        System.out.println("Resultado Suma: " + suma);
        System.out.println("Resultado Resta: " + resta);
        System.out.println("Resultado Multiplicacion: " + multiplicacion);
        System.out.println("Resultado Division: " + division);

    }

    public static void conversordeMoneda() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa el valor en pesos colombianos");
        int peso = scanner.nextInt();
        double tasadecambio = 3895.0;
        double valorendolares = peso / tasadecambio;
        System.out.println("cantidad en pesos colombianos: $" + peso);
        System.out.println("Conversion en Dolares: $" + String.format("%.2f", valorendolares));

    }

    public static void facturaconIVA() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio sin iva del articulo: ");
        int preciosiniva = scanner.nextInt();
        double iva = 0.19;
        double totalconiva = preciosiniva * iva;
        double valorapagar = preciosiniva + totalconiva;
        System.out.println("Base sin iva del producto: $" + preciosiniva);
        System.out.println("iva del 19%: $" + String.format("%.2f", totalconiva));
        System.out.println("valor a pagar del producto: $" + valorapagar);

    }

    public static void condicionalesDíadelaSemana() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero del 1 al 7 para saber el dia de la semana: ");
        int numero = scanner.nextInt();
        String dia;
        switch (numero) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Numero no valido, solo puede ser del 1 al 7 ";
        }
        System.out.println(dia);

    }

    public static void ordenamientodeNúmeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int numero2 = scanner.nextInt();
        System.out.println("Ingrese el tercer numero:");
        int numero3 = scanner.nextInt();
        System.out.println("Los numeros ingresados son: " + numero1 + ", " + numero2 + ", " + numero3);
        int menor;
        int medio;
        int mayor;
        if (numero1 <= numero2 && numero1 <= numero3) {
            menor = numero1;
            if (numero2 <= numero3) {
                medio = numero2;
                mayor = numero3;
            } else {
                medio = numero3;
                mayor = numero2;
            }
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            menor = numero2;
            if (numero1 <= numero3) {
                medio = numero1;
                mayor = numero3;
            } else {
                medio = numero3;
                mayor = numero1;
            }
        } else {
            menor = numero3;
            if (numero1 <= numero2) {
                medio = numero1;
                mayor = numero2;
            } else {
                medio = numero2;
                mayor = numero1;
            }
        }
        System.out.println("Números ordenados: " + menor + ", " + medio + ", " + mayor);

    }

    public static void primeraCifradeunNúmero() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero de 5 digitos: ");
        int numero = scanner.nextInt();

        String cadena = Integer.toString(Math.abs(numero));
        char primeracifra = cadena.charAt(0);
        System.out.println("La primera cifra del numero ingresado es: " + primeracifra);

    }

    public static void multiplosde8() {
        System.out.println("Los Multiplos De 8: ");
        int numero = 0;
        while (numero <= 100) {
            if (numero % 8 == 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }

    public static void promediodeNúmerosPositivos() {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int contador = 0;

        System.out.println("Ingresa numeros positivos para calcular su promedio");
        System.out.println("Si deseas finalizar el programa, ingresa un número negativo.");

        while (true) {
            System.out.print("Ingresa un número: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            suma += numero;
            contador++;
        }


        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("El promedio de los números ingresados es: " + String.format("%.2f", promedio));
        } else {
            System.out.println("No se ingreso ningun numero positivo");
        }


    }

    public static void conteodePositivosyNegativos() {
        Scanner scanner = new Scanner(System.in);
        int contadorpositivo = 0;
        int contadornegativo = 0;
        System.out.println("Ingresa 10 numeros ya sean positivos o negativos");
        for (int i = 0; i < 10; i++) {
            System.out.println("Numero ingresado:");
            int numero = scanner.nextInt();
            if (numero > 0) {
                contadorpositivo++;
            } else if (numero < 0) {
                contadornegativo++;
            }
        }
        System.out.println("Total de numeros Positivos: " + contadorpositivo);
        System.out.println("Total de numeros Negativos: " + contadornegativo);

    }

    public static void pirámideNumérica() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero para la altura de su piramide: ");
        int numero = scanner.nextInt();
        for (int i = 1; i <= numero; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void arreglodeCaracteres() {
        char[] caracteres = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        System.out.println("Contenido del arreglo");
        for (int i = 0; i < caracteres.length; i++) {
            System.out.println("Posicion " + i + ": " + caracteres[i]);
        }
    }

    public static void ordenInverso() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("ingresa 10 numeros: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Numeros en orden inverso: ");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

    }

    public static void paroImpar() {
        Scanner scanner = new Scanner(System.in);
        int[] numero = new int[8];
        System.out.println("Ingrese 8 numeros: ");
        for (int i = 0; i < 8; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numero[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.println("Tipo de numero:");
        for (int i = 0; i < 8; i++) {
            if (numero[i] % 2 == 0) {
                System.out.println(numero[i] + " Es un numero Par");
            } else {
                System.out.println(numero[i] + " Es un numero Impar");
            }
        }

    }
}