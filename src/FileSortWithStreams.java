import java.io.IOException;
import java.nio.file.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class FileSortWithStreams {

    public static void main(String[] args) throws IOException {
        Path initialFile = Paths.get("files/initial.txt");
        Path sortedFile = Paths.get("files/initial.txt");

        Stream<CharSequence> sortedLines = Files.lines(initialFile).sorted().map(Function.identity());
        Files.write(initialFile, sortedLines::iterator, StandardOpenOption.CREATE);
    }
}