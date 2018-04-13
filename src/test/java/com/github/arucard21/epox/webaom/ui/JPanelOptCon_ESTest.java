/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 13 20:09:40 GMT 2018
 */

package com.github.arucard21.epox.webaom.ui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.arucard21.epox.webaom.Options;
import com.github.arucard21.epox.webaom.ui.JPanelOptCon;
import javax.swing.event.ChangeEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JPanelOptCon_ESTest extends JPanelOptCon_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JPanelOptCon jPanelOptCon0 = new JPanelOptCon();
      // Undeclared exception!
      try { 
        jPanelOptCon0.opts((Options) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.webaom.ui.JPanelOptCon", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JPanelOptCon jPanelOptCon0 = new JPanelOptCon();
      Options options0 = new Options();
      boolean[] booleanArray0 = new boolean[1];
      options0.mBa = booleanArray0;
      // Undeclared exception!
      try { 
        jPanelOptCon0.opts(options0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("com.github.arucard21.epox.webaom.Options", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JPanelOptCon jPanelOptCon0 = new JPanelOptCon();
      // Undeclared exception!
      try { 
        jPanelOptCon0.optl((Options) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.webaom.ui.JPanelOptCon", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JPanelOptCon jPanelOptCon0 = new JPanelOptCon();
      Options options0 = new Options();
      int[] intArray0 = new int[0];
      options0.mIa = intArray0;
      // Undeclared exception!
      try { 
        jPanelOptCon0.optl(options0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.github.arucard21.epox.webaom.Options", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JPanelOptCon jPanelOptCon0 = new JPanelOptCon();
      Options options0 = new Options();
      int[] intArray0 = new int[6];
      intArray0[4] = 17;
      options0.mIa = intArray0;
      jPanelOptCon0.optl(options0);
      assertEquals(5, Options.I_USMOD);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JPanelOptCon jPanelOptCon0 = new JPanelOptCon();
      Options options0 = mock(Options.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(options0).getB(anyInt());
      doReturn(0, 10, 3800, 10).when(options0).getI(anyInt());
      doReturn("\u0001").when(options0).getS(anyInt());
      jPanelOptCon0.optl(options0);
      assertFalse(jPanelOptCon0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JPanelOptCon jPanelOptCon0 = new JPanelOptCon();
      Options options0 = new Options();
      jPanelOptCon0.optl(options0);
      jPanelOptCon0.opts(options0);
      jPanelOptCon0.optl(options0);
      assertFalse(jPanelOptCon0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JPanelOptCon jPanelOptCon0 = new JPanelOptCon();
      int int0 = jPanelOptCon0.getD();
      assertEquals(4000, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JPanelOptCon jPanelOptCon0 = new JPanelOptCon();
      int int0 = jPanelOptCon0.getT();
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JPanelOptCon jPanelOptCon0 = new JPanelOptCon();
      jPanelOptCon0.stateChanged((ChangeEvent) null);
      assertFalse(jPanelOptCon0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JPanelOptCon jPanelOptCon0 = new JPanelOptCon();
      jPanelOptCon0.setEnabled(false);
      assertFalse(jPanelOptCon0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JPanelOptCon jPanelOptCon0 = new JPanelOptCon();
      boolean boolean0 = jPanelOptCon0.getN();
      assertFalse(boolean0);
  }
}