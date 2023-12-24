package se.mbaeumer.javalab.functionalprogramming.chapter3.filewatcher;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

public class FileWatcherDemo {
    public void watchFileChange() throws IOException, InterruptedException {
        final Path path = Paths.get("/Users/martinbaumer/Documents/gitrepo/java-lab");
        final WatchService watchService = path.getFileSystem().newWatchService();

        final WatchKey watchKey = watchService.poll(1, TimeUnit.MINUTES);

        if (watchKey != null){
            watchKey.pollEvents()
                    .stream()
                    .forEach(watchEvent -> System.out.println(watchEvent.context()));
        }
    }
}
