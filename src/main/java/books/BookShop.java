package books;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class BookShop {

    private final String name;

    /**
     * Constructor of the class Book shop
     * @param name name of the book shop
     */
    public BookShop(String name){
        this.name = name;
    }

	/**
	* Compute sum of array
	* @param arr
	* @return sum of array
	 */
	public int sum_of_array(int[] arr) { 
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum; 
	}

    /**
     * method to compute the cost of a basket
     * @param books array corresponding to the number of each harry potter book the client desire to buy (books.length should return 5)
     * @return the cost in euro with the discount
     */
    public double cost(int[] books){

		double book_price = 8.0;
		double final_price = 0.0;

		while (sum_of_array(books) != 0) {
			int number_of_books = 0;
			for (int i=0; i<books.length; i++) {
				if (books[i] != 0) {
					books[i]--;
					number_of_books++;
				}
			}
			switch (number_of_books) {
				case 1:
					final_price += book_price;
					break;
				case 2:
					final_price += 2*book_price;
					break;
				case 3:
					final_price += 3*book_price*0.86;
					break;
				case 4:
					final_price += 4*book_price*0.72;
					break;
				case 5:
					final_price += 5*book_price*0.65;
					break;
			}
		}

        return final_price;
    }

	// public static void main(String[] args) {
	//     int[] books = new int[]{0, 2, 2, 2, 1};
	//     BookShop bs = new BookShop("bs");
	//     System.out.println(bs.cost(books));
	//     List<Integer> zero = Arrays.asList(0, 0, 0, 0, 0);
	//     System.out.println(!(Arrays.asList(books).containsAll(zero)));
	//     System.out.println(bs.sum_of_array(books));
	// }
}
