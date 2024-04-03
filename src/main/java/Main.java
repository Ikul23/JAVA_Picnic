import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Указание абсолютного пути к файлу input.txt
        String filePath = "C:\\Users\\ikul2\\IdeaProjects\\KuleshovI\\Picnic\\src\\main\\java\\input.txt";

        try {
            // Чтение файла
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            // Задание 1: Подсчет слов
            int wordCount = 0;
            while (scanner.hasNext()) {
                scanner.next();
                wordCount++;
            }
            System.out.println("Количество слов в файле: " + wordCount);

            // Перенос курсора в начало файла
            scanner = new Scanner(file);

            // Задание 2: Поиск самого длинного слова
            String longestWord = "";
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            System.out.println("Самое длинное слово: " + longestWord);

            // Перенос курсора в начало файла
            scanner = new Scanner(file);

            // Задание 3: Вычисление частоты слов
            Map<String, Integer> wordFrequency = new HashMap<>();
            while (scanner.hasNext()) {
                String word = scanner.next();
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
            System.out.println("Частота слов:");
            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

              scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}
