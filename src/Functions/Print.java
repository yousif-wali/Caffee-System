package Functions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;

import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Print implements ActionListener{
	JTable table;
	public Print(JTable table) {
		this.table = table;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
            boolean complete = table.print();
            if (complete) {
                // Show a success message
                JOptionPane.showMessageDialog(null, "Printing Complete",
                                              "Printing Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Show a message indicating that printing was cancelled
                JOptionPane.showMessageDialog(null, "Printing Cancelled",
                                              "Printing Result", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (PrinterException pe) {
            // Show a message indicating that printing failed
            JOptionPane.showMessageDialog(null, "Printing Failed: " + pe.getMessage(),
                                          "Printing Result", JOptionPane.ERROR_MESSAGE);
        }
    }
}
