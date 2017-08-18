
public class Start {

	
	public static void main(String[] args) {

		/**
		 * Hier wird die Hauptframe ge�ffnet
		 * 
		 *F�r den GUI Design benutzt es Nimbus Feel and Look. Hier wird es auf gerufen 
		 *http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 * 
		 * Einleitung: 
		 * Bei VirK�r k�nnen sie Virtuelle K�rtchen erstellen.
		 * das Erste was sie machen k�nnen ist einen neuen K�rtchensammlung erstellen.
		 * daf�r gehen sie auf "K�rtchen Erstellen".
		 * 
		 * Heir k�nnen Sie die zwei Faktoren eines K�rtchen eingeben. Das erste wird gezeigt, das zweite
		 * wird gepr�ft.
		 * Wenn sie auf weiter dr�cken wird das K�rtchen gespeichert. 
		 * Sie k�nnen solange machen bis sie zufrieden sind.
		 * Wenn sie fertig sind k�nnen sie auf "Beenden" Dr�cken.
		 * 
		 * Jetzt k�nnen sie auf K�rtchen abfragen gehen, wo ihr die Lernen k�nnt
		 * Ein zuf�lliges K�rtchen wird ausgew�hlt und sie k�nnen euren Antwort tippen.
		 * wenn sie wissen wollen, ob es richtig ist k�nnen sie auf "�berpr�fen" dr�cken.
		 * bei Weiter kommt ein neues, zuf�lliges K�rtchen. Dies geht solange, bis sie zufrieden sind.
		 * Wenn sie fertig sind, k�nnen sie auf "Beenden" dr�cken.
		 * 
		 * Wenn sie noch einen neuen K�rtchen erstellen wollen, k�nnen sie auf "K�rtchensammlung L�schen" dr�cken,
		 * damit sie platz haben
		 * 
		 * @author Pedro de Souza Winkler
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
