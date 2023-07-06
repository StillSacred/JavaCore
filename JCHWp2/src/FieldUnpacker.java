import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FieldUnpacker {
    public int[] unpackField() {
        int[] result = new int[9];
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("output.txt"))) {
            int packedField = Integer.parseInt(bufferedReader.readLine());
            for (int i = 0; i < result.length; i++) {
                result[i] = packedField >> i * 2 & 3;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}