package graphic;

import javax.swing.*;

import lombok.Getter;

//@Builder
@Getter
public class Window extends JFrame {

    private String windowTitle;
    private int windowWidth;
    private int windowHeight;
    private String workingDirectory;

    public void init() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle(windowTitle);
        setSize(windowWidth, windowHeight);
    }

    public static class WindowBuilder {

        private Window instance = new Window();

        public WindowBuilder windowTitle(String windowTitle) {
            instance.windowTitle = windowTitle;
            return this;
        }

        public WindowBuilder windowWidth(int windowWidth) {
            instance.windowWidth = windowWidth;
            return this;
        }

        public WindowBuilder windowHeight(int windowHeight) {
            instance.windowHeight = windowHeight;
            return this;
        }

        public WindowBuilder workingDirectory(String workingDirectory) {
            instance.workingDirectory = workingDirectory;
            return this;
        }

        public Window build() {

            if (instance.workingDirectory == null) {
                throw new RuntimeException("Working directory is null!");
            }
            return instance;
        }
    }
}


