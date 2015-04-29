package prjava01.mateo15;

import java.awt.Desktop;
import java.io.*;

public class Prjava01Mateo15 {

public static void main(String[] args) throws IOException {
        File f = new File("prj01-Mateo15.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("<html>");bw.newLine();
            bw.write("  <head>");bw.newLine();
            bw.write("    <title>");bw.newLine();
            bw.write("      Nova p&agrave;gina  web");bw.newLine();
            bw.write("    </title>");bw.newLine();
            bw.write("  </head>");bw.newLine();
            bw.write("  <body>");bw.newLine();
            bw.write("    Nova p&agrave;gina web Jordi Mateo Daw2 UF4 Pr&agrave;ctica 2");bw.newLine();
            bw.write("  </body>");bw.newLine();
            bw.write("</html>");bw.newLine();
            bw.close();
        }
    }
    
}
