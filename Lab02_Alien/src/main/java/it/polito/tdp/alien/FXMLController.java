package it.polito.tdp.alien;

import java.awt.Label;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	private AlienDictionary ad = new AlienDictionary();
	
  //  @FXML
  //  private Label lblErrore;
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnTraslate;

    @FXML
    private TextArea txtRisultato;

    @FXML
    private Button btnClear;

    @FXML
    void doReset(ActionEvent event) {

    }

    @FXML
    void doTraslate(ActionEvent event) {
    	String testo =  txtParola.getText().toLowerCase();
    	if( testo.contains(" ")) {
    		String[] campi = testo.split(" ");
    		String parolaAliena = campi[0];
    		String parolaTradotta = campi[1];
    			if(parolaAliena.matches("[a-z]*") && parolaTradotta.matches("[a-z]*")) {
    				this.ad.addWord(parolaAliena, parolaTradotta);
    		    	txtRisultato.setText("Parola aggiunta con successo");
    			}
    			else 
    				txtRisultato.setText("Parola inserita non corretta");
    	}
    	else {
    			if(testo.matches("[a-z]*")) {
    				String traduzione = this.ad.translateWord(testo);
    				txtRisultato.setText("Traduzione di " + testo + ": " + traduzione);
    			}
    			else 
    				txtRisultato.setText("Parola inserita non corretta");
    		}
    }

    
    public void setAd(AlienDictionary ad) {
		this.ad = ad;
	}

	@FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTraslate != null : "fx:id=\"btnTraslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtRisultato != null : "fx:id=\"txtRisultato\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Scene.fxml'.";
     //   assert lblErrore != null : "fx:id=\"lblErrore\" was not injected: check your FXML file 'Scene.fxml'.";
    }
}
