package io.javabrains.raitingsdataservice.resource;

import io.javabrains.raitingsdataservice.model.Rating;
import io.javabrains.raitingsdataservice.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId")String movieId){
        return new Rating(movieId,4);
    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String movieId) {
       List<Rating> ratingList = Arrays.asList(
               new Rating("MovieId_0", 4),
               new Rating("MovieId_1", 3)
       );
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratingList);
       return userRating;
    }
}
