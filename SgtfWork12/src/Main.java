import java.io.IOException;

/**
 * Work1.2 配列(リスト)への文字列追加
 * 
 * sgtf
 * @author yosuke kirihata
 *
 */
public class Main {
	
	public static final int MAX_ARRAY_SIZE = 100;//配列サイズの定義
	
	public static void main(String[] args) throws IOException {//Stream(System.in.read)はエラー処理が必須
		String buff = "";//文字列作成用の一時変数
		
		String[] array = new String[MAX_ARRAY_SIZE];//文字列格納用配列の宣言
		int index = 0;//文字列格納用配列の位置を指す変数
		
		while (true) {
			System.out.print(">");
			
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

			//文字列の格納
			if (index < MAX_ARRAY_SIZE) { //配列範囲外を使用しないように制限
				array[index] = buff;//完成した文字列を格納
				buff = "";//一時変数のクリア
				index++;//位置を移動
			}
			
			//配列の表示
			for (int i = 0; i < index; i++) {
				System.out.println(array[i]);
			}
			
		}
	}

}
