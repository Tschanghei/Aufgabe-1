package propra;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;

public class Gratulation {

    private String name;

    private Gratulation(String name) {
        this.name = name;
    }

    public static Gratulation create(String name) {
        if (name == null || name.isBlank()) {
            return new Gratulation("Unbekannter Nummer 1");
        }
        return new Gratulation(name);
    }

    String getAnrede() {
        return "Hallo " + name +",";
    }

    String[] getText() {
        return new String[] {
                "schön, dass Sie es geschafft haben das Gradle File zu reparieren.",
                "Wir hoffen, Sie schaffen auch den Rest der Aufgabe."
        };
    }

}
