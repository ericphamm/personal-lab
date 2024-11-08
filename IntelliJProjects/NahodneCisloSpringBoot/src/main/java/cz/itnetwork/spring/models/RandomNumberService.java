package cz.itnetwork.spring.models;

import org.springframework.stereotype.Service;

@Service
public class RandomNumberService {
    public int randomize(RandomNumberDTO randomNumber) {
        int result = (int)Math.floor(Math.random() * (randomNumber.getNumber2() - randomNumber.getNumber1() + 1) + randomNumber.getNumber1());
        randomNumber.setResult(result);
        return result;
    }
}
