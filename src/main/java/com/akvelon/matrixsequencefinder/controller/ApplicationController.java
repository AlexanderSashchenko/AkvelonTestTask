package com.akvelon.matrixsequencefinder.controller;

import com.akvelon.matrixsequencefinder.model.MatrixDto;
import com.akvelon.matrixsequencefinder.service.LongestSequenceFinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
public class ApplicationController {
    private final LongestSequenceFinder longestSequenceFinder;
    
    public ApplicationController(LongestSequenceFinder longestSequenceFinder) {
        this.longestSequenceFinder = longestSequenceFinder;
    }
    
    @PostMapping("/matrix-input")
    public int findLongestSequence(@RequestBody @Valid MatrixDto matrixDto) {
        return longestSequenceFinder.findLongestSequence(matrixDto.getMatrix());
    }
}
