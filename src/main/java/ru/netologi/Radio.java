package ru.netologi;

import com.sun.source.tree.BinaryTree;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {  //выбор радиостанции
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;

    }

    public void next() {        //следующая станция / следующая после 9 станции 0
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


    public void volumeUpDown() {                // увеличение громкости / уменьшение громкости
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = currentVolume - 1;
        }
    }
}
