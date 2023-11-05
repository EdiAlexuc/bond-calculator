package com.edquant.bondcalculator;

public class Bond {

    private Long id;
    private String name;
    private double parValue;
    private double couponRate;
    private int yearsToMaturity;
    private double marketRate;

    public Bond(Long id, String name, double parValue, double couponRate, int yearsToMaturity, double marketRate) {
        this.id = id;
        this.name = name;
        this.parValue = parValue;
        this.couponRate = couponRate;
        this.yearsToMaturity = yearsToMaturity;
        this.marketRate = marketRate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getParValue() {
        return parValue;
    }

    public void setParValue(double parValue) {
        this.parValue = parValue;
    }

    public double getCouponRate() {
        return couponRate;
    }

    public void setCouponRate(double couponRate) {
        this.couponRate = couponRate;
    }

    public int getYearsToMaturity() {
        return yearsToMaturity;
    }

    public void setYearsToMaturity(int yearsToMaturity) {
        this.yearsToMaturity = yearsToMaturity;
    }

    public double getMarketRate() {
        return marketRate;
    }

    public void setMarketRate(double marketRate) {
        this.marketRate = marketRate;
    }
}
