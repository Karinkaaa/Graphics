package decorators;

import graphic.Figure;

import java.awt.*;

public interface IDecorator {
    void doDecorate(Figure target, Graphics g);
}
