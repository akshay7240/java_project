import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main 
{
	public static void main(String[] args)
	{
		float sum=0,i=0;
        List<Items> ItemsDetails=Arrays.asList(new Items(101,"Black Sleeveless Shirt",2000,"Louis Philepe"),new Items(101,"Yellow Full Sleeve Check Shirt",2800,"Allen Solly"),
        		new Items(102,"Maroon check formal trousers", 3500, "UCB"),
        		new Items(103,"Blue Shade Jeans",4500,"Basics")
        		);
        System.out.println("Items Details");
		System.out.println("----------------");
        Collections.sort(ItemsDetails,Collections.reverseOrder());
        System.out.println("ItemId\tShortDescription\t\tPrice\tBrand");
      
        for(Items item : ItemsDetails)
        {
        	System.out.println(item);
        }
        
        
	}

	

	

	
}
