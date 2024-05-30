package Functions;

import Main.Main;
import Main.Util.MyLabel;
import Models.Item;
import Service.ItemList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RefreshHistory {
    public RefreshHistory() { 
        MyLabel updateTotal = Main.GetTotal();
        JTable table = Main.GetTable();
        String[] columnNames = {"Name", "Quantity", "Price"};
        
        // The size of the accumulatedData should be the size of the Data list
        Object[][] accumulatedData = new Object[ItemList.Data.size()][3];

        BigDecimal Total = BigDecimal.ZERO;
        int currentIndex = 0;
        for(Item item : ItemList.Data) {
            // Extracting name, amount, and price for each item
            String name = item.GetName();
            int amount = item.GetAmount();
            double price = item.GetPrice();
            
            // Populating the table data
            accumulatedData[currentIndex++] = new Object[] {name, amount, price};
            
            // Calculating the total
            BigDecimal itemTotal = BigDecimal.valueOf(price).multiply(BigDecimal.valueOf(amount));
            Total = Total.add(itemTotal.setScale(2, RoundingMode.HALF_UP));
        }

        // Updating the JTable model
        table.setModel(new DefaultTableModel(accumulatedData, columnNames));
        
        // Updating the total label
        updateTotal.setText("<html><h2>$"+ Total +"</h2></html>");
    }
}
