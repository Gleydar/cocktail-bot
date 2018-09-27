package edu.hm.cs.pblv.group3.model.entities;

import edu.hm.cs.pblv.group3.main.IngredientCsv;
import edu.hm.cs.pblv.group3.repositories.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class StringToIngredients {

    private IngredientRepository repository;
    private String input;


    @Autowired
    public StringToIngredients(IngredientRepository repository) {
        this.repository = repository;
    }

    public void run(String input) {
        HashSet<String> set = (HashSet<String>) getIngredients();
    }

    private Set<String> getIngredients() {
        List<Ingredient> list = repository.findAll();
        Set<String> set = new HashSet<>();
        for (Ingredient ingredient : list) {
            set.add(ingredient.getName());
        }
        return set;
    }


}
