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
	@DisplayName("assert 3 different books")
    public void assert_3_differrent_books(){
		double two_book_price_with_discount = 3*book_price*0.86;
		int[] basket1 = {1, 1, 1, 0, 0};
		int[] basket2 = {0, 1, 1, 1, 0};
		int[] basket3 = {0, 0, 1, 1, 1};
		int[] basket4 = {1, 0, 0, 1, 1};
		int[] basket5 = {1, 0, 1, 0, 1};
		int[] basket6 = {1, 0, 1, 0, 1};
		int[] basket7 = {0, 1, 1, 0, 1};
		int[] basket8 = {1, 0, 1, 1, 0};
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
	@DisplayName("assert 4 different books")
    public void assert_4_differrent_books(){
		double two_book_price_with_discount = 4*book_price*0.72;
		int[] basket1 = {1, 1, 1, 1, 0};
		int[] basket2 = {0, 1, 1, 1, 1};
		int[] basket3 = {1, 0, 1, 1, 1};
		int[] basket4 = {1, 1, 1, 0, 1};
		int[] basket5 = {1, 1, 0, 1, 1};
		assertEquals(bookshop.cost(basket1), two_book_price_with_discount);
		assertEquals(bookshop.cost(basket2), two_book_price_with_discount);
		assertEquals(bookshop.cost(basket3), two_book_price_with_discount);
		assertEquals(bookshop.cost(basket4), two_book_price_with_discount);
		assertEquals(bookshop.cost(basket5), two_book_price_with_discount);
    }

    @Test
	@DisplayName("assert 5 different books")
    public void assert_5_differrent_books(){
		double two_book_price_with_discount = 5*book_price*0.65;
		int[] basket1 = {1, 1, 1, 1, 1};
		assertEquals(bookshop.cost(basket1), two_book_price_with_discount);
    }
}
