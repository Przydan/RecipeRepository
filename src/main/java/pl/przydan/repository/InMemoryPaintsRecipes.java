package pl.przydan.repository;

import pl.przydan.paint.Paint;
import pl.przydan.paint.PaintNames;

import java.util.LinkedHashMap;
import java.util.Map;

public class InMemoryPaintsRecipes implements RepositoryInterface{

    private Map<String, Map<PaintNames, Double>> paintsRecipesRepo;
    private Map<PaintNames, Double> paintRecipe;

    public InMemoryPaintsRecipes() {
        paintRecipe = new LinkedHashMap<>();
        paintsRecipesRepo = new LinkedHashMap<>();
    }


    @Override
    public Map<String, Map<PaintNames, Double>> add(Paint paint) {
        return null;
    }

    @Override
    public Map<String, Map<PaintNames, Double>> delete(Paint paint) {
        return null;
    }

    @Override
    public Map<String, Map<PaintNames, Double>> update(Paint paint) {
        return null;
    }

    @Override
    public Map<String, Map<PaintNames, Double>> print(Paint paint) {
        return null;
    }
}
