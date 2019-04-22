package org.demo;

import org.demo.app.Application;
import org.demo.factories.GUIFactory;
import org.demo.factories.MacOSFactory;
import org.demo.factories.WindowsFactory;


public class AbstractFactoryApplication {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}