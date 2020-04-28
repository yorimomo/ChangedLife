package life.ChangedLife.Aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 	目覚ましのエンティティクラスです。
 * @author PCUser
 *
 */
@Aspect
@Component
public class Clock {

	/**
	 * アラームを3回鳴らします。
	 */
	@Before("execution(* life.ChangedLife.Service.DayTimeLife.do*(..))")
	public void ringAlarm() {

		for (int i = 0; i < 3; i++) {
			System.out.println("目覚まし時計のアラームが鳴りました(" + (i + 1) + "回目)");
		}
	}

}
