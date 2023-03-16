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
        rad.setCurrentStationNumber(9);
        rad.setNextStation();

        int expected = 0;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationNumber() {

        Radio rad = new Radio();
        rad.setCurrentStationNumber(0);
        rad.setNextStation();

        int expected = 1;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNine() {

        Radio rad = new Radio();
        rad.setCurrentStationNumber(0);
        rad.setPrevStation();

        int expected = 9;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNumber() {

        Radio rad = new Radio();
        rad.setCurrentStationNumber(9);
        rad.setPrevStation();

        int expected = 8;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLowVolume() {
        Radio rad = new Radio();
        rad.setCurrentSoundVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldOverVolume() {
        Radio rad = new Radio();
        rad.setCurrentSoundVolume(11);

        int expected = 0;
        int actual = rad.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentSoundVolume(10);

        rad.setIncreaseVolume();

        int expected = 10;
        int actual = rad.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentSoundVolume(0);

        rad.setIncreaseVolume();

        int expected = 1;
        int actual = rad.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentSoundVolume(10);

        rad.setDecreaseVolume();

        int expected = 9;
        int actual = rad.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentSoundVolume(0);

        rad.setDecreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}
