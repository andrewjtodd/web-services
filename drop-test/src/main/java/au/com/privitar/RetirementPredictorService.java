package au.com.privitar;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class RetirementPredictorService extends Application<RetirementPredictorConfiguration> {

    public static void main(String[] args) throws Exception {
        new RetirementPredictorService().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<RetirementPredictorConfiguration> bootstrap) {

    }

    @Override
    public void run(RetirementPredictorConfiguration configuration, Environment environment) {
        final RetirementPredictorResource resource = new RetirementPredictorResource(configuration.getTemplate(), configuration.getDefaultName(), configuration.getCalcConfiguration());

        final TemplateHealthCheck healthCheck = new TemplateHealthCheck(configuration.getTemplate());
        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(resource);
    }
}
