package pl.przydan.repository;

import pl.przydan.paint.Paint;
import pl.przydan.paint.PaintNames;

import java.util.Map;

public interface RepositoryInterface {
    Map<String, Map<PaintNames, Double>> add(Paint paint);
    Map<String, Map<PaintNames, Double>> delete(Paint paint);
    Map<String, Map<PaintNames, Double>> update(Paint paint);
    Map<String, Map<PaintNames, Double>> print(Paint paint);
}
