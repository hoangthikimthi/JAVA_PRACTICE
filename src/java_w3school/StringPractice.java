package java_w3school;

public class StringPractice {

	public static void main(String[] args) {
		BT_05();

	}

	public static void BT_05() {
		String s1 = "this is index of example";
		int index1 = s1.indexOf("is");
		int index2 = s1.indexOf("index");
		System.out.println(index1 + "  " + index2);// 2 8

		// Truyền vào chuỗi con và chỉ số bắt đầu
		int index3 = s1.indexOf("is", 4);
		System.out.println(index3);// 5

		// Truyền vào giá trị Char
		int index4 = s1.indexOf('s');
		System.out.println(index4);// 3

	}

	public static void BT_01() {
		String str = "Hoangthi kimthi";
		System.out.println(str.charAt(0));
	}
}
