package com.gaurav.coronavirustracker;

public class LocationStats {
	
	
	private String state;
	private String country;
	private int totlaReportedCases;
	
	private int diffFromPrevoiusDay;
	
	
	
	public int getDiffFromPrevoiusDay() {
		return diffFromPrevoiusDay;
	}
	public void setDiffFromPrevoiusDay(int diffFromPrevoiusDay) {
		this.diffFromPrevoiusDay = diffFromPrevoiusDay;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getTotlaReportedCases() {
		return totlaReportedCases;
	}
	public void setTotlaReportedCases(int totlaReportedCases) {
		this.totlaReportedCases = totlaReportedCases;
	}
	@Override
	public String toString() {
		return "LocationStats [state=" + state + ", country=" + country + ", totlaReportedCases=" + totlaReportedCases
				+ "]";
	}
	
	
	

}
