import java.util.List;

public class ProcesoImperativoNotas {
    public static int contarMayoresA(List<Double> notas, double umbral) {
        int count = 0;
        for (double nota : notas) {
            if (nota > umbral) {
                count++;
            }
        }
        return count;
    }

    public static int contarMenoresA(List<Double> notas, double umbral) {
        int count = 0;
        for (double nota : notas) {
            if (nota < umbral) {
                count++;
            }
        }
        return count;
    }

    public static int contarEnRango(List<Double> notas, double min, double max) {
        int count = 0;
        for (double nota : notas) {
            if (nota >= min && nota < max) {
                count++;
            }
        }
        return count;
    }
}
