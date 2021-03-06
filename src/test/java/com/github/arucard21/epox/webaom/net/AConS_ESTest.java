/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 13 20:12:17 GMT 2018
 */

package com.github.arucard21.epox.webaom.net;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.arucard21.epox.webaom.net.AConS;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AConS_ESTest extends AConS_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AConS aConS0 = new AConS("", 0, 0, 1, 0, 0, false);
      assertEquals(0, aConS0.lport);
      assertEquals(0, aConS0.max_tout);
      assertFalse(aConS0.nat);
      assertEquals(0, aConS0.delay);
      assertEquals(0, aConS0.rport);
      assertEquals(1000, aConS0.tout);
  }
}
