import junit.framework.TestCase;

public class TestClass extends TestCase {
    public void testPalindrom1(){
        String text = "abba";
        Palindrom cur = new Palindrom();
        assertTrue(cur.isPalindrom(text));
    }
    public void testPalindrom2(){
        String text = "aba";
        Palindrom cur = new Palindrom();
        assertTrue(cur.isPalindrom(text));
    }
    public void testPalindrom3(){
        String s = "lomi";
        Palindrom cur = new Palindrom();
        assertFalse(cur.isPalindrom(s));
    }
    public void testCoins1(){
        int x = 123;
        Coins curC = new Coins();
        assertEquals(6,curC.numOfCoins(x));
    }

    public void testCoins2(){
        int x = 253;
        Coins curC = new Coins();
        assertEquals(8,curC.numOfCoins(x));
    }
    public void testCoins3(){
        int x = 100000;
        Coins curC = new Coins();
        assertEquals(2000,curC.numOfCoins(x));
    }
    public void testPositive1(){
        int[] args = {-3, 1, 2, 5};
        minPositive cur = new minPositive();
        assertEquals(3,cur.minNum(args));
    }
    public void testPositive2(){
        int[] args = {-3, 0, 1, 2, 5, 3, 4, 10};
        minPositive cur = new minPositive();
        assertEquals(6,cur.minNum(args));
    }
    public void testPositive3(){
        int[] args = {-10, -5, 1, 999, 52, 2, 3, 5, 4};
        minPositive cur = new minPositive();
        assertEquals(6,cur.minNum(args));
    }
    public void testProperly1(){
        Properly cur = new Properly();
        assertTrue(cur.isProperly("((()))"));
    }
    public void testProperly2(){
        Properly cur = new Properly();
        assertFalse(cur.isProperly("(()))"));
    }
    public void testProperly3(){
        Properly cur = new Properly();
        assertFalse(cur.isProperly("())()"));
    }
    public void testProperly4(){
        Properly cur = new Properly();
        assertTrue(cur.isProperly("()()"));
    }
    public void testStairs1(){
        Variants cur = new Variants();
        assertEquals(5, cur.countVariants(4));
    }
    public void testStairs2(){
        Variants cur = new Variants();
        assertEquals(21, cur.countVariants(7));
    }
    public void testStairs3(){
        Variants cur = new Variants();
        assertEquals(233, cur.countVariants(12));
    }


}
