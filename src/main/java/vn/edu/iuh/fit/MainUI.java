package vn.edu.iuh.fit;

import jdepend.swingui.JDepend;

public class MainUI {
    public static void main(String[] args) throws Exception {

        JDepend jDepend = new JDepend();
        jDepend.addDirectory("/Volumes/SSD_1TB/Hoc_Ki2_Nam4/1_SortwareArchitecture/TH_Week5_ThayHai_3-3/Library-Assistant");
        jDepend.analyze();
        System.out.println("DONE");
    }
}