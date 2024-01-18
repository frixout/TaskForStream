import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Arrays.spliterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = asList(1, 3, 6, 8, 10, 18, 36);
        //посчитать среднее
        System.out.println(nums.stream()
                .mapToDouble(x -> x)
                .average()
        );

        List<String> colors = asList("RED", "grEEn", "white", "Orange", "pink");
        //перевести все в верхний и нижний регистр
        colors.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println)
        ;
        colors.stream()
                .map(String::toLowerCase)
                .forEach(System.out::println)
        ;

        nums = asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //посчитать сумму четных и нечетных элементов
        System.out.println(nums.stream()
                .filter(x -> x%2==0)
                .reduce(Integer::sum)
        );
        System.out.println(nums.stream()
                .filter(x -> x%2!=0)
                .reduce(Integer::sum)
        );

        nums = asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
        //удалить дубликаты
        nums.stream()
                .distinct()
                .forEach(System.out::println);
        ;

        colors = asList("Red", "Green", "Blue", "Pink", "Brown");
        //получить количество элементов начинающихся с определенной буквы
        System.out.println(colors.stream()
                .filter(x -> x.startsWith("R"))
                .count()
        );
        //отсортировать в порядке возрастания и убывания

        nums = asList(1, 17, 54, 14, 14, 33, 45, -11);
        //найти наибольший и наименьший элемент
        System.out.println(nums.stream()
                .max(Comparator.comparing(x -> x))
        );
        System.out.println(nums.stream()
                .min(Comparator.comparing(x -> x))
        );
        //найти второй наибольший и второй наименьший элемент
        List<Integer> finalNums = nums;
        System.out.println(nums.stream()
        );

        Country france = new Country("France", 65_235_184L);
        Country canada = new Country("Canada", 37_653_095L);
        Country uk = new Country("United Kingdom", 67_791_734L);

        var people = new ArrayList<>(Arrays.asList(
                Arrays.asList(
                        new Person("John", 50, Gender.MALE, canada),
                        new Person("May", 12, Gender.FEMALE, france),
                        new Person("Tiff", 23, Gender.MALE, uk)
                ),
                Arrays.asList(
                        new Person("Azul", 15, Gender.FEMALE, france),
                        new Person("Samantha", 67, Gender.FEMALE, canada),
                        new Person("John", 50, Gender.MALE, canada)
                )
        )
        );

        /*
        Объединить коллекцию people в единую коллекцию
        Вывести имена людей с длиной менее 4
        Вывести возраст самого старого человека
        Вывести сумму всех возрастов
        Вывести информацию о людях (средний возраст, минимальный возраст, максимальный возраст, количество людей)
        Сгруппировать и вывести людей по возрасту (взрослые отдельно, дети отдельно)
        Сгруппировать людей по национальности
        Объединить и вывести имена людей через подчеркивание
        Получить и вывести канадских мужчин
         */

    }
}