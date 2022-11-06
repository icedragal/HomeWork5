public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        char clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Ошибка определения ОС");
        }

        //Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if ( clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        else {
            System.out.println("Ошибка определения ОС");
        }

        //Задание 3
        System.out.println("Задание 3");
        int year = 2400;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }

        //Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            int deliveryPeriod = 1;
            System.out.println("Потребуется дней: " + deliveryPeriod);
        } else if (deliveryDistance >=20 && deliveryDistance < 60) {
            int deliveryPeriod = 2;
            System.out.println("Потребуется дней: " + deliveryPeriod);
        } else if (deliveryDistance >= 60 && deliveryDistance <100) {
            int deliveryPeriod = 3;
            System.out.println("Потребуется дней: " + deliveryPeriod);
        }
        else {
            System.out.println("Error");
        }
    }
}