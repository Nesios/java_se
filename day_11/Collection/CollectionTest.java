package day_11.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Stack;

public class CollectionTest {

	public static void main(String[] args) {

		List<Integer> numeriList = new ArrayList<>();
		numeriList.add(9);
		numeriList.add(10);
		numeriList.add(11);
		numeriList.remove(2);
		System.out.println("ArrayList stampato con Enhance for");
		for (Integer i : numeriList) {
			System.out.println(i);
		}
		System.out.println("ArrayList stampato con for");
		for (int i = 0; i < numeriList.size(); i++) {
			System.out.println(numeriList.get(i));
		}
		System.out.println("Lista stampata con Iterator");
		Iterator iter = numeriList.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		List<String> strList = new LinkedList<>();
		strList.add("fantozzi");
		strList.add("Pierino");
		strList.add("Monnezza");
		strList.remove("fantozzi");
		// strList.remove(0);
		System.out.println("LinkedList stampato con Enhance for");
		for (String s : strList) {
			System.out.println(s);
		}
		System.out.println("LinkedList stampato con for");
		for (int s = 0; s < strList.size(); s++) {
			System.out.println(strList.get(s));
		}
		System.out.println("LinkeList stampata con Iterator");
		Iterator iterList = strList.iterator();
		while (iterList.hasNext()) {
			System.out.println(iterList.next());
		}
		System.out.println("LinkeList stampata con ListIterator");
		ListIterator listIter = strList.listIterator();
		while (listIter.hasNext()) {
			System.out.println(listIter.next());
		}
		Stack<String> stackPila = new Stack<>();
		stackPila.push("Anna");
		stackPila.push("Franco");
		stackPila.push("Gianni");
		String rimosso = stackPila.pop();
		System.out.println(rimosso + ": elemento rimosso");
		for (int i = 0; i < stackPila.size(); i++) {
			System.out.println(stackPila.get(i));
		}
		Set<Character> setCharacter = new HashSet<>();
		setCharacter.add('a');
		setCharacter.add('b');
		setCharacter.add('b');
		Iterator<Character> itrSet = setCharacter.iterator();
		System.out.println("HashSet stampato con iteratore");
		while (itrSet.hasNext()) {
			System.out.println(itrSet.next());
		}
	}
}