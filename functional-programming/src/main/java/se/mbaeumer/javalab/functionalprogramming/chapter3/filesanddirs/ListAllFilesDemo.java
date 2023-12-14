package se.mbaeumer.javalab.functionalprogramming.chapter3.filesanddirs;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ListAllFilesDemo {
    public void listAllFilesNonFunctional() throws IOException {
        Files.list(Paths.get("/Users/martinbaumer/Documents/gitrepo/java-lab"))
                .forEach(System.out::println);
    }

    public void listSubDirectories() throws IOException {
        Files.list(Paths.get("/Users/martinbaumer/Documents/gitrepo/java-lab"))
                .filter(Files::isDirectory)
                .forEach(System.out::println);

    }

    public void listAllJavaFiles(){
        String[] javaFiles = new File("/Users/martinbaumer/Documents/gitrepo/java-lab")
                .list(new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {
                        return name.endsWith(".java");
                    }
                });
        Arrays.asList(javaFiles)
                .stream()
                .forEach(System.out::println);
    }

    public void listAllJavaFilesWithDirectoryStream() throws IOException {
        Files
                .newDirectoryStream(Paths.get("/Users/martinbaumer/Documents/gitrepo/java-lab"),
                        path -> path.toString().endsWith(".java"))
                .forEach(System.out::println);
    }
}
