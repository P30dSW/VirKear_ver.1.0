import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro de Souza Winkler
 */
public class KaertchenGUI extends javax.swing.JFrame implements ActionListener{
	
	//Menü Elemente
    private javax.swing.JLabel lblTitel;
    private javax.swing.JButton btnKaerErstellen, btnKaerLernen, btnLoeschen, btnHilfe;

    //Kärerstellen Elemente
    private javax.swing.JLabel lblEingabe1, lblEingabe2;
    private javax.swing.JTextField txtEingabe1, txtEingabe2;
    private javax.swing.JButton btnWeiterErstellen, btnBeendenErstellen;
    
    //KärLernen Elemente
    private javax.swing.JLabel lblGegebenWort, lblGesuchtWort, lblGegebenWortgezeigt, lblRichtigodFalsch;
    private javax.swing.JTextField txtGesuchtEingabe;
    private javax.swing.JButton btnWeiterLernen, btnBeendenLernen, btnUeberpruefenLernen;
   
    //Variablen und Instanz für die WoerterListe
    private WortListDM wdm = new WortListDM();
    private Random rnd = new Random();
    
    private ArrayList<WortList> KaerchenPackGUI = new ArrayList<WortList>();

    
    private ArrayList<WortList> KaerchenPackLernenGUI = new ArrayList<WortList>();
    private WortList KaerchenLernenGUI = new WortList();
    public KaertchenGUI() {
    	
    	//Elemente:Menü
    	lblTitel = new JLabel("VirKär");
    	lblTitel.setBounds(210,25,100,20);
    	lblTitel.setFont(new Font("Verdana", Font.BOLD, 24));
    	
    	btnKaerErstellen = new JButton("Kärtchen erstellen");
    	btnKaerErstellen.setBounds(150,125,200,40);
    	btnKaerErstellen.addActionListener(this);
    	
    	btnKaerLernen = new JButton("Kärtchen abfragen");
    	btnKaerLernen.setBounds(150,200,200,40);
    	btnKaerLernen.addActionListener(this);
    	    
    	btnLoeschen = new JButton("Kärtchensammlung Löschen");
    	btnLoeschen.setBounds(150,275,200,40);
    	btnLoeschen.addActionListener(this);
    	
    	btnHilfe = new JButton("?");
    	btnHilfe.setBounds(455,1,40,20);
    	btnHilfe.setFont(new Font("Verdana", Font.BOLD, 16));
    	btnHilfe.addActionListener(this);
    	
    	//Elemente: Kärtschen erstellen
    	
    	lblEingabe1 = new JLabel("1. Eingabe");
    	lblEingabe1.setBounds(10,75,200,30);
    	lblEingabe1.setFont(new Font("Verdana", Font.BOLD, 24));
    	lblEingabe1.setVisible(false);
    	
    	lblEingabe2 = new JLabel("2. Eingabe");
    	lblEingabe2.setBounds(10,200,200,30);
    	lblEingabe2.setFont(new Font("Verdana", Font.BOLD, 24));
    	lblEingabe2.setVisible(false);
    	
    	txtEingabe1 = new JTextField();
    	txtEingabe1.setFont(new Font("Verdana", Font.PLAIN, 24));
    	txtEingabe1.setBounds(175,65,225,40);
    	txtEingabe1.setVisible(false);
    	
    	txtEingabe2 = new JTextField();
    	txtEingabe2.setFont(new Font("Verdana", Font.PLAIN, 24));
    	txtEingabe2.setBounds(175,190,225,40);
    	txtEingabe2.setVisible(false);
    	
    	btnWeiterErstellen = new JButton("Weiter");
    	btnWeiterErstellen.setBounds(390,300,100,30);
    	btnWeiterErstellen.setVisible(false);
    	btnWeiterErstellen.addActionListener(this);
    	
    	btnBeendenErstellen = new JButton("Beenden");
    	btnBeendenErstellen.setBounds(390,350,100,30);
    	btnBeendenErstellen.addActionListener(this);
    	btnBeendenErstellen.setVisible(false);
    	
    	//Elemente:KärLernen
    	
    	lblGegebenWort = new JLabel("gegebenes Wort: ");
    	lblGegebenWort.setBounds(10,40,250,30);
    	lblGegebenWort.setFont(new Font("Verdana", Font.BOLD, 24));
    	lblGegebenWort.setVisible(false);
    	
    	lblGesuchtWort = new JLabel("Gesuchtes Wort: ");
    	lblGesuchtWort.setBounds(10,130,250,20);
    	lblGesuchtWort.setFont(new Font("Verdana", Font.BOLD, 24));
    	lblGesuchtWort.setVisible(false);
    	
    	lblGegebenWortgezeigt = new JLabel("test anzeige");
    	lblGegebenWortgezeigt.setFont(new Font("Verdana", Font.BOLD, 24));
    	lblGegebenWortgezeigt.setBounds(250,35,225,40);
    	lblGegebenWortgezeigt.setVisible(false);
    	
    	lblRichtigodFalsch = new JLabel("keine Antwort");
    	lblRichtigodFalsch.setFont(new Font("Verdana", Font.BOLD, 24));
    	lblRichtigodFalsch.setBounds(10,225,300,75);
    	lblRichtigodFalsch.setVisible(false);
    	
    	txtGesuchtEingabe = new JTextField();
    	txtGesuchtEingabe.setFont(new Font("Verdana", Font.PLAIN, 24));
    	txtGesuchtEingabe.setBounds(240,120,225,40);
    	txtGesuchtEingabe.setVisible(false);
    	
    	btnWeiterLernen = new JButton("Weiter");
    	btnWeiterLernen.setBounds(390,330,100,30);
    	btnWeiterLernen.setVisible(false);
    	btnWeiterLernen.addActionListener(this);
    	
    	btnBeendenLernen = new JButton("Beenden");
    	btnBeendenLernen.setBounds(390,380,100,30);
    	btnBeendenLernen.addActionListener(this);
    	btnBeendenLernen.setVisible(false);
    	
    	btnUeberpruefenLernen = new JButton("Überprüfen");
    	btnUeberpruefenLernen.setBounds(390,250,100,30);
    	btnUeberpruefenLernen.addActionListener(this);
    	btnUeberpruefenLernen.setVisible(false);
    	
    	//Frame einstellungen
    	this.setSize(500, 460);
    	this.setResizable(false);
    	this.setLocation(700, 200);
    	this.setTitle("VirKär Ver. 1.0");
    	this.setLayout(null);
    	this.add(lblTitel);
    	this.add(btnKaerErstellen);
    	this.add(btnKaerLernen);
    	this.add(lblEingabe1);
    	this.add(lblEingabe2);
    	this.add(txtEingabe1);
    	this.add(txtEingabe2);
    	this.add(btnWeiterErstellen);
    	this.add(btnBeendenErstellen);
    	this.add(lblGegebenWort);
    	this.add(lblGesuchtWort);
    	this.add(txtGesuchtEingabe);
    	this.add(btnWeiterLernen);
    	this.add(btnBeendenLernen);
    	this.add(lblGegebenWortgezeigt);
    	this.add(lblRichtigodFalsch);
    	this.add(btnUeberpruefenLernen);
    	this.add(btnLoeschen);
    	this.add(btnHilfe);
    	this.setVisible(true);
    }

