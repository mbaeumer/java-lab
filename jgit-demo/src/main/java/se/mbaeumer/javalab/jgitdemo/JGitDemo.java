package se.mbaeumer.javalab.jgitdemo;

import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.JGitInternalException;

import java.io.IOException;

public class JGitDemo {

    public static void main(String[] args){

        GitService gitService = new GitService();
        try {
            gitService.cloneRepository();
            System.out.println("Successfully cloned repository");
        } catch (GitAPIException | JGitInternalException e) {
            System.out.println(e.getMessage());
        }

        try {
            gitService.pull();
            System.out.println("Successfully pulled repository");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (GitAPIException e) {
            System.out.println(e.getMessage());
        }

    }
}
