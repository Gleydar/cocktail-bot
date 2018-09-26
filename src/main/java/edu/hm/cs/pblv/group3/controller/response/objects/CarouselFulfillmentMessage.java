package edu.hm.cs.pblv.group3.controller.response.objects;

/**
 * @author Konstantin on 21.09.2018.
 */
public class CarouselFulfillmentMessage implements IFulfillmentMessage{

	public CarouselSelect carouselSelect;
	public String platform = "ACTIONS_ON_GOOGLE";

	public CarouselFulfillmentMessage() {
		this.carouselSelect = new CarouselSelect();
	}

	public CarouselSelect getCarouselSelect() {
		return carouselSelect;
	}

	public void setCarouselSelect(CarouselSelect carouselSelect) {
		this.carouselSelect = carouselSelect;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}
}
