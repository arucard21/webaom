/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 13 20:02:12 GMT 2018
 */

package com.github.arucard21.epox.webaom.ui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.arucard21.epox.webaom.data.AFile;
import com.github.arucard21.epox.webaom.data.AG;
import com.github.arucard21.epox.webaom.data.Anime;
import com.github.arucard21.epox.webaom.data.Ep;
import com.github.arucard21.epox.webaom.data.Group;
import com.github.arucard21.epox.webaom.data.Path;
import com.github.arucard21.epox.webaom.ui.TableModelAlt;
import java.lang.reflect.Array;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TableModelAlt_ESTest extends TableModelAlt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      TableColumn tableColumn0 = new TableColumn(0);
      defaultTableColumnModel0.addColumn(tableColumn0);
      // Undeclared exception!
      try { 
        tableModelAlt0.formatTable(defaultTableColumnModel0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3 >= 1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      String[] stringArray0 = new String[9];
      stringArray0[3] = "";
      TableModelAlt.cNames = stringArray0;
      String string0 = tableModelAlt0.getColumnName(3);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      String[] stringArray0 = new String[0];
      TableModelAlt.cNames = stringArray0;
      int int0 = tableModelAlt0.getColumnCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 3);
      TableModelAlt.cTypes = classArray0;
      Class class0 = tableModelAlt0.getColumnClass(0);
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      Class class0 = tableModelAlt0.getColumnClass(0);
      assertEquals("interface com.sun.swing.TreeTableModel", class0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      Class class0 = tableModelAlt0.getColumnClass(5);
      assertEquals("class java.lang.Integer", class0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      Path path0 = new Path("&=b");
      path0.add(path0);
      int int0 = tableModelAlt0.getChildCount(path0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      TableModelAlt.cNames = null;
      // Undeclared exception!
      try { 
        tableModelAlt0.getColumnName((-2270));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.webaom.ui.TableModelAlt", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      // Undeclared exception!
      try { 
        tableModelAlt0.getColumnName(1834);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1834
         //
         verifyException("com.github.arucard21.epox.webaom.ui.TableModelAlt", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      TableModelAlt.cNames = null;
      // Undeclared exception!
      try { 
        tableModelAlt0.getColumnCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.webaom.ui.TableModelAlt", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      TableModelAlt.cTypes = null;
      // Undeclared exception!
      try { 
        tableModelAlt0.getColumnClass((-737));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.webaom.ui.TableModelAlt", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      // Undeclared exception!
      try { 
        tableModelAlt0.getChildCount((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.webaom.ui.TableModelAlt", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      // Undeclared exception!
      try { 
        tableModelAlt0.getChildCount(fileSystemHandling0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.testdata.FileSystemHandling cannot be cast to com.github.arucard21.epox.webaom.data.Base
         //
         verifyException("com.github.arucard21.epox.webaom.ui.TableModelAlt", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      Path path0 = new Path((String) null);
      path0.mkArray();
      // Undeclared exception!
      try { 
        tableModelAlt0.getChild(path0, (-1572));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1572
         //
         verifyException("com.github.arucard21.epox.webaom.data.Base", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      // Undeclared exception!
      try { 
        tableModelAlt0.formatTable((TableColumnModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.webaom.ui.TableModelAlt", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      AFile aFile0 = new AFile(3);
      boolean boolean0 = tableModelAlt0.isLeaf(aFile0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      AFile aFile0 = new AFile(2);
      boolean boolean0 = tableModelAlt0.isLeaf(aFile0.anime);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      Anime anime0 = new Anime(6);
      Object object0 = tableModelAlt0.getChild(anime0, 152);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      Object object0 = tableModelAlt0.getChild((Object) null, (-1178));
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      Object object0 = tableModelAlt0.getRoot();
      Object object1 = tableModelAlt0.getValueAt(object0, 5);
      assertEquals(0, object1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      Object object0 = tableModelAlt0.getRoot();
      Object object1 = tableModelAlt0.getValueAt(object0, (-2364));
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      Object object0 = tableModelAlt0.getRoot();
      Object object1 = tableModelAlt0.getValueAt(object0, 0);
      assertEquals("Press F5 to update.", object1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      Path path0 = new Path(".");
      Object object0 = tableModelAlt0.getValueAt(path0, 5);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      Path path0 = new Path("SET ");
      Object object0 = tableModelAlt0.getValueAt(path0, 4);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      Anime anime0 = new Anime(1062);
      Group group0 = new Group(184);
      AG aG0 = new AG(anime0, group0);
      Object object0 = tableModelAlt0.getValueAt(aG0, 5);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      Anime anime0 = new Anime(6);
      Group group0 = new Group(0);
      AG aG0 = new AG(anime0, group0);
      Object object0 = tableModelAlt0.getValueAt(aG0, 0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      AFile aFile0 = new AFile(3);
      Object object0 = tableModelAlt0.getValueAt(aFile0, 1063);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      AFile aFile0 = new AFile(3);
      Object object0 = tableModelAlt0.getValueAt(aFile0, 4);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      AFile aFile0 = new AFile(3);
      Object object0 = tableModelAlt0.getValueAt(aFile0, 3);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      AFile aFile0 = new AFile(3);
      Object object0 = tableModelAlt0.getValueAt(aFile0, 5);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      Ep ep0 = new Ep(5);
      Object object0 = tableModelAlt0.getValueAt(ep0, 5);
      assertEquals(0, object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      Anime anime0 = new Anime(658);
      Object object0 = tableModelAlt0.getValueAt(anime0, 1882);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      Anime anime0 = new Anime(658);
      Object object0 = tableModelAlt0.getValueAt(anime0, 5);
      assertNotNull(object0);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      Anime anime0 = new Anime(658);
      Object object0 = tableModelAlt0.getValueAt(anime0, 4);
      assertEquals(0, object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      Anime anime0 = new Anime(2);
      Object object0 = tableModelAlt0.getValueAt(anime0, 3);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      Anime anime0 = new Anime(658);
      // Undeclared exception!
      try { 
        tableModelAlt0.getValueAt(anime0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.webaom.data.Anime", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      Anime anime0 = new Anime(658);
      Object object0 = tableModelAlt0.getValueAt(anime0, 0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      Anime anime0 = new Anime(1);
      Object object0 = tableModelAlt0.getValueAt(anime0, 1);
      assertNotNull(object0);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      Path path0 = new Path("There is not enough space on the disk");
      Object object0 = tableModelAlt0.getValueAt(path0, 6);
      assertNotNull(object0);
      assertEquals("0.00  B", object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      Ep ep0 = new Ep(4);
      Object object0 = tableModelAlt0.getValueAt(ep0, 0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      Object object0 = tableModelAlt0.getValueAt((Object) null, 0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      Ep ep0 = new Ep(4);
      int int0 = tableModelAlt0.getChildCount(ep0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      // Undeclared exception!
      try { 
        tableModelAlt0.getColumnClass((-737));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -737
         //
         verifyException("com.github.arucard21.epox.webaom.ui.TableModelAlt", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      String string0 = tableModelAlt0.getColumnName(4);
      assertEquals("Year", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      TableModelAlt tableModelAlt0 = new TableModelAlt();
      int int0 = tableModelAlt0.getColumnCount();
      assertEquals(7, int0);
  }
}
