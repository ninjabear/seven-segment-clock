package clock.gui;

import clock.core.ClockTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {

    private ClockTimer ct;

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("7Clock");
        Group root = new Group();


        DigitalClock dc = new DigitalClock();
        ct = new ClockTimer();
        ct.start(dc);
        root.getChildren().add(dc);

        primaryStage.setScene(new Scene(root, 475, 150, Color.color(0.20,0.20,0.20)));
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        try {
            ct.stop();
        } finally {
            super.stop();
        }
    }

    public static void main(String[] args) {
        launch(args);

        /*
        Logger.log("Started!");

        final ClockTimer ct = new ClockTimer();
        ct.start(new ClockTimer.TimerEvent() {
            @Override
            public void timeGiven(SevenSegTime t) {
                Logger.log(t.toString());
            }
        });

        try {
            Thread.sleep(10000);
        } catch (InterruptedException x)
        {
             Logger.log(x);
        }

        ct.stop();

        Logger.log("Digit test..");

        for (int d = 0; d<=9; d++)
        {
            SevenSegDigit dig = new SevenSegDigit(d);
            String states = d+"; ";

            for (SevenSegDigit.ElState e : dig.getSegStates())
            {
                states += e.toString() + ", ";
            }

            states = states.replaceFirst(",\\s+$", "");

            Logger.log(states);
        }


        Logger.log("Finished!");
        */
    }
}
