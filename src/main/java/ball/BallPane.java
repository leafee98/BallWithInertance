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

    public void up() { this.up(1); }
    public void up(int v) {
        if (ball.getCenterY() - ball.getRadius() - v > 1) {
            ball.setCenterY(ball.getCenterY() - v);
        } else {
            ball.setCenterY(2 + ball.getRadius());
        }
    }
    public void down(int v) {
        if (ball.getCenterY() + ball.getRadius() + v < 300) {
            ball.setCenterY(ball.getCenterY() + v);
        } else {
            ball.setCenterY(299 - ball.getRadius());
        }
    }
    public void right(int v) {
        if (ball.getCenterX() + ball.getRadius() + v < 546) {
            ball.setCenterX(ball.getCenterX() + v);
        } else {
            ball.setCenterX(545 - ball.getRadius());
        }
    }
    public void left(int v) {
        if (ball.getCenterX() - ball.getRadius() - v > 14) {
            ball.setCenterX(ball.getCenterX() - v);
        } else {
            ball.setCenterX(15 + ball.getRadius());
        }
    }
}