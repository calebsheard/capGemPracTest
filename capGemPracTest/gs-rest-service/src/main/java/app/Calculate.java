package app;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Calculate {
	
	private static final NumberFormat formatter = new DecimalFormat("#0.00");
	
	public String compute(List<Integer> numbers) {
		Double result = numbers.stream()
				.sorted(Comparator.reverseOrder())
				.limit(3)
				.map(i -> i * i)
				.reduce((a, b) -> a + b)
				.map(sum -> Math.sqrt(sum))
				.orElseThrow(() -> new IllegalArgumentException("Invalid arguements"));

		return formatter.format(result);
	}
}