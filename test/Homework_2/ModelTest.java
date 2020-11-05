package Homework_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;


class ModelTest {
    Model model = new Model();

    @DisplayName("rand() should return the number in range from 0 to 100 inclusive")
    @RepeatedTest(1000)
    void rand() {
        int randomNumber = model.rand(0, 100);
        Assertions.assertTrue(randomNumber >= 0 && randomNumber <= 100, "Number should be in the range!");
    }

    @DisplayName("should return true if randomNumber == userNumber")
    @RepeatedTest(100)
    void checkUserNumber() {
        int result = new Random().nextInt();
        model.setRandomNumber(result);
        Assertions.assertTrue(model.checkUserNumber(result), "Number should match");
    }
}