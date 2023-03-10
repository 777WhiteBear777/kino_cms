package lab.space.kino_cms.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Slf4j
public class FileUtil {
    private final static Path DIRECTORY = Paths.get("files/");

    public static boolean saveFile(String filename, MultipartFile multipartFile) {
        if (multipartFile != null
                && multipartFile.getOriginalFilename() != null
                && !multipartFile.getOriginalFilename().equals("")) {
            if (!Files.exists(DIRECTORY)) {
                try {
                    Files.createDirectory(DIRECTORY);
                } catch (IOException e) {
                    log.error("Could not create directory");
                    return false;
                }
            }
            try (InputStream inputStream = multipartFile.getInputStream()) {
                Path filePath = DIRECTORY.resolve(filename);
                Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                log.error("Could not save file");
                return false;
            }
            return true;

        }
        return false;
    }

    public static void deleteFile(String filename) {
        File file = new File("files\\" + filename);
        if (file.exists()) {
            file.delete();
        } else {
            log.error("File not deleted");
        }
    }
}