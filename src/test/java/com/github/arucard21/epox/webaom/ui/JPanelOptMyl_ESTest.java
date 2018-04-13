/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 13 20:11:54 GMT 2018
 */

package com.github.arucard21.epox.webaom.ui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.arucard21.epox.webaom.Options;
import com.github.arucard21.epox.webaom.data.Mylist;
import com.github.arucard21.epox.webaom.ui.JPanelOptMyl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JPanelOptMyl_ESTest extends JPanelOptMyl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JPanelOptMyl jPanelOptMyl0 = new JPanelOptMyl();
      // Undeclared exception!
      try { 
        jPanelOptMyl0.opts((Options) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.webaom.ui.JPanelOptMyl", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JPanelOptMyl jPanelOptMyl0 = new JPanelOptMyl();
      Options options0 = new Options();
      String[] stringArray0 = new String[3];
      options0.mSa = stringArray0;
      // Undeclared exception!
      try { 
        jPanelOptMyl0.opts(options0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("com.github.arucard21.epox.webaom.Options", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JPanelOptMyl jPanelOptMyl0 = new JPanelOptMyl();
      Options options0 = new Options();
      options0.mIa = null;
      // Undeclared exception!
      try { 
        jPanelOptMyl0.optl(options0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.webaom.Options", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JPanelOptMyl jPanelOptMyl0 = new JPanelOptMyl();
      Options options0 = new Options();
      int[] intArray0 = new int[3];
      intArray0[2] = 15;
      options0.mIa = intArray0;
      // Undeclared exception!
      try { 
        jPanelOptMyl0.optl(options0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // setSelectedIndex: 15 out of bounds
         //
         verifyException("javax.swing.JComboBox", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JPanelOptMyl jPanelOptMyl0 = new JPanelOptMyl();
      Options options0 = new Options();
      int[] intArray0 = new int[1];
      options0.mIa = options0.mIa;
      options0.mIa = intArray0;
      // Undeclared exception!
      try { 
        jPanelOptMyl0.optl(options0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.github.arucard21.epox.webaom.Options", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JPanelOptMyl jPanelOptMyl0 = new JPanelOptMyl();
      Options options0 = new Options();
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[6] = true;
      options0.mBa = booleanArray0;
      jPanelOptMyl0.optl(options0);
      Mylist mylist0 = jPanelOptMyl0.getMylistData();
      assertEquals(1, mylist0.vie);
      assertEquals(0, mylist0.stt);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JPanelOptMyl jPanelOptMyl0 = new JPanelOptMyl();
      Mylist mylist0 = jPanelOptMyl0.getMylistData();
      assertEquals(0, mylist0.vie);
      assertEquals(1, mylist0.stt);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JPanelOptMyl jPanelOptMyl0 = new JPanelOptMyl();
      Options options0 = new Options();
      jPanelOptMyl0.opts(options0);
      assertEquals(1, Options.I_LPORT);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      JPanelOptMyl jPanelOptMyl0 = new JPanelOptMyl();
      jPanelOptMyl0.setEnabled(true);
      assertTrue(jPanelOptMyl0.getFocusTraversalKeysEnabled());
  }
}
