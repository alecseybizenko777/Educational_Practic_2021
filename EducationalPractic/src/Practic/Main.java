package Practic;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Bytsenko Aleksey Vladimirovich
 */
public class Main {

    public static void main (String[] args) {

        ArrayList<Client> clientsList = new ArrayList<>();

        Client Client1 = new Client("Фёдоров", "Денис", "Степанович", "Белгород", "Преображенская", 64, "89519877890", 4);
        Client Client2 = new Client("Сидоров", "Иван", "Александрович", "Москва", "Волхонка", 45, "89204537621", 1);
        Client Client3 = new Client("Петров", "Данил", "Алексеевич", "Москва", "Моховая", 36, "89192799127", 2);
        Client Client4 = new Client("Иванов", "Роман", "Антонович", "Белгород", "Проспект Богдана Хмельницкого", 27, "89207465152", 8);
        Client Client5 = new Client("Городов", "Сергей", "Игоревич", "Белгород", "Проспект Славы", 85, "89511372233", 12);

        clientsList.add(Client1);
        clientsList.add(Client2);
        clientsList.add(Client3);
        clientsList.add(Client4);
        clientsList.add(Client5);

        System.out.println("\nСписок клиентов:");

        for (int i = 0; i < clientsList.size(); i++)
        {
            System.out.println(clientsList.get(i));
        }

        ArrayList<Car> carList = new ArrayList<>();

        Car Subaru = new Car("Subaru", 28845, "Subaru BRZ", 250, 500);
        Car Audi = new Car("Audi", 118406, "Audi e-tron GT", 700, 1400);
        Car Kia = new Car("KIA", 35026, "KIA Stinger", 500, 1000);
        Car BMW = new Car("BMW", 94780, "BMW M4", 800, 1600);
        Car Jaguar = new Car("Jaguar", 82349, "Jaguar F-Type", 1000, 2000);

        System.out.println("\nСписок автомобилей:");

        for (int i = 0; i < carList.size(); i++)
        {
            System.out.println(carList.get(i));
        }

        //Графический интерфейс [Start
        {
            try {
                UIManager.LookAndFeelInfo[] installedLookAndFeels=UIManager.getInstalledLookAndFeels();
                for (int idx=0; idx<installedLookAndFeels.length; idx++)
                    if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                        UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                        break;
                    }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ContactEditor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(ContactEditor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ContactEditor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(ContactEditor.class.getName()).log(Level.SEVERE, null, ex);
            }

            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new ContactEditor().setVisible(true);
                }
            });
        }
        //Графический интерфейс End]

        int userChoice;

        Scanner choice = new Scanner(System.in);

        do {

            System.out.println("Выберите действие:");
            System.out.println("1. Добавить пользователей;");
            System.out.println("2. Добавить автомобиль.");
            System.out.println("Для выхода из программы закройте окно графического интерфейса.");
            System.out.print("\nВведите цифру: ");

            userChoice = choice.nextInt();

            if (userChoice == 1)
            {
                Scanner inputText = new Scanner(System.in);
                Scanner inputNumber = new Scanner(System.in);

                String surname, name, patronymic;
                String city, street;
                int houseNumber;
                String numberTelephone;
                int numberOfHits;

                do {
                    System.out.print("\nВведите - Фамилию: ");
                    surname = inputText.next();

                    System.out.print("\nВведите - Имя: ");
                    name = inputText.next();

                    System.out.print("\nВведите - Отчество: ");
                    patronymic = inputText.next();

                    System.out.print("\nВведите - Город: ");
                    city = inputText.next();

                    System.out.print("\nВведите - Улицу: ");
                    street = inputText.next();

                    System.out.print("\nВведите - Номер дома: ");
                    houseNumber = inputNumber.nextInt();

                    System.out.print("\nВведите - Номер телефона: ");
                    numberTelephone = inputText.next();

                    System.out.print("\nВведите - Введите количество обращений: ");
                    numberOfHits = inputNumber.nextInt();

                    try(FileWriter writer = new FileWriter("ClientList.txt", true))
                    {
                        writer.write( "Фамилия: " + surname + ";\nИмя: " + name + ";\nОтчество: " + patronymic +
                                ";\nГород: " + city + ";\nУлица: " + street + ";\nНомер дома: " + houseNumber +
                                ";\nНомер телефона: " + numberTelephone + ";\nКоличество обращений: " + numberOfHits + ".\n\n");
                        //writer.close();
                        writer.flush();
                    }
                    catch(IOException ex){
                        System.out.println(ex.getMessage());
                    }

                    System.out.print("\nКлиент был добавлен!\nЕсли желаете продолжить добавление новых клиентов, "
                            + "введите любое число, кроме \"0\",\nиначе введите \"0\".\nДействие №");

                    userChoice = choice.nextInt();

                } while(userChoice != 0);
            }
            else if (userChoice == 2)
            {
                Scanner inputText = new Scanner(System.in);
                Scanner inputNumber = new Scanner(System.in);

                String brand, name;
                int cost, rentalCost, pledgeAmount;

                do {
                    System.out.print("\nВведите - Название брэнда: ");
                    brand = inputText.next();

                    System.out.print("\nВведите - Стоимость авто: ");
                    cost = inputNumber.nextInt();

                    System.out.print("\nВведите - Полное название авто: ");
                    name = inputText.next();

                    System.out.print("\nВведите - Стоимость аренды: ");
                    rentalCost = inputNumber.nextInt();

                    System.out.print("\nВведите - Залог для его аренды: ");
                    pledgeAmount = inputNumber.nextInt();


                    try(FileWriter writer = new FileWriter("CarList.txt", true))
                    {
                        writer.write("Автомобиль:\nБрэнд - " + brand + ";\nСтоимость = "
                                + cost + "$;\nНазвание: " + name
                                + ";\nСтоимость аренды = " + rentalCost + "$."
                                + ". Залог для его аренды составляет " + pledgeAmount + "\n\n");
                        //writer.close();
                        writer.flush();
                    }
                    catch(IOException ex){
                        System.out.println(ex.getMessage());
                    }

                    System.out.print("\nАвтомобиль был добавлен!\nЕсли желаете продолжить добавление новых автомобилей, "
                            + "введите любое число, кроме \"0\",\nиначе введите \"0\".\nДействие №");

                    userChoice = choice.nextInt();

                } while(userChoice != 0);
            }
            else
            {
                System.err.println("\nОшибка! Введено некорректное значение!\n");
            }

            userChoice = 1;
        } while (userChoice != 0);
    }
}