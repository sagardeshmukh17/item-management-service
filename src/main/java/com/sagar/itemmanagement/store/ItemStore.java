package com.sagar.itemmanagement.store;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import com.sagar.itemmanagement.model.Item;

public class ItemStore {
	
	
	private static final List<Item> items = new ArrayList<>();
	private static final AtomicLong idCounter = new AtomicLong(1);
	
	public static Item addItem(Item item) {
		item.setId(idCounter.getAndIncrement());
		items.add(item);
		return item;
	}
	
	public static Optional<Item> getItemById(Long id){
		return items.stream().filter(item -> item.getId().equals(id)).findFirst();
	}

}
