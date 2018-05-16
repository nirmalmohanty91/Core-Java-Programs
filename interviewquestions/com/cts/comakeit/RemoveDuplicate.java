package com.cts.comakeit;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDuplicate {

	public static void main(String[] args) {
		ArrayList<Integer> wordDulicate = new ArrayList<>();
		wordDulicate.add(11);
		wordDulicate.add(12);
		wordDulicate.add(11);
		wordDulicate.add(14);
		wordDulicate.add(16);
		wordDulicate.add(11);

		System.out.println(wordDulicate);
		ArrayList<Integer> nonDupList = new ArrayList<>();
		Iterator<Integer> dupIter = wordDulicate.iterator();
		while (dupIter.hasNext()) {
			Integer dupWord = dupIter.next();
			if (nonDupList.contains(dupWord)) {
				System.out.println("Removed: " + dupWord);
				dupIter.remove();
				System.out.println(wordDulicate);

			} else {
				System.out.println("Added: " + dupWord);
				nonDupList.add(dupWord); // 11,12,14,16
				System.out.println(nonDupList);
			}

		}
		System.out.println(nonDupList);
	}
}
