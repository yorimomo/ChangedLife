package life.ChangedLife.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 人間のエンティティクラスです。
 * @author PCUser
 *
 */
@Aspect
@Component
public class MorningActivity {

	//氏名
	private String name = "菅直人";
	//年齢(文字列)
	private String age = "23歳";

	/**
	 * 氏名を取得します。
	 * @return 氏名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 氏名を設定します。
	 * @param name 氏名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 年齢を取得します。
	 * @return 年齢
	 */
	public String getAge() {
		return age;
	}

	/**
	 * 年齢を設定します。
	 * @param age 年齢
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * 朝の活動を始めます。
	 */
	@Before("execution(* life.ChangedLife.Service.DayTimeLife.do*(..))")
	public void beginActivity() {
		putOn("ヨレヨレのYシャツ", "ジーンズ", "クロックス");
		eatBreakfast();
		leaveHome();
	}

	/**
	 * 服を着ます。
	 * @param shirt シャツ
	 * @param pants ズボン
	 * @param shoes 靴
	 */
	public void putOn(String shirt, String pants, String shoes) {
		System.out.println(getName() + "は" + shirt + "を着た!");
		System.out.println(getName() + "は" + pants + "を穿いた!");
		System.out.println(getName() + "は" + shoes + "を履いた!");
	}

	/**
	 * 朝食を食べます。
	 */
	public void eatBreakfast() {
		System.out.println(getName() + "は朝食を5分で食べた!");
	}

	/**
	 * 家を出発します。
	 */
	public void leaveHome() {
		System.out.println(getName() + "家を出発した!");
	}

}
