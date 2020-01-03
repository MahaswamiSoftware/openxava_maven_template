package com.yourcompany.restaurant.calculators;

import org.openxava.calculators.ICalculator;
import org.openxava.jpa.XPersistence;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.Map;

public class BillCalculator implements ICalculator {
	
	private int id;
	 
    public Object calculate() throws Exception { 
        EntityManager em = XPersistence.getManager();
    	Query query = em.createQuery("select or from order_recipe or where or.order_id = :orderId");
        query.setParameter("orderId", id);
        
        double amount = 0.0;
        
        try {
			@SuppressWarnings("unchecked")
			List<Map<String, Object>> orderRecipes = (List<Map<String, Object>>) query.getResultList();

	        for(Map<String, Object> object : orderRecipes) {
	        	int recipeId = Integer.parseInt(object.get("recipes_id").toString());
	        	Query query1 = em.createQuery("select r.cost from Recipe r where r.id = :id");
	            query.setParameter("id", recipeId);
	            double cost = Double.parseDouble(query1.getSingleResult().toString());
	            amount += cost;
	        }

        }catch(Exception e) {
        	e.printStackTrace();
        }
        return amount;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }

}
