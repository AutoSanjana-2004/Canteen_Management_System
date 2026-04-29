package projectcms;

import java.util.List;

public class FoodService {
    private FoodDAO dao = new FoodDAO();

    public void addFood(String name, double price) {
        dao.addFood(new Food(name, price));
    }

    public List<Food> getFoods() {
        return dao.getAllFood();
    }

    public void deleteFood(int id) {
        dao.deleteFood(id);
    }
}
