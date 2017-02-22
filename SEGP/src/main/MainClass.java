package main;
<<<<<<< HEAD:SEGP/src/main/SegpGroup3.java

import java.util.Properties;

import DataBase.History;
=======
import database.History_Managment;
>>>>>>> upstream/master:SEGP/src/main/MainClass.java
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import userInterface.Proxy;


/**
 *
 * @author Segp-Group 3
 */
public class MainClass extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("MainFXML.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("/stylesheet.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
<<<<<<< HEAD:SEGP/src/main/SegpGroup3.java

		// following three lines are for proxy settings
		Properties systemProperties = System.getProperties();
<<<<<<< HEAD:SEGP/src/segp3/SegpGroup3.java
    	systemProperties.setProperty("http.proxyHost","172.16.0.2");
    	systemProperties.setProperty("http.proxyPort","8080");
		History hs=new History();
		hs.CreateDataBase();
=======
		systemProperties.setProperty("http.proxyHost","172.16.0.2");
		systemProperties.setProperty("http.proxyPort","8080");
    	//systemProperties.setProperty("http.proxyHost","");
    	//systemProperties.setProperty("http.proxyPort","");
		

>>>>>>> f6e6b4db5773530aeeba81ecea499572a03b01ff:SEGP/src/main/SegpGroup3.java
=======
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("172.16.0.2", "8080");
		proxy.setHttpsProxy("172.16.0.2", "8080");
		

		// following three lines are for proxy settings
		History_Managment.CreateDataBase(); //if datbase is deleted then create new one
>>>>>>> upstream/master:SEGP/src/main/MainClass.java
		launch(args);
	}

}
