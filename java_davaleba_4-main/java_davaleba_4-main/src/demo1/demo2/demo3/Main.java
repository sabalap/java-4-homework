package demo1.demo2.demo3;

public class Main {
    public static void main(String[] args) {
        IphoneX iphoneX=new IphoneX("Iphone X +");
        SamsungNote samsungNote=new SamsungNote("Samsung note 10+");
        Panasonic panasonic = new Panasonic("Panasonic Eluga I7");
        Nokia nokia=new Nokia("Nokia Pro");


        iphoneX.printSmartphone();
        nokia.printSimbian();
        panasonic.printSimbian();
        samsungNote.printSmartphone();

    }
}
