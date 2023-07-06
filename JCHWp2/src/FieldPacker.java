import java.io.FileWriter;
import java.io.IOException;

public class FieldPacker {
    public void packFieldToInt(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i] << i * 2;
        }
        writeToFile(result);
    }

    private void writeToFile(int number) {
        try (FileWriter fileWriter = new FileWriter("output.txt")) {
            fileWriter.write(String.valueOf(number));
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}