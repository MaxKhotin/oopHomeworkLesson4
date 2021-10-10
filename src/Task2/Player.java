package Task2;

public class Player implements Playable, Recordable{
    @Override
    public void play(){
        System.out.println("Музыка играет");
    }
    @Override
    public void pause(){
        System.out.println("Музыка/запись приостановлена");
    }
    @Override
    public void stop() {
        System.out.println("Плеер выключен");
    }
    @Override
    public void record(){
        System.out.println("Запись включена");
    }
}
