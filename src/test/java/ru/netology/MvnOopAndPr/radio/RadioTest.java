package ru.netology.MvnOopAndPr.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio rad = new Radio();

    @Test
    public void shouldStationNumberLimit() {

        rad.setCurrentStationNumber(5);

        int expected = 5;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationNumberOverLimit() {

        rad.setCurrentStationNumber(rad.getQuantityStation());

        int expected = rad.getCurrentStationNumber();
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationNumberUnderLimit() {

        rad.setCurrentStationNumber(rad.getMinStationNumber() - 1);

        int expected = rad.getMinStationNumber();
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationNumberNoChange() {

        rad.setCurrentStationNumber(rad.getMinStationNumber());

        int expected = rad.getMinStationNumber();
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationZero() {

        rad.setCurrentStationNumber(rad.getMaxStationNumber());
        rad.setNextStation();

        int expected = rad.getMinStationNumber();
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationNumber() {

        rad.setCurrentStationNumber(rad.getMinStationNumber());
        rad.setNextStation();

        int expected = rad.getMinStationNumber() + 1;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNine() {

        rad.setCurrentStationNumber(rad.getMinStationNumber());
        rad.setPrevStation();

        int expected = rad.getMaxStationNumber();
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNumber() {

        rad.setCurrentStationNumber(rad.getMaxStationNumber());
        rad.setPrevStation();

        int expected = rad.getMaxStationNumber() - 1;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldQuantityStation() {
        Radio rad = new Radio(100);

        Assertions.assertEquals(99, rad.getMaxStationNumber());
        Assertions.assertEquals(100, rad.getQuantityStation());
    }

    @Test
    public void shouldLowVolume() {
        rad.setCurrentSoundVolume(rad.getMinVolumeLevel() - 1);

        int expected = rad.getMinVolumeLevel();
        int actual = rad.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldOverVolume() {
        rad.setCurrentSoundVolume(rad.getMaxVolumeLevel() + 1);

        int expected = 0;
        int actual = rad.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {
        rad.setCurrentSoundVolume(rad.getMaxVolumeLevel());

        rad.setIncreaseVolume();

        int expected = rad.getMaxVolumeLevel();
        int actual = rad.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        rad.setCurrentSoundVolume(rad.getMinVolumeLevel());

        rad.setIncreaseVolume();

        int expected = rad.getMinVolumeLevel() + 1;
        int actual = rad.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        rad.setCurrentSoundVolume(rad.getMaxVolumeLevel());

        rad.setDecreaseVolume();

        int expected = rad.getMaxVolumeLevel() - 1;
        int actual = rad.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {
        rad.setCurrentSoundVolume(rad.getMinVolumeLevel());

        rad.setDecreaseVolume();

        int expected = rad.getMinVolumeLevel();
        int actual = rad.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}
