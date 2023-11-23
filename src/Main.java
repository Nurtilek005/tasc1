import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите длину ширину высоту параллелепипеда:");
            double length = getInput(scanner);
            double width = getInput(scanner);
            double height = getInput(scanner);

            Parallelepiped parallelepiped = new Parallelepiped(length, width, height);
            System.out.println("Площадь параллелепипеда: " + parallelepiped.calculateArea());
            System.out.println("Объем параллелепипеда: " + parallelepiped.calculateVolume());

            System.out.println("Введите радиус высоту цилиндра :");
            double radius = getInput(scanner);
            height = getInput(scanner);

            Cylinder cylinder = new Cylinder(radius, height);
            System.out.println("Площадь цилиндра: " + cylinder.calculateArea());
            System.out.println("Объем цилиндра: " + cylinder.calculateVolume());

        } catch (InputMismatchException e) {
            FIXME:
            System.out.println("Ошибка ввода. Пожалуйста, введите числовое значение.");

        } catch (IllegalArgumentException e) {
          TODO:
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static double getInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("\u001B[31m"+"Ошибка! Пожалуйста, введите числовое значение."+"\u001B[0m");
                scanner.next();
            }}




        }

    }




