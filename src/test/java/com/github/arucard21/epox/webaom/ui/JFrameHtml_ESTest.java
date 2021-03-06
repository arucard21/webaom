/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 13 20:09:21 GMT 2018
 */

package com.github.arucard21.epox.webaom.ui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.arucard21.epox.webaom.ui.JFrameHtml;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JFrameHtml_ESTest extends JFrameHtml_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JFrameHtml jFrameHtml0 = null;
      try {
        jFrameHtml0 = new JFrameHtml("Show Info", "Show Info");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
