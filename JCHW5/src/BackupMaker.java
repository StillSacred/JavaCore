import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class BackupMaker {
    public void makeBackup(String source) throws IOException {
        Path sourcePath = Paths.get(source);
        if (!Files.exists(sourcePath)) {
            throw new IOException("Directory " + source + " not found");
        }
        if (Files.isRegularFile(sourcePath)) {
            Files.createDirectory(Paths.get(sourcePath.getParent() + "/backup"));
            Files.copy(sourcePath, Paths.get(sourcePath.getParent() + "/backup/" + sourcePath.getFileName()), REPLACE_EXISTING);
        }
        File[] filesList = new File(source).listFiles();
        if (filesList == null) {
            return;
        }
        if (!Files.exists(Paths.get(source + "/backup"))) {
            Files.createDirectory(Paths.get(source + "/backup"));
        }
        for (File file : filesList) {
            if (!file.isDirectory()) {
                String fileName = file.getName();
                Files.copy(Paths.get(source + "/" + fileName), Paths.get(source + "/backup/" + fileName), REPLACE_EXISTING);
                System.out.println("File " + fileName + " was copied");
            }
        }
    }
}