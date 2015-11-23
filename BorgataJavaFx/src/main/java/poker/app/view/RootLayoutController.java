package poker.app.view;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import enums.eGame;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.stage.FileChooser;
import poker.app.MainApp;

/**
 * The controller for the root layout. The root layout provides the basic
 * application layout containing a menu bar and space where other JavaFX
 * elements can be placed.
 * 
 * @author Marco Jakob
 */
public class RootLayoutController implements Initializable {

    // Reference to the main application
    private MainApp mainApp;

    @FXML
    private Menu mnuGame;
    
    @FXML
    public RadioMenuItem FiveCardJoker;
    @FXML
    public RadioMenuItem FiveCardWild;
    @FXML
    public RadioMenuItem FiveCardDraw;
    @FXML
    public RadioMenuItem SevenCardDraw;
    @FXML
    public RadioMenuItem TexasHoldem;
    @FXML
    public RadioMenuItem OmahaHoldem;
    @FXML
    private RadioMenuItem Close;
    
	public void GameSelect(){
	    	
	    	if (FiveCardJoker.isSelected()){
	    		this.mainApp.setiGameType(eGame.FiveStudOneJoker);
	    	}
	    	else if (FiveCardWild.isSelected()){
	    		this.mainApp.setiGameType(eGame.FiveStudTwoJoker);
	    	}
	    	else if(FiveCardDraw.isSelected()){
	    		this.mainApp.setiGameType(eGame.FiveStud);
	    	}
	    	else if(SevenCardDraw.isSelected()){
	    		this.mainApp.setiGameType(eGame.SevenDraw);
	    	}
	    	else if(TexasHoldem.isSelected()){
	    		this.mainApp.setiGameType(eGame.TexasHoldEm);
	    	}
	    	else if(OmahaHoldem.isSelected()){
	    		this.mainApp.setiGameType(eGame.Omaha);
	    	}
	    	else{
	    		//do nothing
	    	}
	    }
    
//    public eGame GameSelect(){
//    	
//    	if (FiveCardJoker.isSelected()){
//    		return(eGame.FiveStudOneJoker);
//    	}
//    	else if (FiveCardWild.isSelected()){
//    		return(eGame.FiveStudTwoJoker);
//    	}
//    	else if(FiveCardDraw.isSelected()){
//    		return(eGame.FiveStud);
//    	}
//    	else if(SevenCardDraw.isSelected()){
//    		return(eGame.SevenDraw);
//    	}
//    	else if(TexasHoldem.isSelected()){
//    		return(eGame.TexasHoldEm);
//    	}
//    	else if(OmahaHoldem.isSelected()){
//    		return(eGame.Omaha);
//    	}
//    	else{return null;}
//    }
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {

	 
/*		CheckMenuItem item1 = new CheckMenuItem("5 card stud");
        item1.selectedProperty().addListener(new ChangeListener(){
            @Override
            public void changed(ObservableValue arg0, Object arg1, Object arg2) {
               mainApp.setiGameType(1);              
            }            
          });
		
		
		mnuGame.getItems().add(item1);
		
		
		
		CheckMenuItem item2 = new CheckMenuItem("5 card draw");
        item2.selectedProperty().addListener(new ChangeListener(){
            @Override
            public void changed(ObservableValue arg0, Object arg1, Object arg2) {
               mainApp.setiGameType(2);              
            }            
          });
		
		
		mnuGame.getItems().add(item2);*/
		
		
	}
    
    
    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    /**
     * Creates an empty address book.
     */
    @FXML
    private void handleNew() {
    }

    /**
     * Opens a FileChooser to let the user select an address book to load.
     */
    @FXML
    private void handleOpen() {
    }

    /**
     * Saves the file to the person file that is currently open. If there is no
     * open file, the "save as" dialog is shown.
     */
    @FXML
    private void handleSave() {
    }

    /**
     * Opens a FileChooser to let the user select a file to save to.
     */
    @FXML
    private void handleSaveAs() {
    }

    /**
     * Opens an about dialog.
     */
    @FXML
    private void handleAbout() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("AddressApp");
        alert.setHeaderText("About");
        alert.setContentText("Author: Bert Gibbons");

        alert.showAndWait();
    }

    /**
     * Closes the application.
     */
    @FXML
    private void handleExit() {
        System.exit(0);
    }
    /**
     * Opens the birthday statistics.
     */
    @FXML
    private void handleShowBirthdayStatistics() {
    }




}