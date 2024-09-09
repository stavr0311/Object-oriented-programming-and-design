package ru.netologi;

import ru.netologi.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void testStationselection() {   //выбор радиостанции
        Radio radio = new Radio();


        radio.setCurrentRadioStation(6);

        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {    //следующая станция по счёту
        radio.setCurrentRadioStation(7);
        radio.next();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationAfterMin() {   //следующая станция после MIN.
        radio.setCurrentRadioStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {     //предыдущая станция по счёту.
        radio.setCurrentRadioStation(4);
        radio.prev();

        int expected = 3;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationAfterMax() {   //  следующая после 9 станции 0.
        radio.setCurrentRadioStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpTest() {      //прибавить громкость
        radio.setCurrentVolume(99);
        radio.volumeUpDown();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownTest() {      //убавить громкость
        radio.setCurrentVolume(100);
        radio.volumeUpDown();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void max() {   //  выбор станции больше максимального значения
        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void min() {   //  выбор станции меньше минимального значения
        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpMax() {   //прибавить громкость больше Max
        radio.setCurrentVolume(101);
        radio.volumeUpDown();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownMin() {   //убавить меньше Min
        radio.setCurrentVolume(0);
        radio.volumeUpDown();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}