package propra;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Print g = null;
        if (args.length != 1) {
            g = Print.create(null);
        }
        else {
            g = Print.create(args[0]);
        }
        g.print();
    }

}
