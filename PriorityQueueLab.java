import java.util.Queue;
import java.util.PriorityQueue;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PriorityQueueLab {
    public static void main(String[] args) {
        Queue<Integer> integers = new PriorityQueue<>();
        String fileName = "RandIntegers.txt";

        try {
            File file = new File(fileName);
            Scanner scan = new Scanner(file);

            while (scan.hasNextInt()) {
                integers.add(scan.nextInt());
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }

        for (int integer : integers) {
            System.out.println(integer);
        }
    }
}