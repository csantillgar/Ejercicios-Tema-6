package Ejercicio12;

import java.io.File;
import java.util.*;

public class FileIndexer {
    private Map<String, String> fileIndex;

    public FileIndexer() {
        fileIndex = new HashMap<>();
    }

    public void indexFiles(String directoryPath) {
        indexFilesRecursive(new File(directoryPath));
    }

    private void indexFilesRecursive(File directory) {
        if (!directory.isDirectory()) {
            return;
        }

        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    // Solo indexa archivos en el directorio, no en subdirectorios
                    continue;
                } else {
                    fileIndex.put(file.getName(), file.getAbsolutePath());
                }
            }
        }
    }

    public String getFilePath(String fileName) {
        return fileIndex.get(fileName);
    }

    public List<String> getAllFilesSorted() {
        List<String> sortedFiles = new ArrayList<>(fileIndex.keySet());
        Collections.sort(sortedFiles);
        return sortedFiles;
    }

    public void printAllFilesWithPaths() {
        for (Map.Entry<String, String> entry : fileIndex.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
