package net.frosthaven.hana;

public class WindowProps {

    public String Title;
    public int Width;
    public int Height;

    public WindowProps() {
        this.Title = "Hana Engine";
        this.Width = 960;
        this.Height = 540;
    }

    public WindowProps(String title, int width, int height) {
        this.Title = title;
        this.Width = width;
        this.Height = height;
    }
}
