package com.cognizant.loan;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping("/{number}")
    public Map<String, Object> getLoan(@PathVariable String number) {
        Map<String, Object> loan = new HashMap<>();
        loan.put("number", number);
        loan.put("type", "Car");
        loan.put("loan", 400000);
        loan.put("emi", 32000);
        loan.put("tenure", 18);
        return loan;
    }
}
