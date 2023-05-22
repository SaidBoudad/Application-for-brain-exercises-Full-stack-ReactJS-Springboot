package com.brainsexercise.multiplication.challenge;

public interface ChallengeService {
    //verifies if an attempt coming from the presentation layer is correct or not.

    ChallengeAttempt verifyAttempt(ChallengeAttemptDTO resultAttempt);
}
