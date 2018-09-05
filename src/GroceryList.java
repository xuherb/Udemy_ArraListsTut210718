import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("\nYou have " + groceryList.size() + " items in your list");
        System.out.println(groceryList.toString() + "\n");
    }

    public void modifyGrocery(String item, String newItem){
        int position = findItemInt(item);
        if(position >= 0) {modifyGrocery(position, newItem);}
    }

    public void modifyGrocery(int position, String newItem){
        position--;
        String oldItem = groceryList.get(position);
        groceryList.set(position, newItem);
        System.out.println("Item \"" + oldItem + "\" at position " + (position+1) +
        " has been changed to \"" + groceryList.get(position) + "\"");
    }

    public String removeItem(int position){
        String removedItem = groceryList.get(position -1); //TODO: nema zmysel tu riesit -1, lebo potom to treba riesit aj v removeItem(string)
        groceryList.remove(position -1);
        return removedItem;
    }

    public void removeItem(String item){
        int position = groceryList.indexOf(item);
        if(position >= 0) {
            removeItem(position + 1);
        }
    }

    public int findItemInt(String item) {
        return groceryList.indexOf(item);
    }

    public String findItem(String item){
        int position = groceryList.indexOf(item);
        if(position >= 0) return groceryList.get(position);
        return null;
    }

}
