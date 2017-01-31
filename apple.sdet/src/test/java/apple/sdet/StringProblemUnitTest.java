package apple.sdet;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringProblemUnitTest {
	public static StringProblem sp;
	 
	 	@BeforeClass
	 	public static void setUpBeforeClass() throws Exception {
	 		sp = new StringProblem();
	 	}
	 
	 	/*@AfterClass
	 	public static void tearDownAfterClass() {
	 	}
	 */
	 
	 	
	 	@Test
	 	public void test() {
	 		
	 		//TC1
	 		assertEquals("Ale", sp.removeCharacterCustomize("Apple", 'p'));
	 		assertEquals("Ale", sp.removeInbuiltMethod("Apple", 'p'));
	 		//TC2
	 		assertEquals("Appl intrviw", sp.removeCharacterCustomize("Apple interview", 'e'));
	 		assertEquals("Appl intrviw", sp.removeInbuiltMethod("Apple interview", 'e'));
	 		//TC3
	 		assertEquals("Apple interview", sp.removeCharacterCustomize("Apple interview", 'x'));
	 		assertEquals("Apple interview", sp.removeInbuiltMethod("Apple interview", 'x'));
	 		//TC4
	 		assertEquals("bc bc", sp.removeCharacterCustomize("abc abc", 'a'));
	 		assertEquals("yz yz", sp.removeInbuiltMethod("xyz xyz", 'x'));
	 		//TC5
	 		assertEquals("ma ma", sp.removeCharacterCustomize("mac mac", 'c'));
	 		assertEquals("code code", sp.removeInbuiltMethod("xcode xcode", 'x'));
	 		//TC6
	 		assertEquals("", sp.removeCharacterCustomize("", ' '));
	 		assertEquals("", sp.removeInbuiltMethod("", ' '));
	 		//TC7
	 		assertEquals("", sp.removeCharacterCustomize(" ", ' '));
	 		assertEquals("", sp.removeInbuiltMethod(" ", ' '));
	 		//TC8
	 		assertEquals(null, sp.removeCharacterCustomize(null, ' '));
	 		assertEquals(null, sp.removeInbuiltMethod(null, ' '));
	 	}
}
