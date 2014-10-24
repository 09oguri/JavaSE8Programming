package chapter1;

import java.util.Arrays;
import java.util.Comparator;

public class Exercise1 {
	public static void main(String[] args) {
		String[] strings = { "aaa", "bb", "cccc", "d" };

		for (String str : strings) {
			System.out.println(str);
		}

		System.out.println("#####");
		System.out.println("main thread id: " + Thread.currentThread().getId());

		Comparator<String> comp = (String first, String second) -> {
			System.out.println("comparator thread id: "
					+ Thread.currentThread().getId());
			return Integer.compare(first.length(), second.length());
		};
		Arrays.sort(strings, comp);
		System.out.println("#####");

		for (String str : strings) {
			System.out.println(str);
		}
	}
}
