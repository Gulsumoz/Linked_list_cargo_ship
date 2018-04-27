import java.io.FileNotFoundException;
import java.util.Scanner;

// A complete working Java program to demonstrate all insertion methods
// on linked list
    class CNode {
        Item data;
        CNode next;

    public CNode(Item data) {
        this.data = data;
        next=null;
    }

    public CNode() {

    }

    public Item getData() {
        return data;
    }

    public void setData(Item data) {
        this.data = data;
    }

    public CNode getNext() {
        return next;
    }

    public void setNext(CNode next) {
        this.next = next;
    }
}





    public class Final {

    Scanner userchoice = new Scanner(System.in);
    private double totalweight = 0;

    public static void main(String[] args) throws FileNotFoundException {
        new Final();
    }


    public Final() throws FileNotFoundException {

           CNode cargohold=new CNode();

        System.out.println("Welcome to the BlackStar Cargo Hold interface.");
        System.out.println("Please select a number from the options below");
        System.out.println("");

        while (true) {
            // Give the user a list of their options
            System.out.println("1: Add an item to the cargo hold.");
            System.out.println("2: Remove an item from the cargo hold.");
            System.out.println("3: Sort the contents of the cargo hold.");
            System.out.println("4: Search for an item.");
            System.out.println("5: Display the items in the cargo hold.");
            System.out.println("6: Perform a partial search for an item.");
            System.out.println("7: Perform a ransack method.");
            System.out.println("0: Exit the BlackStar Cargo Hold interface.");

            // Get the user input
            int userChoice = userchoice.nextInt();
            userchoice.nextLine();

            switch (userChoice) {
                case 1:
                    addItem(cargohold);
                    break;
                case 2:
                    removeItem(cargohold);
                    break;
                case 3:
                    sortItems(cargohold);
                    break;
                case 4:
                    searchItems(cargohold);
                    break;
                case 5:
                    displayItems(cargohold);
                    break;
                case 6:
                    partialSearch(cargohold);
                    break;
                case 7:
                    ransack(cargohold);
                    break;
                case 0:
                    System.out.println("Thank you for using the BlackStar Cargo Hold interface. See you again soon!");
                    System.exit(0);
            }
        }

    }

    private void addItem(CNode cargohold) throws FileNotFoundException {

        CNode start, tail, next;
        start=null;
        next=null;

        Scanner in = new Scanner(System.in);
        boolean addedItem = false;
        double addedItemweight = 0;
        boolean weightLimit = false;
        System.out.println("Please enter an item name: ");
        String itemName = in.nextLine();
        System.out.println("Please enter Item weight in pound: ");
        double itemWeight = in.nextDouble();
        System.out.println("Please enter item Value in Dollar ");
        double itemValue = in.nextDouble();
        System.out.println("Please enter durability of the item: ");
        String itemDurab = in.next();
        System.out.println("Please enter a number to set item  ID  : ");
        int itemId = in.nextInt();
        System.out.println("please enter 1 if item is equipable");
        System.out.println("please enter 2 if item is consumable");
        System.out.println("please enter 3 if item is weapon");
        int addingchoice = userchoice.nextInt();
        userchoice.nextLine();
        switch (addingchoice) {
            case 1:
                // add item to equipable
                System.out.println("what is the use of this equipable ");
                String use = in.next();
                System.out.println("what is the volume of this equipable ");
                double volume = in.nextDouble();
                in.nextLine();
                System.out.println("what is the color of this equipable ");
                String color = in.next();

                if (totalweight + itemWeight <= 50000) {
                    Item eq = new Equipable(use, volume, color, itemName, itemWeight, itemValue, itemDurab, itemId);
                next = new CNode(eq);
                tail=start;
                    tail.setNext(next);
                    tail = next;
                    addedItem = true;

                }
                break;

            case 2:
                // add item to consumable
                System.out.println("what is the color of this consumable ");
                String consumecolor = in.next();
                System.out.println("what is the taste of this consumable ");
                String taste = in.next();
                System.out.println("what is the smell of this consumable ");
                String smell = in.next();

                if (totalweight + itemWeight <= 50000) {
                    Item con = new Consumable(consumecolor, taste, smell, itemName, itemWeight, itemValue, itemDurab, itemId);
                    next = new CNode(con);
                    tail=start;
                    tail.setNext(next);
                    tail = next;
                    addedItem = true;
                    addedItem = true;

                }
                break;
            case 3:
                // add item to weapon
                System.out.println("what kind of weapon is this item ");
                String kind = in.next();
                System.out.println("what is the model of this weapon ");
                String model = in.next();
                System.out.println("what is the area of effect in number ");
                double area_of_effect = in.nextDouble();

                if (totalweight + itemWeight <= 50000) {
                    Item wep = new Weapon(kind, model, area_of_effect, itemName, itemWeight, itemValue, itemDurab, itemId);
                    next = new CNode(wep);
                    tail=start;
                    tail.setNext(next);
                    tail = next;
                    addedItem = true;
                    addedItem = true;
                }
                break;

        }
        System.out.println(next.getData().getName());;
    }


    private void sortItems(CNode cargohold)  {

    }

    private void removeItem(CNode cargohold)  {

    }
    private void searchItems(CNode cargohold)  {

    }

    private void displayItems(CNode cargohold)  {

    }

    private void partialSearch(CNode cargohold)  {

    }

    private void ransack(CNode cargohold)  {

    }





}

