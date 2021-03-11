package books;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;

public class BookShopTest {

	private static BookShop bookshop;
	private static double book_price;
	
	@BeforeAll
	public static void init() {
		bookshop = new BookShop("Ernster");
		book_price = 8.0;
	}

    @Test
	@DisplayName("assert 1 different books")
    public void assert_1_differrent_books(){
		int[] basket1 = {1, 0, 0, 0, 0};
		int[] basket2 = {0, 1, 0, 0, 0};
		int[] basket3 = {0, 0, 1, 0, 0};
		int[] basket4 = {0, 0, 0, 1, 0};
		int[] basket5 = {0, 0, 0, 0, 1};
		assertEquals(bookshop.cost(basket1), book_price);
		assertEquals(bookshop.cost(basket2), book_price);
		assertEquals(bookshop.cost(basket3), book_price);
		assertEquals(bookshop.cost(basket4), book_price);
		assertEquals(bookshop.cost(basket5), book_price);
    }

    @Test
	@DisplayName("assert 2 different books")
    public void assert_2_differrent_books(){
		double two_book_price_with_discount = 2*book_price*0.93;
		int[] basket1 = {1, 1, 0, 0, 0};
		int[] basket2 = {0, 1, 1, 0, 0};
		int[] basket3 = {0, 0, 1, 1, 0};
		int[] basket4 = {0, 0, 0, 1, 1};
		int[] basket5 = {1, 0, 0, 0, 1};
		int[] basket6 = {1, 0, 1, 0, 0};
		int[] basket7 = {0, 1, 0, 0, 1};
		int[] basket8 = {0, 0, 1, 0, 1};
		assertEquals(bookshop.cost(basket1), two_book_price_with_discount);
		assertEquals(bookshop.cost(basket2), two_book_price_with_discount);
		assertEquals(bookshop.cost(basket3), two_book_price_with_discount);
		assertEquals(bookshop.cost(basket4), two_book_price_with_discount);
		assertEquals(bookshop.cost(basket5), two_book_price_with_discount);
		assertEquals(bookshop.cost(basket6), two_book_price_with_discount);
		assertEquals(bookshop.cost(basket7), two_book_price_with_discount);
		assertEquals(bookshop.cost(basket8), two_book_price_with_discount);
    }

    @Test
	@DisplayName("assert 2 different books and 1 duplicate")
    public void assert_2_differrent_books_and_1_duplicate(){
		double two_book_price_with_discount_with_1_duplicate = 2*book_price*0.93 + book_price;
		int[] basket1 = {1, 2, 0, 0, 0};
		int[] basket2 = {0, 2, 1, 0, 0};
		int[] basket3 = {0, 0, 1, 2, 0};
		int[] basket4 = {0, 0, 0, 2, 1};
		int[] basket5 = {1, 0, 0, 0, 2};
		int[] basket6 = {1, 0, 2, 0, 0};
		int[] basket7 = {0, 2, 0, 0, 1};
		int[] basket8 = {0, 0, 2, 0, 1};
		assertEquals(bookshop.cost(basket1), two_book_price_with_discount_with_1_duplicate);
		assertEquals(bookshop.cost(basket2), two_book_price_with_discount_with_1_duplicate);
		assertEquals(bookshop.cost(basket3), two_book_price_with_discount_with_1_duplicate);
		assertEquals(bookshop.cost(basket4), two_book_price_with_discount_with_1_duplicate);
		assertEquals(bookshop.cost(basket5), two_book_price_with_discount_with_1_duplicate);
		assertEquals(bookshop.cost(basket6), two_book_price_with_discount_with_1_duplicate);
		assertEquals(bookshop.cost(basket7), two_book_price_with_discount_with_1_duplicate);
		assertEquals(bookshop.cost(basket8), two_book_price_with_discount_with_1_duplicate);
    }


