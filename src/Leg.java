public class Leg {
    String knee = "Поломанное";
    int LegSize = 45;
    int fingers = 10;

    public void setFingers(int fingers) {
        this.fingers = fingers;
    }

    public void setKnee(String knee) {
        this.knee = knee;
    }

    public void setLegSize(int legSize) {
        this.LegSize = LegSize;
    }

    public int getfingers() {
        return fingers;
    }

    public int getLegSize() {
        return LegSize;
    }

    public String getKnee() {
        return knee;
    }

    @Override
    public String toString() {
        return "Ноги: " + "\n" + "Кол-во пальцев: " + getfingers() + "\n" + "Размер ноги: " + getLegSize() + "\n" + "Состояние колена: " + getKnee() + "\n";
    }
}
