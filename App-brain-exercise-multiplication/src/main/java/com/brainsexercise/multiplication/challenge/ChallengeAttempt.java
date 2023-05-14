package com.brainsexercise.multiplication.challenge;

import com.brainsexercise.multiplication.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChallengeAttempt {
    //the attempt from the user to solve the challenge from "@link"
    private Long id;
    private User user;
    private int factorA;
    private int factorB;
    private int resultAttempt;
    private boolean correct;
}
