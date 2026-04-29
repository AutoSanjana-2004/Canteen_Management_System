package projectcms;

import javax.swing.*;

public class AddFoodUI extends JFrame {

    public AddFoodUI() {
        setTitle("Add Food");
        setSize(300,200);
        setLayout(null);

        JTextField name = new JTextField();
        JTextField price = new JTextField();

        name.setBounds(50,30,200,30);
        price.setBounds(50,70,200,30);

        JButton addBtn = new JButton("Add");
        addBtn.setBounds(100,120,100,30);

        add(name); add(price); add(addBtn);

        FoodService service = new FoodService();

        addBtn.addActionListener(e -> {
            service.addFood(name.getText(), Double.parseDouble(price.getText()));
            JOptionPane.showMessageDialog(this, "Added");
        });

        setVisible(true);
    }
}
