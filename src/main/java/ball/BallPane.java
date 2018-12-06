package ball;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

class BallPane extends Pane {
    private Circle ball = new Circle(30, Color.rgb(236, 144, 144));
    public BallPane() {
        this.getChildren().add(ball);
        ball.setCenterY(151);
        ball.setCenterX(266);
    }

    public void up() {
        if (ball.getCenterY() - ball.getRadius() > 1) {
            ball.setCenterY(ball.getCenterY() - 2);
        }
    }
    public void down() {
        if (ball.getCenterY() + ball.getRadius() < 300)
            ball.setCenterY(ball.getCenterY() + 2);
    }
    public void right() {
        if (ball.getCenterX() + ball.getRadius() < 546)
            ball.setCenterX(ball.getCenterX() + 2);
    }
    public void left() {
        if (ball.getCenterX() - ball.getRadius() > 14)
            ball.setCenterX(ball.getCenterX() - 2);
    }
}