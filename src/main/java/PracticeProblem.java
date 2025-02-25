public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(isPalindrome("aaabaaa"));
	}

	public static boolean isPalindrome(String word) {
		word = word.toLowerCase().replaceAll(" ", "");
		for (int i = 0; i < word.length() / 2; i++) {
			if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static int getAge(String[] names, int[] ages, String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i] == name) {
				return ages[i];
			}
		}
		return -1;
	}

	public static int countWords(String words, char search) {
		String[] wordArr = words.split(" ");
		int count = 0;
		for (String currWord : wordArr) {
			if (currWord.indexOf(search) != -1) {
				count++;
			}
		}
		return count;
	}
}
