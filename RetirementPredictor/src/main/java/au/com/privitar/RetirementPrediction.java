package au.com.privitar;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

/**
 * Created by dev on 27/05/2014.
 */
public class RetirementPrediction {

    private long id;

    @Length(max = 3)
    private Double value;

    public RetirementPrediction(long id, Double value) {
        this.id = id;
        this.value = value;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public Double getvalue() { return value; }
}
