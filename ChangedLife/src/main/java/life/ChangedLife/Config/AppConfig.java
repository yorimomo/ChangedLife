package life.ChangedLife.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import life.ChangedLife.Aspect.Clock;
import life.ChangedLife.Aspect.MorningActivity;
import life.ChangedLife.Service.DayTimeLife;

@Configuration
//@ComponentScan(basePackages = "life.ChangedLife.Aspect.*")
@EnableAspectJAutoProxy
public class AppConfig {

	@Bean
	Clock clock() {
		return new Clock();
	}

	@Bean
	MorningActivity morningActivity() {
		return new MorningActivity();
	}

	@Bean
	DayTimeLife dayTimeLife() {
		return new DayTimeLife();
	}
}