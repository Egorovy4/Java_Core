package lesson16;

import java.util.Arrays;

public class Collection {
	private static Number[] numbers;

	public Collection(Number[] numbers) {
		super();
		Collection.numbers = numbers;
	}

	@Override
	public String toString() {
		return "Collection [numbers=" + Arrays.toString(numbers) + "]";
	}

	private class oddNumbersSetting implements Iterator {
		private int count = 0;

		@Override
		public boolean nasNext() {
			return count < numbers.length;
		}

		@Override
		public Object next() {
			if ((int) numbers[count] % 2 != 0) {
				numbers[count] = 0;
			}
			return numbers[count++];
		}
	}

	public Iterator getOddNumbersSetting() {
		return new oddNumbersSetting();
	}

	private class backThroughOneNumbers implements Iterator {
		private int count = numbers.length - 1;
		private int tempIndex;

		@Override
		public boolean nasNext() {
			return count >= 0;
		}

		@Override
		public Object next() {
			tempIndex = count;
			count = count - 2;
			return numbers[tempIndex];
		}
	}

	public Iterator getBackThroughOneNumbers() {
		return new backThroughOneNumbers();
	}

	public Iterator threeStepOddNumbers() {
		return new Iterator() {
			private int count = numbers.length - 1;
			private int tempIndex;

			@Override
			public boolean nasNext() {
				return count >= 0;
			}

			@Override
			public Object next() {
				tempIndex = count;
				count = count - 3;

				if ((int) numbers[tempIndex] % 2 != 0) {
					return numbers[tempIndex];
				} else {
					return null;
				}
			}
		};
	}

	public Iterator fiveStepPairedNumbersSetting() {
		class newLockalIterator implements Iterator {
			private int count = 0;
			private int tempIndex;

			@Override
			public boolean nasNext() {
				return count < numbers.length;
			}

			@Override
			public Object next() {
				tempIndex = count;
				count = count + 5;

				if ((int) numbers[tempIndex] % 2 == 0) {
					numbers[tempIndex] = (int) numbers[tempIndex] - 100;
				}

				return numbers[tempIndex];
			}
		}
		return new newLockalIterator();
	}

	private static class TwoStepNumbersChangingParity implements Iterator {
		private int count = 0;
		private int tempIndex;

		@Override
		public boolean nasNext() {
			return count < Collection.numbers.length;
		}

		@Override
		public Object next() {
			tempIndex = count;
			count = count + 2;

			if ((int) numbers[tempIndex] % 2 == 0) {
				numbers[tempIndex] = (int) numbers[tempIndex] + 1;
			}

			return numbers[tempIndex];
		}
	}

	public static Iterator gettwoStepNumbersChangingParity() {
		return new TwoStepNumbersChangingParity();
	}
}
