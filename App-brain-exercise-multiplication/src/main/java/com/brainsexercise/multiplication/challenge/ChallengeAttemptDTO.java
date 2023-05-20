package com.brainsexercise.multiplication.challenge;

import lombok.Value;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Value
public class ChallengeAttemptDTO {
    //Attempt coming from the user.
    @Min(1) @Max(99)
    int factorA,factorB;
    @NotBlank
    String userAlias;
    @Positive @Max(9801) //99*99
    int guess;

}
