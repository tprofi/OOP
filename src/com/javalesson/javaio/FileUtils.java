package com.javalesson.javaio;

import java.io.File;

public class FileUtils {


    /**
     * This method print to standard output a file properties
     *
     * @param path - is absolute file path
     */
    void printIOFileDetails(String path) {
        File file = new File(path);
    }
}
