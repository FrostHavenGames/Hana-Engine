package net.frosthaven.hana;

import static org.lwjgl.opengl.GL11.*;

public class Application {

    private final Window m_Window;
    private boolean m_Running = true;

    public Application() {
        m_Window = Window.create(new WindowProps());
    }

    public void run() {
        while (m_Running) {
            glClearColor(1, 0, 1, 1);
            glClear(GL_COLOR_BUFFER_BIT);
            m_Window.onUpdate();
        }
    }
}
