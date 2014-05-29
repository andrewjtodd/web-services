package au.com.privitar;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import io.dropwizard.Configuration;

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
public class HelloWorldResource {
    private final String template;
    private final String defaultName;
    private final AtomicLong counter;
    private final CalcConfiguration config;

    public HelloWorldResource(String template, String defaultName, Configuration config) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
        this.config = (CalcConfiguration) config;
    }
    @GET
    @Timed
    public Saying sayHello(@QueryParam("name") Optional<String> name) {
        final String value = String.format(template, name.or(defaultName));

        final Double thefee = config.getTaxRate();
        return new Saying(counter.incrementAndGet(), thefee);
    }
}
