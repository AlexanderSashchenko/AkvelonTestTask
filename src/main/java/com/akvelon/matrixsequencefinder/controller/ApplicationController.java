package com.akvelon.matrixsequencefinder.controller;

import com.akvelon.matrixsequencefinder.model.MatrixDto;
import com.akvelon.matrixsequencefinder.service.LongestSequenceFinder;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    private final LongestSequenceFinder longestSequenceFinder;
    
    public ApplicationController(LongestSequenceFinder longestSequenceFinder) {
        this.longestSequenceFinder = longestSequenceFinder;
    }
    
    @PostMapping("/matrix-input")
    public String findLongestSequence(@RequestBody @Valid MatrixDto matrixDto) {
        return "The longest sequence of 1's within a single row or column is: "
                + longestSequenceFinder.findLongestSequence(matrixDto.getMatrix());
    }
}
