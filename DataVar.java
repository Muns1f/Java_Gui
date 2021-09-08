
import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.border.*;

public class DataVar {

    // The Login Form Frame Variables
    static JLabel LoginHeader;
    static JLabel Username;
    static JLabel Password;
    static JTextField username;
    static JPasswordField password;
    static JButton Login;
    static JButton Exit;
    static JButton ShowUsersInfo;
    // Pizza System Labels
    static JLabel header;
    static JLabel l1;
    static JLabel l2;
    static JLabel l3;
    static JLabel l4;
    static JLabel l5;
    static JLabel l6;
    

    // Pizza System TextFields
    static JTextField Order;
    static JTextField Rate;
    static JTextField Customer;
    static JTextField Amount;
    static JTextField Quantity;
    static JTextField Cost;

    // Pizza Types Variables [Panel1]
    static JRadioButton Margherita;
    static JRadioButton Buffalo;
    static JRadioButton Meat;
    static JRadioButton Pepperoni;

    // pizza Types Variables [Panel2]
    static JCheckBox Onion;
    static JCheckBox Chesse;
    static JCheckBox Tomato;
    static JCheckBox Baby_Corn;

    // Pizza System Buttons
    static JButton GenerateBill;
    static JButton Clear;

    static JFrame frame = new JFrame();
    static JFrame LoginFrame = new JFrame();

    DataVar() {
       

        frame.setTitle("Pizza Ordering System");
        LoginFrame.setTitle("Login Page");

        // Create Font Class Object
        Font myFont = new Font("Sans", Font.BOLD, 17);

        // Create Main Panel And set Layouts
        JPanel panel = new JPanel();
        JPanel OrderInfo = new JPanel(new GridLayout(3, 4, 5, 5));
        JPanel Options = new JPanel(new GridLayout(1, 2, 40, 50));
        JPanel OptionFirst = new JPanel(new GridLayout(4, 1, 10, 5));
        JPanel OptionSecond = new JPanel(new GridLayout(4, 1, 10, 5));
        JPanel Buttons = new JPanel(new FlowLayout());
     

        // Set Two Panels
        OptionFirst.setBorder(new TitledBorder("Pizza Type"));
        OptionSecond.setBorder(new TitledBorder("Toppings"));
        Options.add(OptionFirst);
        Options.add(OptionSecond);

        // Create Login Frame Variables
        LoginHeader = new JLabel("Welcome");
        Username = new JLabel("Username");
        Password = new JLabel("Password");
        username = new JTextField();
        password = new JPasswordField();
        Login = new JButton("Login");
        Exit = new JButton("Exit");
        ShowUsersInfo = new JButton("Users_Info");

        // Create Labales To Values
        header = new JLabel("Pizza Ordering Bill System");
        l1 = new JLabel("Order No.");
        l2 = new JLabel("Rate");
        l3 = new JLabel("Customer Name");
        l4 = new JLabel("Amount");
        l5 = new JLabel("Quantity");
        l6 = new JLabel("Cost of Toppings");
        
         

        // Create TextFields
        Order = new JTextField();
        Rate = new JTextField();
        Rate.setEditable(false);
        Customer = new JTextField();
        Amount = new JTextField();
        Amount.setEditable(false);
        Quantity = new JTextField();
        Cost = new JTextField();
        Cost.setEditable(false);

        // Create Pizza Type RadioButtons
        Margherita = new JRadioButton("Margherita");
        Meat = new JRadioButton("Meat");
        Buffalo = new JRadioButton("Buffalo");
        Pepperoni = new JRadioButton("Pepperoni");

        // Create Pizza Radio Group
        ButtonGroup Type = new ButtonGroup();
        Type.add(Margherita);
        Type.add(Meat);
        Type.add(Buffalo);
        Type.add(Pepperoni);

        // Create Toppings CheckBox
        Onion = new JCheckBox("Onion");
        Chesse = new JCheckBox("Chesse");
        Tomato = new JCheckBox("Tomato");
        Baby_Corn = new JCheckBox("Baby_Corn");

        // Add Pizza Type Varibles To First Panel
        OptionFirst.add(Meat);
        OptionFirst.add(Margherita);
        OptionFirst.add(Buffalo);
        OptionFirst.add(Pepperoni);

        // Add Pizza Toppings To Second Panel
        OptionSecond.add(Onion);
        OptionSecond.add(Chesse);
        OptionSecond.add(Tomato);
        OptionSecond.add(Baby_Corn);

        // Create MainButtons & Add To Buttons Panel
        GenerateBill = new JButton("Genrate Bill");
        Clear = new JButton("Clear");
        
        Buttons.add(Clear);
        Buttons.add(GenerateBill);
   
        // Add Info To OrderInfo Panel
        panel.add(header);
        OrderInfo.add(l1);
        OrderInfo.add(Order);
        OrderInfo.add(l2);
        OrderInfo.add(Rate);
        OrderInfo.add(l3);
        OrderInfo.add(Customer);
        OrderInfo.add(l4);
        OrderInfo.add(Amount);
        OrderInfo.add(l5);
        OrderInfo.add(Quantity);
        OrderInfo.add(l6);
        OrderInfo.add(Cost);
       
       // GenerateBill.setBounds(200,300,100,28);

        // Main Frame Design
        frame.setSize(520, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 1, 10, 20));
        frame.add(header);
        frame.add(OrderInfo);
        frame.add(Options);
        frame.add(Buttons);
        
        // Login Frame Adding Data
        LoginFrame.add(LoginHeader);
        LoginFrame.add(Username);
        LoginFrame.add(username);
        LoginFrame.add(Password);
        LoginFrame.add(password);
        LoginFrame.add(Login);
        LoginFrame.add(Exit);
        LoginFrame.add(ShowUsersInfo);

        // Login Frame Design
        LoginFrame.setSize(400, 340);
        LoginFrame.setVisible(true);
        LoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LoginFrame.setLayout(null);

        // set Font Object To Variables
        Username.setFont(myFont);
        Password.setFont(myFont);
        LoginHeader.setFont(myFont);

        // Set Color To Login Buttons
        Login.setForeground(Color.BLUE);
        Exit.setForeground(Color.RED);
        ShowUsersInfo.setForeground(Color.GREEN);
        Clear.setForeground(Color.RED);
        GenerateBill.setForeground(Color.BLUE);
        
        
        username.setForeground(Color.RED);
        password.setForeground(Color.RED);

        // Set Bounds (Absoulte Layout)
        Username.setBounds(50, 70, 100, 30);
        username.setBounds(200, 70, 150, 28);
        Password.setBounds(50, 130, 100, 30);
        password.setBounds(200, 130, 150, 28);
        Exit.setBounds(50, 200, 100, 28);
        Login.setBounds(250, 200, 100, 28);
     
        
        ShowUsersInfo.setBounds(138,250,120,28);
        

        // Create Action Event Sources
        // First Panel
        
        
        MyListener Listen = new MyListener();
        
        
        Meat.addActionListener(Listen);
        Margherita.addActionListener(Listen);
        Buffalo.addActionListener(Listen);
        Pepperoni.addActionListener(Listen);

        // Second Panel
        Onion.addActionListener(Listen);
        Chesse.addActionListener(Listen);
        Tomato.addActionListener(Listen);
        Baby_Corn.addActionListener(Listen);

        // Buttons Source
        GenerateBill.addActionListener(Listen);
        Clear.addActionListener(Listen);

        Login.addActionListener(Listen);
        Exit.addActionListener(Listen);
        ShowUsersInfo.addActionListener(Listen);
    }

    public static void main(String s[]) {

        new DataVar();

    }

}
