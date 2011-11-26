/**
 * テストクラス。
 */
public class test1 {

	/**
	 * 改行文字列。
	 */
	private static final String LINE_SEP = System.getProperty("line.separator");

	/**
	 * メイン。
	 * @param args			起動引数
	 * @return なし
	 */
	public static void main(String[] args) {
		try {
			String s1 = "aaa";
			String s2 = "bbb";
			String s3 = "aaa";

			test1 obj1 = new test1();
			test1 obj2 = new test1();

			System.out.println("s1=" + s1 + ", s2=" + s2 + ", s3=" + s3);
			System.out.println("s1.hashCode()=" + s1.hashCode() + ", s2.hashCode()=" + s2.hashCode() + ", s3.hashCode()=" + s3.hashCode());
			System.out.println("s1.equals(s3)=" + s1.equals(s3));

			System.out.println("obj1.hashCode()=" + obj1.hashCode() + ", obj2.hashCode()=" + obj2.hashCode());
			System.out.println("obj1.equals(obj2)=" + obj1.equals(obj2));

			System.out.println("Hello World!" + LINE_SEP + LINE_SEP +
								"(" +
								"JVMﾍﾞﾝﾀﾞｰ：" + System.getProperty("java.vm.vendor") + LINE_SEP +
								"JVMﾊﾞｰｼﾞｮﾝ：" + System.getProperty("java.vm.version") + LINE_SEP +
								"ﾃﾞﾌｫﾙﾄｴﾝｺｰﾃﾞｨﾝｸﾞ：" + System.getProperty("file.encoding") +
								")");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
