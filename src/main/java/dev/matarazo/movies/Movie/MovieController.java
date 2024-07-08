package dev.matarazo.movies.Movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService service;

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(service.getAllMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imbdId}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imbdId){
        return new ResponseEntity<Optional<Movie>>(service.singleMovie(imbdId), HttpStatus.OK);
    }

}
