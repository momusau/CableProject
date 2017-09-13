/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cablecostcalculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button; 
import javafx.scene.input.KeyEvent;


/**
 *
 * @author momusau
 */
public class CableCostCalculator extends Application {
    
    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Cable Cost Calculator");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Scene scene = new Scene(grid, 500, 375);
        primaryStage.setScene(scene);
        
        
        Text scenetitle = new Text("Build Quality!");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
        grid.add(scenetitle, 0, 0, 1, 1);
        
        Label cableCostPerBox = new Label("Cost per foot of cable:");
        grid.add(cableCostPerBox, 0, 1);
        
       
        
        TextField cableCostField = new TextField();
        grid.add(cableCostField, 0, 2);
        
        Label desiredLengthBox = new Label("Final cable length:");
        grid.add(desiredLengthBox, 1, 1);
        
            cableCostField.setOnAction(new EventHandler<ActionEvent>(){
                public void handle(ActionEvent event){
                    String cableCostString = cableCostField.getText();
                    System.out.println(cableCostString);                   
                }
        });
        
        TextField desiredLengthField = new TextField();
        grid.add(desiredLengthField, 1, 2);
        
        Label numberOfCablesBox = new Label("How many cables:");
        grid.add(numberOfCablesBox, 2, 1);
    
        TextField numberOfCablesField = new TextField();
        grid.add(numberOfCablesField, 2, 2);
        
            desiredLengthField.setOnAction(new EventHandler<ActionEvent>(){
                public void handle(ActionEvent event){
                    String desiredLengthString = desiredLengthField.getText();                  
            }
        });
        
        Label connectorOneCostBox = new Label("Cost of first connector:");
        grid.add(connectorOneCostBox, 0, 3);        
        
        TextField connectorOneCostField = new TextField();
        grid.add(connectorOneCostField, 0, 4);
        
             connectorOneCostField.setOnAction(new EventHandler<ActionEvent>(){
                public void handle(ActionEvent event){
                    String connectorOneCostString = connectorOneCostField.getText();                  
                }
            });
        
        Label connectorOneQuantityBox = new Label("How many first conn: ");
        grid.add(connectorOneQuantityBox, 1, 3);
        
        TextField connectorOneQuantityField = new TextField();
        grid.add(connectorOneQuantityField, 1, 4);
        
            connectorOneQuantityField.setOnAction(new EventHandler<ActionEvent>(){
                public void handle(ActionEvent event){
                    String connectorOneQuantityString = connectorOneQuantityField.getText();                  
                }
            });
        
        Label connectorTwoCostBox = new Label("Cost of second conn:"); 
        grid.add(connectorTwoCostBox, 2, 3);
        
        TextField connectorTwoCostField = new TextField();
        grid.add(connectorTwoCostField, 2, 4);
        
            connectorTwoCostField.setOnAction(new EventHandler<ActionEvent>(){
                public void handle(ActionEvent event){
                    String connectorTwoCostString = connectorTwoCostField.getText();                  
                }
            });
        
        Label connectorTwoQuantityBox = new Label("How many second conn:"); 
        grid.add(connectorTwoQuantityBox, 0, 5);
        
        TextField connectorTwoQuantityField = new TextField();
        grid.add(connectorTwoQuantityField, 0, 6);
        
            connectorTwoQuantityField.setOnAction(new EventHandler<ActionEvent>(){
                public void handle(ActionEvent event){
                    String connectorTwoQuantityString = connectorTwoQuantityField.getText();                  
                }
            });
        
        Label sellPriceBox = new Label("Estimated sell price:"); 
        grid.add(sellPriceBox, 1, 5);
        
        TextField sellPriceField = new TextField();
        grid.add(sellPriceField, 1, 6);
        
        sellPriceField.setOnAction(new EventHandler<ActionEvent>(){
                public void handle(ActionEvent event){
                    String sellPriceString = sellPriceField.getText();                  
                }
            });
        
        Label totalBox = new Label("Estimated total"); 
        grid.add(totalBox, 0, 7);
        
        TextField totalField = new TextField();
        grid.add(totalField, 0, 8);
        
            totalField.setOnAction(new EventHandler<ActionEvent>(){
                public void handle(ActionEvent event){
                    String totalFieldString = totalField.getText();                  
                }
            });
        
        Label revenueBox = new Label("Estimated revenue"); 
        grid.add(revenueBox, 1, 7);
        
        TextField revenueField = new TextField();
        grid.add(revenueField, 1, 8);
        
        revenueField.setOnAction(new EventHandler<ActionEvent>(){
                public void handle(ActionEvent event){
                    String revenueFieldString = revenueField.getText();                  
                }
            });
        
        Button calculateButton = new Button("Calculate");
        calculateButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        grid.add(calculateButton, 2, 5, 2, 6);
        
        calculateButton.setOnAction(new EventHandler<ActionEvent>(){
        
            public void handle(ActionEvent event){
                System.out.println("HelloWorld");
            }
        
        
        });
        
        
        
        
        
        
    
    primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