	public void actionPerformed(ActionEvent e) {
		
		//Anzeige von Menü zu Kärerstellen
		if(e.getSource() == btnKaerErstellen){
			//Stellt die Elementen vom Menü nicht Visible
			lblTitel.setVisible(false);
			btnKaerErstellen.setVisible(false);
			btnKaerLernen.setVisible(false);
			btnHilfe.setVisible(false);
			btnLoeschen.setVisible(false);
			//Stellt dei Elementen vom Kärerstellen auf Visible
			lblEingabe1.setVisible(true);
			lblEingabe2.setVisible(true);
			txtEingabe1.setVisible(true);
			txtEingabe2.setVisible(true);
			btnWeiterErstellen.setVisible(true);
			btnBeendenErstellen.setVisible(true);
		
		}
		
		//Anzeige von Kärerstellen zu Menü
		if(e.getSource() == btnBeendenErstellen){
			//Stellt die Elementen vom Kärerstellen nicht Visible
			lblEingabe1.setVisible(false);
			lblEingabe2.setVisible(false);
			txtEingabe1.setVisible(false);
			txtEingabe2.setVisible(false);
			btnWeiterErstellen.setVisible(false);
			btnBeendenErstellen.setVisible(false);
			//Stellt dei Elementen vom Menü auf Visible
			lblTitel.setVisible(true);
			btnKaerErstellen.setVisible(true);
			btnKaerLernen.setVisible(true);
			btnHilfe.setVisible(true);
			btnLoeschen.setVisible(true);
			//Speichert den lokalen ArrayList in den ArrayList vom WortListDM
			if(!KaerchenPackGUI.isEmpty()){
				btnKaerErstellen.setEnabled(false);
				wdm.setWoerterliste(KaerchenPackGUI);
			}
			
		}
		//Anzeige von Menü zu Kärlernen
		if(e.getSource() == btnKaerLernen){
			if(wdm.isWoerterlisteEmpty() == false){
			//Stellt die Elementen vom Menü nicht Visible
			lblTitel.setVisible(false);
			btnKaerErstellen.setVisible(false);
			btnKaerLernen.setVisible(false);
			btnHilfe.setVisible(false);
			btnLoeschen.setVisible(false);
			//Stellt dei Elementen vom Kärlernen auf Visible
			lblGegebenWort.setVisible(true);
			lblGesuchtWort.setVisible(true);
			txtGesuchtEingabe.setVisible(true);
			btnWeiterLernen.setVisible(true);
			btnBeendenLernen.setVisible(true);
			lblGegebenWortgezeigt.setVisible(true);
			lblRichtigodFalsch.setVisible(true);
			btnUeberpruefenLernen.setVisible(true);
			
			//NImmt den Wert von der Woerterliste im DM 
			KaerchenPackLernenGUI = new ArrayList<WortList>(wdm.getWoerterliste());
			 // auswahl von einen zufälligen Woerterliste
			KaerchenLernenGUI = KaerchenPackLernenGUI.get(rnd.nextInt(wdm.lengthOfWoerterliste()));
			//Setzt die Strings von Woerterliste auf die Controlls
			lblGegebenWortgezeigt.setText(KaerchenLernenGUI.Wort);
			}else{
				JOptionPane.showMessageDialog(null, "Sie haben noch keinen Kärtchensammlung erstellt");
			}
		}
		
		//Für den Auswahl einen Zufälligen Woerterliste
		if(e.getSource() == btnWeiterLernen){
			// auswahl von einen zufälligen Woerterliste
			KaerchenLernenGUI = null;
			KaerchenLernenGUI = KaerchenPackLernenGUI.get(rnd.nextInt(wdm.lengthOfWoerterliste()));
			KaerchenPackLernenGUI.toString();
			KaerchenLernenGUI.toString();
			//Setzt die Strings von Woerterliste auf die Controlls
			lblGegebenWortgezeigt.setText(KaerchenLernenGUI.Wort);
			txtGesuchtEingabe.setText("");
		}
		
		//Anzeige von Kärlernen zu Menü
		if(e.getSource() == btnBeendenLernen){
			//Stellt die Elementen vom Kärlernen nicht Visible
			lblGegebenWort.setVisible(false);
			lblGesuchtWort.setVisible(false);
			txtGesuchtEingabe.setVisible(false);
			btnWeiterLernen.setVisible(false);
			btnBeendenLernen.setVisible(false);
			lblGegebenWortgezeigt.setVisible(false);
			lblRichtigodFalsch.setVisible(false);
			btnUeberpruefenLernen.setVisible(false);
			//Stellt die Controlls vom Menü auf Visible
			lblTitel.setVisible(true);
			btnKaerErstellen.setVisible(true);
			btnKaerLernen.setVisible(true);
			btnHilfe.setVisible(true);
			btnLoeschen.setVisible(true);
		}
		
		//Erstellt eine Wortlist von den zwei Textfeldern,was danach in den ArrayList KaerchenPackGUI eingefügt wird. 
		//Stellt wieder alles auf null nach dem Prozess
		if(e.getSource() == btnWeiterErstellen){
			if(txtEingabe1.getText().equals("")|| txtEingabe2.getText().equals("")){
			JOptionPane.showMessageDialog(null, "Sie haben keinen Werten eingegeben.");
			}else{
			
			WortList KaerchenGUI = new WortList();
			KaerchenGUI.Wort = txtEingabe1.getText();
			KaerchenGUI.Uebersetzung = txtEingabe2.getText();
			KaerchenPackGUI.add(KaerchenGUI);
			txtEingabe1.setText("");
			txtEingabe2.setText("");
			JOptionPane.showMessageDialog(null, "Kärtchen wurde geschpeichert");
			}
		}
		
		//Überprüft ob die angegebende Lösung richtig ist. Dabei wird der Label lblRichtigodFalsch geändert
		if(e.getSource() == btnUeberpruefenLernen){
			if(txtGesuchtEingabe.getText() == ""){
				JOptionPane.showMessageDialog(null, "Sie haben keinen Antwort gegeben.");
			}else{
				if(KaerchenLernenGUI.Uebersetzung.equalsIgnoreCase(txtGesuchtEingabe.getText())){
					lblRichtigodFalsch.setText("<html>Ihre Eingabe <br>ist Richtig</html>");
					lblRichtigodFalsch.setForeground(Color.GREEN);
				}else{
					lblRichtigodFalsch.setText("<html>Falsch.<br>Es ist : <html>" + KaerchenLernenGUI.Uebersetzung);
					lblRichtigodFalsch.setForeground(Color.RED);
				}
			}
		}
		
		//Gibt den Hilfmessagebox aus
		if(e.getSource() == btnHilfe){
			JOptionPane.showMessageDialog(null, "<html><h1>VirKär Ver. 1.0</h1><p>Autor: Pedro de Souza Winkler</p><p>Herstellungsort: GIBMIT Pratteln</p><p>E-Mail:pedro.desouzawinkler@gibmit.ch</p><p>Ver.1.0 Release:07.04.17</p><p><br>Dieses Projekt wurde für den Modul 404 erstellt</p></html>");
		}
		
		//Damit man die möglichkeit hat, Einen Kärtchensammlung zu löschen, habe ich Löschfunktion eingesetzt
		if(e.getSource() == btnLoeschen){
			if(wdm.isWoerterlisteEmpty() == false){
				wdm.deleteWoerterliste();
				JOptionPane.showMessageDialog(null, "<html>Die gespeicherte Kärtchensammlung<br>wurde gelöscht<html/>");
				btnKaerErstellen.setEnabled(true);
			}else{
				JOptionPane.showMessageDialog(null, "Sie haben noch keinen Kärtchensammlung erstellt");
			}
		}
	}
}
   