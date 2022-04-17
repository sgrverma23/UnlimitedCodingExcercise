import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class FilesReaderWriter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        PrintWriter outputStream = null;
        ArrayList<String> rows = new ArrayList<String>();

        try {
            reader  = new BufferedReader(new FileReader("files/initial.txt"));
            outputStream = new PrintWriter(new FileWriter("files/output.txt"));

            String file;
            while ((file = reader .readLine()) != null) {
                rows.add(file);
            }
            Collections.sort(rows);
            String[] strArr= rows.toArray(new String[0]);
            for (String cur : strArr)
                outputStream.println(cur);
        } finally {
            if (reader  != null) {
                if (outputStream != null) {
                    outputStream.close();
                }
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

}