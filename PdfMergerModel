package model;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.utils.PdfMerger;
import java.util.List;

public class PdfMergerModel {

    public boolean mergePDFs(List<PdfReader> pdfReaders, String outputFilePath) {
        try (PdfDocument pdfDocument = new PdfDocument(new PdfWriter(outputFilePath))) {
            PdfMerger pdfMerger = new PdfMerger(pdfDocument);
            for (PdfReader reader : pdfReaders) {
                pdfMerger.merge(reader, 1, reader.getNumberOfPages());
            }
            pdfMerger.close();
        }
        return true;
    }
}
