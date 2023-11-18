package com.subhacodes.gradledemo.Respository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.subhacodes.gradledemo.models.Contest;
import java.util.List;


public interface ContestRepository extends CrudRepository<Contest, Long>{

    // List<Contest> findByContestName(String contestName);
}
