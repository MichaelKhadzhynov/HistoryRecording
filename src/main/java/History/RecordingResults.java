package History;

import java.io.FileWriter;
import java.io.IOException;

public class RecordingResults {

    public static <T> void recording(T result) throws IOException {

        String text = String.valueOf(result);

        new Property();
        String s = Property.FILE_PATH;
        boolean b = Property.APPEND;
        try (FileWriter writer = new FileWriter(s, b)) {
            writer.append("\n" + ' ' + '\n' + "LAST ORDER: " + '\n');
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

