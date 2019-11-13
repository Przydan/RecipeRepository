package pl.przydan.repository;

import pl.przydan.paints.Paint;
import pl.przydan.paints.PaintNames;
import pl.przydan.receptura.Recipe;

import java.util.ArrayList;
import java.util.List;

public class InMemoryPaintsRecipes implements RepositoryInterface{
    private List<Paint> paints = new ArrayList<>();
    private List<Recipe> recipes = new ArrayList<>();

    public InMemoryPaintsRecipes() {

        paints.add(new Paint(PaintNames.YELLOW, 2.5d));
        paints.add(new Paint(PaintNames.GREEN_CHESPA, 1.5d));
        paints.add(new Paint(PaintNames.PROCESS_BLUE, 7.5d));
        paints.add(new Paint(PaintNames.WARM_RED, 0.5d));

        recipes.add(new Recipe("355", paints));
        recipes.add(new Recipe("300", paints));
    }




}
