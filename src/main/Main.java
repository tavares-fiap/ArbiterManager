package main;

import Controller.Manager_Controller;
import View.Splash_GUI;

public class Main {
    
    
    public static Manager_Controller manager = new Manager_Controller();
    
    public static void main(String[] args) {
        new Splash_GUI().setVisible(true);
    }
    
}
