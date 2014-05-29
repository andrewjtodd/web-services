package au.com.privitar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Andrew Todd on 30/05/2014.
 */
public class RetirementPredictorCalculator {
    final static Logger logger = LoggerFactory.getLogger(RetirementPredictorCalculator.class);


    public RetirementPredictorCalculator() {
        logger.debug("Created a calculator");
    }

    private Double getIncrement(CalcConfiguration configuration) {

        Double cpi = configuration.getCPI();
        Double salaryComponent = configuration.getSalaryInflationIncrement();
        return cpi + salaryComponent;

    }

    public Double doPrediction(CalcConfiguration configuration) {
        logger.debug("Starting prediction");

        return getIncrement(configuration);
    }
}
