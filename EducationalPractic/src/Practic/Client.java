package Practic;

import java.io.FileWriter;
import java.io.IOException;

public class Client {

    final private String surname, name, patronymic;
    final private String city, street;
    final private int houseNumber;
    final private String numberTelephone;
    final private int numberOfHits;


    Client(String surname, String name, String patronymic, String city, String street, int houseNumber, String numberTelephone, int numberOfHits) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.numberTelephone = numberTelephone;
        this.numberOfHits = numberOfHits;

        //System.out.println("\nКлиент:\nФамилия: " + surname + "\nИмя: " + name + "\nОтчество: " + patronymic
        //    + "\nГород: " + city + "\nУлица: " + street + "\nНомер дома: " + houseNumber
        //    + "\nНомер телефона: " + numberTelephone + "\nКоличество обращений = " + numberOfHits);

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
    }

    @Override
    public String toString() {
        return "Клиент: " + surname + " " + name + " " + patronymic + ", из города \"" + city + "\", проживает на улице \"" + street + "\", в доме №"
                + houseNumber + ".\nКоличество его обращений в пункт проката = " + numberOfHits + "\n";
    }

}