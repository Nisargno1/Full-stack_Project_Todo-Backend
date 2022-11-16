package com.nisargPatel.story;

import java.awt.image.BufferedImage;

public class Story {
	private String description;
	private BufferedImage image;
	public Story() {
		super();
	}
	public Story(String description, BufferedImage image) {
		super();
		this.description = description;
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BufferedImage getImage() {
		return image;
	}
	public void setImage(BufferedImage image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Story [description=" + description + ", image=" + image + "]";
	}
	
	
}
