public class LongSubs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println(lengthOfLongestSubstring("c"));
		 */
		System.out.println(longestPalindrome("aaabaaaa"));
	}

	public int lengthOfLongestSubstring(String s) {
		if (s.length() == 1) {
			return 1;
		}
		int maxlen = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = s.length(); j >= i; j--) {
				String s2 = s.substring(i, j);
				if (validString(s2)) {
					if (maxlen < s2.length()) {
						maxlen = s2.length();
					}
				}
			}
		}

		return maxlen;
	}

	private static boolean validString(String s2) {
		for (int i = 0; i < s2.length(); i++) {
			if (s2.lastIndexOf(s2.charAt(i)) > i) {
				return false;
			}
		}
		return true;
	}

	private static boolean validStringPalindrome(String s2) {
		StringBuilder sb = new StringBuilder(s2);
		return sb.reverse().toString().equals(s2);
	}

	public static String longestPalindrome(String s) {
		String maxString = "";
		int maxlen = 0;
		if (s.length() == 1) {
			return s;
		}
		int i = 0;
		int j = s.length() - 1;
		while ( i < s.length() / 2) {

			String s1 = s.substring(i, j + 1);
			if (validString(s1)) {
				if (maxlen < s1.length()) {
					maxlen = s1.length();
					maxString = s1;
				}
			}
			String s2 = s.substring(i + 1, j);
			if (validString(s2)) {
				if (maxlen < s2.length()) {
					maxlen = s2.length();
					maxString = s2;
				}
			}
			String s3 = s.substring(i + 1, j + 1);
			if (validString(s3)) {
				if (maxlen < s3.length()) {
					maxlen = s3.length();
					maxString = s3;
				}
			}
			
		}

		return maxString;
	}

}
