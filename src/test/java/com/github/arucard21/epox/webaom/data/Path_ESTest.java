/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 13 20:12:05 GMT 2018
 */

package com.github.arucard21.epox.webaom.data;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.arucard21.epox.webaom.data.Path;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Path_ESTest extends Path_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Path path0 = new Path((String) null);
      String string0 = path0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Path path0 = new Path("$");
      String string0 = path0.toString();
      assertEquals("$", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Path path0 = new Path((String) null);
      Object object0 = path0.getKey();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Path path0 = new Path("");
      Object object0 = path0.getKey();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Path path0 = new Path("");
      String string0 = path0.toString();
      assertEquals("", string0);
  }
}