package catalogue;

import java.io.Serializable;
import java.util.Collections;

/**
 * Improved version of the Basket class with recommended additions
 * 
 * @author  Callum Barnett
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  @Override
  public boolean add(Product pr) {
	  for(Product existingProduct: this) {
		  if(existingProduct.getProductNum().equals(pr.getProductNum())) {
			  System.out.println("Product is repeated");
			  existingProduct.setQuantity(existingProduct.getQuantity() + pr.getQuantity());
			  return true;
		  }
	  }
	  System.out.println("Product is not repeated");
	  super.add(pr);
	  return true;
  }
  public void sortBasket() {
	  Collections.sort(this, (p1, p2) -> p1.getProductNum().compareTo(p2.getProductNum()));
  }
}
