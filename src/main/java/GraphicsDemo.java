import javax.swing.*;

public class GraphicsDemo {
    public static void main(String[] args) {

        Window window = new Window();

        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setTitle("Graphic editor v.1");

        window.add(new GraphicArea());
        window.setSize(500, 500);


        window.setVisible(true);

    }
}
