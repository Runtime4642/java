package of;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Example {
	
	public static void main(String[] args) {
		
//		만들어지는 오브젝트는
//		- unmodifiable wrapper object 1개
//		- HashSet 1개
//		- HashMap 1개 (HashSet 내부에서 생성)
//		- length 3의 Object[] table 1개
//		- Node object 2개
//		Object는 12 바이트 헤더를 가지고(64bit JVM) 만들어지는 오브젝트의 사이즈를 다 계산하면 152 바이트
		
		Set<String> set = new HashSet<>(3);
		set.add("test1");
		set.add("test2");
		set = Collections.unmodifiableSet(set);
		
		
		
		//만들어지는 오브젝트는 1개에 2개 필드. 필요한 공간은 20 바이트
		Set<String> setByOf = Set.of("foo", "bar");
		
	}
}
