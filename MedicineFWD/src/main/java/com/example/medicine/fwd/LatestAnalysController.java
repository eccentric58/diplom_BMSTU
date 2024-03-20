package com.example.medicine.fwd;

import com.example.medicine.fwd.dto.AnalysisDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LatestAnalysController {
    @GetMapping("/HelloWorld")
    public String helloWorld() {
        return "helloWorld";
    }

    @GetMapping("/getLastAnalysis")
    public AnalysisDto getLastAnalysis(int patientId) {
        AnalysisDto dto = new AnalysisDto(1, 3, 4, 5, 6, 7, 8, 9);

        return dto;
    }


}
