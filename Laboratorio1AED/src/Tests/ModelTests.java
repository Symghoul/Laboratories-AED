package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import model.SmartArray;

public class ModelTests {

	private SmartArray sort;
	
	public void InverselyCase(){
		
		sort = new SmartArray();
		sort.OrganizedInversely(false, false, 10, 20, 0);
		
	}
	@Test
	public void inverselyNormal() {
		
		InverselyCase();
		sort.OrganizedInversely(false, false, 10, 15, 0);
		boolean normal=true;
		assertTrue(normal);
	}
	@Test
	public void inverselyLimit() {
		
		InverselyCase();
		int number = 3;
		boolean limit= false;
		sort.OrganizedInversely(true, false, 17, 58, number);
		
		if(number==0){
			limit=true;
		}
		assertTrue(limit);
	}
	@Test
	public void inverselyInteresting() {
		
		InverselyCase();
		
		int number = 20;
		boolean interesting = false;
		
		sort.OrganizedInversely(true, true, number, 15, 0);
		
		if(number > 15){
		interesting = true;
		}
		assertTrue(interesting);
	}
	
	public void random (){
		
		sort = new SmartArray();
		sort.RandomGenerator(false, 10, 20, 0);
	}
	
	@Test
	public void randomNormal(){
		
		random();
		boolean normal=true;
		sort.RandomGenerator(false, 20, 30, 0);
		assertTrue(normal);
	}
	
	@Test
	public void randomLimit(){
		random();
		boolean limit=false;
		sort.RandomGenerator(true, 30, 40, 0);
		assertTrue(limit);
	}
	@Test
	public void randomInteresting(){
		random();
		boolean interesting=false;
		sort.RandomGenerator(false, 20, 30, 5);
		assertTrue(interesting);
	}
	
	
	
	
	
	

}
