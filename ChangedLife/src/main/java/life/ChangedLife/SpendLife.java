package life.ChangedLife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import life.ChangedLife.Config.AppConfig;
import life.ChangedLife.Service.DayTimeLife;

/**
 * Hello world!
 *
 */
public class SpendLife
{

    public static void main( String[] args )
    {

    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	DayTimeLife dayTimeLife = context.getBean(DayTimeLife.class);

		System.out.println("****************************************************");
		System.out.println("4月1日の生活が始まります。");

		//仕事を行う
		dayTimeLife.doJob();

		System.out.println("4月1日の生活が終わります。");
		System.out.println("****************************************************");

		System.out.println("****************************************************");
		System.out.println("4月2日の生活が始まります。");

		//仕事を行う
		dayTimeLife.doHikeMountains();

		System.out.println("4月2日の生活が終わります。");
		System.out.println("****************************************************");

		System.out.println("****************************************************");
		System.out.println("4月3日の生活が始まります。");

		//仕事を行う
		dayTimeLife.doWalk();

		System.out.println("4月3日の生活が終わります。");
		System.out.println("****************************************************");

		((ConfigurableApplicationContext) context).close();

    }
}
