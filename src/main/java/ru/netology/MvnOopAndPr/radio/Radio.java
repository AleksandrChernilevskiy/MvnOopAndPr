package ru.netology.MvnOopAndPr.radio;

public class Radio {
    private int currentStationNumber;
    private int currentSoundVolume;

    int getCurrentStationNumber() {
        return currentStationNumber;
    }

    void setCurrentStationNumber(int newStationNumber) {
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

    int setNextStation(int newCurrentStationNumber) {

        if (newCurrentStationNumber < 9) {
            currentStationNumber = newCurrentStationNumber + 1;
        } else {
            currentStationNumber = 0;
        }
        return currentStationNumber;
    }

    int setPrevStation(int newCurrentStationNumber) {

        if (newCurrentStationNumber == 0) {
            currentStationNumber = 9;
        } else {
            currentStationNumber = newCurrentStationNumber - 1;
        }
        return currentStationNumber;
    }

    int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < 0) {
            return;
        }
        if (newCurrentSoundVolume > 10) {
            return;
        }
        currentSoundVolume = newCurrentSoundVolume;
    }

    int setIncreaseVolume() {
        if (currentSoundVolume < 10) {
            currentSoundVolume = currentSoundVolume + 1;
        }
        return currentSoundVolume;
    }

    int setDecreaseVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume = currentSoundVolume - 1;
        }
        return currentSoundVolume;
    }
}
