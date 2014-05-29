package au.com.privitar;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

/**
 * Created by dev on 27/05/2014.
 */
public class Saying {
    private long id;

    @Length(max = 3)
    private String content;
    private Double value;

    public Saying() {

    }

    public Saying(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Saying(long id, Double value) {
        this.id = id;
        this.value = value;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }

    @JsonProperty
    public Double getvalue() { return value; }
}
