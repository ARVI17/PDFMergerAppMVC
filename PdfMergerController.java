import com.itextpdf.kernel.pdf.PdfReader;
import java.io.File;
import java.util.List;
import model.PdfMergerModel;
import view.PdfMergerView;

public class PdfMergerController {
    private final PdfMergerView view = null;
    private final PdfMergerModel model = null;

    public PdfMergerController() {
        this.view = view;
        this.model = model;
    }

    PdfMergerController(PdfMergerView view, PdfMergerModel model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        this.model = null;
    }

    public void mergePDFs(List<File> pdfFiles, String outputFilePath) {
        List<PdfReader> pdfReaders = PdfUtilities.createPdfReaders(pdfFiles);
        if (pdfReaders != null) {
            boolean success = model.mergePDFs(pdfReaders, outputFilePath);
            if (success) {
                view.showMessage("Archivos PDF unidos con éxito en: " + outputFilePath);
            } else {
                view.showMessage("No se pudo unir los archivos PDF.");
            }
        } else {
            view.showMessage("No se pudo crear la lista de lectura de los archivos PDF.");
        }
    }

    void start() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
