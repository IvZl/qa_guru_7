import org.junit.jupiter.api.Test;

import java.util.zip.ZipFile;

public class ZipFilesTest {

    @Test
    void zipFileTest() throws Exception {
        ZipFile zipFile = new ZipFile("src\\test\\resources\\zipfile.zip");
    }
}
