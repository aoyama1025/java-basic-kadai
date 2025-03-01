package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	//自分のじゃんけんの手を入力するメソッド
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			String input = scanner.next();

			if ((input.equals("r")) || (input.equals("s")) || input.equals("p")) {
				scanner.close();
				return input;
			} else {
				System.out.println("エラー：再度自分のじゃんけんの手を入力しましょう\n");

			}
		}

	}

	//対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {
		String[] handsArray = { "r", "s", "p" };
		String hands = handsArray[(int) Math.floor(Math.random() * 3)];
		return hands;
	}

	//じゃんけんを行うメソッド
	public void playGame(String myHand, String cpuHand) {

		//自分と対戦相手のじゃんけんの手を出力する
		HashMap<String, String> hand = new HashMap<String, String>();
		hand.put("r", "グー");
		hand.put("s", "チョキ");
		hand.put("p", "パー");

		System.out.println("自分の手は" + hand.get(myHand) + ",対戦相手の手は" + hand.get(cpuHand));

		//自分と対戦相手のじゃんけんの手を比較する
		if ((myHand.equals("r") && cpuHand.equals("s")) || (myHand.equals("s") && cpuHand.equals("p"))
				|| (myHand.equals("p") && cpuHand.equals("r"))) {
			System.out.println("自分の勝ちです");

		} else if ((myHand.equals("r") && cpuHand.equals("p")) || (myHand.equals("s") && cpuHand.equals("r"))
				|| (myHand.equals("p") && cpuHand.equals("s"))) {
			System.out.println("自分の負けです");

		} else {
			System.out.println("あいこです");
		}
	}
}
