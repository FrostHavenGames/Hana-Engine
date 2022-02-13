package net.frosthaven.hana;

public class EntryPoint {

    public static void main(String[] args) {
        Log.init();
        Log.getCoreLogger().warn("Initialized Logger!");

        Application app = new Application();
        app.run();
    }
}
