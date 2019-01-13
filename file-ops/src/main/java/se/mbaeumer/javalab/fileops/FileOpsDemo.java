package se.mbaeumer.javalab.fileops;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileOpsDemo {
    public static void main(String[] args) {
        System.out.println("Demo of file operations in Java");
        FileOpsDemo fileOpsDemo = new FileOpsDemo();
        fileOpsDemo.showFileProperties();
        fileOpsDemo.createFile();
        fileOpsDemo.renameFile();
        fileOpsDemo.deleteFile();
        fileOpsDemo.createDirectory();
        fileOpsDemo.listFiles();
        fileOpsDemo.deleteDirectory();
    }

    public void showFileProperties(){
        File file = new File("src/main/resources/profil.png");
        System.out.println("Absolute path: " + file.getAbsolutePath());
        try {
            System.out.println("Canonical path: " + file.getCanonicalPath());
            System.out.println("Name: " + file.getName());
            System.out.println("Path: " + file.getPath());
            System.out.println("Parent: " + file.getParent());
            System.out.println("toPath: " + file.toPath().toString());
            System.out.println("length: " + file.length());
            System.out.println("lastModified: " + file.lastModified());
            System.out.println("Exists: " + file.exists());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createFile(){
        File file = new File("src/main/resources/profil2.png");
        System.out.println("Does the file exist? " + file.exists());
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file");
        }
        System.out.println("Does the file exist? " + file.exists());
    }

    public void renameFile(){
        File targetFile = new File("src/main/resources/profil3.png");
        File file = new File("src/main/resources/profil2.png");
        file.renameTo(targetFile);
    }

    public void deleteFile(){
        File file = new File("src/main/resources/profil3.png");
        file.delete();
    }

    public void createDirectory(){
        File file = new File("src/main/resources/test-dir");
        file.mkdir();
        System.out.println("created directory");
    }

    public void listFiles(){
        File file = new File("src/main/resources");
        Arrays.asList(file.listFiles()).stream().forEach(f -> System.out.println(f.getAbsolutePath()));
    }

    public void deleteDirectory(){
        File file = new File("src/main/resources/test-dir");
        file.delete();
        System.out.println("deleted directory");
    }
}
