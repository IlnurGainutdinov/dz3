import java.util.ArrayList;
import java.util.Scanner;

public class Main {
/*
3) Разработка игры “быки - коровы” (игрок против компьютера)
a)Интерфейс взаимодействий Game (должны быть описаны сигнатуры
методов start, inputValue,getGameStatus)
b)Абстрактный класс AbstractGame (который предзаполняет слово
компьютера - generateWord(), на основе generateCharList() - который
является абстрактным методом)
c)Статусная модель с помощью перечислений(GameStatus)
d)Класс ответа Answer
e)Классы реализующие AbstractGame(предполагается игра на числах,англ
буквах, русских буквах)
f)* реализовать restart().*/

    public static void main(String[] args) {
        Game game = new NumberGame();
        game.start(5,5);
        ArrayList<String> log = new ArrayList<>();
        while (game.getGameStatus() != GameStatus.WIN && game.getGameStatus() != GameStatus.LOSE){
            Scanner scanner = new Scanner(System.in);

            log.add(scanner.nextLine());

            Answer answer = game.inputValue(log.get(log.size()-1).toUpperCase());
            System.out.println(answer);
            System.out.println("Статус игры: " + game.getGameStatus().getRuValue());


        }
        System.out.println("Хотите посмотреть историю ввода вариантов?: Yes/No");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextLine().toUpperCase().contains("YES")) {
            System.out.println("История ввода по порядку " + log);
        }
        else {
            System.out.println("Всего доброго! До свидания!");
        }



    }
}