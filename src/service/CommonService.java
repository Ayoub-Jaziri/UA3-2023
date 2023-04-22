package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonService {
    /**
     *
     * @return String
     * @throws IOException  IOException
     */
    static String readInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
        return reader.readLine();
    }



    /**
     * check if object already exist
     * @param fileName fileName
     * @return boolean
     * @throws IOException IOException
     * @throws ClassNotFoundException ClassNotFoundException
     */
    public boolean checkDuplicate(String fileName) throws IOException, ClassNotFoundException {

        File f = new File(fileName + ".txt");
        return f.exists();
    }
}
