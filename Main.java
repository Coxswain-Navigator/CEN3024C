package application;

import java.io.*;
import java.net.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

//Adam Hunt
	/**
	 * 7/28/2021
	 * Final assignment
	 * Demonstrates use of various java applcations
	 * For some reason, the modules are not detected in the modulepath and as such
	 * a generation of a javadoc is not possible.
	 */
public class Main extends Application {
  // IO streams
	/**
	 * The primary method through which the code is transmitted from the client to the server and vice versa.
	 */
  DataOutputStream toServer = null;
  DataInputStream fromServer = null;

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Panel p to hold the label and text field
	  /**
	   * Sets up the UI
	   */
    BorderPane paneForTextField = new BorderPane();
    paneForTextField.setPadding(new Insets(5, 5, 5, 5)); 
    paneForTextField.setStyle("-fx-border-color: green");
    paneForTextField.setLeft(new Label("Enter a number between 1 and 30: "));
    
    TextField tf = new TextField();
    tf.setAlignment(Pos.BOTTOM_RIGHT);
    paneForTextField.setCenter(tf);
    
    BorderPane mainPane = new BorderPane();
    // Text area to display contents
    TextArea ta = new TextArea();
    mainPane.setCenter(new ScrollPane(ta));
    mainPane.setTop(paneForTextField);
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(mainPane, 450, 200);
    primaryStage.setTitle("Client"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
    tf.setOnAction(e -> {
      try {
        // Get the number from the text field
        int num = Integer.parseInt(tf.getText().trim());
		
  
        // Send the request to the server
        /**
         * Sends the num value input by the user to the server for processing
         */
        toServer.writeInt(num);
        toServer.flush();
  
        // Get result from the server
        /**
         * Reads the result sent from the server. Originally intended to recieve
         * multiple values but scrapped due to issues.
         * @param num is the number typed in by the user.
         */
        int resultnumber = fromServer.readInt();
		//char resultletter = fromServer.readChar();
        String resultletter = "error";
        switch (num) {
		case 0 :
			resultletter = "error"; 
			break;
		case 1 :
			resultletter = "door"; 
			break;
		case 2 :
			resultletter = "chamber";
			break;
		case 3 :
			resultletter = "raven";
			break;
		case 4 :
			resultletter = "nevermore";
			break;
		case 5 :
			resultletter = "bird";
			break;
		case 6 :
			resultletter = "lenore";
			break;
		case 7 :
			resultletter = "nothing";
			break;
		case 8 :
			resultletter = "still";
			break;
		case 9 :
			resultletter = "soul";
			break;
		case 10 :
			resultletter = "said";
			break;
		case 11 :
			resultletter = "thy";
			break;
		case 12 :
			resultletter = "bust";
			break;
		case 13 :
			resultletter = "upon";
			break;
		case 14 :
			resultletter = "tapping";
			break;
		case 15 :
			resultletter = "name";
			break;
		case 16 :
			resultletter = "word";
			break;
		case 17 :
			resultletter = "tell";
			break;
		case 18 :
			resultletter = "quoth";
			break;
		case 19 :
			resultletter = "one";
			break;
		case 20 :
			resultletter = "floor";
			break;
		}
        // Display to the text area
        /**
         * Sends the result to the UI. Also checks whether or not the process was successful.
         * @return The number of times the word appears in the poem
         */
		if (resultletter.equals("error")) {
			ta.appendText("Value outside 1-30. "); }
      else {
    	  
    	  ta.appendText(resultletter + " appears in the poem " + resultnumber + " times. ");
      }
      }
      
      catch (IOException ex) {
        System.err.println(ex);
      }
    });
  
    try {
      // Create a socket to connect to the server
      @SuppressWarnings("resource")
	Socket socket = new Socket("localhost", 8000);
      
      // Create an input stream to receive data from the server
      fromServer = new DataInputStream(socket.getInputStream());

      // Create an output stream to send data to the server
      toServer = new DataOutputStream(socket.getOutputStream());
    }
    catch (IOException ex) {
      ta.appendText(ex.toString() + '\n');
    }
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
