package de.ricardo.javaapiricklesson;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import java.util.List;


@RestController
@RequestMapping("/api/characters" )
public class RickAndMorthController {

    RestClient.Builder builder = RestClient.builder();
    private final RickAndMorthyApiService rickAndMorthyApiService = new RickAndMorthyApiService(builder);

    @GetMapping
    public List<RickAndMorthyResponseResults> getAllCharacters() {
        return rickAndMorthyApiService.getAllCharacters();
    }
}
