package pl.przydan.receptura;

import pl.przydan.paints.Paint;

import java.util.List;

public class Recipe {
    private String recipeName;
    private List<Paint> recipeIngredients;

    public Recipe(String recipeName, List<Paint> recipeIngredients) {
        this.recipeName = recipeName;
        this.recipeIngredients = recipeIngredients;
    }


    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public List<Paint> getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(List<Paint> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    @Override
    public String toString() {
        return " # " + recipeName + "\n"
                + recipeIngredients + "\n"
                ;
    }
}
