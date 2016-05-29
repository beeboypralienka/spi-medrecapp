/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spi.medrecapp.Gui;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.sikuli.script.App;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

/**
 *
 * @author fachrulpbm
 */
public class FrmMainTest {
    
    private static FrmMain fm;
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FrmMainTest.class.getName()).log(Level.SEVERE, null, ex);
        }        
        fm = new FrmMain();
        fm.setExtendedState(fm.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        fm.setVisible(true);        
    }
    
    @Test
    public void scenario_01()throws Exception{
        Screen screen = new Screen();
        
        /* Click master menu */
        screen.click("/images/07master.png",0);
        
        /* Click submenu specialist data */
        screen.click("/images/08specialistData.png",0);
        
        /* Click and type the specialist ID */
        screen.type("/images/09typeSpecialistID.png", "SP-001",0);
        
        /* Type TAB + type "Internal Disease" on specialist Name + type TAB + type "50000" on price */
        screen.type("\tInternal Disease\t50000");
        
        /* Click the insert button */
        screen.click("/images/10insertButton.png",0);
        
        /* Check the information icon */
        screen.exists("/images/11information.png",0);
        
        /* Click the OK button */
        screen.click("/images/12okButton.png",0);
        
        /* Check if the data on table exist */
        screen.exists("/images/13tabel.png",0);
        
        /* Click the data on table */
        screen.click("/images/14tabelClick.png",0);
        
        /* Check if the field automated filled */
        screen.exists("/images/15fieldAuto.png",0);
        
        /* Click the delete button */
        screen.click("/images/16deleteButton.png",0);
        
        screen.exists("/images/17question.png",0);
        screen.click("/images/18yesButton.png",0);
        screen.exists("/images/19information.png",0);
        screen.click("/images/20okButton.png",0);
        screen.exists("/images/21tableEmpty.png",0);
        screen.click("/images/22closeInternal.png",0);
        
    }
    
//    public FrmMainTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
    @AfterClass
    public static void tearDownClass() {
        fm.setVisible(false);
    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    @Test
//    public void testSomeMethod() {
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
