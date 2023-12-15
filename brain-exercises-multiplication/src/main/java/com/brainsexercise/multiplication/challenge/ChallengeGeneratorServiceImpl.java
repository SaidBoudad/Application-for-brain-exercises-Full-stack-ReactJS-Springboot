package com.brainsexercise.multiplication.challenge;

import org.springframework.stereotype.Service;

import java.util.Random;
@Service
public class ChallengeGeneratorServiceImpl implements ChallengeGeneratorService{
    //return a randomly-generated challenge with factors bw 11 and 99
    private final Random random;

    private final static int MINIMUM_FACTOR = 11;
    private final static int MAXIMUM_FACTOR = 100;


    ChallengeGeneratorServiceImpl(){
        this.random=new Random();
    }
    //We make second constructor that accepts the 'random' object to make the class testable
    protected ChallengeGeneratorServiceImpl(final Random random){
        this.random=random;
    }

    //By subtracting MINIMUM_FACTOR from MAXIMUM_FACTOR, we define the range of possible values,
    // and then by adding MINIMUM_FACTOR to the result, we shift the range to start from MINIMUM_FACTOR.
    private int next(){
        return random.nextInt(MAXIMUM_FACTOR - MINIMUM_FACTOR)+MINIMUM_FACTOR;
    }
    @Override
    public Challenge randomChallenge() {
        return new Challenge(next(),next());
    }
}
