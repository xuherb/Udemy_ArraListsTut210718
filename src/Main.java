import java.util.*;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static GroceryList c = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;

        instructions();

        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice){
                case 0:
                    instructions();
                    break;

                case 1:
                    c.printGroceryList();
                    break;

                case 2:
                    add();
                    break;

                case 3:
                    modify();
                    break;

                case 4:
                    rem();
                    break;

                case 5:
                    search();
                    break;

                case 6:
                    quit = true;
                    break;

                default:
                    instructions();
            }

        }
        //end of main method
    }

    public static void instructions(){
        System.out.println("\nPress:");
        System.out.println("\t0- Print instruction");
        System.out.println("\t1- Print list");
        System.out.println("\t2- Add item to list");
        System.out.println("\t3- Replace item on list");
        System.out.println("\t4- Remove item from list");
        System.out.println("\t5- Search for item on list");
        System.out.println("\t6- EXIT APPLICATION");
    }

    public static void add() {
        System.out.print("Enter item: ");
        c.addGroceryItem(scan.nextLine());
    }

    public static void modify(){
        System.out.print("Enter item number: ");
        int number = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter new item: ");
        String item = scan.nextLine();
        c.modifyGrocery(number, item);
    }

    public static void rem(){
        System.out.print("Enter item number: ");
        c.removeItem(scan.nextInt());
    }

    public static void search(){
        System.out.print("Enter item to  search for: ");
        String searchedItem = c.findItem(scan.nextLine());
        if(searchedItem != null){
            System.out.println("Searched item is " + searchedItem);
        } else System.out.println("Item was not found");
    }
}
