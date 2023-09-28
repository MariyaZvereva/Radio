
public class Radio {
    private int currentStation;
    private int currentVolume;


    public void next() {
        if (currentStation != 9) {
            currentStation++;
            return;
        }
        else  {
            currentStation = 0;

        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
            return;
        }
        else {
            currentStation = 9;
        }
    }


    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume - 1;
        }
    }

}
