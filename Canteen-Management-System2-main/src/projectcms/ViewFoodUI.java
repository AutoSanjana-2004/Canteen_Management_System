package projectcms;

import javax.swing.*;
import java.util.List;

public class ViewFoodUI extends JFrame {

    public ViewFoodUI() {
        setTitle("Food List");
        setSize(400,300);

        JTextArea area = new JTextArea();

        FoodService service = new FoodService();
        List<Food> list = service.getFoods();

        for (Food f : list) {
            area.append(f.getId() + " " + f.getName() + " ₹" + f.getPrice() + "\n");
        }

        add(new JScrollPane(area));
        setVisible(true);
    }
}
