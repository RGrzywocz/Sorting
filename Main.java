package sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public class Main {
    public static void sortWord(String inputFileName, String outputFileName) {

        List<String> words = new ArrayList<>();
        if (inputFileName.equals("")) {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                words.add(scanner.next());
            }
            scanner.close();
        } else {
            File file = new File(inputFileName);
            try (Scanner fileScanner = new Scanner(file)) {
                while (fileScanner.hasNext()) {
                    words.add(fileScanner.next());
                }
                fileScanner.close();
            } catch (FileNotFoundException e) {
                //   outputMsg("not found");
                return;
            }
        }
        Collections.sort(words);
        if (outputFileName.equals("")) {
            System.out.println("Total words: " + words.size());
            System.out.print("Sorted data: ");
            for (String word : words) {
                System.out.print(word + " ");
            }
        } else {
            File outputFile = new File(outputFileName);
            try (PrintWriter writer = new PrintWriter(outputFileName)) {

                writer.println("Total words: " + words.size());
                writer.print("Sorted data: ");
                for (String word : words) {
                    writer.print(word + " ");
                }
            } catch (IOException e) {
                return;
            }
        }

    }

    public static void sortLines(String inputFileName, String outputFileName) {
        List<String> words = new ArrayList<>();
        if (inputFileName.equals("")) {
            Scanner scanner = new Scanner(System.in);

            while (scanner.hasNext()) {
                words.add(scanner.nextLine());
            }
            scanner.close();
        } else {
            File file = new File(inputFileName);
            try (Scanner fileScanner = new Scanner(file)) {
                while (fileScanner.hasNext()) {
                    words.add(fileScanner.next());
                }
                fileScanner.close();
            } catch (FileNotFoundException e) {
                //   outputMsg("not found");
                return;
            }
        }
        Collections.sort(words);
        if (outputFileName.equals("")) {
            System.out.println("Total lines: " + words.size());
            System.out.print("Sorted data: ");
            for (String word : words) {
                System.out.print(word + " ");
            }
        } else {
            File outputFile = new File(outputFileName);
            try (PrintWriter writer = new PrintWriter(outputFileName)) {

                writer.println("Total lines: " + words.size());
                writer.print("Sorted data: ");
                for (String word : words) {
                    writer.print(word + " ");
                }
            } catch (IOException e) {
                return;
            }
        }

    }

    public static void sortNumbers(String inputFileName, String outputFileName) {
        List<Integer> words = new ArrayList<>();
        if (inputFileName.equals("")) {
            Scanner scanner = new Scanner(System.in);

            while (scanner.hasNext()) {
                words.add(Integer.parseInt(scanner.next()));
            }
            scanner.close();
        } else {
            File file = new File(inputFileName);
            try (Scanner fileScanner = new Scanner(file)) {
                while (fileScanner.hasNext()) {
                    words.add(Integer.parseInt(fileScanner.next()));
                }
                fileScanner.close();
            } catch (FileNotFoundException e) {
                //   outputMsg("not found");
                return;
            }
        }
        Collections.sort(words);
        if (outputFileName.equals("")) {
            System.out.println("Total numbers: " + words.size());
            System.out.print("Sorted data: ");
            for (Integer word : words) {
                System.out.print(word + " ");
            }
        } else {
            File outputFile = new File(outputFileName);
            try (PrintWriter writer = new PrintWriter(outputFileName)) {

                writer.println("Total numbers: " + words.size());
                writer.print("Sorted data: ");
                for (Integer word : words) {
                    writer.print(word + " ");
                }
            } catch (IOException e) {
                return;
            }
        }

    }

    public static void sortWordbyCount(String inputFileName, String outputFileName) {
        List<String> words = new ArrayList<>();
        if (inputFileName.equals("")) {
            Scanner scanner = new Scanner(System.in);

            while (scanner.hasNext()) {
                words.add(scanner.next());
            }
            scanner.close();
        } else {
            File file = new File(inputFileName);
            try (Scanner fileScanner = new Scanner(file)) {
                while (fileScanner.hasNext()) {
                    words.add(fileScanner.next());
                }
                fileScanner.close();
            } catch (FileNotFoundException e) {
                //   outputMsg("not found");
                return;
            }
        }
        Collections.sort(words);
        Map<String, Integer> wordsWithCount = new TreeMap<>();
        for (String word : words) {
            if (wordsWithCount.get(word) == null) wordsWithCount.put(word, 1);
            else {
                wordsWithCount.replace(word, wordsWithCount.get(word) + 1);
            }
        }
        Set<Integer> counts = new LinkedHashSet<>();
        for (Integer countx : wordsWithCount.values()) {
            counts.add(countx);
        }
        List<Integer> countsAfter = new LinkedList<Integer>();
        for (Integer ints : counts) {
            countsAfter.add(ints);
        }
        Collections.sort(countsAfter);
        if (outputFileName.equals("")) {
            System.out.println("Total words: " + words.size() + ".");
            for (Integer count : countsAfter) {
                for (String value : wordsWithCount.keySet()) {
                    if (count == wordsWithCount.get(value)) {
                        System.out.println(value + ": " + count + " time(s), " + count * 100 / words.size() + "%");
                    }
                }
            }
        } else {
            try (PrintWriter writer = new PrintWriter(outputFileName)) {
                writer.println("Total words: " + words.size() + ".");
                for (Integer count : countsAfter) {
                    for (String value : wordsWithCount.keySet()) {
                        if (count == wordsWithCount.get(value)) {
                            writer.println(value + ": " + count + " time(s), " + count * 100 / words.size() + "%");
                        }
                    }
                }
            } catch (IOException e) {
                return;
            }
        }
    }


    public static void sortLinesbyCount(String inputFileName, String outputFileName) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            words.add(scanner.nextLine());
        }
        Collections.sort(words);
        Map<String, Integer> wordsWithCount = new TreeMap<>();
        for (String word : words) {
            if (wordsWithCount.get(word) == null) wordsWithCount.put(word, 1);
            else {
                wordsWithCount.replace(word, wordsWithCount.get(word) + 1);
            }
        }
        Set<Integer> counts = new LinkedHashSet<>();
        for (Integer countx : wordsWithCount.values()) {
            counts.add(countx);
        }
        List<Integer> countsAfter = new LinkedList<Integer>();
        for (Integer ints : counts) {
            countsAfter.add(ints);
        }
        Collections.sort(countsAfter);
        // Collections.reverse(countsAfter);
        System.out.println("Total lines: " + words.size() + ".");
        for (Integer count : countsAfter) {
            for (String value : wordsWithCount.keySet()) {
                if (count == wordsWithCount.get(value)) {
                    System.out.println(value + ": " + count + " time(s), " + count * 100 / words.size() + "%");
                }
            }
        }
        scanner.close();
    }

    public static void sortNumbersbyCount(String inputFileName, String outputFileName) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> words = new ArrayList<>();
        while (scanner.hasNext()) {
            words.add(Integer.parseInt(scanner.next()));
        }
        Collections.sort(words);
        Map<Integer, Integer> wordsWithCount = new TreeMap<>();
        for (Integer word : words) {
            if (wordsWithCount.get(word) == null) wordsWithCount.put(word, 1);
            else {
                wordsWithCount.replace(word, wordsWithCount.get(word) + 1);
            }
        }
        Set<Integer> counts = new LinkedHashSet<>();
        for (Integer countx : wordsWithCount.values()) {
            counts.add(countx);
        }
        List<Integer> countsAfter = new LinkedList<Integer>();
        for (Integer ints : counts) {
            countsAfter.add(ints);
        }
        Collections.sort(countsAfter);
        //Collections.reverse(countsAfter);
        System.out.println("Total numbers: " + words.size() + ".");
        for (Integer count : countsAfter) {
            for (Integer value : wordsWithCount.keySet()) {
                if (count == wordsWithCount.get(value)) {
                    System.out.println(value + ": " + count + " time(s), " + count * 100 / words.size() + "%");
                }
            }
        }
        scanner.close();
    }

    public static void main(final String[] args) {
        boolean natural = true;
        boolean byCount = false;
        boolean words = true;
        boolean lines = false;
        boolean numbers = false;
        String inputFile = "";
        String outputFile = "";
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-dataType")) {
                words = lines = numbers = false;
                try {
                    if (args[i + 1].equals("word")) words = true;
                    if (args[i + 1].equals("line")) lines = true;
                    if (args[i + 1].equals("long")) numbers = true;
                } catch (Exception e) {
                    System.out.println("No data type defined!");
                }
            }
            if (args[i].equals("-sortingType")) {
                natural = byCount = false;
                try {
                    if (args[i + 1].equals("natural")) natural = true;
                    if (args[i + 1].equals("byCount")) byCount = true;
                } catch (Exception e) {
                    System.out.println("No sorting type defined!");
                }
            }
            if (args[i].equals("-inputFile")) {
                inputFile = args[i + 1];
            }
            if (args[i].equals("-outputFile")) {
                outputFile = args[i + 1];
            }
        }

        if (natural) {
            if (words) {
                sortWord(inputFile, outputFile);
            } else if (lines) {
                sortLines(inputFile, outputFile);
            } else if (numbers) {
                sortNumbers(inputFile, outputFile);
            }
        } else if (byCount) {
            if (words) {
                sortWordbyCount(inputFile, outputFile);
            } else if (lines) {
                sortLinesbyCount(inputFile, outputFile);
            } else if (numbers) {
                sortNumbersbyCount(inputFile, outputFile);
            }
        }
    }
}
