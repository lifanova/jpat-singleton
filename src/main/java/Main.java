import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        logger.log("Запускаем программу");
        System.out.println("Добрый день!Начинаем работу нашей программы");

        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите, пожалуйста, размер списка: ");
        int sizeList = scanner.nextInt();
        System.out.print("Введите, пожалуйста, верхнюю границу для значений: ");
        int maxValue = scanner.nextInt();

        logger.log("Создаем и наполняем список");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < sizeList; i++) {
            list.add(random.nextInt(maxValue));
        }

        logger.log("Выводим список на экран");
        System.out.print("Ваш список: ");
        printList(list);

        logger.log("Просим пользователя ввести верхний порог фильтра");
        System.out.print("Введите, пожалуйста, верхний порог фильтра: ");
        int treshold = scanner.nextInt();

        Filter filter = new Filter(treshold);
        List<Integer> newList = filter.filterOut(list, sizeList);

        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        printList(newList);

        logger.log("Завершаем программу");
        System.out.print("Работа программы завершена, до новых встреч!");
    }

    public static void printList(List<Integer> list) {
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
