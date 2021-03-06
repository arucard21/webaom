/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 13 19:59:10 GMT 2018
 */

package com.github.arucard21.epox.webaom.ui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.arucard21.epox.webaom.A;
import com.github.arucard21.epox.webaom.FileHandler;
import com.github.arucard21.epox.webaom.ui.JPanelMain;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JPanelMain_ESTest extends JPanelMain_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JPanelMain jPanelMain0 = null;
      try {
        jPanelMain0 = new JPanelMain();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.webaom.ui.JPanelMain", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      fileHandler0.m_ext = null;
      A.fha = fileHandler0;
      JPanelMain jPanelMain0 = null;
      try {
        jPanelMain0 = new JPanelMain();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // dataModel must be non null
         //
         verifyException("javax.swing.JList", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        A.init();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.SwingUtilities", e);
      }
  }
}
