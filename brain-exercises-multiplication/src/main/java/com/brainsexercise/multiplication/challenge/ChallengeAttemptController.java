package com.brainsexercise.multiplication.challenge;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/attempts")
public class ChallengeAttemptController {
    //provide a REST API to POST the attempts from users.
    private final ChallengeService challengeService;
    @PostMapping
    ResponseEntity<ChallengeAttempt> postResult(@Valid @RequestBody ChallengeAttemptDTO challengeAttemptDTO){

        return ResponseEntity.ok(challengeService.verifyAttempt(challengeAttemptDTO));
    }

}



