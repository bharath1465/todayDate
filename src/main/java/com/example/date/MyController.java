package com.example.date;

// import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
@RestController
public class MyController {
    @GetMapping("/")
    public String getDateText(){
    LocalDate td = LocalDate.now();
    DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    //String formattedDate = now.format(format1);
    String c = String.valueOf(td.format(format1));
    return c;
    }
}
