package au.com.privitar;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

/**
 * Created by dev on 29/05/2014.
 */
public class CalcConfiguration extends Configuration {

    private Double CPI;
    private Double salaryInflationIncrement;
    private Double taxRate;
    private Double defaultContributions;
    private Double defaultReturn;
    private Double defaultInsurance;
    private Double defaultAdminFee;
    private Double defaultMgtFee;
    private Double defaultAdviserFee;

    @JsonProperty
    public Double getCPI() {
        return CPI;
    }

    @JsonProperty
    public void setCPI(Double CPI) {
        this.CPI = CPI;
    }

    @JsonProperty
    public Double getSalaryInflationIncrement() {
        return salaryInflationIncrement;
    }

    @JsonProperty
    public void setSalaryInflationIncrement(Double salaryInflationIncrement) {
        this.salaryInflationIncrement = salaryInflationIncrement;
    }

    @JsonProperty
    public Double getTaxRate() {
        return taxRate;
    }

    @JsonProperty
    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    @JsonProperty
    public Double getDefaultContributions() {
        return defaultContributions;
    }

    @JsonProperty
    public void setDefaultContributions(Double defaultContributions) {
        this.defaultContributions = defaultContributions;
    }

    @JsonProperty
    public Double getDefaultReturn() {
        return defaultReturn;
    }

    @JsonProperty
    public void setDefaultReturn(Double defaultReturn) {
        this.defaultReturn = defaultReturn;
    }

    @JsonProperty
    public Double getDefaultInsurance() {
        return defaultInsurance;
    }

    @JsonProperty
    public void setDefaultInsurance(Double defaultInsurance) {
        this.defaultInsurance = defaultInsurance;
    }

    @JsonProperty
    public Double getDefaultAdminFee() {
        return defaultAdminFee;
    }

    @JsonProperty
    public void setDefaultAdminFee(Double defaultAdminFee) {
        this.defaultAdminFee = defaultAdminFee;
    }

    @JsonProperty
    public Double getDefaultMgtFee() {
        return defaultMgtFee;
    }

    @JsonProperty
    public void setDefaultMgtFee(Double defaultMgtFee) {
        this.defaultMgtFee = defaultMgtFee;
    }

    @JsonProperty
    public Double getDefaultAdviserFee() {
        return defaultAdviserFee;
    }

    @JsonProperty
    public void setDefaultAdviserFee(Double defaultAdviserFee) {
        this.defaultAdviserFee = defaultAdviserFee;
    }
}
