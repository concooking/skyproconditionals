import java.lang.management.PlatformLoggingMXBean;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Задача 1
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возрваст человека равен " + age + " то возраст совершеннолетия ещё не настал нужно подождать");
        }
        // Задача 2
        int temp = 4;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов можно идти без шапки");
        }
        // Задача 3
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }
        // Задача 4
        int ageMan = 4;
        if (ageMan >= 2 && ageMan <=6) {
            System.out.println("Если возраст человека равен " + ageMan + " то ему нужно ходить в десткий сад");
        }
        if (ageMan >= 7 && ageMan <= 17) {
            System.out.println("Если возраст человека равен " + ageMan + " то ему нужно ходить в школу");
        }
        if (ageMan >= 18 && ageMan <= 24) {
            System.out.println("Если возраст человека равен " + ageMan + " то его место в университете");
        }
        if (ageMan > 24) {
            System.out.println("Если возраст человека равен " + ageMan + " то ему пора на работу");
        }
        // Задача 5
        int ageChildren = 10;
        if (ageChildren < 5) {
            System.out.println("Если возраст ребенка равен " + ageChildren + " то ему нельзя кататься на аттракционе");
        }
        if (ageChildren >= 5 && ageChildren <= 14) {
            System.out.println("Если возраст ребенка равен " + ageChildren + " то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (ageChildren > 14) {
            System.out.println("Если возраст ребенка равен " + ageChildren + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        // Задача 6
        int places = 500;
        if (places <= 120) {
            if (places <= 60) {
                System.out.println("В вагоне есть сидячие места");
            }
            if (places > 60) {
                System.out.println("В вагоне есть стоячие места");
            } else {
                System.out.println("В вагоне мест нет");
            }
            // Задача 7
            int one = 10;
            int two = 500;
            int three = 300;
            if (one > two && one > three) {
                System.out.println("Наибольшее число " + one);
            } else if (two > one && two > three) {
                System.out.println("Наибольшее число " + two);
            } else {
                System.out.println("Наибольшее число " + three);
            }
        }
    }
}