package Functions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Logout implements ActionListener{
    private JFrame frameToDispose;

    public Logout(JFrame frameToDispose) {
        this.frameToDispose = frameToDispose;
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(frameToDispose != null) {
			frameToDispose.dispose();
		}
		new Main.Login();
	}
}
