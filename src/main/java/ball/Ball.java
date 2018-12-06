package ball;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.FlowPane;
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
        MyAnimationTimer toUp = new MyAnimationTimer() {
            @Override
            public void move(int v) {
                ballPane.up(v);
            }
        };
        up.addEventHandler(MouseEvent.MOUSE_PRESSED, e -> toUp.start());
        up.addEventHandler(MouseEvent.MOUSE_RELEASED, e -> toUp.stop());

        Button down = new Button("down");
        MyAnimationTimer toDown = new MyAnimationTimer() {
            @Override
            public void move(int v) {
                ballPane.down(v);
            }
        };
        down.addEventHandler(MouseEvent.MOUSE_PRESSED, e -> toDown.start());
        down.addEventHandler(MouseEvent.MOUSE_RELEASED, e -> toDown.stop());

        Button left = new Button("left");
        MyAnimationTimer toLeft = new MyAnimationTimer() {
            @Override
            public void move(int v) {
                ballPane.left(v);
            }
        };
        left.addEventHandler(MouseEvent.MOUSE_PRESSED, e -> toLeft.start());
        left.addEventHandler(MouseEvent.MOUSE_RELEASED, e -> toLeft.stop());

        Button right = new Button("right");
        MyAnimationTimer toRight = new MyAnimationTimer() {
            @Override
            public void move(int v) {
                ballPane.right(v);
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

    }
}