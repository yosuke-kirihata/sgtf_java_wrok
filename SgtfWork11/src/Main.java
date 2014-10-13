import java.io.IOException;

/**
 * Work1.1 エコーバック
 * 
 * sgtf
 * @author yosuke kirihata
 *
 */
public class Main {
	
	public static void main(String[] args) throws IOException {//Stream(System.in.read)はエラー処理が必須
		String buff = "";//文字列作成用の一時変数
		
		System.out.print(">");
		
		//文字の入力を受け付ける
		while (true) {
			int c = System.in.read();//文字コードを得る
			
			if (c == '\r') {
				//無視
			} else if (c == '\n') {
				break; //Enterを入力した場合、繰り返しを抜ける
			} else {
				buff = buff + (char)c;//バッファ変数に入力文字を追加
			}
		}

		//文字列の表示
		if (buff.equals("")) {
			System.out.print("NONE");
		} else {
			System.out.print(buff);//完成した文字列を表示
		}
	}

}
