/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 13 20:12:16 GMT 2018
 */

package com.github.arucard21.epox.webaom.data;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.arucard21.epox.webaom.data.Mylist;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Mylist_ESTest extends Mylist_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Mylist mylist0 = new Mylist();
      assertEquals(0, mylist0.vie);
  }
}
