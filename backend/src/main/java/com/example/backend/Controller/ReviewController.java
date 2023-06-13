package com.example.backend.Controller;

import com.example.backend.Repository.ReviewRepository;
import com.example.backend.entity.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewController(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @GetMapping("/getAll")
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    @PostMapping("/add")
    public Review addReview(@RequestBody Review review) {
        return reviewRepository.save(review);
    }


}
