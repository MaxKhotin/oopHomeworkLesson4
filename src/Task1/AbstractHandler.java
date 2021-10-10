package Task1;

public abstract class AbstractHandler {
    void open(){
        System.out.println("Документ открыт");
    }
    void create(){
        System.out.println("Документ создан");
    }
    void edit(){
        System.out.println("Документ отредактирован");
    }
    void save(){
        System.out.println("Документ сохранён");
    }
}
