import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class FindConsistingWords {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String WORDLIST = "/usr/share/dict/words";

        // getting all words from dictionary file and storing into list
        List<String> words = readInWordList(WORDLIST);
        List<String> consistingWords;
        String input = "";

        while (!input.equals("-1")) {
            System.out.print("\n[+] Enter a substring: ");
            input = kb.nextLine();

            if (input.equals("-1")) {
                break;
            }

            // getting all consisting words
            consistingWords = fetchConsistingWords(input, words);

            // printing out all consisting words
            for (String word: consistingWords) {
                System.out.println("\t[-] " + word);
            }
        }
    }

    public static List<String> fetchConsistingWords(String input, List<String> words) {
        List<String> consistingWords = new ArrayList<String>();

        // ... implement logic ... //
                // i will use hashset to store all words//
        return consistingWords;
    }

    public static List<String> readInWordList(String filename) {
        List<String> words = new ArrayList<String>();

        System.out.println("\n[*] Reading in wordlist");
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            for (String line; (line = br.readLine()) != null; ) {
                if (line.length() > 2) {
                    words.add(line);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }

        System.out.println("[*] Finished reading in wordlist\n");
        return words;
    }
}