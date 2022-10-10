// Prepared by Harshit Ajakiya 21ce001
// WAP to show how to create a file with different mode and methods of File class to find
// path, directory etc.
import java.io.*;

public class Practical1 {
    public static void main(String[] args) {

        String path = "";
        boolean bool = false;
        try {
            // createing new files
            File file = new File("testFile1.txt");
            file.createNewFile();
            System.out.println(file);
            // createing new canonical from file object
            File file2 = file.getCanonicalFile();
            // returns true if the file exists
            System.out.println(file2);
            bool = file2.exists();
            // returns absolute pathname
            path = file2.getAbsolutePath();
            System.out.println(bool);
            // if file exists
            if (bool) {
                // prints
                System.out.print(path + " Exists? " + bool);
            }
        } catch (Exception e) {
            // if any error occurs
            e.printStackTrace();
        }
    }
}