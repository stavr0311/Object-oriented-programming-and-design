package ru.netologi;

import com.sun.source.tree.BinaryTree;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        //if (currentVolume < 0) {
        //   return;
        //}
        //if (currentVolume < 100) {
        //  return;
        //}
        //this.
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;

    }

    public void next() {        //следующая станция
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }

    }

    public void prev() {     // предыдущая станция
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }

    public void prevMax() {    // следующая после 9
        if (currentRadioStation > 9) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 0;

        }
    }

    public void volumeUp() {                // увеличение громкости на 1
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void volumeDown() {              // уменьшение громкости на 1
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}

