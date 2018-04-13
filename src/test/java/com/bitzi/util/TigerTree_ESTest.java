/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 13 20:06:02 GMT 2018
 */

package com.bitzi.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.bitzi.util.TigerTree;
import java.nio.ByteBuffer;
import java.security.DigestException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TigerTree_ESTest extends TigerTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TigerTree tigerTree0 = new TigerTree();
      assertEquals("TigerTree", tigerTree0.getAlgorithm());
      assertNotNull(tigerTree0);
      
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        tigerTree0.engineUpdate(byteArray0, (byte)0, 1024);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TigerTree tigerTree0 = new TigerTree();
      assertEquals("TigerTree", tigerTree0.getAlgorithm());
      assertNotNull(tigerTree0);
      
      byte[] byteArray0 = new byte[86];
      tigerTree0.update(byteArray0);
      assertEquals("TigerTree", tigerTree0.getAlgorithm());
      assertEquals(86, byteArray0.length);
      
      tigerTree0.update(byteArray0);
      assertEquals("TigerTree", tigerTree0.getAlgorithm());
      assertEquals(86, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TigerTree tigerTree0 = new TigerTree();
      assertEquals("TigerTree", tigerTree0.getAlgorithm());
      assertNotNull(tigerTree0);
      
      byte[] byteArray0 = new byte[5];
      tigerTree0.engineUpdate(byteArray0, (byte)0, 0);
      assertEquals("TigerTree", tigerTree0.getAlgorithm());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(5, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TigerTree tigerTree0 = new TigerTree();
      assertEquals("TigerTree", tigerTree0.getAlgorithm());
      assertNotNull(tigerTree0);
      
      tigerTree0.engineReset();
      assertEquals("TigerTree", tigerTree0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TigerTree tigerTree0 = new TigerTree();
      assertEquals("TigerTree", tigerTree0.getAlgorithm());
      assertNotNull(tigerTree0);
      
      int int0 = tigerTree0.engineGetDigestLength();
      assertEquals("TigerTree", tigerTree0.getAlgorithm());
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TigerTree tigerTree0 = new TigerTree();
      assertEquals("TigerTree", tigerTree0.getAlgorithm());
      assertNotNull(tigerTree0);
      
      byte[] byteArray0 = tigerTree0.engineDigest();
      assertEquals("TigerTree", tigerTree0.getAlgorithm());
      assertNotNull(byteArray0);
      assertEquals(24, byteArray0.length);
      
      int int0 = tigerTree0.engineDigest(byteArray0, 0, 438);
      assertEquals("TigerTree", tigerTree0.getAlgorithm());
      assertEquals(24, byteArray0.length);
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        TigerTree.tl((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.bitzi.util.TigerTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        TigerTree.tl(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.bitzi.util.TigerTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TigerTree tigerTree0 = new TigerTree();
      assertEquals("TigerTree", tigerTree0.getAlgorithm());
      assertNotNull(tigerTree0);
      
      // Undeclared exception!
      try { 
        tigerTree0.engineUpdate((byte[]) null, 1, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TigerTree tigerTree0 = new TigerTree();
      assertEquals("TigerTree", tigerTree0.getAlgorithm());
      assertNotNull(tigerTree0);
      
      // Undeclared exception!
      try { 
        tigerTree0.engineDigest((byte[]) null, (-4090), 31);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TigerTree tigerTree0 = new TigerTree();
      assertEquals("TigerTree", tigerTree0.getAlgorithm());
      assertNotNull(tigerTree0);
      
      byte[] byteArray0 = tigerTree0.engineDigest();
      assertEquals("TigerTree", tigerTree0.getAlgorithm());
      assertNotNull(byteArray0);
      assertEquals(24, byteArray0.length);
      
      // Undeclared exception!
      try { 
        tigerTree0.engineDigest(byteArray0, 183, 438);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TigerTree tigerTree0 = new TigerTree();
      byte[] byteArray0 = tigerTree0.engineDigest();
      assertNotNull(byteArray0);
      
      String string0 = TigerTree.tl(byteArray0);
      assertEquals(24, byteArray0.length);
      assertEquals("93,158,208,10,3,14,99,139,219,117,58,106,36,251,144,14,90,99,184,231,62,108,37,182,", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TigerTree tigerTree0 = new TigerTree();
      tigerTree0.blockUpdate();
      tigerTree0.blockUpdate();
      assertEquals("TigerTree", tigerTree0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TigerTree tigerTree0 = new TigerTree();
      byte[] byteArray0 = tigerTree0.engineDigest();
      try { 
        tigerTree0.engineDigest(byteArray0, 35, (-233));
        fail("Expecting exception: DigestException");
      
      } catch(DigestException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.bitzi.util.TigerTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TigerTree tigerTree0 = new TigerTree();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(2617);
      tigerTree0.update(byteBuffer0);
      byte[] byteArray0 = tigerTree0.engineDigest();
      assertEquals(24, byteArray0.length);
      assertNotNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TigerTree tigerTree0 = new TigerTree();
      tigerTree0.engineUpdate((byte)15);
      assertEquals("TigerTree", tigerTree0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TigerTree tigerTree0 = new TigerTree();
      try { 
        tigerTree0.clone();
        fail("Expecting exception: CloneNotSupportedException");
      
      } catch(CloneNotSupportedException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.bitzi.util.TigerTree", e);
      }
  }
}
