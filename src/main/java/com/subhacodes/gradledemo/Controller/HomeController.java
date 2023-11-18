package com.subhacodes.gradledemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.subhacodes.gradledemo.Respository.ContestRepository;
import com.subhacodes.gradledemo.models.Contest;

@RestController
@RequestMapping(path="/contest")
public class HomeController{

    @Autowired
    ContestRepository contestRepository;
    
    @PostMapping("/create")
    public String createContest(@RequestParam String contestName, @RequestParam String contestDescription){
        Contest c = new Contest();
        c.setContestName(contestName);
        c.setContestDescription(contestDescription);
        contestRepository.save(c);
        return "contest created";
    }

    @GetMapping("/all")
    public Iterable<Contest> getContest(){
        System.out.println("Printing Contset getContest");
        
        return contestRepository.findAll();
    }
}