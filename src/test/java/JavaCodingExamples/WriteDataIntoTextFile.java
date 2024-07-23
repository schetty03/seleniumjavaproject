package JavaCodingExamples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("C:\\temp\\Test123.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hi writing data in to test file");
        bw.newLine();
        bw.write("hooray");
        bw.newLine();
        bw.write("Success");
        System.out.println("Finished!!!");
        bw.close();
    }
}
