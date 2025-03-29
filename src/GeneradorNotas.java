import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class GeneradorNotas {
    public static List<Double> generarNotas(int cantidad) {
        Random random = new Random();
        return random.doubles(cantidad, 1.0, 7.0)
                .boxed()
                .collect(Collectors.toList());
    }
}
