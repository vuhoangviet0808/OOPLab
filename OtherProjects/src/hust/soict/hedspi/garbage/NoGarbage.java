package hust.soict.hedspi.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        String filename = "answers.txt"; // Replace with the path to a very large file
        byte[] inputBytes = {0};
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        startTime = System.currentTimeMillis();
        StringBuffer outputStringBuffer = new StringBuffer();
        for (byte b : inputBytes) {
            outputStringBuffer.append((char) b); // Efficient concatenation
        }
        String outputString = outputStringBuffer.toString();
        endTime = System.currentTimeMillis();

        System.out.println("Time taken with StringBuffer: " + (endTime - startTime) + " ms");
    }
}

