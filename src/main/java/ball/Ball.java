package ball;

import javafx.application.Application;
import javafx.animation.AnimationTimer;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;

public class Ball extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        BallPane ballPane = new BallPane();
        Frame frame = new Frame();
        StackPane sp = new StackPane(frame, ballPane);

        // =================
        // four buttons
        Button up = new Button("up");
        AnimationTimer toUp = new AnimationTimer() {
            @Override
            public void handle(long now) {
                ballPane.up();
            }
        };
        up.addEventHandler(MouseEvent.MOUSE_PRESSED, e -> toUp.start());
        up.addEventHandler(MouseEvent.MOUSE_RELEASED, e -> toUp.stop());

        Button down = new Button("down");
        AnimationTimer toDown = new AnimationTimer() {
            @Override
            public void handle(long now) {
                ballPane.down();
            }
        };
        down.addEventHandler(MouseEvent.MOUSE_PRESSED, e -> toDown.start());
        down.addEventHandler(MouseEvent.MOUSE_RELEASED, e -> toDown.stop());

        Button left = new Button("left");
        AnimationTimer toLeft = new AnimationTimer() {
            @Override
            public void handle(long now) {
                ballPane.left();
            }
        };
        left.addEventHandler(MouseEvent.MOUSE_PRESSED, e -> toLeft.start());
        left.addEventHandler(MouseEvent.MOUSE_RELEASED, e -> toLeft.stop());

        Button right = new Button("right");
        AnimationTimer toRight = new AnimationTimer() {
            @Override
            public void handle(long now) {
                ballPane.right();
            }
        };
        right.addEventHandler(MouseEvent.MOUSE_PRESSED, e -> toRight.start());
        right.addEventHandler(MouseEvent.MOUSE_RELEASED, e -> toRight.stop());

        // button's pane
        FlowPane fp = new FlowPane(up, down, left, right);
        fp.setAlignment(Pos.CENTER);

        // main pane
        VBox vbox = new VBox(sp, fp);
        vbox.setSpacing(6);

        Scene scene = new Scene(vbox, 560, 340);
        stage.setScene(scene);
        stage.setTitle("Move The Ball  -- Leafee");
        stage.setResizable(false);
        stage.show();

        // debug
    }
}


// =============================================================
// class BallPane
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



// ============================================================
// class Frame
class Frame extends StackPane {
    public Frame() {
        super(new Rectangle(534, 302, Color.BLACK),
                new Rectangle(532, 300, Color.WHITE));
        // Rectangle rec = new Rectangle(532, 300, Color.WHITE);
        // Rectangle frame = new Rectangle(534, 302, Color.BLACK);
    }
}