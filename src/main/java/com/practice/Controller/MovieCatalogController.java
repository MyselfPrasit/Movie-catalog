package com.practice.Controller;


import com.practice.Resource.MovieInfo;
import com.practice.Resource.Movies;
import com.practice.Resource.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/movies")
public class MovieCatalogController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public List<Movies> getMovieList(@PathVariable("userId") String userId){

        UserRating userRating = restTemplate.getForObject("http://MOVIE-RATING-SERVICE/rating/"+
                userId, UserRating.class);

        return userRating.getUserRatings().stream().map(rating -> {
            MovieInfo movieInfo = restTemplate.getForObject("http://MOVIE-INFO-SERVICE/movie-info/" +
                    String.valueOf(rating.getMovieId()), MovieInfo.class);
            return new Movies(userId,movieInfo.getMovieName(), rating.getRating());
        }).collect(Collectors.toList());

    }

}
