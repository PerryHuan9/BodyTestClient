package com.example.vip.recyclerview;

/**
 *
 */

public class Fruit {
	private int imageView;
	private String textView;

	public Fruit() {
	}

	public Fruit(int imageView, String textView) {
		this.imageView = imageView;
		this.textView = textView;
	}

	public int getImageView() {
		return imageView;
	}

	public void setImageView(int imageView) {
		this.imageView = imageView;
	}

	public String getTextView() {
		return textView;
	}

	public void setTextView(String textView) {
		this.textView = textView;
	}
}
