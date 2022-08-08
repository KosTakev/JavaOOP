package rpg_lab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AxeTest {
   private Axe axe;
   private Dummy dummy;
   private Axe brokenAxe;

   @Before
   public void setUp() {
      this.axe = new Axe(10, 10);
      this.dummy = new Dummy(100, 100);
      this. brokenAxe = new Axe(10, 0);
   }

   @Test
   public void testAxeDurabilityAfterAttack() {
      axe.attack(dummy);
      assertEquals(9, axe.getDurabilityPoints());
   }

   @Test(expected = IllegalStateException.class)
   public void testAxeThrowsIfAxeIsBroken () {
      axe.attack(dummy);
   }

}