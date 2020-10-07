package se.mbaeumer.javalab.jgitdemo;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;

import java.io.File;
import java.io.IOException;

public class GitService {

    private static final String LOCAL_PATH = "/Users/martinbaumer/proj/gitrepo/test-dir";

    public void cloneRepository() throws GitAPIException {
        Git git = Git.cloneRepository()
                .setURI("https://github.com/mbaeumer/chess-challenges.git")
                .setDirectory(new File(LOCAL_PATH))
                .call();

    }

    public void pull() throws IOException, GitAPIException {
        Git git = Git.open(new File(LOCAL_PATH));
        git.pull().call();
    }
}
