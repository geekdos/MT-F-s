package com.ensaf.etudiant.mtapplication.model;

public class DummyModel {
	
	private long mId;
	private String mImageURL;
	private String mText;
	private String mDescription;
	private int mIconRes;
	private double mx, my;
	private String mplaceName;


	public DummyModel() {
	}

	public DummyModel(long id, String imageURL, String text, int iconRes) {
		mId = id;
		mImageURL = imageURL;
		mText = text;
		mIconRes = iconRes;
	}

	public DummyModel(long id,double x, double y, String placeName, String imageURL, String text, String description, int iconRes) {
		mId = id;
		mx = x;
		my = y;
		mplaceName = placeName;
		mImageURL = imageURL;
		mText = text;
		mIconRes = iconRes;
		mDescription = description;
	}

	public long getId() {
		return mId;
	}

	public void setId(long id) {
		mId = id;
	}

	public String getImageURL() {
		return mImageURL;
	}

	public void setImageURL(String imageURL) {
		mImageURL = imageURL;
	}

	public String getText() {
		return mText;
	}

	public void setText(String text) {
		mText = text;
	}

	public int getIconRes() {
		return mIconRes;
	}

	public void setIconRes(int iconRes) {
		mIconRes = iconRes;
	}

	public String getDescription() {
		return mDescription;
	}

	public void setDescription(String desciption) {
		this.mDescription = desciption;
	}

	public double getMx() {
		return mx;
	}

	public void setMx(double x) {
		this.mx = x;
	}

	public double getMy() {
		return my;
	}

	public void setMy(double y) {
		this.my = y;
	}

	public String getMplaceName() {
		return mplaceName;
	}

	public void setMplaceName(String placeName) {
		this.mplaceName = placeName;
	}

	@Override
	public String toString() {
		return mText;
	}
}
