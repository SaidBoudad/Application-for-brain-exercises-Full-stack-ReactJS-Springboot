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

    //this last manner give sensitive information , we make it by adding these 2 properties
    //server.error.include-message=always
    //server.error.include-binding-errors=always
    //Other alternative to return the list of message for invalid input in fields
    //maybe we need to add these 2 explicitly
    //import org.springframework.context.support.DefaultMessageSourceResolvable;
    //import org.springframework.validation.BindingResult;
//    @PostMapping
//    ResponseEntity<?> postResult(@Valid @RequestBody ChallengeAttemptDTO challengeAttemptDTO,BindingResult bindingResult){
//        if (bindingResult.hasErrors()) {
//            List<String> errorMessages = bindingResult.getAllErrors().stream()
//                    .map(DefaultMessageSourceResolvable::getDefaultMessage)
//                    .collect(Collectors.toList());
//            return ResponseEntity.badRequest().body(errorMessages);
//        }else
//        return ResponseEntity.ok(challengeService.verifyAttempt(challengeAttemptDTO));
//    }

}



