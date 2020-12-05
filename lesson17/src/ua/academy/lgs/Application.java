package ua.academy.lgs;

import java.util.ArrayList;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		// It is possible to add String element to Integer list because of Erasure of
		// Generic Types.
		// During the type erasure process, the Java compiler erases all type parameters
		// and replaces each with its first bound if the type parameter is bounded,
		// or Object if the type parameter is unbounded.

		List<Integer> list = new ArrayList<>();
		AddToList.addToList(list);
		System.out.println(list);
	}

}
