package Lesson_3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class MainIO {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1
        byte[] arr = new byte[100];
        try(FileInputStream in = new FileInputStream("123/50.txt")) {

            int x;
            in.read(arr);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (byte b:arr) {
            System.out.print(b);
        }

        //2
        ArrayList<InputStream> ali = new ArrayList<>();
        ali.add(new FileInputStream("123/1.txt"));
        ali.add(new FileInputStream("123/2.txt"));
        ali.add(new FileInputStream("123/3.txt"));
        ali.add(new FileInputStream("123/4.txt"));
        ali.add(new FileInputStream("123/5.txt"));

        SequenceInputStream in = new SequenceInputStream(Collections.enumeration(ali));
        byte[] arr1 = new byte[100];

        FileOutputStream out =new FileOutputStream("123/all.txt");//) {
        while(in.read(arr1)>0) {
            out.write(arr1);
        }  // файл получилcя но что-то с переводом картеки непонятно

        //3
        System.out.println();
        readBook(2);

    }
    public static void readBook(int page) throws FileNotFoundException {
        int N = 1800;
        int pos = (page-1 )*N;
        try (RandomAccessFile raf = new RandomAccessFile("123/book.txt", "r")){
            byte[] data = new byte[N];
            raf.seek(pos);
            raf.read(data, 0, N );
            String text = new String(data, "windows-1251");
            System.out.print(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
