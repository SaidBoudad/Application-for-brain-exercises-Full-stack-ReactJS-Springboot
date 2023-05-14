package com.brainsexercise.multiplication.challenge;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.BDDAssertions.then;

public class ChallengeServiceTest {
    private ChallengeService challengeService;

    @BeforeEach
    public void setUp(){
        challengeService= new ChallengeServiceImpl();
    }
    @Test
    public void checkCorrectAttemptTest(){
        Boolean said = true;
        Assumptions.assumingThat(said,()-> System.out.println("said"));
        //given
        ChallengeAttemptDTO attemptDTO= new ChallengeAttemptDTO(10,20,"Said_Boudad",200);
        //when
        ChallengeAttempt resultAttempt = challengeService.verifyAttempt(attemptDTO);
        //then
        then(resultAttempt.isCorrect()).isTrue();
    }
    @Test
    public void checkWrongAttemptTest(){
        //given
        ChallengeAttemptDTO attemptDTO = new ChallengeAttemptDTO(5,10,"Said_Boudad",40);
        //when
        ChallengeAttempt resultAttempt = challengeService.verifyAttempt(attemptDTO);
        //then
        then(resultAttempt.isCorrect()).isFalse();
    }
}
