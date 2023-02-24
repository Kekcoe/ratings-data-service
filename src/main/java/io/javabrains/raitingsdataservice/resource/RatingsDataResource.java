package io.javabrains.raitingsdataservice.resource;

import io.javabrains.raitingsdataservice.model.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataResource {

    @RequestMapping("/{movieId}")
    public Rating getMovieInfo(@PathVariable("movieId")String movieId){
        return new Rating(movieId,4);
    }


}
