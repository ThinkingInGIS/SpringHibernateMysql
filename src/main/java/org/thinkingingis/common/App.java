package org.thinkingingis.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.thinkingingis.stock.bo.StockBo;
import org.thinkingingis.stock.model.Stock;

public class App {
	
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		
		StockBo stockBo = (StockBo)context.getBean("stockBo");
		
    	/** insert **/
    	Stock stock = new Stock();
    	stock.setStockCode("011");
    	stock.setStockName("GIS");
    	stockBo.save(stock);
    	
    	/** select**/
		Stock stock2 = stockBo.findByStockCode("011");
		System.out.println(stock2);
		
		/**update**/
    	stock2.setStockName("GIS-1");
    	stockBo.update(stock2);
		
	   	/** delete **/
    	stockBo.delete(stock2);
    	
    	System.out.println("all done!");
    	
	}

}
