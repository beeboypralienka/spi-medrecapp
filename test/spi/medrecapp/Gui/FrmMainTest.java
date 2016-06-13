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
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

/**
 *
 * @author fachrulpbm
 */
public class FrmMainTest {
    
    private static FrmMain fm;
    
    public FrmMainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FrmMainTestFuck.class.getName()).log(Level.SEVERE, null, ex);
        }        
        fm = new FrmMain();
        fm.setExtendedState(fm.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        fm.setVisible(true);
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.exit(0);
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testScenario1() {
        
        try {
            Screen screen = new Screen();
            screen.click("/images/07master.png",0);
            screen.click("/images/08specialistData.png",0);
            screen.type("/images/09typeSpecialistID.png", "SP-001",0);
            screen.type("\tInternal Disease\t50000");
            screen.click("/images/10insertButton.png",0);
            screen.exists("/images/11information.png",0);
            screen.click("/images/12okButton.png",0);
            screen.exists("/images/13tabel.png",0);
            screen.click("/images/14tabelClick.png",0);
            screen.exists("/images/15fieldAuto.png",0);
            screen.click("/images/16deleteButton.png",0);
            screen.exists("/images/17question.png",0);
            screen.click("/images/18yesButton.png",0);
            screen.exists("/images/19information.png",0);
            screen.click("/images/20okButton.png",0);
            screen.exists("/images/21tableEmpty.png",0);
            screen.click("/images/22closeInternal.png",0);
            //screen.click("/medrecapp.sikuli/file.png",0);
            //screen.click("/medrecapp.sikuli/exit.png",0); 
        } catch (FindFailed ex) {
            Logger.getLogger(FrmMainTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
