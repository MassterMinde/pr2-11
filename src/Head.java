public class Head {
    String hair="Коричневые";
    String eyes="Зеленые";
    int ears=1;

    public void setEars(int ears) {
        this.ears = ears;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public int getEars() {
        return ears;
    }

    public String getEyes() {
        return eyes;
    }

    public String getHair() {
        return hair;
    }

    @Override
    public String toString() {
        return "Голова:\n"+"Волосы: "+hair+"\nГлаза: "+eyes+"\nУши: "+getEars()+"\n";
    }
}
