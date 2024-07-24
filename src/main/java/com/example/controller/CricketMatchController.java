package com.example.controller;

import com.example.entity.CricketMatch;
import com.example.service.CricketMatchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/crickInfo")
public class CricketMatchController {
    private CricketMatchService cricketMatchService;

    public CricketMatchController(CricketMatchService cricketMatchService) {
        this.cricketMatchService = cricketMatchService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<CricketMatch>> getAllMatches(){
        List<CricketMatch> allMatches = cricketMatchService.getAllMatches();
        return new ResponseEntity<>(allMatches, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<CricketMatch>> getLiveMatches(){
        List<CricketMatch> liveMatches = cricketMatchService.getLiveMatches();
        return new ResponseEntity<>(liveMatches,HttpStatus.OK);
    }

    @GetMapping("/mlc")
    public ResponseEntity<List<List<String>>> getMlcPointsTable(){
        List<List<String>> mlcPointTable = cricketMatchService.getMlcPointTable();
        return new ResponseEntity<>(mlcPointTable,HttpStatus.OK);
    }

    @GetMapping("/hundred")
    public ResponseEntity<List<List<String>>> getHundredPointsTable(){
        List<List<String>> hundredPointTable = cricketMatchService.getHundredPointTable();
        return new ResponseEntity<>(hundredPointTable,HttpStatus.OK);
    }

    @GetMapping("/blast")
    public ResponseEntity<List<List<String>>> getT20BlastPointsTable(){
        List<List<String>> t20BlastPointTable = cricketMatchService.getT20BlastPointTable();
        return new ResponseEntity<>(t20BlastPointTable,HttpStatus.OK);
    }

}
