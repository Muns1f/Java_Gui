
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.*;

public class MyListener implements ActionListener {

    static double MeatPrice = 120;
    static double MarPrice = 80;
    static double PerPrice = 95;
    static double BuffPrice = 110;

    static double OnionPrice = 10;
    static double ChessePrice = 20;
    static double TomatoPrice = 10;
    static double Baby_CornPrice = 15;
    static double total = 0;

    @Override
    public void actionPerformed(ActionEvent e) {


		if(e.getSource() == DataVar.Exit){
		            System.exit(0);
		        } else if(e.getSource() == DataVar.Login){
		                String usernameF = DataVar.username.getText();
		                String passwordF = DataVar.password.getText();
		                String msg = "Great " + DataVar.username.getText();

		                if (DataVar.username.getText().equals("admin") && DataVar.password.getText().equals("admin")) {
		                    JOptionPane.showMessageDialog(null, msg);
		                    DataVar.frame.setVisible(true);
		                } else if(DataVar.username.getText().equals("123") && DataVar.password.getText().equals("123")){
                                     JOptionPane.showMessageDialog(null, msg);
		                    DataVar.frame.setVisible(true);
                                }else { 
		                    JOptionPane.showMessageDialog(null, "Invalid Login");
		                }
		        } // Else If


        if (e.getSource() == DataVar.Meat) {
            DataVar.Rate.setText(String.valueOf(MeatPrice));
            double Price = Double.parseDouble(DataVar.Quantity.getText());
            int priceInt = (int) Price;
            DataVar.Amount.setText(String.valueOf(priceInt * MeatPrice));

        } else if (e.getSource() == DataVar.Margherita) {
            DataVar.Rate.setText(String.valueOf(MarPrice));
            double Price = Double.parseDouble(DataVar.Quantity.getText());
            int priceInt = (int) Price;
            DataVar.Amount.setText(String.valueOf(priceInt * MarPrice));
        } else if (e.getSource() == DataVar.Buffalo) {
            DataVar.Rate.setText(String.valueOf(BuffPrice));
            double Price = Double.parseDouble(DataVar.Quantity.getText());
            int priceInt = (int) Price;
            DataVar.Amount.setText(String.valueOf(priceInt * BuffPrice));
        } else if (e.getSource() == DataVar.Pepperoni) {
            DataVar.Rate.setText(String.valueOf(PerPrice));
            double Price = Double.parseDouble(DataVar.Quantity.getText());
            int priceInt = (int) Price;
            DataVar.Amount.setText(String.valueOf(priceInt * PerPrice));
        }
        
        
         if (e.getSource() == DataVar.Onion) {
           total+=OnionPrice;
            DataVar.Cost.setText(String.valueOf(total));
        } else if (e.getSource() == DataVar.Chesse) {
           total+=ChessePrice;
            DataVar.Cost.setText(String.valueOf(total));
        } else if (e.getSource() == DataVar.Tomato) {
            total+=TomatoPrice;
            DataVar.Cost.setText(String.valueOf(total));
        } else if (e.getSource() == DataVar.Baby_Corn) {
            total+=Baby_CornPrice;
            DataVar.Cost.setText(String.valueOf(total));
        }
        
        
        
         
        
   
        if (e.getSource() == DataVar.GenerateBill) {
            JOptionPane.showMessageDialog(null, "Order No.: " + DataVar.Order.getText()
                    + "\n" + "Customer Name: " + DataVar.Customer.getText() + "\n" + "Quantity: " + DataVar.Quantity.getText()
                    + "\n" + "Rate: " + DataVar.Rate.getText() + "$" + "\n" + "Amount: " + DataVar.Amount.getText() + "$" + "\n"
                    + "Total Cost: " + (Double.parseDouble(DataVar.Amount.getText()) + total) + "$");
        }

        if (e.getSource() == DataVar.Clear) {
            DataVar.Customer.setText("");
            DataVar.Order.setText("");
            DataVar.Rate.setText("");
            DataVar.Amount.setText("");
            DataVar.Quantity.setText("");
            DataVar.Cost.setText("");
            total = 0;
        }
        
        
        if(e.getSource() == DataVar.ShowUsersInfo){
            
            JOptionPane.showMessageDialog(null,
                "Username : Munsif " + "\n" + "Password : 123" + "\n" + "------------------------------------" + "\n" + "Username : Mohamed " + "\n" + "Password : mohamed123" + "\n" + "------------------------------------" + "\n" + "Username : Ahmed " + "\n" + "Password : ahmed" + "\n");
        }

     } // Method Override

} // Class
