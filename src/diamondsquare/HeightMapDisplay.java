package diamondsquare;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Takes the map created by the DSAlgorithm and displays it
 *
 * @author Anthony
 */
public class HeightMapDisplay extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane leftpane = new GridPane(); 
        leftpane.setAlignment(Pos.CENTER);
        // Set up some padding around the edges of the grid,
        // top, right, bottom, left - number of pixels
        leftpane.setPadding(new Insets(15, 15, 15, 15));
        // Set up the horizontal and vertical spacing between 
        // the rows and columns of the grid
        leftpane.setHgap(10);
        leftpane.setVgap(10);    
        // Create labels and text fields and place them into the grid layout
        //textfields
        TextField a = new TextField();
        a.setText("-100"); //set placeholder text
        a.setPrefWidth(70); //set prefered width
        TextField b = new TextField();
        b.setText("100"); //set placeholder text
        b.setPrefWidth(70); //set prefered width
        TextField h = new TextField();
        h.setText(".85"); //set placeholder text
        h.setPrefWidth(70); //set prefered width
        TextField i = new TextField();
        i.setText("7"); //set placeholder text
        i.setPrefWidth(70); //set prefered width
        TextField pixel = new TextField();
        pixel.setText("7"); //set placeholder text
        pixel.setPrefWidth(70); //set prefered width
        TextField s1 = new TextField();
        s1.setText("126"); //set placeholder text
        s1.setPrefWidth(70); //set prefered width
        TextField s2 = new TextField();
        s2.setText("126"); //set placeholder text
        s2.setPrefWidth(70); //set prefered width
        TextField s3 = new TextField();
        s3.setText("126"); //set placeholder text
        s3.setPrefWidth(70); //set prefered width
        TextField s4 = new TextField();
        s4.setText("126"); //set placeholder text
        s4.setPrefWidth(70); //set prefered width
        
        TextField Gs1 = new TextField();
        Gs1.setText("126"); //set placeholder text
        Gs1.setPrefWidth(70); //set prefered width
        TextField Gs2 = new TextField();
        Gs2.setText("126"); //set placeholder text
        Gs2.setPrefWidth(70); //set prefered width
        TextField Gs3 = new TextField();
        Gs3.setText("126"); //set placeholder text
        Gs3.setPrefWidth(70); //set prefered width
        TextField Gs4 = new TextField();
        Gs4.setText("126"); //set placeholder text
        Gs4.setPrefWidth(70); //set prefered width
        
        TextField Bs1 = new TextField();
        Bs1.setText("126"); //set placeholder text
        Bs1.setPrefWidth(70); //set prefered width
        TextField Bs2 = new TextField();
        Bs2.setText("126"); //set placeholder text
        Bs2.setPrefWidth(70); //set prefered width
        TextField Bs3 = new TextField();
        Bs3.setText("126"); //set placeholder text
        Bs3.setPrefWidth(70); //set prefered width
        TextField Bs4 = new TextField();
        Bs4.setText("126"); //set placeholder text
        Bs4.setPrefWidth(70); //set prefered width
        
        Button create = new Button("Create");
        create.setPrefWidth(70); //set prefered width
        
        // Parameters to the add routine are: component, column, row
        leftpane.add(new Label("A: Min Range"), 0, 0);
        leftpane.add(a, 1, 0);
        leftpane.add(new Label("B: Max Range"), 0, 1); 
        leftpane.add(b, 1, 1);
        leftpane.add(new Label("H: Decay (0 - 1)"), 0, 2);
        leftpane.add(h, 1, 2);
        leftpane.add(new Label("EXP: (1 - 8)"), 0, 3);
        leftpane.add(i, 1, 3);
        leftpane.add(new Label("Pixelsize: "), 0, 4);
        leftpane.add(pixel, 1, 4);
        
        leftpane.add(new Label("Red"), 4, 0); 
        leftpane.add(new Label("Seed 1: (0 - 255)"), 4, 1); 
        leftpane.add(s1, 5, 1);
        leftpane.add(new Label("Seed 2: (0 - 255)"), 4, 2);
        leftpane.add(s2, 5, 2);
        leftpane.add(new Label("Seed 3: (0 - 255)"), 4, 3);
        leftpane.add(s3, 5, 3);
        leftpane.add(new Label("Seed 4: (0 - 255)"), 4, 4);
        leftpane.add(s4, 5, 4);
        
        leftpane.add(new Label("Green"), 6, 0); 
        leftpane.add(new Label("Seed 1: (0 - 255)"), 6, 1); 
        leftpane.add(Gs1, 7, 1);
        leftpane.add(new Label("Seed 2: (0 - 255)"), 6, 2);
        leftpane.add(Gs2, 7, 2);
        leftpane.add(new Label("Seed 3: (0 - 255)"), 6, 3);
        leftpane.add(Gs3, 7, 3);
        leftpane.add(new Label("Seed 4: (0 - 255)"), 6, 4);
        leftpane.add(Gs4, 7, 4);
        
        leftpane.add(new Label("Blue"), 8, 0); 
        leftpane.add(new Label("Seed 1: (0 - 255)"), 8, 1); 
        leftpane.add(Bs1, 9, 1);
        leftpane.add(new Label("Seed 2: (0 - 255)"), 8, 2);
        leftpane.add(Bs2, 9, 2);
        leftpane.add(new Label("Seed 3: (0 - 255)"), 8, 3);
        leftpane.add(Bs3, 9, 3);
        leftpane.add(new Label("Seed 4: (0 - 255)"), 8, 4);
        leftpane.add(Bs4, 9, 4);
        
        leftpane.add(create, 5, 5);
        
        create.setOnAction(e -> {
            switch (Integer.parseInt(i.getText())) {
                case 1:
                    if (Integer.parseInt(pixel.getText()) < 55) //if below the proper range...
                        pixel.setText("55");
                    break;
                case 2:
                    if (Integer.parseInt(pixel.getText()) < 33) //if below the proper range...
                        pixel.setText("33");
                    break;
                case 3:
                    if (Integer.parseInt(pixel.getText()) < 20) //if below the proper range...
                        pixel.setText("20");
                    break;
                case 4:
                    if (Integer.parseInt(pixel.getText()) < 10) //if below the proper range...
                        pixel.setText("10");
                    break;
                case 5:
                    if (Integer.parseInt(pixel.getText()) < 5) //if below the proper range...
                        pixel.setText("5");
                    break;
                case 6:
                    if (Integer.parseInt(pixel.getText()) < 4) //if below the proper range...
                        pixel.setText("4");
                    break;
                case 7:
                    if (Integer.parseInt(pixel.getText()) < 2) //if below the proper range...
                        pixel.setText("2");
                    break;
                default:
                    i.setText("1");
                    break;
            }
            
            if (Double.parseDouble(s1.getText()) < 0) //if below the proper range...
                        s1.setText("0");
            if (Double.parseDouble(s1.getText()) > 255) //if below the proper range...
                        s1.setText("255");
            if (Double.parseDouble(s2.getText()) < 0) //if below the proper range...
                        s2.setText("0");
            if (Double.parseDouble(s2.getText()) > 255) //if below the proper range...
                        s2.setText("255");
            if (Double.parseDouble(s3.getText()) < 0) //if below the proper range...
                        s3.setText("0");
            if (Double.parseDouble(s3.getText()) > 255) //if below the proper range...
                        s3.setText("255");
            if (Double.parseDouble(s4.getText()) < 0) //if below the proper range...
                        s4.setText("0");
            if (Double.parseDouble(s4.getText()) > 255) //if below the proper range...
                        s4.setText("255");
            
            if (Double.parseDouble(Gs1.getText()) < 0) //if below the proper range...
                        Gs1.setText("0");
            if (Double.parseDouble(Gs1.getText()) > 255) //if below the proper range...
                        Gs1.setText("255");
            if (Double.parseDouble(Gs2.getText()) < 0) //if below the proper range...
                        Gs2.setText("0");
            if (Double.parseDouble(Gs2.getText()) > 255) //if below the proper range...
                        Gs2.setText("255");
            if (Double.parseDouble(Gs3.getText()) < 0) //if below the proper range...
                        Gs3.setText("0");
            if (Double.parseDouble(Gs3.getText()) > 255) //if below the proper range...
                        Gs3.setText("255");
            if (Double.parseDouble(Gs4.getText()) < 0) //if below the proper range...
                        Gs4.setText("0");
            if (Double.parseDouble(Gs4.getText()) > 255) //if below the proper range...
                        Gs4.setText("255");
            
            if (Double.parseDouble(Bs1.getText()) < 0) //if below the proper range...
                        Bs1.setText("0");
            if (Double.parseDouble(Bs1.getText()) > 255) //if below the proper range...
                        Bs1.setText("255");
            if (Double.parseDouble(Bs2.getText()) < 0) //if below the proper range...
                        Bs2.setText("0");
            if (Double.parseDouble(Bs2.getText()) > 255) //if below the proper range...
                        Bs2.setText("255");
            if (Double.parseDouble(Bs3.getText()) < 0) //if below the proper range...
                        Bs3.setText("0");
            if (Double.parseDouble(Bs3.getText()) > 255) //if below the proper range...
                        Bs3.setText("255");
            if (Double.parseDouble(Bs4.getText()) < 0) //if below the proper range...
                        Bs4.setText("0");
            if (Double.parseDouble(Bs4.getText()) > 255) //if below the proper range...
                        Bs4.setText("255");
            
            if (Double.parseDouble(h.getText()) < 0) //if below the proper range...
                        h.setText("0");
            if (Double.parseDouble(h.getText()) > 1) //if below the proper range...
                        h.setText("1");
            if (Integer.parseInt(i.getText()) < 1) //if below the proper range...
                        i.setText("1");
            if (Integer.parseInt(i.getText()) > 7) //if below the proper range...
                        i.setText("7");
            
            
            DSAlgorithm red = new DSAlgorithm(Integer.parseInt(a.getText()), Integer.parseInt(b.getText()), Double.parseDouble(h.getText()), Integer.parseInt(i.getText()), Integer.parseInt(pixel.getText()), Double.parseDouble(s1.getText()), Double.parseDouble(s2.getText()), Double.parseDouble(s3.getText()), Double.parseDouble(s4.getText())); //create the map to display
            DSAlgorithm green = new DSAlgorithm(Integer.parseInt(a.getText()), Integer.parseInt(b.getText()), Double.parseDouble(h.getText()), Integer.parseInt(i.getText()), Integer.parseInt(pixel.getText()), Double.parseDouble(Gs1.getText()), Double.parseDouble(Gs2.getText()), Double.parseDouble(Gs3.getText()), Double.parseDouble(Gs4.getText())); //create the map to display
            DSAlgorithm blue = new DSAlgorithm(Integer.parseInt(a.getText()), Integer.parseInt(b.getText()), Double.parseDouble(h.getText()), Integer.parseInt(i.getText()), Integer.parseInt(pixel.getText()), Double.parseDouble(Bs1.getText()), Double.parseDouble(Bs2.getText()), Double.parseDouble(Bs3.getText()), Double.parseDouble(Bs4.getText())); //create the map to display

//DSAlgorithm(int a, int b, double h, int i, int pixelsize, double seed1, double seed2, double seed3, double seed4)
            createMap(red, green, blue); //display the map
        });
        
        Scene scene = new Scene(leftpane);
        
        primaryStage.setTitle("Settings");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public void createMap(DSAlgorithm dsa, DSAlgorithm green, DSAlgorithm blue) {
        Stage primaryStage = new Stage();
        
        FlowPane pane = new FlowPane(); //pane to add all of the pixels to
        pane.setPrefWrapLength(dsa.getMAPSIZE() * dsa.getPIXELSIZE()); //set the size of each wrapped region
        //pane.setPrefWidth(MAPSIZE * PIXELSIZE); //set the size of each wrapped region
        //pane.setMinWidth(MAPSIZE * PIXELSIZE); //set the size of each wrapped region
        pane.setMaxWidth(dsa.getMAPSIZE() * dsa.getPIXELSIZE()); //set the size of each wrapped region

        dsa.fillMap(0, (dsa.getMAPSIZE() - 1), 0, (dsa.getMAPSIZE() - 1), dsa.getA(), dsa.getB()); //fill the map with heights
        dsa.colorCorrect(); //fix bounding errors for the Color Class
        green.fillMap(0, (dsa.getMAPSIZE() - 1), 0, (dsa.getMAPSIZE() - 1), dsa.getA(), dsa.getB()); //fill the map with heights
        green.colorCorrect(); //fix bounding errors for the Color Class
        blue.fillMap(0, (dsa.getMAPSIZE() - 1), 0, (dsa.getMAPSIZE() - 1), dsa.getA(), dsa.getB()); //fill the map with heights
        blue.colorCorrect(); //fix bounding errors for the Color Class
        
        //add the values of the map to the screen
        for (int r = 0; r < dsa.getMAPSIZE(); r++) {
            for (int c = 0; c < dsa.getMAPSIZE(); c++) {
                Rectangle sq = new Rectangle(dsa.getPIXELSIZE(), dsa.getPIXELSIZE()); //rectangle of PIXELSIZE^2
                sq.setFill(Color.rgb((int)(dsa.getMap()[r][c]), (int)(green.getMap()[r][c]), (int)(blue.getMap()[r][c]))); //set the color to the map value
                pane.getChildren().add(sq);
            }
        }
        
        Scene scene = new Scene(pane); //create a window large enough to hold the map

        primaryStage.setTitle("Diamond-Square Height Map");
        primaryStage.setScene(scene);
        //primaryStage.setResizable(false);
        primaryStage.show();
    }
}