    @Test
	@DisplayName("assert 3 different books")
    public void assert_3_differrent_books(){
		double three_book_price_with_discount = 3*book_price*0.86;
		int[] basket1 = {1, 1, 1, 0, 0};
		int[] basket2 = {0, 1, 1, 1, 0};
		int[] basket3 = {0, 0, 1, 1, 1};
		int[] basket4 = {1, 0, 0, 1, 1};
		int[] basket5 = {1, 0, 1, 0, 1};
		int[] basket6 = {1, 0, 1, 0, 1};
		int[] basket7 = {0, 1, 1, 0, 1};
		int[] basket8 = {1, 0, 1, 1, 0};
		assertEquals(bookshop.cost(basket1), three_book_price_with_discount);
		assertEquals(bookshop.cost(basket2), three_book_price_with_discount);
		assertEquals(bookshop.cost(basket3), three_book_price_with_discount);
		assertEquals(bookshop.cost(basket4), three_book_price_with_discount);
		assertEquals(bookshop.cost(basket5), three_book_price_with_discount);
		assertEquals(bookshop.cost(basket6), three_book_price_with_discount);
		assertEquals(bookshop.cost(basket7), three_book_price_with_discount);
		assertEquals(bookshop.cost(basket8), three_book_price_with_discount);
    }

    @Test
	@DisplayName("assert 3 different books_with two different books")
    public void assert_3_differrent_books_with_two_different_books(){
		double three_book_price_with_discount = 3*book_price*0.86 + 2*book_price*0.93;
		int[] basket1 = {2, 1, 2, 0, 0};
		int[] basket2 = {0, 2, 2, 1, 0};
		int[] basket3 = {0, 0, 1, 2, 2};
		int[] basket4 = {2, 0, 0, 1, 2};
		int[] basket5 = {2, 0, 1, 0, 2};
		int[] basket6 = {1, 0, 2, 0, 2};
		int[] basket7 = {0, 2, 2, 0, 1};
		int[] basket8 = {1, 0, 2, 2, 0};
		assertEquals(bookshop.cost(basket1), three_book_price_with_discount);
		assertEquals(bookshop.cost(basket2), three_book_price_with_discount);
		assertEquals(bookshop.cost(basket3), three_book_price_with_discount);
		assertEquals(bookshop.cost(basket4), three_book_price_with_discount);
		assertEquals(bookshop.cost(basket5), three_book_price_with_discount);
		assertEquals(bookshop.cost(basket6), three_book_price_with_discount);
		assertEquals(bookshop.cost(basket7), three_book_price_with_discount);
		assertEquals(bookshop.cost(basket8), three_book_price_with_discount);
    }

    @Test
	@DisplayName("assert 4 different books")
    public void assert_4_differrent_books(){
		double four_book_price_with_discount = 4*book_price*0.72;
		int[] basket1 = {1, 1, 1, 1, 0};
		int[] basket2 = {0, 1, 1, 1, 1};
		int[] basket3 = {1, 0, 1, 1, 1};
		int[] basket4 = {1, 1, 1, 0, 1};
		int[] basket5 = {1, 1, 0, 1, 1};
		assertEquals(bookshop.cost(basket1), four_book_price_with_discount);
		assertEquals(bookshop.cost(basket2), four_book_price_with_discount);
		assertEquals(bookshop.cost(basket3), four_book_price_with_discount);
		assertEquals(bookshop.cost(basket4), four_book_price_with_discount);
		assertEquals(bookshop.cost(basket5), four_book_price_with_discount);
    }

    @Test
	@DisplayName("assert two sets of4 different books")
    public void assert_two_sets_of_4_differrent_books(){
		double four_book_price_with_discount = 8*book_price*0.72;
		int[] basket1 = {2, 2, 2, 2, 0};
		int[] basket2 = {0, 2, 2, 2, 2};
		int[] basket3 = {2, 0, 2, 2, 2};
		int[] basket4 = {2, 2, 2, 0, 2};
		int[] basket5 = {2, 2, 0, 2, 2};
		assertEquals(bookshop.cost(basket1), four_book_price_with_discount);
		assertEquals(bookshop.cost(basket2), four_book_price_with_discount);
		assertEquals(bookshop.cost(basket3), four_book_price_with_discount);
		assertEquals(bookshop.cost(basket4), four_book_price_with_discount);
		assertEquals(bookshop.cost(basket5), four_book_price_with_discount);
    }

    @Test
	@DisplayName("assert 5 different books")
    public void assert_5_differrent_books(){
		double three_book_price_with_discount = 5*book_price*0.65;
		int[] basket1 = {1, 1, 1, 1, 1};
		assertEquals(bookshop.cost(basket1), three_book_price_with_discount);
    }
}
