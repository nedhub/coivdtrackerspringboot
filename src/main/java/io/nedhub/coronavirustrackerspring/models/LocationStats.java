package io.nedhub.coronavirustrackerspring.models;

public class LocationStats {


    private String state;
    private String country;
    private int latestTotalReportedCases;


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

    public int getLatestTotalReportedCases() {
        return latestTotalReportedCases;

    }

    public void setLatestTotalReportedCases(int latestTotalReportedCases) {
        this.latestTotalReportedCases = latestTotalReportedCases;
    }



}
