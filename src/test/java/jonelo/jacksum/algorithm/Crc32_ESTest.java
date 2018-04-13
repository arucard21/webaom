/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 13 20:11:52 GMT 2018
 */

package jonelo.jacksum.algorithm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jonelo.jacksum.algorithm.Crc32;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Crc32_ESTest extends Crc32_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Crc32 crc32_0 = new Crc32();
      crc32_0.update(561);
      crc32_0.update(561);
      assertEquals(3596227959L, crc32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Crc32 crc32_0 = new Crc32();
      crc32_0.update(561);
      byte[] byteArray0 = new byte[3];
      crc32_0.update(byteArray0, (int) (byte)0, (int) (byte)0);
      assertEquals(2212294583L, crc32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Crc32 crc32_0 = new Crc32();
      byte[] byteArray0 = new byte[3];
      crc32_0.update(byteArray0);
      long long0 = crc32_0.getValue();
      assertEquals(4282505490L, long0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Crc32 crc32_0 = new Crc32();
      // Undeclared exception!
      try { 
        crc32_0.update((byte[]) null, (-1233), (-1002));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.CRC32", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Crc32 crc32_0 = new Crc32();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        crc32_0.update(byteArray0, 1, 2854);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.CRC32", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Crc32 crc32_0 = new Crc32();
      long long0 = crc32_0.getValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Crc32 crc32_0 = new Crc32();
      crc32_0.uppercase = true;
      String string0 = crc32_0.getHexValue();
      assertEquals("00000000", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Crc32 crc32_0 = new Crc32();
      String string0 = crc32_0.getHexValue();
      assertEquals("00000000", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Crc32 crc32_0 = new Crc32();
      crc32_0.reset();
      assertEquals(0L, crc32_0.getValue());
  }
}
