package pl.javastart.task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoordinateSystem coordinateSystem = new CoordinateSystem();
        Scanner scanner = new Scanner(System.in);
        coordinateSystem.run(scanner);

        System.out.println("Podaj współrzędną x: ");
        int x = scanner.nextInt();
        System.out.println("Podaj współrzędną y");
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Punkt znajduje się w I ćwiartce.");
        } else if (x < 0 && y > 0) {
            System.out.println("Punkt znajduje się w II ćwiartce.");
        } else if (x < 0 && y < 0) {
            System.out.println("Punkt znajduje sie w III ćwiartce. ");
        } else if (x > 0 && y < 0) {
            System.out.println("Punlt znajduje sie w IV ćwiartce. ");
        } else if (x == 0 && y < 0) {
            System.out.println("Punkt leży na osi Y. ");
        } else if (x == 0 && y > 0) {
            System.out.println("Punkt leży na osi Y");
        } else if (x > 0 && y == 0) {
            System.out.println("Punkt leży na osi X");
        } else if (x < 0 && y == 0) {
            System.out.println("Punkt leży na osi X");
        } else if (x == 0 && y == 0) {
            System.out.println("Punkt znajduje się na środku osi.");
        }
        System.out.println("Koniec programu!");
        scanner.close();
    }
}
