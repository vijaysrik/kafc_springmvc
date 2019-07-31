package com.marketplace.model.art;

import java.math.BigDecimal;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.postgresql.util.Base64;

@Entity
@Table(name = "artwork")
public class ArtWork {
	@Column(name = "name")
	private String name;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	/*
	 * private String artistname; private Long artistid;
	 */
	@ManyToOne
	@JoinColumn(name = "artistid", nullable = false)
	private Artist artist;
	@Column(name = "medium")
	private String medium;
	@Column(name = "price")
	private BigDecimal price;
	@Column(name = "imagefile")
	private byte[] imagefile;
	// filepath

	// private Long userid;
	@Column(name = "length")
	private int length;
	@Column(name = "width")
	private int width;
	@Column(name = "description")
	private String description;
	@Transient
	private String base64Image;

	public String getBase64Image() {
		return base64Image;
	}

	public void setBase64Image(String base64Image) {
       // this.base64Image=Base64.encodeBytes(this.getImagefile());
		this.base64Image= base64Image;
	}

	public String getName() {
		return name;
	}

	public void setName(String artname) {
		this.name = artname;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long artid) {
		this.id = artid;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public byte[] getImagefile() {
		return imagefile;
	}

	public void setImagefile(byte[] imagefile) {
		this.imagefile = imagefile;
	}

	/*
	 * public Long getUserid() { return userid; } public void setUserid(Long userid)
	 * { this.userid = userid; }
	 */
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
