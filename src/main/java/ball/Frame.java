package ball;

import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

class Frame extends StackPane {
    public Frame() {
        super(new Rectangle(534, 302, Color.BLACK),
                new Rectangle(532, 300, Color.WHITE));
        // Rectangle rec = new Rectangle(532, 300, Color.WHITE);
        // Rectangle frame = new Rectangle(534, 302, Color.BLACK);
    }
}