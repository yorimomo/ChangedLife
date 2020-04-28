package life.ChangedLife.Service;

import org.springframework.stereotype.Service;

@Service
public class DayTimeLife {

	/**
	 * 仕事をします。
	 */
	public void doJob() {
		System.out.println("菅直人" + "はちゃんと仕事をした!!");
	}

	/**
	 * 山を登ります。
	 */
	public void doHikeMountains() {
		System.out.println("菅直人" + "は山々を縦走した!");
	}

	/**
	 * 散歩します。
	 */
	public void doWalk() {
		System.out.println("菅直人" + "は暇だから散歩をした!");
	}
}
