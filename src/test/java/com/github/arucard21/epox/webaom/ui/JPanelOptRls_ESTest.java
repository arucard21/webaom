/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 13 20:05:08 GMT 2018
 */

package com.github.arucard21.epox.webaom.ui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.arucard21.epox.util.DSData;
import com.github.arucard21.epox.webaom.Rules;
import com.github.arucard21.epox.webaom.WebAOM;
import com.github.arucard21.epox.webaom.ui.JPanelOptRls;
import com.github.arucard21.epox.webaom.ui.TableModelDS;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.time.format.TextStyle;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.ListSelectionModel;
import javax.swing.plaf.metal.MetalLabelUI;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JPanelOptRls_ESTest extends JPanelOptRls_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Rules rules0 = new Rules();
      assertNotNull(rules0);
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertEquals("#MOVE", rules0.getMov());
      assertEquals(3, Rules.M_FALLB);
      assertEquals(1, Rules.M_RULES);
      assertEquals(0, Rules.M_NOREN);
      assertEquals(2, Rules.M_ANIDB);
      
      JPanelOptRls jPanelOptRls0 = new JPanelOptRls(rules0);
      assertNotNull(jPanelOptRls0);
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertEquals("#MOVE", rules0.getMov());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicySet());
      assertTrue(jPanelOptRls0.getFocusTraversalKeysEnabled());
      assertFalse(jPanelOptRls0.getIgnoreRepaint());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicyProvider());
      assertFalse(jPanelOptRls0.isFocusCycleRoot());
      assertEquals(3, Rules.M_FALLB);
      assertEquals(1, Rules.M_RULES);
      assertEquals(0, Rules.M_NOREN);
      assertEquals(2, Rules.M_ANIDB);
      
      JTable jTable0 = new JTable(1759, 3);
      assertNotNull(jTable0);
      assertFalse(jTable0.getIgnoreRepaint());
      assertTrue(jTable0.getFocusTraversalKeysEnabled());
      assertFalse(jTable0.isFocusTraversalPolicySet());
      assertFalse(jTable0.isFocusCycleRoot());
      assertFalse(jTable0.isFocusTraversalPolicyProvider());
      
      jPanelOptRls0.moveElement(jTable0, rules0.mVill, 1);
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertEquals("#MOVE", rules0.getMov());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicySet());
      assertTrue(jPanelOptRls0.getFocusTraversalKeysEnabled());
      assertFalse(jPanelOptRls0.getIgnoreRepaint());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicyProvider());
      assertFalse(jPanelOptRls0.isFocusCycleRoot());
      assertFalse(jTable0.getIgnoreRepaint());
      assertTrue(jTable0.getFocusTraversalKeysEnabled());
      assertFalse(jTable0.isFocusTraversalPolicySet());
      assertFalse(jTable0.isFocusCycleRoot());
      assertFalse(jTable0.isFocusTraversalPolicyProvider());
      assertEquals(3, Rules.M_FALLB);
      assertEquals(1, Rules.M_RULES);
      assertEquals(0, Rules.M_NOREN);
      assertEquals(2, Rules.M_ANIDB);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rules rules0 = new Rules();
      assertNotNull(rules0);
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertEquals("#MOVE", rules0.getMov());
      assertEquals(0, Rules.M_NOREN);
      assertEquals(2, Rules.M_ANIDB);
      assertEquals(1, Rules.M_RULES);
      assertEquals(3, Rules.M_FALLB);
      
      JPanelOptRls jPanelOptRls0 = new JPanelOptRls(rules0);
      assertNotNull(jPanelOptRls0);
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertEquals("#MOVE", rules0.getMov());
      assertTrue(jPanelOptRls0.getFocusTraversalKeysEnabled());
      assertFalse(jPanelOptRls0.isFocusCycleRoot());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicyProvider());
      assertFalse(jPanelOptRls0.getIgnoreRepaint());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicySet());
      assertEquals(0, Rules.M_NOREN);
      assertEquals(2, Rules.M_ANIDB);
      assertEquals(1, Rules.M_RULES);
      assertEquals(3, Rules.M_FALLB);
      
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      assertNotNull(defaultTableColumnModel0);
      
      ListSelectionModel listSelectionModel0 = defaultTableColumnModel0.getSelectionModel();
      assertNotNull(listSelectionModel0);
      
      JTable jTable0 = new JTable((TableModel) null, defaultTableColumnModel0, listSelectionModel0);
      assertNotNull(jTable0);
      assertTrue(jTable0.getFocusTraversalKeysEnabled());
      assertFalse(jTable0.isFocusTraversalPolicySet());
      assertFalse(jTable0.getIgnoreRepaint());
      assertFalse(jTable0.isFocusTraversalPolicyProvider());
      assertFalse(jTable0.isFocusCycleRoot());
      
      Vector<Integer> vector0 = new Vector<Integer>();
      assertNotNull(vector0);
      assertEquals(10, vector0.capacity());
      assertEquals(0, vector0.size());
      assertTrue(vector0.isEmpty());
      assertEquals("[]", vector0.toString());
      
      jPanelOptRls0.moveElement(jTable0, vector0, 1);
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertEquals("#MOVE", rules0.getMov());
      assertTrue(jPanelOptRls0.getFocusTraversalKeysEnabled());
      assertFalse(jPanelOptRls0.isFocusCycleRoot());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicyProvider());
      assertFalse(jPanelOptRls0.getIgnoreRepaint());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicySet());
      assertTrue(jTable0.getFocusTraversalKeysEnabled());
      assertFalse(jTable0.isFocusTraversalPolicySet());
      assertFalse(jTable0.getIgnoreRepaint());
      assertFalse(jTable0.isFocusTraversalPolicyProvider());
      assertFalse(jTable0.isFocusCycleRoot());
      assertEquals(10, vector0.capacity());
      assertEquals(0, vector0.size());
      assertTrue(vector0.isEmpty());
      assertEquals("[]", vector0.toString());
      assertFalse(vector0.contains(1));
      assertEquals(0, Rules.M_NOREN);
      assertEquals(2, Rules.M_ANIDB);
      assertEquals(1, Rules.M_RULES);
      assertEquals(3, Rules.M_FALLB);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Rules rules0 = new Rules();
      assertNotNull(rules0);
      assertEquals("#MOVE", rules0.getMov());
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertEquals(0, Rules.M_NOREN);
      assertEquals(1, Rules.M_RULES);
      assertEquals(3, Rules.M_FALLB);
      assertEquals(2, Rules.M_ANIDB);
      
      rules0.setRen("!^_USX>_0i\"'?J}u8*");
      assertEquals("#MOVE", rules0.getMov());
      assertEquals("!^_USX>_0i\"'?J}u8*", rules0.getRen());
      assertEquals(0, Rules.M_NOREN);
      assertEquals(1, Rules.M_RULES);
      assertEquals(3, Rules.M_FALLB);
      assertEquals(2, Rules.M_ANIDB);
      
      JPanelOptRls jPanelOptRls0 = new JPanelOptRls(rules0);
      assertNotNull(jPanelOptRls0);
      assertEquals("#MOVE", rules0.getMov());
      assertEquals("!^_USX>_0i\"'?J}u8*", rules0.getRen());
      assertTrue(jPanelOptRls0.getFocusTraversalKeysEnabled());
      assertFalse(jPanelOptRls0.getIgnoreRepaint());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicySet());
      assertFalse(jPanelOptRls0.isFocusCycleRoot());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicyProvider());
      assertEquals(0, Rules.M_NOREN);
      assertEquals(1, Rules.M_RULES);
      assertEquals(3, Rules.M_FALLB);
      assertEquals(2, Rules.M_ANIDB);
      
      // Undeclared exception!
      try { 
        jPanelOptRls0.testAndApplyRules();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Rules rules0 = new Rules();
      assertNotNull(rules0);
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertEquals("#MOVE", rules0.getMov());
      assertEquals(3, Rules.M_FALLB);
      assertEquals(2, Rules.M_ANIDB);
      assertEquals(1, Rules.M_RULES);
      assertEquals(0, Rules.M_NOREN);
      
      JPanelOptRls jPanelOptRls0 = new JPanelOptRls(rules0);
      assertNotNull(jPanelOptRls0);
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertEquals("#MOVE", rules0.getMov());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicySet());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicyProvider());
      assertFalse(jPanelOptRls0.isFocusCycleRoot());
      assertFalse(jPanelOptRls0.getIgnoreRepaint());
      assertTrue(jPanelOptRls0.getFocusTraversalKeysEnabled());
      assertEquals(3, Rules.M_FALLB);
      assertEquals(2, Rules.M_ANIDB);
      assertEquals(1, Rules.M_RULES);
      assertEquals(0, Rules.M_NOREN);
      
      Object object0 = jPanelOptRls0.getValue(" moving operation.");
      assertNull(object0);
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertEquals("#MOVE", rules0.getMov());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicySet());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicyProvider());
      assertFalse(jPanelOptRls0.isFocusCycleRoot());
      assertFalse(jPanelOptRls0.getIgnoreRepaint());
      assertTrue(jPanelOptRls0.getFocusTraversalKeysEnabled());
      assertEquals(3, Rules.M_FALLB);
      assertEquals(2, Rules.M_ANIDB);
      assertEquals(1, Rules.M_RULES);
      assertEquals(0, Rules.M_NOREN);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Rules rules0 = new Rules();
      assertNotNull(rules0);
      assertEquals("#MOVE", rules0.getMov());
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertEquals(2, Rules.M_ANIDB);
      assertEquals(3, Rules.M_FALLB);
      assertEquals(1, Rules.M_RULES);
      assertEquals(0, Rules.M_NOREN);
      
      JPanelOptRls jPanelOptRls0 = new JPanelOptRls(rules0);
      assertNotNull(jPanelOptRls0);
      assertEquals("#MOVE", rules0.getMov());
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertFalse(jPanelOptRls0.isFocusCycleRoot());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicySet());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicyProvider());
      assertFalse(jPanelOptRls0.getIgnoreRepaint());
      assertTrue(jPanelOptRls0.getFocusTraversalKeysEnabled());
      assertEquals(2, Rules.M_ANIDB);
      assertEquals(3, Rules.M_FALLB);
      assertEquals(1, Rules.M_RULES);
      assertEquals(0, Rules.M_NOREN);
      
      // Undeclared exception!
      try { 
        jPanelOptRls0.moveElement((JTable) null, rules0.mVill, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.webaom.ui.JPanelOptRls", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Rules rules0 = new Rules();
      assertNotNull(rules0);
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertEquals("#MOVE", rules0.getMov());
      assertEquals(0, Rules.M_NOREN);
      assertEquals(3, Rules.M_FALLB);
      assertEquals(1, Rules.M_RULES);
      assertEquals(2, Rules.M_ANIDB);
      
      JPanelOptRls jPanelOptRls0 = new JPanelOptRls(rules0);
      assertNotNull(jPanelOptRls0);
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertEquals("#MOVE", rules0.getMov());
      assertFalse(jPanelOptRls0.isFocusCycleRoot());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicyProvider());
      assertTrue(jPanelOptRls0.getFocusTraversalKeysEnabled());
      assertFalse(jPanelOptRls0.getIgnoreRepaint());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicySet());
      assertEquals(0, Rules.M_NOREN);
      assertEquals(3, Rules.M_FALLB);
      assertEquals(1, Rules.M_RULES);
      assertEquals(2, Rules.M_ANIDB);
      
      // Undeclared exception!
      try { 
        jPanelOptRls0.itemStateChanged((ItemEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.webaom.ui.JPanelOptRls", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Rules rules0 = new Rules();
      assertNotNull(rules0);
      assertEquals("#MOVE", rules0.getMov());
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertEquals(2, Rules.M_ANIDB);
      assertEquals(1, Rules.M_RULES);
      assertEquals(0, Rules.M_NOREN);
      assertEquals(3, Rules.M_FALLB);
      
      JPanelOptRls jPanelOptRls0 = new JPanelOptRls(rules0);
      assertNotNull(jPanelOptRls0);
      assertEquals("#MOVE", rules0.getMov());
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicyProvider());
      assertFalse(jPanelOptRls0.isFocusCycleRoot());
      assertTrue(jPanelOptRls0.getFocusTraversalKeysEnabled());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicySet());
      assertFalse(jPanelOptRls0.getIgnoreRepaint());
      assertEquals(2, Rules.M_ANIDB);
      assertEquals(1, Rules.M_RULES);
      assertEquals(0, Rules.M_NOREN);
      assertEquals(3, Rules.M_FALLB);
      
      // Undeclared exception!
      try { 
        jPanelOptRls0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.webaom.ui.JPanelOptRls", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JPanelOptRls jPanelOptRls0 = null;
      try {
        jPanelOptRls0 = new JPanelOptRls((Rules) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.webaom.ui.JPanelOptRls", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Rules rules0 = new Rules();
      assertNotNull(rules0);
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertEquals("#MOVE", rules0.getMov());
      assertEquals(0, Rules.M_NOREN);
      assertEquals(1, Rules.M_RULES);
      assertEquals(2, Rules.M_ANIDB);
      assertEquals(3, Rules.M_FALLB);
      
      JPanelOptRls jPanelOptRls0 = new JPanelOptRls(rules0);
      assertNotNull(jPanelOptRls0);
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertEquals("#MOVE", rules0.getMov());
      assertTrue(jPanelOptRls0.getFocusTraversalKeysEnabled());
      assertFalse(jPanelOptRls0.isFocusCycleRoot());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicySet());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicyProvider());
      assertFalse(jPanelOptRls0.getIgnoreRepaint());
      assertEquals(0, Rules.M_NOREN);
      assertEquals(1, Rules.M_RULES);
      assertEquals(2, Rules.M_ANIDB);
      assertEquals(3, Rules.M_FALLB);
      
      TableModelDS tableModelDS0 = new TableModelDS(rules0.mVill, "", "");
      assertNotNull(tableModelDS0);
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertEquals("#MOVE", rules0.getMov());
      assertEquals(3, tableModelDS0.getColumnCount());
      assertEquals(11, tableModelDS0.getRowCount());
      assertEquals(0, Rules.M_NOREN);
      assertEquals(1, Rules.M_RULES);
      assertEquals(2, Rules.M_ANIDB);
      assertEquals(3, Rules.M_FALLB);
      assertEquals(0, TableModelDS.SEL);
      assertEquals(2, TableModelDS.DST);
      assertEquals(1, TableModelDS.SRC);
      
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      assertNotNull(defaultTableColumnModel0);
      
      DefaultComboBoxModel<Object> defaultComboBoxModel0 = new DefaultComboBoxModel<Object>();
      assertNotNull(defaultComboBoxModel0);
      
      JList<Object> jList0 = new JList<Object>(defaultComboBoxModel0);
      assertNotNull(jList0);
      assertTrue(jList0.getFocusTraversalKeysEnabled());
      assertFalse(jList0.getIgnoreRepaint());
      assertFalse(jList0.isFocusCycleRoot());
      assertFalse(jList0.isFocusTraversalPolicyProvider());
      assertFalse(jList0.isFocusTraversalPolicySet());
      
      ListSelectionModel listSelectionModel0 = jList0.getSelectionModel();
      assertNotNull(listSelectionModel0);
      assertTrue(jList0.getFocusTraversalKeysEnabled());
      assertFalse(jList0.getIgnoreRepaint());
      assertFalse(jList0.isFocusCycleRoot());
      assertFalse(jList0.isFocusTraversalPolicyProvider());
      assertFalse(jList0.isFocusTraversalPolicySet());
      
      JTable jTable0 = new JTable(tableModelDS0, defaultTableColumnModel0, listSelectionModel0);
      assertNotNull(jTable0);
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertEquals("#MOVE", rules0.getMov());
      assertEquals(3, tableModelDS0.getColumnCount());
      assertEquals(11, tableModelDS0.getRowCount());
      assertTrue(jList0.getFocusTraversalKeysEnabled());
      assertFalse(jList0.getIgnoreRepaint());
      assertFalse(jList0.isFocusCycleRoot());
      assertFalse(jList0.isFocusTraversalPolicyProvider());
      assertFalse(jList0.isFocusTraversalPolicySet());
      assertFalse(jTable0.isFocusTraversalPolicyProvider());
      assertFalse(jTable0.getIgnoreRepaint());
      assertFalse(jTable0.isFocusCycleRoot());
      assertTrue(jTable0.getFocusTraversalKeysEnabled());
      assertFalse(jTable0.isFocusTraversalPolicySet());
      assertEquals(0, Rules.M_NOREN);
      assertEquals(1, Rules.M_RULES);
      assertEquals(2, Rules.M_ANIDB);
      assertEquals(3, Rules.M_FALLB);
      assertEquals(0, TableModelDS.SEL);
      assertEquals(2, TableModelDS.DST);
      assertEquals(1, TableModelDS.SRC);
      
      jPanelOptRls0.moveElement(jTable0, rules0.mVill, 2);
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertEquals("#MOVE", rules0.getMov());
      assertTrue(jPanelOptRls0.getFocusTraversalKeysEnabled());
      assertFalse(jPanelOptRls0.isFocusCycleRoot());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicySet());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicyProvider());
      assertFalse(jPanelOptRls0.getIgnoreRepaint());
      assertEquals(3, tableModelDS0.getColumnCount());
      assertEquals(11, tableModelDS0.getRowCount());
      assertTrue(jList0.getFocusTraversalKeysEnabled());
      assertFalse(jList0.getIgnoreRepaint());
      assertFalse(jList0.isFocusCycleRoot());
      assertFalse(jList0.isFocusTraversalPolicyProvider());
      assertFalse(jList0.isFocusTraversalPolicySet());
      assertFalse(jTable0.isFocusTraversalPolicyProvider());
      assertFalse(jTable0.getIgnoreRepaint());
      assertFalse(jTable0.isFocusCycleRoot());
      assertTrue(jTable0.getFocusTraversalKeysEnabled());
      assertFalse(jTable0.isFocusTraversalPolicySet());
      assertEquals(0, Rules.M_NOREN);
      assertEquals(1, Rules.M_RULES);
      assertEquals(2, Rules.M_ANIDB);
      assertEquals(3, Rules.M_FALLB);
      assertEquals(0, TableModelDS.SEL);
      assertEquals(2, TableModelDS.DST);
      assertEquals(1, TableModelDS.SRC);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Rules rules0 = new Rules();
      assertNotNull(rules0);
      assertEquals("#MOVE", rules0.getMov());
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertEquals(0, Rules.M_NOREN);
      assertEquals(2, Rules.M_ANIDB);
      assertEquals(3, Rules.M_FALLB);
      assertEquals(1, Rules.M_RULES);
      
      JPanelOptRls jPanelOptRls0 = new JPanelOptRls(rules0);
      assertNotNull(jPanelOptRls0);
      assertEquals("#MOVE", rules0.getMov());
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertTrue(jPanelOptRls0.getFocusTraversalKeysEnabled());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicyProvider());
      assertFalse(jPanelOptRls0.isFocusCycleRoot());
      assertFalse(jPanelOptRls0.getIgnoreRepaint());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicySet());
      assertEquals(0, Rules.M_NOREN);
      assertEquals(2, Rules.M_ANIDB);
      assertEquals(3, Rules.M_FALLB);
      assertEquals(1, Rules.M_RULES);
      
      TableModelDS tableModelDS0 = new TableModelDS(rules0.mVill, "", "");
      assertNotNull(tableModelDS0);
      assertEquals("#MOVE", rules0.getMov());
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertEquals(11, tableModelDS0.getRowCount());
      assertEquals(3, tableModelDS0.getColumnCount());
      assertEquals(0, Rules.M_NOREN);
      assertEquals(2, Rules.M_ANIDB);
      assertEquals(3, Rules.M_FALLB);
      assertEquals(1, Rules.M_RULES);
      assertEquals(0, TableModelDS.SEL);
      assertEquals(2, TableModelDS.DST);
      assertEquals(1, TableModelDS.SRC);
      
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      assertNotNull(defaultTableColumnModel0);
      
      DefaultComboBoxModel<Object> defaultComboBoxModel0 = new DefaultComboBoxModel<Object>();
      assertNotNull(defaultComboBoxModel0);
      
      JList<Object> jList0 = new JList<Object>(defaultComboBoxModel0);
      assertNotNull(jList0);
      assertFalse(jList0.isFocusCycleRoot());
      assertFalse(jList0.isFocusTraversalPolicyProvider());
      assertTrue(jList0.getFocusTraversalKeysEnabled());
      assertFalse(jList0.getIgnoreRepaint());
      assertFalse(jList0.isFocusTraversalPolicySet());
      
      ListSelectionModel listSelectionModel0 = jList0.getSelectionModel();
      assertNotNull(listSelectionModel0);
      assertFalse(jList0.isFocusCycleRoot());
      assertFalse(jList0.isFocusTraversalPolicyProvider());
      assertTrue(jList0.getFocusTraversalKeysEnabled());
      assertFalse(jList0.getIgnoreRepaint());
      assertFalse(jList0.isFocusTraversalPolicySet());
      
      JTable jTable0 = new JTable(tableModelDS0, defaultTableColumnModel0, listSelectionModel0);
      assertNotNull(jTable0);
      assertEquals("#MOVE", rules0.getMov());
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertEquals(11, tableModelDS0.getRowCount());
      assertEquals(3, tableModelDS0.getColumnCount());
      assertFalse(jList0.isFocusCycleRoot());
      assertFalse(jList0.isFocusTraversalPolicyProvider());
      assertTrue(jList0.getFocusTraversalKeysEnabled());
      assertFalse(jList0.getIgnoreRepaint());
      assertFalse(jList0.isFocusTraversalPolicySet());
      assertFalse(jTable0.isFocusTraversalPolicySet());
      assertTrue(jTable0.getFocusTraversalKeysEnabled());
      assertFalse(jTable0.getIgnoreRepaint());
      assertFalse(jTable0.isFocusCycleRoot());
      assertFalse(jTable0.isFocusTraversalPolicyProvider());
      assertEquals(0, Rules.M_NOREN);
      assertEquals(2, Rules.M_ANIDB);
      assertEquals(3, Rules.M_FALLB);
      assertEquals(1, Rules.M_RULES);
      assertEquals(0, TableModelDS.SEL);
      assertEquals(2, TableModelDS.DST);
      assertEquals(1, TableModelDS.SRC);
      
      jPanelOptRls0.moveElement(jTable0, rules0.mVill, 0);
      assertEquals("#MOVE", rules0.getMov());
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertTrue(jPanelOptRls0.getFocusTraversalKeysEnabled());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicyProvider());
      assertFalse(jPanelOptRls0.isFocusCycleRoot());
      assertFalse(jPanelOptRls0.getIgnoreRepaint());
      assertFalse(jPanelOptRls0.isFocusTraversalPolicySet());
      assertEquals(11, tableModelDS0.getRowCount());
      assertEquals(3, tableModelDS0.getColumnCount());
      assertFalse(jList0.isFocusCycleRoot());
      assertFalse(jList0.isFocusTraversalPolicyProvider());
      assertTrue(jList0.getFocusTraversalKeysEnabled());
      assertFalse(jList0.getIgnoreRepaint());
      assertFalse(jList0.isFocusTraversalPolicySet());
      assertFalse(jTable0.isFocusTraversalPolicySet());
      assertTrue(jTable0.getFocusTraversalKeysEnabled());
      assertFalse(jTable0.getIgnoreRepaint());
      assertFalse(jTable0.isFocusCycleRoot());
      assertFalse(jTable0.isFocusTraversalPolicyProvider());
      assertEquals(0, Rules.M_NOREN);
      assertEquals(2, Rules.M_ANIDB);
      assertEquals(3, Rules.M_FALLB);
      assertEquals(1, Rules.M_RULES);
      assertEquals(0, TableModelDS.SEL);
      assertEquals(2, TableModelDS.DST);
      assertEquals(1, TableModelDS.SRC);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Rules rules0 = new Rules();
      JPanelOptRls jPanelOptRls0 = new JPanelOptRls(rules0);
      JTable jTable0 = new JTable();
      Vector<WebAOM> vector0 = new Vector<WebAOM>();
      jPanelOptRls0.moveElement(jTable0, vector0, 2);
      assertEquals("[]", vector0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Rules rules0 = new Rules();
      JPanelOptRls jPanelOptRls0 = new JPanelOptRls(rules0);
      jPanelOptRls0.updateRules();
      assertFalse(jPanelOptRls0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Rules rules0 = new Rules();
      JPanelOptRls jPanelOptRls0 = new JPanelOptRls(rules0);
      rules0.setRen("All lines must include ' DO '.");
      ImageIcon imageIcon0 = new ImageIcon();
      JToggleButton jToggleButton0 = new JToggleButton("' does already exist, but with wrong CRC. Handle this manually.", imageIcon0);
      MetalLabelUI metalLabelUI0 = new MetalLabelUI();
      ItemEvent itemEvent0 = new ItemEvent(jToggleButton0, 3, metalLabelUI0, 0);
      jPanelOptRls0.itemStateChanged(itemEvent0);
      jPanelOptRls0.testAndApplyRules();
      assertEquals("All lines must include ' DO '.", rules0.getRen());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Rules rules0 = new Rules();
      JPanelOptRls jPanelOptRls0 = new JPanelOptRls(rules0);
      jPanelOptRls0.testAndApplyRules();
      assertEquals("#RENAME\n#DO SET '%ann - %enr - %epn '\n#IF G(!unknown) DO ADD '[%grp]'\n#ELSE DO ADD '[RAW]'", rules0.getRen());
      assertEquals("#MOVE", rules0.getMov());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Rules rules0 = new Rules();
      JPanelOptRls jPanelOptRls0 = new JPanelOptRls(rules0);
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem(jPanelOptRls0);
      ItemEvent itemEvent0 = new ItemEvent(jRadioButtonMenuItem0, 2, jRadioButtonMenuItem0, 2);
      jPanelOptRls0.itemStateChanged(itemEvent0);
      assertEquals("#MOVE", rules0.getMov());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Rules rules0 = new Rules();
      JPanelOptRls jPanelOptRls0 = new JPanelOptRls(rules0);
      DefaultComboBoxModel<Object> defaultComboBoxModel0 = new DefaultComboBoxModel<Object>();
      JList<Object> jList0 = new JList<Object>(defaultComboBoxModel0);
      ListSelectionModel listSelectionModel0 = jList0.getSelectionModel();
      ActionEvent actionEvent0 = new ActionEvent(listSelectionModel0, 0, "");
      jPanelOptRls0.actionPerformed(actionEvent0);
      assertEquals(0, actionEvent0.getID());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Rules rules0 = new Rules();
      JPanelOptRls jPanelOptRls0 = new JPanelOptRls(rules0);
      TextStyle textStyle0 = TextStyle.NARROW_STANDALONE;
      jPanelOptRls0.putValue("", textStyle0);
      assertFalse(jPanelOptRls0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Rules rules0 = new Rules();
      JPanelOptRls jPanelOptRls0 = new JPanelOptRls(rules0);
      JMenuItem jMenuItem0 = new JMenuItem(jPanelOptRls0);
      DSData dSData0 = new DSData("", "g3!7,}%j", true);
      ItemEvent itemEvent0 = new ItemEvent(jMenuItem0, 1, dSData0, 3);
      jPanelOptRls0.itemStateChanged(itemEvent0);
      assertFalse(jPanelOptRls0.getIgnoreRepaint());
  }
}
