package com.springboot.restapi.util;

public class CommonUtil {
 
	
	private static String getSubStr(String str, int low, int high) {
		return str.substring(low, high + 1);
	}
 
	public static String findTheLongestPath(String str) {
 
		int maxLength = 1;

		int start = 0;
		int len = str.length();

		int low, high;

	 
		for (int i = 1; i < len; ++i) {
			 
			low = i - 1;
			high = i;
			while (low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
				if (high - low + 1 > maxLength) {
					start = low;
					maxLength = high - low + 1;
				}
				--low;
				++high;
			}

			 
			low = i - 1;
			high = i + 1;
			while (low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
				if (high - low + 1 > maxLength) {
					start = low;
					maxLength = high - low + 1;
				}
				--low;
				++high;
			}
		}
		return getSubStr(str, start, start + maxLength - 1);

	 
	}
}
