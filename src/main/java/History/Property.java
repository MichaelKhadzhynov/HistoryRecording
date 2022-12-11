package History;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property {


    protected static String FILE_PATH;
    protected static Integer APPEND_TEXT;
    protected static Boolean APPEND;


    public Property() throws IOException {

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/resources/historyFile.properties"));
        FILE_PATH = properties.getProperty("FILE_PATH");
        APPEND_TEXT = Integer.valueOf(properties.getProperty("APPEND_TEXT"));

        if (APPEND_TEXT == 1) {
            APPEND = true;
        } else if (APPEND_TEXT == 0) {
            APPEND = false;
        } else {
            APPEND = false;
        }
    }

}
