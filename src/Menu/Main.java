package Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите вариант");
        System.out.println("1.Начать игру.");
        System.out.println("2.Инструкция.");
        System.out.println("3.Продолжить");
        System.out.println("4.Разработчик");
        System.out.println("5.Выйти");

        byte user_input = scanner.nextByte();

        Game Game = new Game();

        switch (user_input){
            case 1:
                if (Game.get_run()==true){
                    Game.first_start();
                }
                else{
                    Game.start();
                }
                break;
            case 2:
                Game.instruction();
                break;
            case 3:
                break;
            case 4:
                System.out.println("Silauras");
                break;
            case 5:
                break;
        }
    }
}
