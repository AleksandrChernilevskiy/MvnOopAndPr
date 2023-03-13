package ru.netology.MvnOopAndPr.radio;

public class Radio {
    public int currentStationNumber;
    public int currentSoundVolume;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int newStationNumber) {
        if (newStationNumber > 9) {
            return;
        }
        if (newStationNumber < 0) {
            return;
        }
        if (newStationNumber == currentStationNumber) {
            return;
        }
        currentStationNumber = newStationNumber;
    }

    public int setNextStation(int newCurrentStationNumber) {

        if (newCurrentStationNumber < 9) {
            currentStationNumber = newCurrentStationNumber + 1;
        } else {
            currentStationNumber = 0;
        }
        return currentStationNumber;
    }

    public int setPrevStation(int newCurrentStationNumber) {

        if (newCurrentStationNumber == 0) {
            currentStationNumber = 9;
        } else {
            currentStationNumber = newCurrentStationNumber - 1;
        }
        return currentStationNumber;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < 0) {
            return;
        }
        if (newCurrentSoundVolume > 10) {
            return;
        }
        currentSoundVolume = newCurrentSoundVolume;
    }

    public int setIncreaseVolume() {
        if (currentSoundVolume < 10) {
            currentSoundVolume = currentSoundVolume + 1;
        }
        return currentSoundVolume;
    }

    public int setDecreaseVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume = currentSoundVolume - 1;
        }
        return currentSoundVolume;
    }
}
