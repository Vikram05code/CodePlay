package com.vikram;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentWord {

	public static void main(String[] args) {
		String paragraph = "Java is a versatile and powerful programming language renowned for its platform independence and robustness. Developed by Sun Microsystems in the mid-1990s, Java has since become a cornerstone of modern software development. Its \"write once, run anywhere\" principle allows Java programs to run on any device equipped with a Java Virtual Machine (JVM), making it ideal for creating cross-platform applications. Java's syntax is clear and concise, making it accessible to both beginner and experienced programmers alike. Its extensive standard library provides developers with a wealth of tools and frameworks for building anything from desktop applications to enterprise-level systems and Android mobile apps. With its strong emphasis on security, reliability, and scalability, Java continues to be a top choice for developers across various industries.";
		String mostFrequentWord = findMostFrequentWord(paragraph);
		System.out.println("Most frequent word: " + mostFrequentWord);
	}

	public static String findMostFrequentWord(String paragraph) {
		// Remove punctuation and split the paragraph into words
		String[] words = paragraph.replaceAll("[.,\\/#!$%\\^&\\*;:{}=\\-_`~()]", "").toLowerCase().split("\\s+");

		// Count occurrences of each word
		Map<String, Integer> wordCount = new HashMap<>();
		for (String word : words) {
			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		}

		// Find the word with the maximum occurrence
		String mostFrequentWord = null;
		int maxCount = 0;
		for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				mostFrequentWord = entry.getKey();
			}
		}

		return mostFrequentWord;
	}

}
