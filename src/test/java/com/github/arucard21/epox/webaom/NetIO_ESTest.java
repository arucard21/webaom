/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 13 20:03:26 GMT 2018
 */

package com.github.arucard21.epox.webaom;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.arucard21.epox.swing.Log;
import com.github.arucard21.epox.webaom.NetIO;
import com.github.arucard21.epox.webaom.net.ACon;
import com.github.arucard21.epox.webaom.net.AConS;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NetIO_ESTest extends NetIO_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NetIO netIO0 = new NetIO();
      // Undeclared exception!
      try { 
        netIO0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.webaom.NetIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NetIO netIO0 = new NetIO();
      AConS aConS0 = new AConS((String) null, 0, (-3161), 0, 82, 0, true);
      ACon aCon0 = new ACon((Log) null, aConS0);
      // Undeclared exception!
      try { 
        netIO0.ping(aCon0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.webaom.NetIO", e);
      }
  }
}
