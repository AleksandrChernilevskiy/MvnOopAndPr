package ru.netology.MvnOopAndPr.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {

    private int quantityStation = 10;
    private int maxStationNumber = quantityStation - 1;

    private int minStationNumber;

    private int currentStationNumber;

    private int maxVolumeLevel = 100;

    private int minVolumeLevel;
    private int currentSoundVolume;

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
        this.maxStationNumber = this.quantityStation - 1;
    }

    public void setCurrentStationNumber(int newStationNumber) {
        if (newStationNumber > maxStationNumber) {
            return;
        }
        if (newStationNumber < minStationNumber) {
            return;
        }
        if (newStationNumber == currentStationNumber) {
            return;
        }
        currentStationNumber = newStationNumber;
    }

    public int setNextStation() {

        if (currentStationNumber < maxStationNumber) {
            currentStationNumber = currentStationNumber + 1;
        } else {
            currentStationNumber = minStationNumber;
        }
        return currentStationNumber;
    }

    public int setPrevStation() {

        if (currentStationNumber == minStationNumber) {
            currentStationNumber = maxStationNumber;
        } else {
            currentStationNumber = currentStationNumber - 1;
        }
        return currentStationNumber;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < minVolumeLevel) {
            return;
        }
        if (newCurrentSoundVolume > maxVolumeLevel) {
            return;
        }
        currentSoundVolume = newCurrentSoundVolume;
    }

    public int setIncreaseVolume() {
        if (currentSoundVolume < maxVolumeLevel) {
            currentSoundVolume = currentSoundVolume + 1;
        }
        return currentSoundVolume;
    }

    public int setDecreaseVolume() {
        if (currentSoundVolume > minVolumeLevel) {
            currentSoundVolume = currentSoundVolume - 1;
        }
        return currentSoundVolume;
    }
}
