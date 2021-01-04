import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WordFrequency {

    public static List<String> readFileContent(String fileName) {
        List<String> fileContent = new ArrayList<>();
        try {
            fileContent = Files.readAllLines(Paths.get("src/" + fileName));
            return fileContent;
        } catch (IOException e) {
            System.out.println("File does not exist!");
            System.exit(2);
        }
        return null;
    }

    public static List<String> splitFileContent(List<String> fileContent) {
        List<String> splittedFileContent = new ArrayList<>();
        for (String line : fileContent
        ) {
            String[] splittedLine = line.split(" ");
            for (String word : splittedLine
            ) {
                splittedFileContent.add(word);
            }
        }
    return splittedFileContent;
    }

    public static void findWordsWithFrequency (int frequency) {
        List<String> wordList =  splitFileContent(readFileContent("input.txt"));
        List<String> wordsWithFrequency = new ArrayList<>();

        for (int i = 0; i < wordList.size(); i++) {
            int counter = 0;
            for (int j = 0; j < wordList.size(); j++) {
                if (wordList.get(i).equals(wordList.get(j))) {
                    counter++;
                }
            }
            if (counter == frequency && !wordsWithFrequency.contains(wordList.get(i))) {
                wordsWithFrequency.add(wordList.get(i));
            }
        }
        if (wordsWithFrequency.size() ==0) {
            return;
        }
        try {
            Files.write(Paths.get("src/output.txt"),wordsWithFrequency);
        } catch (IOException e) {
            System.out.println("Cannot write to file!");
            System.exit(1);
        }
    }


    public static void main(String[] args) {
        //System.out.println(readFileContent("input.txt").toString());
        //System.out.println(splitFileContent(readFileContent("input.txt")).toString());
        findWordsWithFrequency(2);
    }
}
