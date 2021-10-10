package Task2;

import java.util.Scanner;

//        Используя IntelliJ IDEA, создайте проект.Требуется:
//        Создайте 2 интерфейса Playable и Recodable. В каждом из интерфейсов создайте по 3 метода void play() /
//        void pause() / void stop() и void record() / void pause() / void stop() соответственно.
//        Создайте производный класс Player от базовых интерфейсов Playable и Recodable.
//        Написать программу, которая выполняет проигрывание и запись.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player player = new Player();
        System.out.println();
        System.out.println("1-Включить музыку  2-Включить запись  3-Пауза  4-Выключить плеер");
        System.out.println("Введите цифру для выплнения действия: ");
        int option = sc.nextInt();
        if (option<1||option>4) {
            System.out.println("Вы ввели неверное число, повторите попытку");
            option = sc.nextInt();
        }
        switch (option) {
            case 1 : {
                player.play();
                break;
            }
            case 2 : {
                player.record();
                break;
            }
            case 3 : {
                player.pause();
                break;
            }
            case 4 : {
                player.stop();
                break;
            }
            default:{
                System.out.println("Вы снова ввели неверное число, перезапустите зпрограмму и повторите попытку");
            }
        }
    }
}
