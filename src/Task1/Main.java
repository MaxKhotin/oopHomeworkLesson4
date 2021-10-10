package Task1;
//        Создайте класс AbstractHandler.
//        В теле класса создать методы void open(), void create(), void change(), void save().
//        Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler.
//        Написать программу, которая будет выполнять определение документа и для каждого формата должны
//        быть методы открытия, создания, редактирования, сохранения определенного формата документа

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите формат документа:");
        String docType = sc.next();
        switch (docType) {
            case "XML" : {
                System.out.println("Формат файла определён как XML");
                XMLHandler program = new XMLHandler();
                program.open();
                break;
            }
            case "TXT" : {
                System.out.println("Формат файла определён как TXT");
                TXTHandler program = new TXTHandler();
                program.open();
                break;
            }
            case "DOC" : {
                System.out.println("Формат файла определён как DOC");
                DOCHandler program = new DOCHandler();
                program.open();
                break;
            }
            default: {
                System.out.println("Вы ввели неверный формат");
            }
        }


    }
}