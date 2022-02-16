package net.frosthaven.hana;

public abstract class Window {

    protected WindowData m_Data;
    protected long m_Window;

    public abstract int getWidth();
    public abstract int getHeight();
    public abstract void onUpdate();
    public abstract void setVSync(boolean enabled);
    public abstract boolean isVSync();

    public class WindowData {
        public String Title;
        public int Width, Height;
        public boolean VSync;
    }

    public static Window create(WindowProps props) {
        return null;
    }
}
