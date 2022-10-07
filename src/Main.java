import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число от 1 до 5: \n" +
                "1. Сложение \n" +
                "2. Умножение\n" +
                "3. Деление \n" +
                "4. Вычитание \n" +
                "5. Вычисление Квадратного уравнения. ");
        int number = in.nextInt();

        if (number == 1) {
            System.out.print("Введите 2 числа a и b");
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.printf("a + b =  %d ", a + b); // %d обозначают спецификатор, вместо которого подставляет один из аргументов
        } else if (number == 2) {
            System.out.print("Введите 2 числа a и b");
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.printf("a * b =  %d ", a * b);

        } else if (number == 3) {
            System.out.print("Введите 2 числа a и b");
            double a = in.nextDouble();
            double b = in.nextDouble();
            System.out.printf("a / b =  %f ", a / b); // %f: вывод чисел с плавающей точкой

        } else if (number == 4) {
            System.out.print("Введите 2 числа a и b");
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.printf("a - b =  %d ", a - b);
        } else if (number == 5) {
            System.out.print("Введите 3 числа a и b и c");
            /* ax^2+bx+c
            d = b^2-4ac
            d > 0 - est' korni ( x1 = (-b-sqrt(D))/2*a ; x2 = (-b+sqrt(D))/2*a
            d < 0 - korney net
            d = 0 - x1= -b/2*a
             */

            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            double D = Math.pow(b, 2)-(4*a*c);
            if (D>0) {
                double x1 = (-b-Math.sqrt(D))/(2*a);
                double x2 = (-b+Math.sqrt(D))/(2*a);
                System.out.printf("x1 = %f \n" +
                        "x2 = %f \n  " , x1, x2);
            } else if (D<0) {
                System.out.print("Корней нет");

            } else {
                double x1= -b/(2*a);
                System.out.printf("x1 = %f" , x1); }

        } else {
            System.out.print("Вы ввели некорректное число");
        }
        }
    }

