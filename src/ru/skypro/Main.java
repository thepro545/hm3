package ru.skypro;

public class Main {

    public static void main(String[] args) {

// Task 1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
// Task 2
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear < 2015) {
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
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            days = 1;
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = 2;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
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
        int age = 19;
        int salary = 90_000;
        int multi = 1;
        float limit = 1f;

        if (age >= 23) {
            multi *= 3;
        } else if (age < 23) {
            multi *= 2;
        }
        if (salary >= 80_000) {
            limit *= 1.5f;
        } else if (salary >= 50_000) {
            limit *= 1.2f;
        }
        float credit = salary * multi * limit;
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + credit + "рублей");
// Task 7
        int age1 = 25;
        int salary1 = 60_000;
        int wantedSum = 330_000;
        int timeMax = 12;
        float betPercent = 10f;
        float paymentPercent = 50f;
        float maxPayment = salary1 * (paymentPercent / 100);
        float payment;
        String result;

        if (age1 < 23) {
            betPercent += 1f;
        }
        if (age1 < 30 && age1 >= 23) {
            betPercent += 0.5f;
        }
        if (salary1 > 80_000) {
            betPercent -= 0.7f;
        }
        payment = wantedSum * (1 + betPercent / 100) / timeMax;
        if (payment <= maxPayment) {
            result = "Одобрено";
        } else {
            result = "Отказано";
        }
        System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPayment + "рублей. Платеж по кредиту " + payment + " рублей. " + result);


    }
}
