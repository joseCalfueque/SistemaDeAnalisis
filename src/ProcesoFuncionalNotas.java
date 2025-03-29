import java.util.List;

public class ProcesoFuncionalNotas {
    public static long contarMayoresA(List<Double> notas, double umbral) {
        return notas.stream().filter(nota -> nota > umbral).count();
    }

    public static long contarMenoresA(List<Double> notas, double umbral) {
        return notas.stream().filter(nota -> nota < umbral).count();
    }

    public static long contarEnRango(List<Double> notas, double min, double max) {
        return notas.stream().filter(nota -> nota >= min && nota < max).count();
    }
}

