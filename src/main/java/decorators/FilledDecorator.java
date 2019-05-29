package decorators;

import graphic.Figure;

import java.awt.*;

public class FilledDecorator implements IDecorator {

    @Override
    public void doDecorate(Figure target, Graphics g) {

        Graphics2D g2 = (Graphics2D)g;
        g2.setPaint(Color.RED);
        target.draw(g, true);
    }
}
