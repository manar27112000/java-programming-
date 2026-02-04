package recursion;

import java.io.File;

public class DiskUsage {

    public static long diskUsage(File root) {
        long total = root.length();  // حجم الملف أو المجلد نفسه

        // لو المجلد يحتوي ملفات أو مجلدات فرعية
        if (root.isDirectory()) {
            for (String childname : root.list()) {
                File child = new File(root, childname);
                total += diskUsage(child);  // الاستدعاء الذاتي لحساب حجم كل عنصر
            }
        }

        System.out.println(total + "\t" + root);  // طباعة الحجم والمسار
        return total;  // إرجاع الحجم الكلي
    }

    public static void main(String[] args) {
        File root = new File("C:/Users"); // غيّر المسار حسب جهازك
        diskUsage(root);
    }
}
