package au.com.privitar;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import io.dropwizard.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by dev on 27/05/2014.
 */
@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class RetirementPredictorResource {
    final static Logger logger = LoggerFactory.getLogger(RetirementPredictorResource.class);

    //    private final String template;
//    private final String defaultName;
    private final AtomicLong counter;
    private final CalcConfiguration config;

    public RetirementPredictorResource(String template, String defaultName, Configuration config) {
//        this.template = template;
//        this.defaultName = defaultName;
        this.counter = new AtomicLong();
        this.config = (CalcConfiguration) config;
    }
    @GET
    @Timed
    public Saying predictRetirement(@QueryParam("name") Optional<String> name) {
        logger.debug("Predicting retirement");
        //final String value = String.format(template, name.or(defaultName));

        RetirementPredictorCalculator calculator = new RetirementPredictorCalculator();
        Double prediction = calculator.doPrediction(config);

        return new Saying(counter.incrementAndGet(), prediction);
    }
}
