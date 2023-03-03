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

    public int setNextStation(int currentStationNumber) {

        if (currentStationNumber == 9) {
            currentStationNumber = 0;
        } else {
            currentStationNumber = currentStationNumber + 1;
        }
        return currentStationNumber;
    }

    public int setPrevStation(int currentStationNumber) {

        if (currentStationNumber == 0) {
            currentStationNumber = 9;
        } else {
            currentStationNumber = currentStationNumber - 1;
        }
        return currentStationNumber;
    }

    public int setIncreaseVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume == 10) {
            return currentSoundVolume;
        } else {
            this.currentSoundVolume = this.currentSoundVolume + 1;
        }
        return currentSoundVolume;
    }

    public int setDecreaseVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume == 0) {
            return currentSoundVolume;
        } else {
            currentSoundVolume = currentSoundVolume - 1;
        }
        return currentSoundVolume;
    }
}
