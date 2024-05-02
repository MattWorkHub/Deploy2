package deploy.controllers;
import deploy.services.RandomIntegerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/random")
public class RandomIntegerController {

    @Autowired
    private RandomIntegerService randomIntegerService;

    @GetMapping
    public ResponseEntity<String> getSum() {
        String randomSum = String.valueOf(randomIntegerService.getSum());
        return ResponseEntity.ok(randomSum);
    }
}