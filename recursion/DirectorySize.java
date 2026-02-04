package recursion;

import java.io.File;

public class DirectorySize {

    public static long getSize(File file) {
        long size = 0;
        if(file.isFile()) {
            File[] files = file.listFiles();
            for(int i = 0;files != null &&  i < files.length; i++) {
                size += getSize(files[i]);}
        }else {
            size+= file.length();
        }
        return size;

    }
    public static void main(String[] args) {

        System.out.println(getSize(new File("D:\\علوم الاخرة\\quran")));

    }
}
