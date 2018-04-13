/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 13 20:11:51 GMT 2018
 */

package com.github.arucard21.epox.av;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.arucard21.epox.av.GenericTrack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GenericTrack_ESTest extends GenericTrack_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GenericTrack genericTrack0 = null;
      try {
        genericTrack0 = new GenericTrack((GenericTrack) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.av.GenericTrack", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GenericTrack genericTrack0 = new GenericTrack();
      GenericTrack genericTrack1 = new GenericTrack(genericTrack0);
      assertEquals(0, genericTrack1.codec_id);
      assertEquals(0.0F, genericTrack1.dur, 0.01F);
      assertEquals(0, genericTrack1.num);
      assertEquals(0, genericTrack1.type_id);
      assertEquals(0.0, genericTrack1.size, 0.01);
  }
}
