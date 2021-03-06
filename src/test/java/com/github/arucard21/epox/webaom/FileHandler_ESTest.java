/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 13 20:07:10 GMT 2018
 */

package com.github.arucard21.epox.webaom;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.arucard21.epox.webaom.A;
import com.github.arucard21.epox.webaom.FileHandler;
import com.github.arucard21.epox.webaom.JobList;
import com.github.arucard21.epox.webaom.Options;
import java.io.File;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.filechooser.FileSystemView;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.javax.swing.MockJFileChooser;
import org.evosuite.runtime.mock.javax.swing.filechooser.MockFileSystemView;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileHandler_ESTest extends FileHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      MockFile mockFile0 = new MockFile("W(+QEeNQl(", "/home/riaas/.webaom");
      boolean boolean0 = fileHandler0.m_ff.accept(mockFile0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      FileHandler.FileFilter1 fileHandler_FileFilter1_0 = fileHandler0.new FileFilter1();
      assertEquals("Me WANTS!", fileHandler_FileFilter1_0.getDescription());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      File file0 = MockFile.createTempFile("e4|", "+");
      JobList jobList0 = new JobList();
      A.jobs = jobList0;
      FileSystemHandling.shouldAllThrowIOExceptions();
      boolean boolean0 = fileHandler0.addFile(file0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      DefaultComboBoxModel<Integer> defaultComboBoxModel0 = new DefaultComboBoxModel<Integer>();
      JComboBox<Integer> jComboBox0 = new JComboBox<Integer>(defaultComboBoxModel0);
      fileHandler0.m_ext.addListDataListener(jComboBox0);
      fileHandler0.addExt("");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      File file0 = MockFile.createTempFile("C~$XL}[e(DOSNTP=1", "BCz!`Xo-@W^,1Smd");
      String string0 = fileHandler0.getExtension(file0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      File file0 = MockFile.createTempFile("com.github.arucard21.epox.webaom.FileHandler$FileFilter1", "SET ");
      String string0 = fileHandler0.getExtension(file0);
      assertEquals("filehandler$filefilter10set ", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      // Undeclared exception!
      try { 
        fileHandler0.opts((Options) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.webaom.FileHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      Options options0 = new Options();
      String[] stringArray0 = new String[2];
      options0.mSa = stringArray0;
      // Undeclared exception!
      try { 
        fileHandler0.opts(options0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("com.github.arucard21.epox.webaom.Options", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        fileHandler0.optl(options0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.StringTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      options0.mSa = stringArray0;
      // Undeclared exception!
      try { 
        fileHandler0.optl(options0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("com.github.arucard21.epox.webaom.Options", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      // Undeclared exception!
      try { 
        fileHandler0.getExtension((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.webaom.FileHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      FileSystemView fileSystemView0 = MockFileSystemView.getFileSystemView();
      MockJFileChooser mockJFileChooser0 = new MockJFileChooser(fileSystemView0);
      File file0 = mockJFileChooser0.getCurrentDirectory();
      boolean boolean0 = fileHandler0.m_ff.accept(file0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      Options options0 = new Options();
      fileHandler0.opts(options0);
      fileHandler0.optl(options0);
      assertEquals(6, Options.S_SOURCEF);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      File file0 = MockFile.createTempFile("hW$J#", "hW$J#");
      JobList jobList0 = new JobList();
      A.jobs = jobList0;
      // Undeclared exception!
      try { 
        fileHandler0.addFile(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.webaom.Job", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      File file0 = MockFile.createTempFile("hW$J#", "");
      JobList jobList0 = new JobList();
      jobList0.addPath(file0);
      A.jobs = jobList0;
      boolean boolean0 = fileHandler0.addFile(file0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      String string0 = fileHandler0.m_ff.getDescription();
      assertEquals("Me WANTS!", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      // Undeclared exception!
      try { 
        fileHandler0.removeExt(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      JobList jobList0 = new JobList();
      A.jobs = jobList0;
      MockFile mockFile0 = new MockFile("com.github.arucard21.epox.webaom.FileHandler$FileFilter1", "com.github.arucard21.epox.webaom.FileHandler$FileFilter1");
      boolean boolean0 = fileHandler0.addFile(mockFile0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileHandler fileHandler0 = new FileHandler();
      // Undeclared exception!
      try { 
        fileHandler0.addExt("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.arucard21.epox.swing.UniqueStringList", e);
      }
  }
}
