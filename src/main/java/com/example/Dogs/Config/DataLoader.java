package com.example.Dogs.Config;

import com.example.Dogs.Entity.Dog;
import com.example.Dogs.Repository.DogRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Map;

@Component
public class DataLoader implements CommandLineRunner {

    private final DogRepository dogRepository;

    public DataLoader(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }
    @Override
    public void run(String... args) throws Exception {

        if (dogRepository.count() == 0) {

            ObjectMapper mapper = new ObjectMapper();

            Map<String, List<String>> dogMap =
                    mapper.readValue(
                            new ClassPathResource("data/dogs.json").getInputStream(),
                            new TypeReference<Map<String, List<String>>>() {}
                    );

            for (Map.Entry<String, List<String>> entry : dogMap.entrySet()) {

                String breed = entry.getKey();
                List<String> subBreeds = entry.getValue();

                // if no sub-breed
                if (subBreeds.isEmpty()) {
                    dogRepository.save(new Dog(breed, ""));
                }

                // if sub-breeds exist
                else {
                    for (String subBreed : subBreeds) {
                        dogRepository.save(new Dog(breed, subBreed));
                    }
                }
            }

            System.out.println("Dogs loaded successfully!");
        }
    }
    }