/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 13 19:59:06 GMT 2018
 */

package com.github.arucard21.epox.webaom;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.arucard21.epox.webaom.DB;
import com.github.arucard21.epox.webaom.Job;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DB_ESTest extends DB_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DB dB0 = new DB();
      dB0.getJobs();
      assertTrue(dB0.debug);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DB dB0 = new DB();
      int int0 = dB0.getJob((Job) null, true);
      assertTrue(dB0.debug);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DB dB0 = new DB();
      dB0.getGeneric(3, (-1));
      assertTrue(dB0.debug);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DB dB0 = new DB();
      dB0._shutdown();
      assertTrue(dB0.debug);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DB dB0 = new DB();
      // Undeclared exception!
      try { 
        dB0._init("org.postgresql.Driver");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DB dB0 = new DB();
      // Undeclared exception!
      try { 
        dB0._init("?N");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DB dB0 = new DB();
      // Undeclared exception!
      try { 
        dB0._init("! and j.name=");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DB dB0 = new DB();
      // Undeclared exception!
      try { 
        dB0._init("com.mysql.jdbc.Driver");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DB dB0 = new DB();
      // Undeclared exception!
      try { 
        dB0.removeJob((Job) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.webaom.DB", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DB dB0 = new DB();
      boolean boolean0 = dB0._ok();
      assertFalse(boolean0);
      assertTrue(dB0.debug);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DB dB0 = new DB();
      assertFalse(dB0._ok());
      
      boolean boolean0 = dB0.update(3, (Object) null, 2334);
      assertFalse(boolean0);
      assertTrue(dB0.debug);
  }
}
