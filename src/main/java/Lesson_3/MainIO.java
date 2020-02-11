package Lesson_3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class MainIO {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("123");
      //  file.mkdirs();
//        String[] str = file.list(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return name.startsWith("1");
//            }
//        });
//        for (String o: str) {
//            System.out.println(o);
//        }

//        File nf = new File("123/test.txt");
//
//        if (!nf.exists()) {
//            throw new IOException("file not exist!");
//        }
//
//        File nf1 = new File("123/test1.txt");
//
//        nf.renameTo(nf1);
       // nf.createNewFile();


//        long t = System.currentTimeMillis();
//        try(FileInputStream in = new FileInputStream("123/2.txt")) {
//            byte[] arr = new byte[512];
//            int x;
//            while ((x = in.read(arr)) > 0) {
//                System.out.print(new String(arr, 0, x, "UTF-8"));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println();
//        System.out.println(System.currentTimeMillis() - t);
//
//        try(InputStreamReader isr = new InputStreamReader(new FileInputStream("123/2.txt"), "UTF-8")) {
//
//            int x;
//            while ((x = isr.read()) != -1) {
//                System.out.print((char)x);
//            }
//        }

//        BufferedReader br = null;
//        FileReader fr = null;
//
//        fr = new FileReader("123/2.txt");
//        br = new BufferedReader(fr);
//        String currentLine;
//        while ((currentLine = br.readLine()) != null) {
//            System.out.println(currentLine);
//        }
//
//        if (br != null) {
//            br.close();
//        }
//
//        if (fr != null) {
//            fr.close();
//        }

//        PipedInputStream in = null;
//        PipedOutputStream out = null;
//
//        try {
//            in = new PipedInputStream();
//            out = new PipedOutputStream();
//            out.connect(in);
//
//            for (int i = 0; i < 100; i++) {
//                out.write(i);
//            }
//
//            int x;
//            while ((x = in.read()) != -1) {
//                System.out.println(x + " ");
//            }
//            in.close();
//            out.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        ArrayList<InputStream> ali = new ArrayList<>();
//        ali.add(new FileInputStream("123/2.txt"));
//        ali.add(new FileInputStream("123/5.txt"));
//        ali.add(new FileInputStream("123/12.txt"));
//
//        SequenceInputStream in = new SequenceInputStream(Collections.enumeration(ali));
//
//        int x;
//
//        while ((x = in.read()) != -1) {
//            System.out.print((char)x);
//        }
//        in.close();

//        try (RandomAccessFile raf = new RandomAccessFile("123/2.txt", "r")){
//            raf.seek(0);
//            System.out.println((char)raf.read());
//        }

//        Studens s = new Studens(1, "Bob");
//        Book book = new Book("HP");
//        s.setBook(book);
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stud.ser"));
//        oos.writeObject(s);
//        oos.close();
//
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stud.ser"));
        Studens s2 = (Studens)ois.readObject();
        ois.close();
        s2.info();
    }
}
