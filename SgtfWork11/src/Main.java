import java.io.IOException;

/**
 * Work1.1 エコーバック
 * 
 * sgtf
 * @author yosuke kirihata
 *
 */
public class Main {

	public static final int KEY_CODE_ENTER = 10;
	
	public static void main(String[] args) throws IOException {//Stream(System.in.read)はエラー処理が必須

		System.out.print(">");
		
		while (true) {
			int c = System.in.read();//文字コードを得る
			if (c == KEY_CODE_ENTER) {
				break; //Enterを入力した場合、繰り返しを抜ける
			}
			System.out.print((char)c);//入力文字を出力(文字コードをchar型でキャスト)
		}
	}

}
