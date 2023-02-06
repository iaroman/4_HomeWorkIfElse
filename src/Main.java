public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
    }
    public static void task1() {
        int age = 14;
        if (age >= 18)
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний  и может немного прибухнуть");
        else
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
    }
    public static void task2() {
        int temperature = 10;
        if (temperature >= 5)
            System.out.println("На улице " + temperature + " градусов. Сегодня тепло, можно идти без шапки");
        else
            System.out.println("На улице " + temperature + " градусов. На улице холодно, нужно надеть шапку");
    }
}