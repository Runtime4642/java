package simple;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Example {
	
	public static void main(String[] args) {
		
//		��������� ������Ʈ��
//		- unmodifiable wrapper object 1��
//		- HashSet 1��
//		- HashMap 1�� (HashSet ���ο��� ����)
//		- length 3�� Object[] table 1��
//		- Node object 2��
//		Object�� 12 ����Ʈ ����� ������(64bit JVM) ��������� ������Ʈ�� ����� �� ����ϸ� 152 ����Ʈ
		
		Set<String> set = new HashSet<>(3);
		set.add("test1");
		set.add("test2");
		set = Collections.unmodifiableSet(set);
		
		
		
		//��������� ������Ʈ�� 1���� 2�� �ʵ�. �ʿ��� ������ 20 ����Ʈ
		Set<String> setByOf = Set.of("foo", "bar");
		
	}
	
	
	void tryWithResourcesByJava7() throws IOException {
	    BufferedReader reader1 = new BufferedReader(new FileReader("test.txt"));
	    try (BufferedReader reader2 = reader1) {
	        // do something
	    }
	}
	// final or effectively final�� ����Ǿ� reader ������ ����� �� ����
	void tryWithResourcesByJava9() throws IOException {
	    BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
	try (reader) {
	        // do something
	    }
	}
}
