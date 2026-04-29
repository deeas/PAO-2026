package ro.unibuc.pao.lab9.buffered_streams;

import java.io.*;

public class Main {
    public static void readUsingBufferedInputStream() {
        try (BufferedInputStream bufferedInputStream = new
                BufferedInputStream(
                new FileInputStream("lab9_dir_test/input.txt"))) {
            while (bufferedInputStream.available() > 0) {
                int read = bufferedInputStream.read();
                System.out.print((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeUsingBufferedOutputStream(String text) {
        try (BufferedOutputStream output = new BufferedOutputStream(
                new FileOutputStream("./lab9_dir_test/output2.txt"))) {
            output.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readUsingBufferedWriter() {
        try (BufferedReader buffer = new BufferedReader(new
                FileReader("./lab9_dir_test/input.txt"))) {
            String line = buffer.readLine();
            while (line != null) {
                System.out.println(line);
                line = buffer.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeUsingBufferedWriter(String text) {
        try (BufferedWriter buffer = new BufferedWriter(new
                FileWriter("./lab9_dir_test/output1.txt"))) {
            buffer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        writeUsingBufferedWriter("Written using buffered writer");
        readUsingBufferedWriter();
        writeUsingBufferedOutputStream("Written using buffered output stream");
        readUsingBufferedInputStream();
    }
}
