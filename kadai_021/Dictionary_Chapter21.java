package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	HashMap<String, String> dictionary = new HashMap<String, String>();

	// コンストラクタ
	public Dictionary_Chapter21() {
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
	}

	//辞書を調べるメソッド
	public void search(String[] englishWords) {
		for (int i = 0; i < englishWords.length; i++) {
			String fruit = dictionary.get(englishWords[i]);
			if (fruit == null) {
				System.out.println(englishWords[i] + "は辞書に存在しません");
			} else {
				System.out.println(englishWords[i] + "の意味は" + fruit);
			}
		}

	}
}
