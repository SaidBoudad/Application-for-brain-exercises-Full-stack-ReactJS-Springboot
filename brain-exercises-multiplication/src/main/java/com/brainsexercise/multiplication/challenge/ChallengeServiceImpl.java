package com.brainsexercise.multiplication.challenge;

import com.brainsexercise.multiplication.user.User;
import org.springframework.stereotype.Service;

@Service
public class ChallengeServiceImpl implements ChallengeService{

    @Override
    public ChallengeAttempt verifyAttempt(ChallengeAttemptDTO attemptDTO) {
        //check if the attempt is correct
        int correctAttempt = attemptDTO.getFactorA()*attemptDTO.getFactorB();
        boolean isCorrect = attemptDTO.getGuess() == correctAttempt;
        if(!isCorrect) System.out.println("the correct response is : "+correctAttempt);
        User user = new User(null,attemptDTO.getUserAlias());
        ChallengeAttempt checkedAttempt= new ChallengeAttempt(null,
                user,
                attemptDTO.getFactorA(),
                attemptDTO.getFactorB(),
                attemptDTO.getGuess(),
                isCorrect

        );
        return checkedAttempt;
    }
}
