package ball;

import javafx.animation.AnimationTimer;

public abstract class MyAnimationTimer extends AnimationTimer {
    private int v = 0;
    private int maxSpeed = 6;
    private boolean speedup = false;
    private long last = 0;
    @Override
    public void handle(long now) {
        if (now - last > 2e8) {
            if (speedup) {
                if (v < maxSpeed) {
                    v += 2;
                    System.out.println("Speed up " + v);
                }
            } else {
                --v;
                    System.out.println("Speed down " + v);
            }
            last = now;
        }

        if (v > 0) {
            this.move(v);
        } else {
            // take care of this super
            super.stop();
        }

        // if (speedup) {
        //     this.move((v < maxSpeed ? ++v : v));
        // } else {
        //     this.move(--v);
        //     if (v <= 0)
        //         // take care of this super
        //         super.stop();
        // }

    }
    public void start() {
        speedup = true;
        last = 0;
        // take care of this super
        super.start();
        System.out.println("button pressed");
    }
    public void stop() {
        speedup = false;
        System.out.println("button released");
    }
    public abstract void move(int v);
}