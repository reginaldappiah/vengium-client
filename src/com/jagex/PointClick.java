package com.jagex;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by Krimsonowl on 3/19/2017.
 */
public class PointClick extends Application {
    Pane pane = new Pane();


    public void start(Stage primaryStage) {

    	System.out.println("STARTED!");
    	
        pane.setOnMouseClicked(event -> {
            double x = event.getX();
            double y = event.getY();

            if (event.getButton().toString().contains("PRIMARY")) {

                Circle c = drawPoint(x,y);
                pane.getChildren().add(c);
            } else {
                removePoint(x,y);
            }
        });

        Scene scene = new Scene(pane, 400, 200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Point Click");
        primaryStage.show();

    }


    private Circle drawPoint(double x, double y) {
        Circle circle = new Circle(x, y, 5, Color.WHITE);
        circle.setStroke(Color.BLACK);
        return circle;
    }

    private void removePoint(double x, double y) {
        ObservableList<Node> list = pane.getChildren();
        for (int i = list.size() - 1; i >= 0; i--) {
            Node circle = list.get(i);
            if (circle.contains(x,y)) {
                pane.getChildren().remove(circle);
                break;
            }
        }
    }
	public static void main(String[] args) {
		Application.launch(args);
	}

}
