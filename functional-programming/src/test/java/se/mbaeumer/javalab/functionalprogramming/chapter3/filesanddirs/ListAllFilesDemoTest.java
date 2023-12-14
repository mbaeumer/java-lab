package se.mbaeumer.javalab.functionalprogramming.chapter3.filesanddirs;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ListAllFilesDemoTest {

    @Test
    void listAllFilesNonFunctional() throws IOException {
        ListAllFilesDemo listAllFilesDemo = new ListAllFilesDemo();
        listAllFilesDemo.listAllFilesNonFunctional();
    }

    @Test
    void listSubDirectories() throws IOException {
        ListAllFilesDemo listAllFilesDemo = new ListAllFilesDemo();
        listAllFilesDemo.listSubDirectories();
    }


    @Test
    void listAllJavaFiles() throws IOException {
        ListAllFilesDemo listAllFilesDemo = new ListAllFilesDemo();
        listAllFilesDemo.listAllJavaFiles();
    }

    @Test
    void listAllJavaFilesWithDirectoryStream() throws IOException {
        ListAllFilesDemo listAllFilesDemo = new ListAllFilesDemo();
        listAllFilesDemo.listAllJavaFilesWithDirectoryStream();
    }
}