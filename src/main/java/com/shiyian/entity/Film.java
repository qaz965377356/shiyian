package com.shiyian.entity;

public class Film {
	private Integer id;
	private String filmname;
	private String filmpic;
	private String summary;
	public Film() {
		super();
	}

	public Film(String filmname, String filmpic, String summary) {
		this.filmname = filmname;
		this.filmpic = filmpic;
		this.summary = summary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFilmname() {
		return filmname;
	}

	public void setFilmname(String filmname) {
		this.filmname = filmname;
	}

	public String getFilmpic() {
		return filmpic;
	}

	public void setFilmpic(String filmpic) {
		this.filmpic = filmpic;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Override
	public String toString() {
		return "Film{" +
				"id=" + id +
				", filmname='" + filmname + '\'' +
				", filmpic='" + filmpic + '\'' +
				", summary='" + summary + '\'' +
				'}';
	}
}
