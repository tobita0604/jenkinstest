package javaProject;

public class mainClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("九九の表");
		String name;

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
		subClass.print();
	}

}
