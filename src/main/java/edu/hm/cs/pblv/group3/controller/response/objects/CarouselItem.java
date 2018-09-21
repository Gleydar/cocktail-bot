package edu.hm.cs.pblv.group3.controller.response.objects;

/**
 * @author Konstantin on 21.09.2018.
 */
public class CarouselItem {

	private CarouselItemInfoWrapper info;
	private String title;
	private String description = "A nice description";
//	private CarouselImage image;

	public CarouselItem(String title) {
		this.info = new CarouselItemInfoWrapper(new CarouselItemInfo(title));
		this.title = title;
	}

	public CarouselItemInfoWrapper getInfo() {
		return info;
	}

	public void setInfo(CarouselItemInfoWrapper info) {
		this.info = info;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

/*	public CarouselImage getImage() {
		return image;
	}
*/
/*	public void setImage(CarouselImage image) {
		this.image = image;
	}
	*/
}
