public class Waterbottle {

    private int volume;

    public Waterbottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }

    public void drink(){
        this.volume -= 10;
    }

    public void empty(){
        this.volume = 0;
    }

    public void fill(){
        this.volume = 100;
    }
}
