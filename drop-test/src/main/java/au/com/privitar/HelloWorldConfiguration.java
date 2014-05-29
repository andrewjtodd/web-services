package au.com.privitar;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class HelloWorldConfiguration extends Configuration {

    @NotEmpty
    private String template;

    @NotEmpty
    private String defaultName;

    @NotEmpty
    private Double CPI;

    @NotEmpty
    private Double salaryInflationIncrement;

    @NotEmpty
    private Double taxRate;

    @NotEmpty
    private Double defaultContributions;

    @NotEmpty
    private Double defaultReturn;

    @NotEmpty
    private Double defaultInsurance;

    @NotEmpty
    private Double defaultAdminFee;

    @NotEmpty
    private Double defaultMgtFee;

    @NotEmpty
    private Double defaultAdviserFee;

    public Double getCPI() {
        return CPI;
    }

    public void setCPI(Double CPI) {
        this.CPI = CPI;
    }

    public Double getSalaryInflationIncrement() {
        return salaryInflationIncrement;
    }

    public void setSalaryInflationIncrement(Double salaryInflationIncrement) {
        this.salaryInflationIncrement = salaryInflationIncrement;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Double getDefaultContributions() {
        return defaultContributions;
    }

    public void setDefaultContributions(Double defaultContributions) {
        this.defaultContributions = defaultContributions;
    }

    public Double getDefaultReturn() {
        return defaultReturn;
    }

    public void setDefaultReturn(Double defaultReturn) {
        this.defaultReturn = defaultReturn;
    }

    public Double getDefaultInsurance() {
        return defaultInsurance;
    }

    public void setDefaultInsurance(Double defaultInsurance) {
        this.defaultInsurance = defaultInsurance;
    }

    public Double getDefaultAdminFee() {
        return defaultAdminFee;
    }

    public void setDefaultAdminFee(Double defaultAdminFee) {
        this.defaultAdminFee = defaultAdminFee;
    }

    public Double getDefaultMgtFee() {
        return defaultMgtFee;
    }

    public void setDefaultMgtFee(Double defaultMgtFee) {
        this.defaultMgtFee = defaultMgtFee;
    }

    public Double getDefaultAdviserFee() {
        return defaultAdviserFee;
    }

    public void setDefaultAdviserFee(Double defaultAdviserFee) {
        this.defaultAdviserFee = defaultAdviserFee;
    }

    @Valid
    @NotNull
    private DataSourceFactory database = new DataSourceFactory();

    @JsonProperty
    public String getTemplate() {
        return template;
    }

    @JsonProperty
    public void setTemplate(String template) {
        this.template = template;
    }

    @JsonProperty
    public String getDefaultName() {
        return defaultName;
    }

    @JsonProperty
    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName;
    }

    @JsonProperty("database")
    public DataSourceFactory getDatabase() {
        return database;
    }

    @JsonProperty("database")
    public void setDatabase(DataSourceFactory database) {
        this.database = database;
    }

//    public Template buildTemplate() {
//        return new Template(template, defaultName);
//    }
}
