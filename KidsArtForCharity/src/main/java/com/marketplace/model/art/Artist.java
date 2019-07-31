package com.marketplace.model.art;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="artist")
public class Artist {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long artistid;
	@Column(name="name")
	private String name;
	@Column(name="age")
	private int age;
	@Column(name="profile")
	private String profile;
	@OneToMany(mappedBy="artist")
	private Set<ArtWork> artworks;
	@Column(name="userid")
	private Long userid;
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public Long getArtistid() {
		return artistid;
	}
	public void setArtistid(Long id) {
		this.artistid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public Set<ArtWork> getArtworks() {
		return artworks;
	}
	public void setArtworks(Set<ArtWork> artworks) {
		this.artworks = artworks;
	}

}
