/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 13 20:06:18 GMT 2018
 */

package com.github.arucard21.epox.swing;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.arucard21.epox.swing.HeaderListener;
import com.github.arucard21.epox.swing.SortButtonRenderer;
import java.awt.IllegalComponentStateException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HeaderListener_ESTest extends HeaderListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      JTableHeader jTableHeader0 = new JTableHeader(defaultTableColumnModel0);
      SortButtonRenderer sortButtonRenderer0 = new SortButtonRenderer();
      HeaderListener headerListener0 = new HeaderListener(jTableHeader0, defaultTableColumnModel0, sortButtonRenderer0);
      // Undeclared exception!
      try { 
        headerListener0.mouseReleased((MouseEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.swing.HeaderListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JTableHeader jTableHeader0 = new JTableHeader((TableColumnModel) null);
      HeaderListener headerListener0 = new HeaderListener(jTableHeader0, (TableColumnModel) null, (SortButtonRenderer) null);
      JCheckBoxMenuItem jCheckBoxMenuItem0 = new JCheckBoxMenuItem("com.github.arucard21.epox.swing.HeaderListener", false);
      MouseEvent mouseEvent0 = new MouseEvent(jCheckBoxMenuItem0, 2162689, 2162689, (-627), (-151), (-1826), 0, (-627), 0, true, 1);
      // Undeclared exception!
      try { 
        headerListener0.mousePressed(mouseEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.swing.HeaderListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, 1862);
      JTable jTable0 = new JTable(defaultTableModel0);
      JTableHeader jTableHeader0 = jTable0.getTableHeader();
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      SortButtonRenderer sortButtonRenderer0 = new SortButtonRenderer();
      HeaderListener headerListener0 = new HeaderListener(jTableHeader0, defaultTableColumnModel0, sortButtonRenderer0);
      // Undeclared exception!
      try { 
        headerListener0.mouseClicked((MouseEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.swing.HeaderListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      JTable jTable0 = new JTable(defaultTableModel0);
      JTableHeader jTableHeader0 = jTable0.getTableHeader();
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      SortButtonRenderer sortButtonRenderer0 = new SortButtonRenderer();
      HeaderListener headerListener0 = new HeaderListener(jTableHeader0, defaultTableColumnModel0, sortButtonRenderer0);
      MouseEvent mouseEvent0 = new MouseEvent(sortButtonRenderer0, (-3276), (-3276), (-3276), 928, 1, (-1309), false, 1);
      headerListener0.mouseReleased(mouseEvent0);
      assertEquals((-1309), mouseEvent0.getClickCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      JTableHeader jTableHeader0 = new JTableHeader();
      SortButtonRenderer sortButtonRenderer0 = new SortButtonRenderer();
      HeaderListener headerListener0 = new HeaderListener(jTableHeader0, defaultTableColumnModel0, sortButtonRenderer0);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jTableHeader0, 29, 959L, (-453), 22, (-453), 22, 22, 1403, false, 1938, 29, (-453), 0.0);
      headerListener0.mouseReleased(mouseWheelEvent0);
      assertEquals(1938, mouseWheelEvent0.getScrollType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      JTable jTable0 = new JTable(defaultTableModel0);
      JTableHeader jTableHeader0 = jTable0.getTableHeader();
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      SortButtonRenderer sortButtonRenderer0 = new SortButtonRenderer();
      HeaderListener headerListener0 = new HeaderListener(jTableHeader0, defaultTableColumnModel0, sortButtonRenderer0);
      MouseEvent mouseEvent0 = new MouseEvent(sortButtonRenderer0, (-3276), (-3276), (-3276), 928, 1, (-1309), false, 1);
      headerListener0.mousePressed(mouseEvent0);
      assertFalse(mouseEvent0.isAltDown());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      JTable jTable0 = new JTable(defaultTableModel0);
      JTableHeader jTableHeader0 = jTable0.getTableHeader();
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      SortButtonRenderer sortButtonRenderer0 = new SortButtonRenderer();
      HeaderListener headerListener0 = new HeaderListener(jTableHeader0, defaultTableColumnModel0, sortButtonRenderer0);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(sortButtonRenderer0, 0, 1, (-955), (-1006), 1, (-1), false, 0, 928, 0);
      headerListener0.mousePressed(mouseWheelEvent0);
      assertEquals((-2147483643), mouseWheelEvent0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      JTableHeader jTableHeader0 = new JTableHeader();
      SortButtonRenderer sortButtonRenderer0 = new SortButtonRenderer();
      HeaderListener headerListener0 = new HeaderListener(jTableHeader0, defaultTableColumnModel0, sortButtonRenderer0);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jTableHeader0, 29, 959L, (-453), 22, (-453), 22, 22, 1403, false, 1938, 29, (-453), 0.0);
      headerListener0.setMask((-774L));
      // Undeclared exception!
      try { 
        headerListener0.mouseClicked(mouseWheelEvent0);
        fail("Expecting exception: IllegalComponentStateException");
      
      } catch(IllegalComponentStateException e) {
         //
         // component must be showing on the screen to determine its location
         //
         verifyException("java.awt.Component", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      JTable jTable0 = new JTable(defaultTableModel0);
      JTableHeader jTableHeader0 = jTable0.getTableHeader();
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      SortButtonRenderer sortButtonRenderer0 = new SortButtonRenderer();
      HeaderListener headerListener0 = new HeaderListener(jTableHeader0, defaultTableColumnModel0, sortButtonRenderer0);
      MouseEvent mouseEvent0 = new MouseEvent(sortButtonRenderer0, (-3276), (-3276), (-3276), 928, 1, (-1309), false, 1);
      headerListener0.mouseClicked(mouseEvent0);
      assertFalse(mouseEvent0.isPopupTrigger());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      JTableHeader jTableHeader0 = new JTableHeader();
      SortButtonRenderer sortButtonRenderer0 = new SortButtonRenderer();
      HeaderListener headerListener0 = new HeaderListener(jTableHeader0, defaultTableColumnModel0, sortButtonRenderer0);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jTableHeader0, 29, 959L, (-453), 22, (-453), 22, 22, 1403, false, 1938, 29, (-453), 0.0);
      headerListener0.mouseClicked(mouseWheelEvent0);
      assertEquals(1938, mouseWheelEvent0.getScrollType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JTableHeader jTableHeader0 = new JTableHeader((TableColumnModel) null);
      SortButtonRenderer sortButtonRenderer0 = new SortButtonRenderer();
      HeaderListener headerListener0 = new HeaderListener(jTableHeader0, (TableColumnModel) null, sortButtonRenderer0);
      headerListener0.setMask(0L);
  }
}
