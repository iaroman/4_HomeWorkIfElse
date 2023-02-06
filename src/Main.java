public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1() {
        System.out.println("<<< Задача 1 >>>");
        int age = 14;
        if (age >= 18)
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний  и может немного прибухнуть");
        else
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
    }
    public static void task2() {
        System.out.println("<<< Задача 2 >>>");
        int temperature = 10;
        if (temperature >= 5)
            System.out.println("На улице " + temperature + " градусов. Сегодня тепло, можно идти без шапки");
        else
            System.out.println("На улице " + temperature + " градусов. На улице холодно, нужно надеть шапку");
    }
    public static void task3() {
        System.out.println("<<< Задача 3 >>>");
        int speed = 60;
        if (speed > 60)
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        else
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
    }
    public static void task4() {
        System.out.println("<<< Задача 4 >>>");
        int age = 40;
        if (age > 1) {
            if (age >= 2 && age <= 6)
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
            else if (age >= 7 && age <= 18)
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
            else if (age >= 18 && age <= 24)
                System.out.println("Если возраст человека равен " + age + ", то ему пора в университет.");
            else
                System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        }
        else
            System.out.println("Такому человеку рано куда-либо ходить");
    }
    public static void task5() {
        System.out.println("<<< Задача 5 >>>");
        int age = 20;
        if (age <= 5)
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        else if (age > 5 && age <= 14)
            System.out.println("Если возраст ребенка равен " + age + ", можно кататься на аттракционе в сопровождение взрослого.");
        else
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься один.");
    }
    public static void task6() {
        System.out.println("<<< Задача 6 >>>");
        int seat = 60;
        int stand = 102 - 60;
        int busySeat = 40;
        int busyStand = 42;
        if (busySeat == seat && busyStand == stand)
            System.out.println("Вагон полностью заполнен");
        else if (busySeat == seat)
            System.out.println("В вагоне свободно " + (stand - busyStand) + " стоячих мест");
        else if (busyStand == stand)
            System.out.println("В вагоне свободно " + (seat - busySeat) + " сидячих мест");
        else
            System.out.println("В вагоне свободно " + (stand - busyStand) + " стоячих мест и " + (seat - busySeat) + " сидячих мест");
    }
    public static void task7() {
        System.out.println("<<< Задача 7 >>>");
        int one = 100;
        int two = 120;
        int three = 30;
        if (one > two && one > three)
            System.out.println("Максимальное значение это one - " + one);
        else if (two > one && two > three)
            System.out.println("Максимальное значение это two - " + two);
        else
            System.out.println("Максимальное значение это three - " + three);
    }

}