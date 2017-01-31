package apple.sdet;

public class StringProblem {

	public static void main(String[] args) {
		
		if (args.length < 2)
			System.out.println("Using default");
		else {
			str = args[0];
			ch = args[1].charAt(0);
		}
		System.out.println("Main string = " + str);
		StringProblem sp = new StringProblem();
		System.out.println("Result from Customize Remove method = " + sp.removeCharacterCustomize(str, ch));
		System.out.println("Result from In built method = " + sp.removeInbuiltMethod(str, ch));
	}

	public static String str = "Apple";
	public static char ch = 'p';

	public String removeCharacterCustomize(String s, char c) {
			if (s == null)
				return null;
			String res = "";
		    char[] chstr = s.toCharArray();
		    for (char celem : chstr) {
		    	if (celem != c)
		    		res += celem;
		    }
			return res;
		}

	public String removeInbuiltMethod(String s, char c) {
			if (s == null)
				return null;
			String res = "";
			res = s.replace(String.valueOf(c), "");
			return res;
		}

}
