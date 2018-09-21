package edu.hm.cs.pblv.group3.controller.response.objects;

/**
 * @author Konstantin on 21.09.2018.
 */
public class FulfillmentMessage {

	public CarouselSelect carouselSelect;

	public FulfillmentMessage() {
		this.carouselSelect = new CarouselSelect();
	}

	public CarouselSelect getCarouselSelect() {
		return carouselSelect;
	}

	public void setCarouselSelect(CarouselSelect carouselSelect) {
		this.carouselSelect = carouselSelect;
	}
}
