package projectcms;

import javax.swing.*;

public class DashboardUI extends JFrame {

    public DashboardUI() {
        setTitle("Dashboard");
        setSize(400,300);
        setLayout(null);

        JButton addFood = new JButton("Add Food");
        addFood.setBounds(50,50,120,30);

        JButton viewFood = new JButton("View Food");
        viewFood.setBounds(200,50,120,30);

        add(addFood);
        add(viewFood);

        addFood.addActionListener(e -> new AddFoodUI());
        viewFood.addActionListener(e -> new ViewFoodUI());

        setVisible(true);
    }
}
