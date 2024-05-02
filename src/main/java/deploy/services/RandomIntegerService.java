package deploy.services;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomIntegerService {

    public int getSum() {
        Random random = new Random();
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        return num1 + num2;
    }
}