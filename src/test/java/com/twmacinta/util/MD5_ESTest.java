/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 13 20:06:07 GMT 2018
 */

package com.twmacinta.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.twmacinta.util.MD5;
import com.twmacinta.util.MD5State;
import java.io.UnsupportedEncodingException;
import jonelo.jacksum.algorithm.AbstractChecksum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MD5_ESTest extends MD5_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      MD5.padding = null;
      // Undeclared exception!
      try { 
        mD5_0.Final();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.twmacinta.util.MD5", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      MD5State mD5State0 = mD5_0.state;
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte)4;
      byteArray0[1] = (byte)4;
      byteArray0[2] = (byte)25;
      byteArray0[3] = (byte)1;
      mD5State0.buffer = byteArray0;
      byteArray0[5] = (byte)93;
      mD5_0.Update(byteArray0);
      int int0 = (-486);
      // Undeclared exception!
      try { 
        mD5_0.getHexValue();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("com.twmacinta.util.MD5State", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(mD5_0);
      
      mD5_0.reset();
      assertEquals(0L, mD5_0.getValue());
      
      mD5_0.Init();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-95);
      byteArray0[2] = (byte)36;
      byteArray0[3] = (byte)81;
      byteArray0[4] = (byte) (-44);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)13;
      mD5_0.Update(byteArray0);
      mD5_0.Init();
      mD5_0.reset();
      MD5State mD5State0 = new MD5State();
      mD5State0.count = (-1L);
      mD5_0.Update(mD5State0, byteArray0, (int) (byte)0, 3127);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      MD5State mD5State0 = mD5_0.state;
      mD5_0.Update("113[h/PGp@)sMj!");
      int int0 = 202;
      int[] intArray0 = new int[9];
      intArray0[0] = 202;
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-99);
      byteArray0[1] = (byte) (-7);
      byteArray0[2] = (byte)2;
      mD5State0.buffer = byteArray0;
      int int1 = 44;
      // Undeclared exception!
      try { 
        mD5_0.asHex();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.twmacinta.util.MD5State", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      MD5State mD5State0 = new MD5State();
      mD5_0.state = mD5State0;
      mD5_0.finals = mD5State0;
      mD5State0.count = 2342L;
      byte[] byteArray0 = new byte[1];
      byte byte0 = (byte) (-68);
      byteArray0[0] = (byte) (-68);
      mD5_0.update(byteArray0, (int) (byte) (-68), (int) (byte) (-68));
      mD5_0.finals = mD5State0;
      mD5_0.Update(byteArray0, (-258), (-1595));
      mD5State0.buffer = byteArray0;
      mD5_0.Update("");
      // Undeclared exception!
      try { 
        mD5_0.update((int) (byte) (-68));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 39
         //
         verifyException("com.twmacinta.util.MD5", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      AbstractChecksum.hexformat(0, 0);
      mD5_0.update(0);
      mD5_0.reset();
      mD5_0.Update((byte)0);
      mD5_0.update((int) (byte)0);
      // Undeclared exception!
      try { 
        mD5_0.Update((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.twmacinta.util.MD5", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      mD5_0.reset();
      MD5State mD5State0 = new MD5State();
      mD5_0.state = mD5State0;
      mD5_0.Update((byte) (-109));
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-109);
      byteArray0[1] = (byte) (-109);
      byteArray0[2] = (byte) (-109);
      mD5State0.buffer = byteArray0;
      String string0 = "com.twmacinta.util.MD5";
      // Undeclared exception!
      try { 
        mD5_0.Update("com.twmacinta.util.MD5");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.twmacinta.util.MD5", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      MD5State mD5State0 = new MD5State();
      mD5_0.state = mD5State0;
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)9;
      byteArray0[1] = (byte)47;
      byteArray0[2] = (byte)30;
      byteArray0[3] = (byte)51;
      byteArray0[4] = (byte) (-96);
      byteArray0[5] = (byte)124;
      byteArray0[6] = (byte)29;
      byteArray0[7] = (byte)108;
      byteArray0[8] = (byte)1;
      mD5State0.buffer = byteArray0;
      // Undeclared exception!
      try { 
        mD5_0.Final();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("com.twmacinta.util.MD5State", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)86;
      byteArray0[1] = (byte) (-43);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte)65;
      byteArray0[6] = (byte) (-79);
      mD5_0.Update(byteArray0, (int) (byte)0, 0);
      mD5_0.update((-80));
      mD5_0.Update("HW?)YR(;EI65b");
      mD5_0.Update((byte)106);
      MD5State mD5State0 = null;
      mD5_0.state = null;
      int int0 = 22;
      // Undeclared exception!
      try { 
        mD5_0.Update(22);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.twmacinta.util.MD5", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      MD5.asHex(byteArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      mD5_0.Update((byte)37);
      MD5State mD5State0 = mD5_0.finals;
      mD5_0.state = null;
      AbstractChecksum.hexformat(0L, 0);
      // Undeclared exception!
      try { 
        mD5_0.getHexValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.twmacinta.util.MD5State", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      mD5_0.Update(907);
      // Undeclared exception!
      try { 
        mD5_0.Update((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.twmacinta.util.MD5", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      mD5_0.asHex();
      mD5_0.Update((-982));
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)101;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)4;
      byteArray0[4] = (byte)72;
      AbstractChecksum.hexformat((byte)0, (byte)0);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)0;
      mD5_0.Update(byteArray0, 401, 479);
      mD5_0.update(byteArray0, (int) (byte)0, 1804603682);
      byte[] byteArray1 = mD5_0.Final();
      mD5_0.Update(byteArray1, 0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      byte[] byteArray0 = new byte[3];
      mD5_0.Update(byteArray0, (int) (byte) (-102));
      mD5_0.Update((int) (byte) (-102));
      byteArray0[0] = (byte) (-102);
      byteArray0[1] = (byte)118;
      byteArray0[2] = (byte) (-1);
      mD5_0.Update(byteArray0);
      mD5_0.update((byte) (-102));
      mD5_0.getHexValue();
      mD5_0.reset();
      mD5_0.Update(byteArray0, (int) (byte) (-1));
      mD5_0.update(byteArray0, (int) (byte)118, 271733878);
      mD5_0.Update("8e8f836e28d4ee20bbd5bbe50618318a", "ISO8859_1");
      byte[] byteArray1 = mD5_0.Final();
      mD5_0.Update(647);
      mD5_0.Final();
      mD5_0.Update("ISO8859_1");
      mD5_0.Update("C#");
      mD5_0.getHexValue();
      mD5_0.reset();
      mD5_0.Update("com.twmacinta.util.MD5", "ISO8859_1");
      byte[] byteArray2 = new byte[2];
      byteArray2[0] = (byte) (-80);
      mD5_0.Update(byteArray1, 0);
      byteArray2[1] = (byte) (-1);
      // Undeclared exception!
      try { 
        mD5_0.update(byteArray2, (int) (byte) (-80), (int) (byte)118);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -80
         //
         verifyException("com.twmacinta.util.MD5", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      MD5State mD5State0 = mD5_0.finals;
      mD5_0.state = null;
      MD5State mD5State1 = mD5_0.finals;
      mD5_0.finals = null;
      byte byte0 = (byte)118;
      // Undeclared exception!
      try { 
        mD5_0.Update((byte)118);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.twmacinta.util.MD5", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      byte[] byteArray0 = new byte[0];
      mD5_0.Update(byteArray0, (-3477), (-3477));
      mD5_0.Update("0123456789abcdef");
      mD5_0.reset();
      mD5_0.Update((byte)4);
      mD5_0.asHex();
      MD5State mD5State0 = mD5_0.state;
      // Undeclared exception!
      try { 
        mD5_0.Update(mD5State0, byteArray0, 255, 190);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 255
         //
         verifyException("com.twmacinta.util.MD5", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      mD5_0.asHex();
      mD5_0.Update("Pc&");
      mD5_0.Update("'E#nT");
      mD5_0.asHex();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-19);
      byteArray0[1] = (byte) (-86);
      byteArray0[2] = (byte)0;
      mD5_0.Update(byteArray0, (int) (byte) (-19));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-2);
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)64;
      byteArray0[3] = (byte)0;
      mD5_0.Update(byteArray0);
      mD5_0.Update("\"sejPR$<cSS", (String) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = null;
      // Undeclared exception!
      try { 
        MD5.asHex((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.twmacinta.util.MD5", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)40;
      byteArray0[1] = (byte)48;
      mD5_0.Update(byteArray0, (-1926607734));
      byteArray0[2] = (byte) (-2);
      byteArray0[3] = (byte)40;
      mD5_0.Update(byteArray0);
      mD5_0.Final();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      byte[] byteArray0 = mD5_0.Final();
      MD5.asHex(byteArray0);
      AbstractChecksum.format(byteArray0, true);
      MD5State mD5State0 = mD5_0.finals;
      mD5State0.count = (-1831L);
      mD5_0.update(byteArray0);
      mD5_0.Update(mD5State0, byteArray0, 0, 460);
      mD5_0.Update((byte) (-42));
      mD5_0.update(byteArray0, (int) (byte) (-42), (int) (byte) (-42));
      try { 
        mD5_0.Update("7xD}+kuwfO3,H:GW", "3B|");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      mD5_0.Update("com.twmacinta.util.MD5");
      mD5_0.Update("com.twmacinta.util.MD5");
      mD5_0.Init();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)101;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)122;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)15;
      mD5_0.update(byteArray0, (int) (byte)15, (int) (byte)122);
      AbstractChecksum.hexformat(515L, 2);
      mD5_0.Update("0123456789abcdef");
      mD5_0.getHexValue();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      AbstractChecksum.hexformat((-377L), (-2590));
      byte[] byteArray0 = null;
      mD5_0.asHex();
      // Undeclared exception!
      try { 
        mD5_0.update((byte[]) null, 165, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.twmacinta.util.MD5", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(mD5_0);
      
      String string0 = mD5_0.getHexValue();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(string0);
      assertEquals("d41d8cd98f00b204e9800998ecf8427e", string0);
      
      MD5State mD5State0 = new MD5State();
      mD5_0.reset();
      mD5_0.finals = mD5State0;
      byte byte0 = (byte) (-85);
      mD5_0.Update((byte) (-85));
      mD5State0.count = (-989L);
      byte[] byteArray0 = null;
      int int0 = (-364);
      // Undeclared exception!
      try { 
        mD5_0.Update((byte[]) null, (-364));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.twmacinta.util.MD5", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      MD5State mD5State0 = mD5_0.state;
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)59;
      mD5_0.Update(mD5State0, byteArray0, (-843), (-843));
      byteArray0[0] = (byte)59;
      byte byte1 = (byte) (-123);
      byteArray0[1] = (byte) (-123);
      mD5State0.buffer = byteArray0;
      // Undeclared exception!
      try { 
        mD5_0.Update(mD5State0, (byte[]) null, 236, 236);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.twmacinta.util.MD5", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      MD5State mD5State0 = mD5_0.state;
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte) (-81);
      byteArray0[0] = (byte) (-81);
      byte byte1 = (byte)0;
      byteArray0[1] = (byte)0;
      mD5State0.buffer = byteArray0;
      byteArray0[2] = (byte)79;
      mD5_0.Update(mD5State0, byteArray0, (int) (byte)0, (int) (byte) (-81));
      // Undeclared exception!
      try { 
        mD5_0.Update((byte)48);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 47
         //
         verifyException("com.twmacinta.util.MD5", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      mD5_0.getHexValue();
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)5;
      byteArray0[0] = (byte)5;
      byte byte1 = (byte)0;
      mD5_0.Update("0123456789abcdef");
      byteArray0[1] = (byte)0;
      byte byte2 = (byte) (-66);
      mD5_0.update(0);
      byteArray0[2] = (byte) (-66);
      mD5_0.Update(byteArray0, (int) (byte)0);
      // Undeclared exception!
      try { 
        mD5_0.Update(byteArray0, (-1440), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1440
         //
         verifyException("com.twmacinta.util.MD5", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      mD5_0.Update((byte)13);
      mD5_0.Update(12);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)118;
      byteArray0[1] = (byte) (-115);
      byteArray0[2] = (byte)114;
      byteArray0[3] = (byte)79;
      byteArray0[4] = (byte)0;
      MD5.padding = byteArray0;
      MD5State mD5State0 = mD5_0.finals;
      mD5_0.state = null;
      // Undeclared exception!
      try { 
        mD5_0.asHex();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.twmacinta.util.MD5State", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      mD5_0.getHexValue();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)119;
      byteArray0[2] = (byte) (-54);
      MD5.asHex(byteArray0);
      mD5_0.Final();
      mD5_0.getHexValue();
      byte[] byteArray1 = mD5_0.Final();
      mD5_0.asHex();
      mD5_0.Update((-1567));
      mD5_0.Update(byteArray1, 1873313359, (-57434055));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      mD5_0.reset();
      mD5_0.Update("");
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)16;
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)40;
      MD5.asHex(byteArray0);
      try { 
        mD5_0.Update("", "a1!_");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(mD5_0);
      
      byte[] byteArray0 = mD5_0.Final();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(byteArray0);
      assertEquals(16, byteArray0.length);
      
      String string0 = mD5_0.asHex();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(string0);
      assertEquals("d41d8cd98f00b204e9800998ecf8427e", string0);
      
      mD5_0.update(0);
      assertEquals(0L, mD5_0.getValue());
      
      mD5_0.Update(byteArray0, 48, 100);
      assertEquals(0L, mD5_0.getValue());
      assertEquals(16, byteArray0.length);
      
      // Undeclared exception!
      try { 
        mD5_0.Update(byteArray0, 100, 48);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 100
         //
         verifyException("com.twmacinta.util.MD5", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(mD5_0);
      
      byte[] byteArray0 = null;
      // Undeclared exception!
      try { 
        mD5_0.Update((byte[]) null, (-5814), (-5814));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.twmacinta.util.MD5", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(mD5_0);
      
      MD5State mD5State0 = new MD5State();
      assertNotNull(mD5State0);
      
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-48);
      byte byte0 = (byte)0;
      byteArray0[1] = (byte)0;
      byte byte1 = (byte) (-119);
      byteArray0[2] = (byte) (-119);
      mD5State0.count = (long) (byte)0;
      mD5State0.buffer = byteArray0;
      mD5State0.count = (long) (byte)0;
      mD5State0.buffer = byteArray0;
      mD5State0.count = 0L;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-91);
      String string0 = mD5_0.asHex();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(string0);
      assertEquals("d41d8cd98f00b204e9800998ecf8427e", string0);
      
      byte byte2 = (byte)125;
      byteArray0[5] = (byte)125;
      byteArray0[6] = (byte)0;
      // Undeclared exception!
      try { 
        mD5_0.Update(mD5State0, byteArray0, (int) (byte) (-48), (int) (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -48
         //
         verifyException("com.twmacinta.util.MD5", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(mD5_0);
      
      mD5_0.Update((-3813));
      assertEquals(0L, mD5_0.getValue());
      
      mD5_0.update((-3813));
      assertEquals(0L, mD5_0.getValue());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(mD5_0);
      
      mD5_0.Update(1127);
      assertEquals(0L, mD5_0.getValue());
      
      byte[] byteArray0 = new byte[0];
      mD5_0.Update(byteArray0, 0);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertEquals(0L, mD5_0.getValue());
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(mD5_0);
      
      try { 
        mD5_0.Update("=Y1).a:s{zr%", "=Y1).a:s{zr%");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(mD5_0);
      
      byte[] byteArray0 = new byte[0];
      String string0 = AbstractChecksum.format(byteArray0, true);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertNotNull(string0);
      assertEquals(0, byteArray0.length);
      assertEquals("", string0);
      
      String string1 = mD5_0.asHex();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
      assertEquals("d41d8cd98f00b204e9800998ecf8427e", string1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(mD5_0);
      
      MD5State mD5State0 = mD5_0.state;
      assertNotNull(mD5State0);
      
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)1;
      mD5_0.Update(mD5State0, byteArray0, (-727), (-727));
      assertArrayEquals(new byte[] {(byte)1}, byteArray0);
      assertEquals(0L, mD5_0.getValue());
      assertEquals(1, byteArray0.length);
      
      byte[] byteArray1 = mD5_0.Final();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(byteArray1);
      assertEquals(16, byteArray1.length);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      mD5_0.Init();
      assertEquals(0L, mD5_0.getValue());
      
      mD5_0.Update(byteArray0, (-1), (-727));
      assertArrayEquals(new byte[] {(byte)1}, byteArray0);
      assertEquals(0L, mD5_0.getValue());
      assertEquals(1, byteArray0.length);
      assertNotSame(byteArray0, byteArray1);
      assertFalse(byteArray0.equals((Object)byteArray1));
      
      mD5_0.reset();
      assertEquals(0L, mD5_0.getValue());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(mD5_0);
      
      byte[] byteArray0 = mD5_0.Final();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(byteArray0);
      assertEquals(16, byteArray0.length);
      
      MD5State mD5State0 = new MD5State();
      assertNotNull(mD5State0);
      
      // Undeclared exception!
      try { 
        mD5_0.Update(mD5State0, byteArray0, 284, 284);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 284
         //
         verifyException("com.twmacinta.util.MD5", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(mD5_0);
      
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)8;
      byteArray0[0] = (byte)8;
      byte byte1 = (byte)0;
      byteArray0[1] = (byte)0;
      int int0 = 0;
      mD5_0.Update(byteArray0, 0, (int) (byte)8);
      assertArrayEquals(new byte[] {(byte)8, (byte)0}, byteArray0);
      assertEquals(0L, mD5_0.getValue());
      assertEquals(2, byteArray0.length);
      
      mD5_0.Init();
      assertEquals(0L, mD5_0.getValue());
      
      // Undeclared exception!
      try { 
        mD5_0.Update((String) null, ":@O.");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.twmacinta.util.MD5", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(mD5_0);
      
      MD5State mD5State0 = new MD5State();
      assertNotNull(mD5State0);
      
      mD5_0.finals = mD5State0;
      assertEquals(0L, mD5_0.getValue());
      
      byte[] byteArray0 = new byte[1];
      byte byte0 = (byte) (-1);
      String string0 = MD5.asHex(byteArray0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertNotNull(string0);
      assertEquals(1, byteArray0.length);
      assertEquals("00", string0);
      
      byteArray0[0] = (byte) (-1);
      mD5_0.Init();
      assertEquals(0L, mD5_0.getValue());
      
      int int0 = 15;
      // Undeclared exception!
      try { 
        mD5_0.update(byteArray0, (int) (byte) (-1), 15);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.twmacinta.util.MD5", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(mD5_0);
      
      String string0 = mD5_0.getHexValue();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(string0);
      assertEquals("d41d8cd98f00b204e9800998ecf8427e", string0);
      
      try { 
        mD5_0.Update("d41d8cd98f00b204e9800998ecf8427e", "f[");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(mD5_0);
      
      byte[] byteArray0 = new byte[0];
      mD5_0.Update(byteArray0);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertEquals(0L, mD5_0.getValue());
      assertEquals(0, byteArray0.length);
      
      mD5_0.Update("0ovO\"tC");
      assertEquals(0L, mD5_0.getValue());
      
      byte[] byteArray1 = mD5_0.Final();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(byteArray1);
      assertEquals(16, byteArray1.length);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      mD5_0.Update(4);
      assertEquals(0L, mD5_0.getValue());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(mD5_0);
      
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-5);
      byteArray0[1] = (byte) (-126);
      byteArray0[2] = (byte) (-119);
      // Undeclared exception!
      try { 
        mD5_0.update(byteArray0, (int) (byte) (-126), 628);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -126
         //
         verifyException("com.twmacinta.util.MD5", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(mD5_0);
      
      byte[] byteArray0 = new byte[0];
      mD5_0.update(byteArray0, (-74), (-74));
      assertArrayEquals(new byte[] {}, byteArray0);
      assertEquals(0L, mD5_0.getValue());
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      assertEquals(0L, mD5_0.getValue());
      assertNotNull(mD5_0);
      
      MD5State mD5State0 = new MD5State();
      assertNotNull(mD5State0);
      
      int[] intArray0 = new int[8];
      intArray0[1] = 0;
      intArray0[3] = 3025;
      intArray0[5] = 64;
      intArray0[6] = 64;
      intArray0[4] = 655;
      mD5State0.state = intArray0;
      byte[] byteArray0 = new byte[1];
      mD5State0.count = (long) (byte)64;
      byteArray0[0] = (byte)64;
      // Undeclared exception!
      try { 
        mD5_0.Update(mD5State0, byteArray0, (int) (byte)64, (int) (byte)64);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 64
         //
         verifyException("com.twmacinta.util.MD5", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)118;
      byteArray0[2] = (byte) (-1);
      mD5_0.Update(byteArray0);
      mD5_0.update((byte)0);
      String string0 = mD5_0.getHexValue();
      assertEquals("ff867f50ee00c24021cfeb0328c87727", string0);
      
      mD5_0.reset();
      mD5_0.Update(byteArray0, (int) (byte) (-1));
      mD5_0.update(byteArray0, (int) (byte)118, 271733878);
      mD5_0.Update("ff867f50ee00c24021cfeb0328c87727", "ISO8859_1");
      mD5_0.Update((int) (byte)118);
      mD5_0.Final();
      mD5_0.Update("ISO8859_1");
      mD5_0.Update("C#");
      String string1 = mD5_0.getHexValue();
      assertEquals("07603488b62fd4cd1110be8240e6a9be", string1);
      
      mD5_0.reset();
      mD5_0.Update("com.twmacinta.util.MD5", "ISO8859_1");
      mD5_0.Update(byteArray0, 0);
      mD5_0.update(byteArray0, (int) (byte)0, (int) (byte)118);
      String string2 = mD5_0.asHex();
      assertEquals("cf7d961d0ea35fd0ed7a0dfc3446fc96", string2);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MD5 mD5_0 = new MD5();
      String string0 = mD5_0.asHex();
      assertEquals("d41d8cd98f00b204e9800998ecf8427e", string0);
      
      mD5_0.Update("d41d8cd98f00b204e9800998ecf8427e", (String) null);
      mD5_0.getHexValue();
      String string1 = mD5_0.getHexValue();
      assertEquals("74be16979710d4c4e7c6647856088456", string1);
  }
}