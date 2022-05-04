package com.revature.pixott.model;

public class Movie {
	private int id;
	private String movie_name; 
	private String genre ;
	private String lead_studio;
	private int audience_score;
	private double  profitability ;
	private int rotten_tomatoes ;
	private double worldwide_sales;  
	private int year;
	public Movie() {
		
	}
	public Movie(int id, String movie_name, String genre, String lead_studio, int audience_score, double profitability,
			int rotten_tomatoes, double worldwide_sales, int year) {
		super();
		this.id = id;
		this.movie_name = movie_name;
		this.genre = genre;
		this.lead_studio = lead_studio;
		this.audience_score = audience_score;
		this.profitability = profitability;
		this.rotten_tomatoes = rotten_tomatoes;
		this.worldwide_sales = worldwide_sales;
		this.year = year;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovieName() {
		return movie_name;
	}
	public void setMovieName(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLeadStudio() {
		return lead_studio;
	}
	public void setLeadStudio(String lead_studio) {
		this.lead_studio = lead_studio;
	}
	public int getAudienceScore() {
		return audience_score;
	}
	public void setAudienceScore(int audience_score) {
		this.audience_score = audience_score;
	}
	public double getProfitability() {
		return profitability;
	}
	public void setProfitability(double profitability) {
		this.profitability = profitability;
	}
	public int getRottenTomatoes() {
		return rotten_tomatoes;
	}
	public void setRottenTomatoes(int rotten_tomatoes) {
		this.rotten_tomatoes = rotten_tomatoes;
	}
	public double getWorldwideSales() {
		return worldwide_sales;
	}
	public void setWorldwideSales(double worldwide_sales) {
		this.worldwide_sales = worldwide_sales;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + audience_score;
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + id;
		result = prime * result + ((lead_studio == null) ? 0 : lead_studio.hashCode());
		result = prime * result + ((movie_name == null) ? 0 : movie_name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(profitability);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + rotten_tomatoes;
		temp = Double.doubleToLongBits(worldwide_sales);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + year;
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
		Movie other = (Movie) obj;
		if (audience_score != other.audience_score)
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (id != other.id)
			return false;
		if (lead_studio == null) {
			if (other.lead_studio != null)
				return false;
		} else if (!lead_studio.equals(other.lead_studio))
			return false;
		if (movie_name == null) {
			if (other.movie_name != null)
				return false;
		} else if (!movie_name.equals(other.movie_name))
			return false;
		if (Double.doubleToLongBits(profitability) != Double.doubleToLongBits(other.profitability))
			return false;
		if (rotten_tomatoes != other.rotten_tomatoes)
			return false;
		if (Double.doubleToLongBits(worldwide_sales) != Double.doubleToLongBits(other.worldwide_sales))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return  String.format("%4d %-40s", id,movie_name );
	}
	
	
	

}