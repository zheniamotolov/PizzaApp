package com.pizza.demo;

import com.pizza.demo.model.Ingredient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;
import com.pizza.demo.model.Ingredient.Type;
import org.springframework.web.bind.annotation.RestController;

@Controller            // <1>
public class HomeController {

  @GetMapping("/")     // <2>
  public String home() {
    return "home";     // <3>
  }
  @GetMapping("/home")
  public String showDesignForm(Model model) {
    List<Ingredient> ingredients = Arrays.asList(
            new Ingredient("FLTO", "Flour Tortilla", Ingredient.Type.WRAP),
            new Ingredient("COTO", "Corn Tortilla", Type.WRAP),
            new Ingredient("GRBF", "Ground Beef", Type.PROTEIN),
            new Ingredient("CARN", "Carnitas", Type.PROTEIN),
            new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES),
            new Ingredient("LETC", "Lettuce", Type.VEGGIES),
            new Ingredient("CHED", "Cheddar", Type.CHEESE),
            new Ingredient("JACK", "Monterrey Jack", Type.CHEESE),
            new Ingredient("SLSA", "Salsa", Type.SAUCE),
            new Ingredient("SRCR", "Sour Cream", Type.SAUCE)
    );
    Type[] types = Ingredient.Type.values();
//    for (Type type : types) {
//      model.addAttribute(type.toString().toLowerCase(),
//              filterByType(ingredients, type));
//    }
    model.addAttribute("design", null);
    return "design";
  }
}
