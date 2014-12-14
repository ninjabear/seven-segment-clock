package clock.gui;

import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.EllipseBuilder;

public class Dot extends Parent {

    public Dot()
    {

         Ellipse circle = EllipseBuilder.create()
            .centerX(0)
            .centerY(0)
            .radiusX(5)
            .radiusY(5)
            .strokeWidth(0.5)
            .stroke(Color.color(0d,0d,0d,0.3d))
            .fill(Color.RED)
            .build();

        super.getChildren().add(circle);
    }

}
