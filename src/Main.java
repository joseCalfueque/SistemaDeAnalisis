import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> notas = NotaGenerator.generarNotas(20);
        System.out.println("Notas generadas: " + notas);

        int mayoresA4Imperativo = NotaProcessorImperative.contarMayoresA(notas, 4.0);
        int menoresA36Imperativo = NotaProcessorImperative.contarMenoresA(notas, 3.6);
        int enRangoImperativo = NotaProcessorImperative.contarEnRango(notas, 3.6, 4.0);

        long mayoresA4Funcional = NotaProcessorFunctional.contarMayoresA(notas, 4.0);
        long menoresA36Funcional = NotaProcessorFunctional.contarMenoresA(notas, 3.6);
        long enRangoFuncional = NotaProcessorFunctional.contarEnRango(notas, 3.6, 4.0);

        System.out.println("\nResultados Imperativos:");
        System.out.println("Notas > 4.0: " + mayoresA4Imperativo);
        System.out.println("Notas < 3.6: " + menoresA36Imperativo);
        System.out.println("Notas en [3.6, 4.0): " + enRangoImperativo);

        System.out.println("\nResultados Funcionales:");
        System.out.println("Notas > 4.0: " + mayoresA4Funcional);
        System.out.println("Notas < 3.6: " + menoresA36Funcional);
        System.out.println("Notas en [3.6, 4.0): " + enRangoFuncional);
    }
}
