package com.subhacodes.gradledemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.subhacodes.gradledemo.Respository.ContestRepository;
import com.subhacodes.gradledemo.models.Contest;

@Service
public class ContestService {

    @Autowired
    private ContestRepository contestRepository;

    public void createContest(String contestName, String contestDescription){
        Contest c = new Contest();
        c.setContestName(contestName);
        c.setContestDescription(contestDescription);
        contestRepository.save(c);
    }
    
    public Iterable<Contest> getAllContests(){
        System.out.println("Inside Service getAllContests");
        return contestRepository.findAll();
    }
}
