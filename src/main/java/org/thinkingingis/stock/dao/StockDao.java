package org.thinkingingis.stock.dao;

import org.thinkingingis.stock.model.Stock;

public interface StockDao {
	
	void save(Stock stock);
	void update(Stock stock);
	void delete(Stock stock);
	Stock findByStockCode(String stockCode);

}
