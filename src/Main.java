import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println("Task 1 ");

        Scanner version = new Scanner(System.in);
        System.out.println("Введите версию вашей ОС: 1 - Android, 0 - IOS ");
        int clientOS = version.nextInt();

        if(clientOS<3){
            String resultVersion = clientOS==0 ? "Установите версию приложения для iOS по ссылке":"Установите версию приложения для iOS по cсылке";
            System.out.println(resultVersion);
        }else{
            System.out.println("Введите корректное число");
        }

        //task 2
        System.out.println("Task 2 ");
        Scanner osVersion = new Scanner(System.in);
        System.out.println("Введите версию вашей ОС: 1 - Android, 0 - IOS ");
        int clientOSS = osVersion.nextInt();

        Scanner yearVersion = new Scanner(System.in);
        System.out.println("Введите год производства телефона ");
        int clientDeviceYear = yearVersion.nextInt();

        if(clientOSS==0){
            if(clientDeviceYear>=2015){
                System.out.println("Установите версию приложения для iOS по ссылке");
            }else{
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOSS==1){
            if(clientDeviceYear>=2015){
                System.out.println("Установите версию приложения для Android по ссылке");
            }else{
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }else{
            System.out.println("Невозможно определение версии и/или года производства, " +
                    "проверьте введенные данные или обратитесь в службу технической поддержки");
        }

        //task 3
        System.out.println("Task 3 ");

        Scanner innerYear = new Scanner(System.in);
        System.out.println("Введите год");
        int year = innerYear.nextInt();


        if((year%4==0&&year%100!=0)||year%400==0){
            System.out.println("Год является високосным");
        }else{
            System.out.println("Год не является високосным");
        }


        //task 4
        System.out.println("Task 4 ");
        Scanner dis = new Scanner(System.in);
        System.out.println("Введите расстояние");
        int deliveryDistance = dis.nextInt();

        int deliveryDays = 1+(deliveryDistance+20)/40;

        System.out.println("Потребуется дней: " + deliveryDays);



        //task 5
        System.out.println("Task 5 ");
        Scanner month = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int monthNumber = month.nextInt();

        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Ваш месяц - зимний");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ваш месяц - весенний");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Ваш месяц - летний");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Ваш месяц - осенний");
                break;
            default:
                System.out.println("Вы ввели несуществующий месяц");

        }
    }
}


