package ssr.prep.stringImpl;

public class UniqueStringCharWODS {

	public static boolean isUniqueString(String str) {
		boolean[] char_set = new boolean[256];

		int val = 0;
		for (int i = 0; i < str.length(); i++) {
			val = str.charAt(i);
			// System.out.println(val + " " + char_set[val]);
			if (char_set[val])
				return false;
			char_set[val] = true;
		}
		return true;

	}

	public static void main(String[] args) {

		if (isUniqueString("Kasam"))
			System.out.println("Unique");
		else
			System.out.println("Not Unique");

	}

}
