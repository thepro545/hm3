package ru.skypro;

public class Main {

    public static void main(String[] args) {

// Task 1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0)
        {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
// Task 2
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear >=2015 ) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } if (clientOS == 1 && clientDeviceYear <2015 ) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear >=2015 ) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } if (clientOS == 0 && clientDeviceYear <2015 ) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
// Task 3
        int Year = 2021;
        if (Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0) {
            System.out.println(Year + " год является високосным");
        } else
            System.out.println(Year + " год не является високосным");
// Task 4
        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance >0 && deliveryDistance<= 20){
            days = 1;
        } if (deliveryDistance >20 && deliveryDistance<= 60) {
            days = 2;
        } if (deliveryDistance >60 && deliveryDistance <= 100) {
            days = 3;
        }
        System.out.println("Потребуется дней: " + days);
// Task 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + " месяц принадлежит к сезону: зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц принадлежит к сезону: весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц принадлежит к сезону: лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц принадлежит к сезону: осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
// Task 6

// Task 7

// Task 8


    }
}
