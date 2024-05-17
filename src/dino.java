public class dino extends Stats {
    public dino() {
        this.intelligens = (int) Math.floor((Math.random() * 20) + 1);
        this.tålighet = (int) Math.floor((Math.random() * 20) + 1);
        this.styrka = (int) Math.floor((Math.random() * 20) + 1);

    }
}