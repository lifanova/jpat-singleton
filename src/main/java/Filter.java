import java.util.ArrayList;
import java.util.List;

public class Filter {
    private final int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source, int size) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int i = 0;
        for (Integer f : source) {
            if (f <= treshold) {
                result.add(f);
                logger.log("Элемент '" + f + "' проходит");
                i++;
            } else {
                logger.log("Элемент '" + f + "' не проходит");
            }
        }
        logger.log("Прошло фильтр " + i + " элем. из " + size);

        return result;
    }
}
