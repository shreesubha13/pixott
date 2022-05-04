package com.revature.pixott.model;

public class Top5movies {
	private int id;
	private String moviename;
	public Top5movies() {
		
	}
	public Top5movies(int id, String moviename) {
		super();
		this.id = id;
		this.moviename = moviename;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((moviename == null) ? 0 : moviename.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Top5movies other = (Top5movies) obj;
		if (id != other.id)
			return false;
		if (moviename == null) {
			if (other.moviename != null)
				return false;
		} else if (!moviename.equals(other.moviename))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return String.format("%4d %-40s",id,moviename);
	}
	
	
	
	}