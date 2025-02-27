package ramda.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class MainClass02 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 100; i++) {
			list.add( new Random().nextInt(100) + 1 ); //1~100랜덤 수
		}
		
		System.out.println(list.toString());
		
		System.out.println("-----------------------------------------");
		//중복제거 distinct
		//정렬 sorted
		list.stream().distinct().sorted().forEach( a -> System.out.print(a + " ") );
		
		System.out.println();//
		
		//내림차순
		list.stream()
			.distinct()
			.sorted( (o1, o2) -> Integer.compare(o2, o1) )
			.forEach( a -> System.out.print(a + " ") );
		
		System.out.println("\n-----------------------------------------");
		//걸러내기 filter - true인 값만 필터링
		
		list.stream().filter( a -> a % 2 == 0 ).forEach( a -> System.out.print(a + " ") );
		
		System.out.println("\n-----------------------------------------");
		//새로운 stream으로 반환 map
		//원본리스트의 값이 50보다 큰 값이면 true, 아니면 false
		
		list.stream().map( a -> a >= 50 ? true : false  ).forEach( a -> System.out.print(a + " ") );
		
		System.out.println("\n-----------------------------------------");
		//스트림의 형변환 mapTo~~~~
		
		list.stream().mapToDouble( a -> a).forEach( a -> System.out.print(a + " ") );
		
		
		System.out.println("\n-----------------------------------------");
		//최종처리 집계함수 max, min, sum, count, average
		int max = list.stream().mapToInt( a -> a).max().getAsInt();
		int min = list.stream().mapToInt( a -> a).min().getAsInt();
		long count = list.stream().mapToInt( a -> a).count();
		double avg = list.stream().mapToInt( a -> a).average().getAsDouble();
		int sum = list.stream().mapToInt( a -> a).sum();
		
		System.out.println("리스트에서 max값:" + max);
		System.out.println("리스트에서 min값:" + min);
		System.out.println("리스트에서 count값:" + count);
		System.out.println("리스트의 평균:" + avg);
		System.out.println("리스트의 합계:" + sum);
		
		System.out.println("\n-----------------------------------------");
		//최종처리 수집함수 collect - 컬렉션타입으로 변환 
		//50보다 큰 값들만 list로 다시 얻는다.
		
		//리스트로 변환
		List<Integer> newList = list.stream().filter( a -> a >= 50).collect( Collectors.toList() );
		System.out.println(newList.toString());
		
		//맵으로 변환
		Map<Integer, Integer> newMap = list.stream().distinct().filter( a -> a >= 50).collect( Collectors.toMap( a -> a,  a -> a * a ));
		System.out.println(newMap.toString() );
		

		System.out.println("\n-----------------------------------------");
		
		//리스트의 요소들 중에서 4글자 이상인 값만 남기고, 전부 대문자로 바꾸고, 알파벳순으로 정렬한 결과를 새로운 리스트로 반환
		List<String> names = Arrays.asList("hong", "kim", "park", "choi", "an");
		
		List<String> result = names.stream()
			.filter( a -> a.length() >= 4)
			.map( a -> a.toUpperCase() )
			.sorted()
			.collect( Collectors.toList());
		
		System.out.println(result);
		
		
		
		
		
		
		
	}
}
