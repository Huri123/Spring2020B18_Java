package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

/*
create a class called ShoppingList
			create 5 objects of Item and store them into List of Items
			calculate the total cost of all Items in the list
 */
public class ShoppingList {
    public static void main(String[] args) {

        //Item item1=new Item();//error verir cunku Item() diye bir constructor yok
        // Item item1=new Item(2.5);//error verir cunku var olan constructor hangi pararmeteri istiyorsa onu yazmalisin

        Item item1 = new Item("Toilet paper", 25, 100);
       // System.out.println(item1.calcCost());
        //System.out.println(item1); //compiler executes toString method

        Item item2 = new Item("Paint Brush", 3, 5);
        Item item3 = new Item("Canvas", 4, 6);
        Item item4 = new Item("Apron", 5, 1);
        Item item5 = new Item("Isle", 10, 1);

        ArrayList<Item>shoppingList=new ArrayList<>();//(burasi String olsaydi tum dataType string olmak zorundaydi. ama int ve double da var.o yuzden Item yaptik)
   shoppingList.addAll(Arrays.asList(item1,item2,item3,item4,item5));

   double totalCost=0;
   /*solution 1
        for(Item each:shoppingList){//each represents each of the item
            totalCost+=each.calcCost();
        }
    */

        for (int i=0;i<shoppingList.size();i++){
            totalCost+=shoppingList.get(i).calcCost();
        }
        System.out.println("Total: "+totalCost);
    }
}
