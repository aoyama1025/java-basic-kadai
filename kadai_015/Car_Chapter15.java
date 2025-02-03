package kadai_015;

public class Car_Chapter15 {
	//フィールド
	private int gear = 1; //1速から5速のギアを表す
	private int speed = 10; //ギアチェンジ後の速度を表す

	//コンストラクタ
	public Car_Chapter15(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}

	public Car_Chapter15() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	//メソッド
	//ギアの値により速度を変える
	public void gearChange(int afterGear) {

		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");

		this.gear = afterGear;

		this.speed = switch (this.gear) {
		case 1 -> 10;
		case 2 -> 20;
		case 3 -> 30;
		case 4 -> 40;
		case 5 -> 50;
		default -> 10;
		};
	}

	//ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");

	}
}
