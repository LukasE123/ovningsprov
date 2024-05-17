public class Stats {

    protected int intelligens;
    protected int tålighet;
    protected int styrka;

    public int schack() {

        int total = (int) Math.floor(Math.random() * 15) + intelligens;

        if (total > 40) {
            return 40;

        } else {
            return total;
        }
    }

    public int brottning() {

        int total = (int) Math.floor(Math.random() * 15) + styrka + tålighet;

        if (total > 40) {
            return 40;

        } else {
            return total;
        }
    }

    public int brytaArm() {

        int total = (int) Math.floor(Math.random() * 15) + styrka;

        if (total > 40) {
            return 40;

        } else {
            return total;
        }
    }


    public int getIntelligens() {
        return intelligens;
    }

    public void setIntelligens(int intelligens) {
        this.intelligens = intelligens;
    }

    public int getTålighet() {
        return tålighet;
    }

    public void setTålighet(int tålighet) {
        this.tålighet = tålighet;
    }

    public int getStyrka() {
        return styrka;
    }

    public void setStyrka(int styrka) {
        this.styrka = styrka;
    }
}
