package ro.unibuc.pao.lab9.files;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File directory = createDirectory("lab9_dir_test");
        createFile(directory, "file1.txt");
        createFile(directory, "file2.txt");
        listFiles(directory);
    }

    public static File createDirectory(String directoryName) {
        File dir = new File(directoryName);
        boolean mkdir = dir.mkdir();

        if (mkdir) {
            System.out.println("Directory : " + directoryName + " created");
        } else {
            throw new RuntimeException("Cannot create directory " + directoryName);
        }

        return dir;
    }

    public static void createFile(File dir, String fileName) {
        String path = dir.getPath() + File.separator + fileName;

        File file = new File(path);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void listFiles(File dir) {
        File[] files = dir.listFiles();

        for (File file : files) {
            System.out.println(file.getName());
        }
    }

}
