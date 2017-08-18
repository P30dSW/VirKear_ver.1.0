
public class Start {

	
	public static void main(String[] args) {

		/**
		 * Hier wird die Hauptframe geöffnet
		 * 
		 *Für den GUI Design benutzt es Nimbus Feel and Look. Hier wird es auf gerufen 
		 *http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 * 
		 * Einleitung: 
		 * Bei VirKär können sie Virtuelle Kärtchen erstellen.
		 * das Erste was sie machen können ist einen neuen Kärtchensammlung erstellen.
		 * dafür gehen sie auf "Kärtchen Erstellen".
		 * 
		 * Heir können Sie die zwei Faktoren eines Kärtchen eingeben. Das erste wird gezeigt, das zweite
		 * wird geprüft.
		 * Wenn sie auf weiter drücken wird das Kärtchen gespeichert. 
		 * Sie können solange machen bis sie zufrieden sind.
		 * Wenn sie fertig sind können sie auf "Beenden" Drücken.
		 * 
		 * Jetzt können sie auf Kärtchen abfragen gehen, wo ihr die Lernen könnt
		 * Ein zufälliges Kärtchen wird ausgewählt und sie können euren Antwort tippen.
		 * wenn sie wissen wollen, ob es richtig ist können sie auf "Überprüfen" drücken.
		 * bei Weiter kommt ein neues, zufälliges Kärtchen. Dies geht solange, bis sie zufrieden sind.
		 * Wenn sie fertig sind, können sie auf "Beenden" drücken.
		 * 
		 * Wenn sie noch einen neuen Kärtchen erstellen wollen, können sie auf "Kärtchensammlung Löschen" drücken,
		 * damit sie platz haben
		 * 
		 * @author Pedro
		 */
        
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KaertchenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KaertchenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KaertchenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KaertchenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KaertchenGUI().setVisible(true);
            }
        });
    
	}

}
