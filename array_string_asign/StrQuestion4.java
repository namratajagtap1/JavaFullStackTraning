package com.yash.array_string_asign;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class StrQuestion4 {

	static Logger logger = Logger.getLogger(StrQuestion4.class.getName());

	public static void main(String args[]) {
		String s = "Namrata";
		String[] sr = s.split("");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < sr.length; i++) {
			if (map.containsKey(sr[i])) {

				int count = map.get(sr[i]);
				map.put(sr[i], count + 1);

			} else {
				map.put(sr[i], 1);

			}

		}
		System.out.println(map);
		logger.info(s);

	}
}