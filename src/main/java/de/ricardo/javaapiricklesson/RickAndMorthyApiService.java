package de.ricardo.javaapiricklesson;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class RickAndMorthyApiService {

    private final RestClient restClient;

    public RickAndMorthyApiService(RestClient.Builder builder) {
        this.restClient = builder.baseUrl("https://rickandmortyapi.com/api" ).build();
    }

    public List<RickAndMorthyResponseResults> getAllCharacters() {
        RickAndMorthyApiResponse response = this.restClient.get()
                .uri("/character" ).retrieve().body(RickAndMorthyApiResponse.class);
        assert response != null;
        return response.results();
    }

//    public static void main(String[] args) {
//        RestClient.Builder restClient1 = RestClient.builder();
//        RickAndMorthyApiService service = new RickAndMorthyApiService(restClient1);
//        service.getAllCharacters();
//    }

}
