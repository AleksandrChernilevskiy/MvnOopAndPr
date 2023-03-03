package ru.netology.MvnOopAndPr.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldStationNumberLimit() {

        Radio rad = new Radio();
        rad.setCurrentStationNumber(5);

        int expected = 5;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationNumberOverLimit() {

        Radio rad = new Radio();
        rad.setCurrentStationNumber(10);

        int expected = 0;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationNumberUnderLimit() {

        Radio rad = new Radio();
        rad.setCurrentStationNumber(-1);

        int expected = 0;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationNumberNoChange() {

        Radio rad = new Radio();
        rad.setCurrentStationNumber(0);

        int expected = 0;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationZero() {

        Radio rad = new Radio();
        int currentStationNumber = 9;

        int expected = 0;
        int actual = rad.setNextStation(currentStationNumber);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationNumber() {

        Radio rad = new Radio();
        int currentStationNumber = 0;

        int expected = 1;
        int actual = rad.setNextStation(currentStationNumber);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNine() {

        Radio rad = new Radio();
        int currentStationNumber = 0;

        int expected = 9;
        int actual = rad.setPrevStation(currentStationNumber);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNumber() {

        Radio rad = new Radio();
        int currentStationNumber = 9;

        int expected = 8;
        int actual = rad.setPrevStation(currentStationNumber);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio rad = new Radio();
        int newCurrentSoundVolume = 10;

        int expected = 10;
        int actual = rad.setIncreaseVolume(newCurrentSoundVolume);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        int newCurrentSoundVolume = 0;

        int expected = 1;
        int actual = rad.setIncreaseVolume(newCurrentSoundVolume);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();
        int currentSoundVolume = 10;

        int expected = 9;
        int actual = rad.setDecreaseVolume(currentSoundVolume);
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio rad = new Radio();
        int currentSoundVolume = 0;

        int expected = currentSoundVolume;
        int actual = rad.setDecreaseVolume(currentSoundVolume);
    }
}
