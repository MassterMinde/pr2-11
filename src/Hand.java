public class Hand {
    String nails="Короткие";
    int fingers=4;
    int hadns=2;

    public void setFingers(int fingers) {
        this.fingers = fingers;
    }

    public void setHadns(int hadns) {
        this.hadns = hadns;
    }

    public void setNails(String nails) {
        this.nails = nails;
    }

    public int getFingers() {
        return fingers;
    }

    public int getHadns() {
        return hadns;
    }

    public String getNails() {
        return nails;
    }

    @Override
    public String toString() {
        return "Руки:\n"+"Кол-во: "+getHadns()+"\nПальцы: "+getFingers()+"\nНогти: "+nails+"\n";
    }
}
