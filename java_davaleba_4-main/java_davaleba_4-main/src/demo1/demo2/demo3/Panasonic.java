package demo1.demo2.demo3;

public class Panasonic extends Simbian {
    String title;

    public Panasonic(String title){
        this.title=title;
    }

    @Override
    public String toString() {
        return title;
    }
}
