package vn.edu.iuh.fit;

import jdepend.xmlui.JDepend;

import java.io.File;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        File directory = new File("reports");
        if (!directory.exists()) {
            boolean created = directory.mkdirs();
            if (!created) {
                throw new Exception("Failed to create directory: reports");
            }
        }

        JDepend jDepend = new JDepend(new PrintWriter("reports/report.xml"));
        jDepend.addDirectory("/Volumes/SSD_1TB/Hoc_Ki2_Nam4/1_SortwareArchitecture/TH_Week5_ThayHai_3-3/Library-Assistant");
        jDepend.analyze();
        System.out.println("DONE");
    }
}