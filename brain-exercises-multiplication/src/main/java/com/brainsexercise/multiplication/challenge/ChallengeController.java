package com.brainsexercise.multiplication.challenge;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/challenges")
public class ChallengeController {
    //implements a REST API to get random challenges
    private final ChallengeGeneratorService challengeGeneratorService;
    @GetMapping("/random")
    Challenge getRandomChallenge(){
        Challenge challenge =challengeGeneratorService.randomChallenge();
        log.info("Generating a random challenge : {} ", challenge );
        return challenge;
    }


}
