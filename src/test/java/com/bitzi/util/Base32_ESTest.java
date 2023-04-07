/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 13 20:04:53 GMT 2018
 */

package com.bitzi.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.bitzi.util.Base32;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base32_ESTest extends Base32_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = Base32.decode("mK(N^HrT(5})J-+W!W");
      assertEquals(11, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = Base32.decode("");
      String string0 = Base32.encode(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base32.encode((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.bitzi.util.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base32.decode((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.bitzi.util.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base32.decode("g");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.bitzi.util.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = Base32.decode("De");
      assertArrayEquals(new byte[] {(byte)25}, byteArray0);
      assertEquals(1, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = Base32.decode("PSLVDEQAAAAAAAAA");
      assertEquals(10, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)124, (byte) (-105), (byte)81, (byte) (-110), (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      byte[] byteArray0 = Base32.decode(",[0PSLV*0D/'eq\"");
      String string0 = Base32.encode(byteArray0);
      assertEquals("PSLVDEQAAAAAAAAA", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) (-42);
      String string0 = Base32.encode(byteArray0);
      assertEquals("ADLAAAA", string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Base32 base32_0 = new Base32();
  }
}