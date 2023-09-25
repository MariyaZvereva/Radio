import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class RadioTest {

     @Test
     public void Station1() {

         Radio radio = new Radio();

         radio.setCurrentStation(-1);

         int expected = 0;
         int actual = radio.getCurrentStation();

         Assertions.assertEquals(expected, actual);

     }

     @Test
     public void Station2() {

         Radio radio = new Radio();
         radio.setCurrentStation(6);

         radio.setCurrentStation(0);

         int expected = 0;
         int actual = radio.getCurrentStation();

         Assertions.assertEquals(expected, actual);

     }

     @Test
     public void Station3() {

         Radio radio = new Radio();

         radio.setCurrentStation(1);

         int expected = 1;
         int actual = radio.getCurrentStation();

         Assertions.assertEquals(expected, actual);

     }

     @Test
     public void Station4() {

         Radio radio = new Radio();

         radio.setCurrentStation(8);

         int expected = 8;
         int actual = radio.getCurrentStation();

         Assertions.assertEquals(expected, actual);

     }

     @Test
     public void Station5() {

         Radio radio = new Radio();

         radio.setCurrentStation(9);

         int expected = 9;
         int actual = radio.getCurrentStation();

         Assertions.assertEquals(expected, actual);

     }

     @Test
     public void Station6() {

         Radio radio = new Radio();


         radio.setCurrentStation(10);

         int expected = 0;
         int actual = radio.getCurrentStation();

         Assertions.assertEquals(expected, actual);

     }

     @Test
     public void Stationprev() {

         Radio radio = new Radio();

         radio.setCurrentStation(0);
         radio.prev();

         int expected = 9;
         int actual = radio.getCurrentStation();

         Assertions.assertEquals(expected, actual);

     }

     @Test
     public void Stationnext() {

         Radio radio = new Radio();

         radio.setCurrentStation(9);
         radio.next();

         int expected = 0;
         int actual = radio.getCurrentStation();

         Assertions.assertEquals(expected, actual);

     }

     @Test
     public void Volume() {

         Radio radio = new Radio();

         radio.setCurrentVolume(10);


         int expected = 10;
         int actual = radio.getCurrentVolume();

         Assertions.assertEquals(expected, actual);

     }

     @Test
     public void VolumePlus() {

         Radio radio = new Radio();

         radio.setCurrentVolume(9);
         radio.increaseVolume();


         int expected = 10;
         int actual = radio.getCurrentVolume();

         Assertions.assertEquals(expected, actual);

     }

     @Test
     public void VolumeMinus() {

         Radio radio = new Radio();

         radio.setCurrentVolume(9);
         radio.reduceVolume();


         int expected = 8;
         int actual = radio.getCurrentVolume();

         Assertions.assertEquals(expected, actual);

     }
}