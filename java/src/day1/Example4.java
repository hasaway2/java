package day1;

import java.util.ArrayList;

import javax.swing.JButton;

// for문 : 일반 for, 향상된 for
public class Example4 {
	public static void main(String[] args) {
		// 반복문을 사용하려면 데이터의 집합
		// 파이썬의 경우 list, set, tuple, dictionary
		// 이런 집합들을 자바에서는 Collection
		// 파이썬의 list -> 자바스크립트의 배열
		// python : a = [1,"3",3.14]
		// js : const a = [1,"3",True];
		
		// 자바에서는 ArrayList 객체
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add("Hello");
		list1.add(new JButton("클릭하세요"));
		
		// 18라인처럼 ArrayList를 만들면 list1은 아무거나 다 담을 수 있다
		// 담을 수 있는 값에 제한을 걸자 : Diamond 연산자
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
	}
}









