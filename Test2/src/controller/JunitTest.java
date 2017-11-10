package controller;

import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitTest {

	Songsakdi s;
	
	@Before
	public void setUp() throws Exception {
		s = new Songsakdi();
		JOptionPane.showMessageDialog(null, "Strat test !");
	}

	@After
	public void tearDown() throws Exception {
		s = null;
		JOptionPane.showMessageDialog(null, "Strat !");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
