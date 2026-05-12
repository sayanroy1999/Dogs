package com.example.Dogs.Controller;

import com.example.Dogs.Entity.Dog;
import com.example.Dogs.Repository.DogRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DogController {

    private final DogRepository dogRepository;

    public DogController(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    // HOME PAGE - LIST ALL DOGS
    @GetMapping("/")
    public String getAllDogs(Model model) {
        model.addAttribute("dogs", dogRepository.findAll());
        return "index";
    }

    // SHOW ADD FORM
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("dog", new Dog());
        return "add-dog";
    }

    // SAVE DOG
    @PostMapping("/save")
    public String saveDog(@ModelAttribute Dog dog) {
        dogRepository.save(dog);
        return "redirect:/";
    }

    // DELETE DOG
    @GetMapping("/delete/{id}")
    public String deleteDog(@PathVariable Long id) {
        if (!dogRepository.existsById(id)) {
            throw new IllegalArgumentException("Invalid dog id: " + id);
        }
        dogRepository.deleteById(id);
        return "redirect:/";
    }

    // SHOW EDIT FORM
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {

        Dog dog = dogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid dog id"));

        model.addAttribute("dog", dog);

        return "edit-dog";
    }

    // UPDATE DOG
    @PostMapping("/update/{id}")
    public String updateDog(@PathVariable Long id,
                            @ModelAttribute Dog dog) {

        dogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid dog id: " + id));
        
        dog.setId(id);

        dogRepository.save(dog);

        return "redirect:/";
    }
}
