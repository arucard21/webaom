/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 13 20:09:46 GMT 2018
 */

package com.github.arucard21.epox.util;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.arucard21.epox.util.LinkedHash;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedHash_ESTest extends LinkedHash_ESTest_scaffolding {

  @Ignore
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedHash linkedHash0 = new LinkedHash();
      BiConsumer<String, Object> biConsumer0 = (BiConsumer<String, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      Integer integer0 = new Integer(0);
      linkedHash0.clear();
      linkedHash0.addLast(integer0);
      Object object0 = linkedHash0.getFirst();
      linkedHash0.addLast((Object) null);
      linkedHash0.remove(object0);
      linkedHash0.getFirst();
      linkedHash0.values();
      linkedHash0.getOrDefault(biConsumer0, biConsumer0);
      linkedHash0.entrySet();
      linkedHash0.clear();
      linkedHash0.addLast(object0);
      linkedHash0.getFirst();
      LinkedHash linkedHash1 = (LinkedHash)linkedHash0.clone();
      linkedHash0.addLast(linkedHash1);
      Integer integer1 = (Integer)linkedHash0.getFirst();
      BiConsumer<Object, Integer> biConsumer1 = (BiConsumer<Object, Integer>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      linkedHash0.forEach(biConsumer1);
      LinkedHash linkedHash2 = (LinkedHash)linkedHash1.clone();
      linkedHash0.remove((Object) linkedHash2);
      linkedHash1.clear();
      // Undeclared exception!
      try { 
//    	  ((LinkedHash) integer1).getFirst();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedHash linkedHash0 = new LinkedHash();
      String string0 = null;
      linkedHash0.getOrDefault((Object) null, (Object) null);
      int int0 = (-3301);
      linkedHash0.keySet();
      Integer integer0 = new Integer((-3301));
      BiFunction<Object, Object, Object> biFunction0 = (BiFunction<Object, Object, Object>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(linkedHash0).when(biFunction0).apply(any() , any());
      Object object0 = linkedHash0.compute(integer0, biFunction0);
      // Undeclared exception!
      try { 
        linkedHash0.addLast(object0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedHash linkedHash0 = new LinkedHash();
      linkedHash0.clear();
      LinkedHash linkedHash1 = new LinkedHash();
      linkedHash1.replace((Object) "RH6ao%ac&]Uq6Q-dQQ", (Object) "RH6ao%ac&]Uq6Q-dQQ");
      linkedHash1.entrySet();
      linkedHash0.getOrDefault((Object) null, linkedHash1);
      BiConsumer<Object, Object> biConsumer0 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      linkedHash0.forEach(biConsumer0);
      linkedHash0.clear();
      linkedHash0.entrySet();
      linkedHash0.getOrDefault("RH6ao%ac&]Uq6Q-dQQ", "RH6ao%ac&]Uq6Q-dQQ");
      BiFunction<String, Object, Object> biFunction0 = (BiFunction<String, Object, Object>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedHash0.replaceAll(biFunction0);
      Set set0 = linkedHash0.keySet();
      String string0 = "tw!t[z-YplB2";
      linkedHash0.addLast("tw!t[z-YplB2");
      linkedHash0.addLast(set0);
      // Undeclared exception!
      try { 
        linkedHash1.remove((Object) linkedHash0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedHash linkedHash0 = new LinkedHash();
      Integer integer0 = new Integer((-746));
      linkedHash0.clone();
      linkedHash0.putIfAbsent(integer0, "");
      LinkedHash linkedHash1 = new LinkedHash();
      Object object0 = linkedHash1.clone();
      linkedHash0.put(linkedHash1, (Object) null);
      linkedHash1.keySet();
      linkedHash0.putIfAbsent(object0, (Object) null);
      linkedHash0.addLast((Object) null);
      linkedHash0.putIfAbsent((Object) null, (Object) null);
      linkedHash0.putIfAbsent((Object) null, integer0);
      linkedHash1.clear();
      linkedHash1.getFirst();
      linkedHash1.getFirst();
      linkedHash0.addLast("");
      linkedHash1.getFirst();
      linkedHash0.getFirst();
      linkedHash1.getFirst();
      linkedHash0.remove((Object) null);
      // Undeclared exception!
      try { 
        linkedHash0.remove((Object) "sUQ~#Xa_Pn![u%4F");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.util.LinkedHash", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedHash linkedHash0 = new LinkedHash();
      linkedHash0.clear();
      Integer integer0 = new Integer(1954);
      linkedHash0.replace((Object) integer0, (Object) "", (Object) integer0);
      linkedHash0.addLast("");
      Object object0 = linkedHash0.getFirst();
      assertNotNull(object0);
      
      linkedHash0.remove((Object) "");
      linkedHash0.get((Object) null);
      boolean boolean0 = linkedHash0.addLast((Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedHash linkedHash0 = new LinkedHash();
      linkedHash0.clone();
      String string0 = "_Ki6?";
      BiFunction<Object, Integer, Object> biFunction0 = (BiFunction<Object, Integer, Object>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedHash0.replaceAll(biFunction0);
      linkedHash0.put((Object) null, "_Ki6?");
      linkedHash0.putIfAbsent("_Ki6?", (Object) null);
      // Undeclared exception!
      try { 
        linkedHash0.remove((Object) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to com.github.arucard21.epox.util.LinkedHash$Node
         //
         verifyException("com.github.arucard21.epox.util.LinkedHash", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedHash linkedHash0 = new LinkedHash();
      Integer integer0 = new Integer((-137));
      linkedHash0.putIfAbsent((Object) null, integer0);
      linkedHash0.getFirst();
      boolean boolean0 = linkedHash0.addLast((Object) null);
      assertFalse(boolean0);
      
      Object object0 = linkedHash0.remove((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedHash linkedHash0 = new LinkedHash();
      boolean boolean0 = linkedHash0.addLast((Object) null);
      assertTrue(boolean0);
      
      linkedHash0.remove((Object) null);
      linkedHash0.clear();
      linkedHash0.clear();
      assertTrue(linkedHash0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedHash linkedHash0 = new LinkedHash();
      linkedHash0.keySet();
      linkedHash0.getFirst();
      linkedHash0.addLast((Object) null);
      linkedHash0.getFirst();
      linkedHash0.getFirst();
      Object object0 = linkedHash0.get((Object) null);
      boolean boolean0 = linkedHash0.addLast(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedHash linkedHash0 = new LinkedHash();
      linkedHash0.clear();
      linkedHash0.clear();
      linkedHash0.getFirst();
      Object object0 = linkedHash0.getFirst();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedHash linkedHash0 = new LinkedHash();
      linkedHash0.entrySet();
      Object object0 = linkedHash0.clone();
      // Undeclared exception!
      try { 
        linkedHash0.remove(object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.util.LinkedHash", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedHash linkedHash0 = new LinkedHash();
      linkedHash0.getFirst();
      linkedHash0.clear();
      assertTrue(linkedHash0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedHash linkedHash0 = new LinkedHash();
      Object object0 = linkedHash0.clone();
      // Undeclared exception!
      try { 
        linkedHash0.remove(object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.util.LinkedHash", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedHash linkedHash0 = new LinkedHash();
      Object object0 = linkedHash0.clone();
      boolean boolean0 = linkedHash0.addLast(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedHash linkedHash0 = new LinkedHash();
      BiConsumer<String, Object> biConsumer0 = (BiConsumer<String, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      linkedHash0.clear();
      Integer integer0 = new Integer(0);
      linkedHash0.clear();
      linkedHash0.addLast(integer0);
      linkedHash0.addLast((Object) null);
      linkedHash0.remove((Object) integer0);
      linkedHash0.getFirst();
      LinkedHash linkedHash1 = (LinkedHash)linkedHash0.clone();
      Collection collection0 = linkedHash0.values();
      linkedHash1.get(collection0);
      linkedHash0.entrySet();
      linkedHash0.clear();
      linkedHash0.addLast(integer0);
      linkedHash0.getFirst();
      LinkedHash linkedHash2 = (LinkedHash)linkedHash0.clone();
      linkedHash0.addLast(linkedHash2);
      LinkedHash linkedHash3 = new LinkedHash();
      BiConsumer<Object, Integer> biConsumer1 = (BiConsumer<Object, Integer>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      LinkedHash linkedHash4 = (LinkedHash)linkedHash3.clone();
      // Undeclared exception!
      try { 
        linkedHash0.remove((Object) linkedHash4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.util.LinkedHash", e);
      }
  }
}
