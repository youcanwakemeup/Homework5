public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        byte clientOS = 0;
        short clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        short year = 2022;
        if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        }
        else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        short deliveryDistance = 95;
        byte deliveryDate = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
        else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryDate += 2;
            System.out.println("Потребуется дней: " + deliveryDate);
        }
        else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            deliveryDate += 1;
            System.out.println("Потребуется дней: " + deliveryDate);
        }
        else {
            System.out.println("Потребуется дней: " + deliveryDate);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte monthNumber = 5;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Это зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}