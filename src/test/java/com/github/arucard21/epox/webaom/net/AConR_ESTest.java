/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 13 20:04:43 GMT 2018
 */

package com.github.arucard21.epox.webaom.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.arucard21.epox.webaom.net.AConR;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AConR_ESTest extends AConR_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AConR aConR0 = new AConR("exh,g%Hdje^?$>L", 1427, "130Sjj_}.BHXSo'");
      aConR0.tag = "w-Z3,/";
      String string0 = aConR0.toString();
      assertEquals("130 jj_}.BHXSo' [null]", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AConR aConR0 = null;
      try {
        aConR0 = new AConR("2dOu0REYdn%S", 0, "2dOu0REYdn%S");
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // Unexpected response
         //
         verifyException("com.github.arucard21.epox.webaom.net.AConR", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AConR aConR0 = null;
      try {
        aConR0 = new AConR("t{H&di%D", 7, "t{H&di%D");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AConR aConR0 = null;
      try {
        aConR0 = new AConR("t{H&di%D", 4, "t{H&di%D");
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // Wrong Tag
         //
         verifyException("com.github.arucard21.epox.webaom.net.AConR", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AConR aConR0 = null;
      try {
        aConR0 = new AConR("", (-72), "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AConR aConR0 = null;
      try {
        aConR0 = new AConR((String) null, 60, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.webaom.net.AConR", e);
      }
  }
}
