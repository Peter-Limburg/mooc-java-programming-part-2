public class Container {

    private int vol;

    public Container() {
        this.vol = vol;
    }

    public int contains() {
        return this.vol;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.vol += amount;
        }
        if (this.vol > 100) {
            this.vol = 100;
        }
    }

    public void remove(int amount) {
        if (amount > 0 && this.vol > 0) {
            this.vol -= amount;
        }
        if (this.vol < 0){
            this.vol = 0;
    }
}

@Override
    public String toString(){
        return this.vol + "/100";
    }

}

