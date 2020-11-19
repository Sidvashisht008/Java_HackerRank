public static String RemoveLetters(String s,List<Character> arr) {
		StringBuilder str = new StringBuilder(s); 
		for(int i = 0;i<str.length();i++) {
			if(arr.contains(str.charAt(i))) {
				str.deleteCharAt(i);
				i--;
			}
		}
		return str.toString();
	}
