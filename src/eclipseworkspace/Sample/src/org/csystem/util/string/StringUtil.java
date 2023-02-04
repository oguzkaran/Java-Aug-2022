/*----------------------------------------------------------------
	FILE		: StringUtil.java
	AUTHOR		: Java-Aug-2022 Group
	LAST UPDATE	: 04.02.2023

	Utility class for string operations

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.string;

public class StringUtil {	
	
	public static String capitalize(String s)
	{
		return s.isEmpty() ? "" : Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
	}	
	
	public static int countString(String s1, String s2)
	{
		int count = 0;		
		
		for (int i = -1; (i = s1.indexOf(s2, i + 1)) != -1; ++count)
			;			
		
		return count;
	}
	
	public static int countStringIgnoreCase(String s1, String s2)
	{
		return countString(s1.toLowerCase(), s2.toLowerCase());
	}		
	
	public static String getRandomText(java.util.Random r, int n, String sourceText)
	{
		String str = "";
		
		int len = sourceText.length();
		
		for (int i = 0; i < n; ++i)
			str += sourceText.charAt(r.nextInt(len));			
		
		return str;
	}	
	
	public static String getRandomTextEN(int n)
	{
		return getRandomTextEN(new java.util.Random(), n);
	}
	
	public static String getRandomTextEN(java.util.Random r, int n)
	{
		return getRandomText(r, n, "abcdefghijklmnopqrstuwxvyz");
	}	
	
	public static String getRandomTextTR(int n)
	{
		return getRandomTextTR(new java.util.Random(), n);
	}	
	
	public static String getRandomTextTR(java.util.Random r, int n)
	{
		return getRandomText(r, n, "abcçdefgğhıijklmnoöprsştuüvyz");
	}	
	
	public static String getShortestPangramEN(String s)
	{
		String result = s;
		
		int end = s.length();
		
		while (end != 0) {
			int begin = 0;
			
			while (begin != end) {
				String str = s.substring(begin++, end);
				
				if (str.length() >= 26 && isPangramEN(str) && str.length() < result.length())
					result = str;
			}
			
			--end;
		}
		
		return result;
	}
	
	public static String getShortestPangramTR(String s)
	{
		String result = s;
		
		int end = s.length();
		
		while (end != 0) {
			int begin = 0;
			
			while (begin != end) {
				String str = s.substring(begin++, end);
				
				if (str.length() >= 29 && isPangramTR(str) && str.length() < result.length())
					result = str;
			}
			
			--end;
		}
		
		return result;
	}			
	
	public static boolean isPalindrome(String s)
	{
		int left = 0;
		int right = s.length() - 1;		
		
		while (left < right) {
			boolean cLeftSelected = false, cRightSelected = false;
			char cLeft = '\0', cRight;
			
			if (!cLeftSelected) {
				cLeft = Character.toLowerCase(s.charAt(left));
				
				if (!Character.isLetter(cLeft)) {
					++left;
					continue;
				}
				cLeftSelected = true;
			}
			
			if (!cRightSelected) {
				cRight = Character.toLowerCase(s.charAt(right));
				
				if (!Character.isLetter(cRight)) {
					--right;
					continue;
				}
				
				if (cLeft != cRight)
					return false;
				
				cRightSelected = true;
			}			
			
			++left;
			--right;			
		}
		
		return true;
	}
	
	public static boolean isPangram(String s, String alphabet)
	{
		int len = alphabet.length();
		
		for (int i = 0; i < len; ++i)
			if (s.indexOf(alphabet.charAt(i)) == -1)
				return false;
		
		return true;
	}
	
	public static boolean isPangramEN(String s)
	{
		return isPangram(s.toLowerCase(), "abcdefghijklmnopqrstuwxvyz");
	}
	
	public static boolean isPangramTR(String s)
	{
		return isPangram(s.toLowerCase(), "abcçdefgğhıijklmnoöprsştuüvyz");
	}	
	
	public static String padLeading(String s, int len, char ch)
	{
		int length  = s.length();
		
		return len <= length ? s : repeat(len - length, ch) + s;
	}
	
	public static String padLeading(String s, int len)
	{
		return padLeading(s, len, ' ');
	}
	
	public static String padTrailing(String s, int len, char ch)
	{
		int length  = s.length();
		
		return len <= length ? s : s + repeat(len - length, ch);
	}
	
	public static String padTrailing(String s, int len)
	{
		return padTrailing(s, len, ' ');
	}		
	
	public static String repeat(int count, char ch)
	{
		return String.format("%0" + count + "d", 0).replace('0', ch);
	}	
	
	public static String reverse(String s)
	{
		String str = "";
		
		for (int i = s.length() - 1; i >= 0; --i)
			str += s.charAt(i);
		
		return str;
	}		
	
	public static String trimLeading(String s)
	{
		int i;		
		int len = s.length();
		
		for (i = 0; i < len && Character.isWhitespace(s.charAt(i)); ++i)
			;
		
		return s.substring(i);
	}
	
	public static String trimTrailing(String s)
	{
		int i;	
		
		
		for (i = s.length() - 1; i >= 0 && Character.isWhitespace(s.charAt(i)); --i)
			;
		
		return s.substring(0, i + 1);
	}
}


