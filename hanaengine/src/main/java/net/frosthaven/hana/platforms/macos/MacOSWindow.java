package net.frosthaven.hana.platforms.macos;

import net.frosthaven.hana.Window;
import net.frosthaven.hana.WindowProps;

public class MacOSWindow extends Window {

    @Override
    public int getWidth() {
        return m_Data.Width;
    }

    @Override
    public int getHeight() {
        return m_Data.Height;
    }

    @Override
    public void onUpdate() {

    }

    @Override
    public void setVSync(boolean enabled) {

    }

    @Override
    public boolean isVSync() {
        return false;
    }

    private void init(WindowProps props) { }

    private void shutdown() { }
}
