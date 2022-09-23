import java.text.DecimalFormat;

public interface Lab_05_01_ShipCostCalculator {
    public static void main(String[] args) {
        // Class ShipCost
        //	Main()
        //		num itemCost = 0
        //		num shipCost = itemCost * 0.02
        //		num totalCost = itemCost + shipCost
        //		output “What is the price of the item?”
        //		input itemCost
        //		if itemCost >= 100.00 then
        //			output “This item gets free shipping”
        //		else
        //			output  “Your shipping cost is “ + shipCost “ and the total price is” + totalCost
        //		end if
        //	return
        //end class
        double itemCost = 12.59;
        double shipCost = itemCost * .02;
        double totalCost = itemCost + shipCost;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("What is the price of the item?");
        System.out.println("The item cost is $" + itemCost);
        if (itemCost >= 100) {
            System.out.println("This item gets free shipping");
        }
        else{
            System.out.println("Your shipping cost is $" + df.format(shipCost) + " and the total price is $" + df.format(totalCost));
        }
 }
}
