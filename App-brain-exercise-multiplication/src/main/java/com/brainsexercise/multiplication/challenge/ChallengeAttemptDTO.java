package com.brainsexercise.multiplication.challenge;

import lombok.Value;

@Value
public class ChallengeAttemptDTO {
    //Attempt coming from the user.

    int factorA,factorB;
    String userAlias;
    int guess;

}
