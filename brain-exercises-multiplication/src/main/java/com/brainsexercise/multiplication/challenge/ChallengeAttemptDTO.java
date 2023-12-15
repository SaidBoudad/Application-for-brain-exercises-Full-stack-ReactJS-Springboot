package com.brainsexercise.multiplication.challenge;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
public class ChallengeAttemptDTO {
    //Attempt coming from the user.

    @Min(1) @Max(99)
    int factorA,factorB;

    @NotBlank
    String userAlias;

    @Positive(message = "How could you possibly get a negative result here? Try again.") @Max(9801) //99*99
    int guess;


}
