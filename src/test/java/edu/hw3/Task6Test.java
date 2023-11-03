package edu.hw3;

import edu.hw3.Task6.Stock;
import edu.hw3.Task6.StockExchange;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Task6Test {
    @Test
    @DisplayName("Stock.add")
    void testAdd() {
        Stock stock = new Stock("a", 100D);
        StockExchange market = new StockExchange();

        market.add(stock);
        Stock ans = market.mostValuableStock();

        assertEquals(ans.name(), "a");
    }

    @Test
    @DisplayName("Stock.remove")
    void testRemove() {
        // given
        Stock stock = new Stock("a", 100D);
        StockExchange market = new StockExchange();

        // when
        market.add(stock);
        Stock ans = market.mostValuableStock();
        assertEquals(ans.name(), "a");
        market.remove(stock);
        ans = market.mostValuableStock();

        // then
        assertNull(ans);
    }

    @Test
    @DisplayName("Stock.mostValuableStock")
    void testMVS() {
        // given
        Stock stock1 = new Stock("a", 200D);
        Stock stock2 = new Stock("b", 150D);
        Stock stock3 = new Stock("c", 100D);
        Stock stock4 = new Stock("d", 50D);
        StockExchange market = new StockExchange();

        // when
        market.add(stock1);
        market.add(stock2);
        market.add(stock3);
        market.add(stock4);
        Stock answer = market.mostValuableStock();

        // then
        assertEquals(answer.name(), "a");
    }
}
