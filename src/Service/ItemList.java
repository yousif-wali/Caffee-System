package Service;

import java.util.ArrayList;
import java.util.List;


import Models.Item;

public class ItemList {
	public static List<Item> Data = new ArrayList<>();
	
	public static void Insert(Item item) {
		ItemList.Data.add(item);
	}
}
