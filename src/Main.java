public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }else
                System.out.println("Ничего не установить");
        }

        System.out.println("Задача 2");

        int clientDeviceYear = 2016;
        int clientOS1 = 1;
        if (clientDeviceYear < 2015 && clientOS1 == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else
            if (clientDeviceYear < 2015 && clientOS1 == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else
                if (clientDeviceYear >= 2015 && clientOS1 == 1) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else if (clientDeviceYear >= 2015 && clientOS1 == 0) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }


        System.out.println("Задача 3");
        int year = 2024;
        if(year%400==0){
            System.out.println(year + " год високосный");
        }else if (year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
        System.out.println("Задача 4");
        int delDist = 96;
        int day = 1;
        if (delDist <=20){
            System.out.println("Потребуется дней: " + day);
        }else  if (delDist<=60){
            System.out.println("Потребуется дней: " + (day + 1));
        } else if (delDist>=60 && delDist<=100){
            System.out.println("Потребуется дней: " + (day + 2));
        }else if (delDist>100){
            System.out.println("Доставки нет");
        }
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber ){
            case 12:
            case 1:
            case 2:
                System.out.println("Принадлежит сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Принадлежит сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Принадлежит сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Принадлежит сезону осень");
                break;
            default:
                System.out.println();
        }

    }
}