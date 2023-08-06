package _02_Generics_Store;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;


/*
 * The Cart class is a Bounded Type Generic class
 * 
 * <T extends Food> means we can only create a Cart with objects part of the 
 * Food class
 */

@SuppressWarnings("unchecked")
public class Cart<T extends NonFood> implements ActionListener {
    private T[] cart;
    JFrame frame;
    JPanel panel;
    JButton button;
    JButton but;
    JButton bu;
    JButton b;
    JLabel label;
    Scanner scan;
    public Cart() {
        cart = (T[]) new NonFood[5];
    }

    // Adds an item to the cart
    public void add(T item) {
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                cart[i] = item;
                return;
            }
        }
        JOptionPane.showMessageDialog(null,
                "Your cart is full!\nNo more than 5 items");
    }

    // Displays everything currently in the cart
    public void showCart() {
         frame = new JFrame();
         panel = new JPanel();
         button = new JButton();
         but = new JButton();
         bu = new JButton();
         b = new JButton();
         label = new JLabel();
         scan = new Scanner(System.in);
        System.out.println("How much money do you have?");
        int h = scan.nextInt();
        button.addActionListener(this);
       
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < cart.length; i++) {
            if (cart[i] != null) {
                panel.add(( cart[i]).getNonFood());
                button.setText("Add to Cart $9.99");
                but.setText("Remove from Cart");
                bu.setText("View");
               
                panel.add(button);
                panel.add(but);
                panel.add(bu);
            }
        }
        b.setText("Checkout");
        label.setText("You have $ " +h + " to spend!");
        
        panel.add(b);
        panel.add(label);
        frame.add(panel);
        frame.setSize(800,800);
        
        
    }

    public int length() {
        return cart.length;
   
    }
    
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
		if(pressed == button) {
			
		}
	}
}
