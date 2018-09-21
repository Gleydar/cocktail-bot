package edu.hm.cs.pblv.group3.controller.response.objects;

/**
 * @author Konstantin on 21.09.2018.
 */
public class CarouselItemInfoWrapper {
	CarouselItemInfo itemInfo;

	public CarouselItemInfoWrapper(CarouselItemInfo itemInfo) {
		this.itemInfo = itemInfo;
	}

	public CarouselItemInfo getItemInfo() {
		return itemInfo;
	}

	public void setItemInfo(CarouselItemInfo itemInfo) {
		this.itemInfo = itemInfo;
	}
}
