package edu.hm.cs.pblv.group3.controller.response.objects;

import java.util.ArrayList;

/**
 * @author Konstantin on 21.09.2018.
 */
public class CarouselSelect {

	public CarouselSelect() {

	}

	private ArrayList<CarouselItem> items = new ArrayList<>();

	public void addItem(CarouselItem item) {
		items.add(item);
	}

	public ArrayList<CarouselItem> getItems() {
		return items;
	}

	public void setItems(ArrayList<CarouselItem> items) {
		this.items = items;
	}
}
