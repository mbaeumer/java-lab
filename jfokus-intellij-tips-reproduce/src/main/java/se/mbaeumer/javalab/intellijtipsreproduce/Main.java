package se.mbaeumer.javalab.intellijtipsreproduce;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        //region init
        BufferedReader reader = new BufferedReader(new FileReader(new File("test.txt")));
        //endregion

        final ArrayList<String> strings = new ArrayList<>();
        String line;
        while((line = reader.readLine()) != null){
            if (!line.isBlank()) {
                strings.add(line);
            }
        }

        reader.close();

        String s;
        s = null;
    }
}
