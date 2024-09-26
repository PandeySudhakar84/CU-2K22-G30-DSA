package Lec49;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Reverse_the_Content_of_File_and_Print_it {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.print("Enter the filename: ");
                String filename = in.next(); // Get the filename from the user
                List<String> lines = new ArrayList<>();
                // Read the file and store lines in a list
                try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        lines.add(line);
                    }
                } catch (IOException e) {
                    System.out.println("Error: " + e.getMessage());
                    return; // Exit if there's an error reading the file
                }
                // Print the lines in reverse order with words reversed
                for (int i = lines.size() - 1; i >= 0; i--) {
                    String reversedLine = reverseWords(lines.get(i));
                    System.out.println(reversedLine);
                }
            }
            public static String reverseWords(String line) {
                String[] words = line.split("\\s+");
                StringBuilder reversed = new StringBuilder();
                for (int i = words.length - 1; i >= 0; i--) {
                    reversed.append(words[i]).append(" ");
                }
                return reversed.toString().trim(); // Remove trailing space
            }
        }
