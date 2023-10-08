import controller.PdfMergerController;
import model.PdfMergerModel;
import view.PdfMergerView;

public class Main {
    public static void main(String[] args) {
        // Crea una instancia del modelo
        PdfMergerModel model = new PdfMergerModel();

        // Crea una instancia de la vista
        PdfMergerView view = new PdfMergerView();

        // Crea una instancia del controlador y pasa la vista y el modelo a él
        PdfMergerController controller = new PdfMergerController(view, model);

        // Inicia la vista
        controller.start();
    }
}
