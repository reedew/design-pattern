package client;

import itfc.Image;
import proxy.ProxyImage;

public class Client {
    public static void main(String[] args) {
        Image image = new ProxyImage("彼岸花.jpg");
        image.display();
        System.out.println();
        image.display();
    }
}
