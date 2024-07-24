package com.example.service;

import com.example.entity.CricketMatch;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface CricketMatchService {
    //get all matches
    List<CricketMatch> getAllMatches();
    //get live matches
    List<CricketMatch> getLiveMatches();
    //get MLC PointTable
    List<List<String>> getMlcPointTable();
    //get Hundred PointTable
    List<List<String>> getHundredPointTable();
    //get T20Blast PointTable
    List<List<String>> getT20BlastPointTable();

}
