/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 13 20:08:32 GMT 2018
 */

package com.github.arucard21.epox.webaom;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.arucard21.epox.webaom.Section;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Section_ESTest extends Section_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Section section0 = new Section("+&M53(O%1$R:oK:8\"");
      section0.str = null;
      String string0 = section0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Section section0 = new Section(" WEIGHT ");
      section0.str = " WEIGHT ";
      String string0 = section0.toString();
      assertEquals(" WEIGHT ", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Section section0 = null;
      try {
        section0 = new Section((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.webaom.Section", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Section section0 = new Section("V2?yU'P'D{");
      assertEquals("P", section0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Section section0 = new Section("'w:[?5xlMf4joN");
      assertEquals("'w:[?5xlMf4joN", section0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Section section0 = new Section("y//");
      assertEquals("y", section0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Section section0 = new Section(" WEIGHT ");
      String string0 = section0.toString();
      assertEquals("", string0);
  }
}
