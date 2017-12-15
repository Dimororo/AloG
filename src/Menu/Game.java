package Menu;

public class Game {

    private boolean first_run = false;
    public boolean get_run(){
        return first_run;
    }

    public void first_start(){
        first_run = true;
        System.out.println("Вы начали игру.");
        System.out.println("Добро пожаловать в Норилимбримбриум.");

    }

    public void start(){
        System.out.println("Добро пожаловать снова :)");
    }

    public void instruction(){
        System.out.println("Для взаимодействия с игрой выбирайте цифры для ответа.");
        System.out.println("Больше от вас ничего не потребуется.");
        System.out.println("Наслаждайтесь :)");
    }


}
