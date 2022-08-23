package daysofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Day11_2DArrays {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<List<Integer>> arr = new ArrayList<>();

		IntStream.range(0, 6).forEach(i -> {
			try {
				arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
						.collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();

		int max = -6 * 9;
		for (int i = 0; i < arr.size() - 2; i++) {
			for (int j = 0; j < arr.get(0).size() - 2; j++) {
				int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
				sum += arr.get(i + 1).get(j + 1);
				sum += arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
				if (sum > max)
					max = sum;
			}
		}
		System.out.println(max);

	}

}

/*** Other solution
 * 
 * 		int[][] narr = arr.stream().map(l -> l.stream().mapToInt(Integer::intValue).toArray()).toArray(int[][]::new);

		// System.out.println(Arrays.toString(narr));
		System.out.println(Arrays.deepToString(narr));

		int total = 0, max = 0;
		for (int i = 0; i < narr.length - 2; i++) {
			for (int j = 0; j < narr[0].length - 2; j++) {
				total = narr[i][j] + narr[i][j + 1] + narr[i][j + 2];
				total += narr[i + 1][j + 1];
				total += narr[i + 2][j] + narr[i + 2][j + 1] + narr[i + 2][j + 2];
				if (total > max) {
					max = total;
				}

			}
		}
		System.out.println(max);
 */



/*
List<List<Integer>> arr = Arrays.asList(Arrays.asList(1, 1, 1, 0, 0, 0), Arrays.asList(0, 1, 0, 0, 0, 0),
				Arrays.asList(1, 1, 1, 0, 0, 0), Arrays.asList(0, 0, 2, 4, 4, 0), Arrays.asList(0, 0, 0, 2, 0, 0),
				Arrays.asList(0, 0, 1, 2, 4, 0));

		int[][] narr = arr.stream().map(l -> l.stream().mapToInt(Integer::intValue).toArray()).toArray(int[][]::new);

		// System.out.println(Arrays.toString(narr));
		System.out.println(Arrays.deepToString(narr));

		int count = 0;
		int total = 0, max = 0;
		for (int i = 0; i < narr.length-2; i++) {
			for (int j = 0; j < narr[0].length - 2; j++) {
				total = narr[i][j] + narr[i][j + 1] + narr[i][j + 2];
				total += narr[i + 1][j + 1];
				total += narr[i + 2][j] + narr[i + 2][j + 1] + narr[i + 2][j + 2];
				if (total > max)
					max = total;
			}
		}
		System.out.println(max);
*/