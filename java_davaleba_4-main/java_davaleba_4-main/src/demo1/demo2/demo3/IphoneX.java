package demo1.demo2.demo3;

public class IphoneX extends Smartphone  {
    String title;

    public  IphoneX(String title){
        this.title=title;
    }


    @Override
    public String toString() {
        return title;
    }
}
