package graphic;

public class GraphicsDemo {
    public static void main(String[] args) {

        Window window = new Window
                .WindowBuilder()
                .windowHeight(500)
                .windowWidth(700)
                .windowTitle("Paint v.2")
                .build();

        window.init();
        window.add(new GraphicArea());
        window.setVisible(true);
    }
}
