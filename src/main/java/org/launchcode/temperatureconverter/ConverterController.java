package org.launchcode.temperatureconverter;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConverterController {

    @GetMapping("/convert") //tells spring what path this is
    @ResponseBody
    public String displayConvertForm() {
        return
                "<html>" +
                        "<head><title>Convert Temperature from F to C</title></head>" +
               "<body>" +
                "<form method=\"post\">" +
                "<label for=\"tempF\">Temperature</label>" +
                "<input name=\"tempF\" placeholder=\"Fahrenheit\">" +
                        "<button>Convert to Celsius</button>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("/convert")
    @ResponseBody
    public String handleConvertForm(@RequestParam Integer tempF) {
        return "The temp " + tempF + "F in C is " + String.valueOf((tempF - 32) * 5 / 9);

    }
}
