package application;

import java.io.*;
import java.net.*;
import java.util.Date;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class Server extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Text area for displaying contents
    TextArea ta = new TextArea();

    // Create a scene and place it in the stage
    Scene scene = new Scene(new ScrollPane(ta), 450, 200);
    primaryStage.setTitle("Server"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
    new Thread( () -> {
      try {
        // Create a server socket
        @SuppressWarnings("resource")
		ServerSocket serverSocket = new ServerSocket(8000);
        Platform.runLater(() ->
          ta.appendText("Server started at " + new Date() + '\n'));
  
        // Listen for a connection request
        Socket socket = serverSocket.accept();
  
        // Create data input and output streams
        DataInputStream inputFromClient = new DataInputStream(
          socket.getInputStream());
        DataOutputStream outputToClient = new DataOutputStream(
          socket.getOutputStream());
  
        while (true) {
          // Receive input from the client
          int num = inputFromClient.readInt();
  
          // Compute result
          int resultnumber = 0;
		switch (num) {
			case 0 :
				resultnumber = 0;
				break;
			case 1 :
				resultnumber = 14;
				break;
			case 2 :
				resultnumber = 11;
				break;
			case 3 :
				resultnumber = 11;
				break;
			case 4 :
				resultnumber = 11;
				break;
			case 5 :
				resultnumber = 10;
				break;
			case 6 :
				resultnumber = 8;
				break;
			case 7 :
				resultnumber = 7;
				break;
			case 8 :
				resultnumber = 7;
				break;
			case 9 :
				resultnumber = 7;
				break;
			case 10 :
				resultnumber = 7;
				break;
			case 11 :
				resultnumber = 7;
				break;
			case 12 :
				resultnumber = 7;
				break;
			case 13 :
				resultnumber = 7;
				break;
			case 14 :
				resultnumber = 7;
				break;
			case 15 :
				resultnumber = 5;
				break;
			case 16 :
				resultnumber = 5;
				break;
			case 17 :
				resultnumber = 5;
				break;
			case 18 :
				resultnumber = 5;
				break;
			case 19 :
				resultnumber = 4;
				break;
			case 20 :
				resultnumber = 4;
				break;
			}
		
          // Send result back to the client
		/**Sending more than one has unpredictable results
			 * so this part was scrapped.
			 */
		  //outputToClient.writeBoolean(iserror);
          //outputToClient.writeChars(resultletter);
          outputToClient.writeInt(resultnumber);
  
          Platform.runLater(() -> {
         //todo : use this if necessary
          });
        }
      }
      catch(IOException ex) {
        ex.printStackTrace();
      }
    }).start();
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}