 													/*--  程序入口 --*/
   
    /*                                           
         \\         //
          \\       //
    ##DDDDDDDDDDDDDDDDDDDDDD##
    ## DDDDDDDDDDDDDDDDDDDD ##   ________   ___   ___        ___   ________   ___   ___        ___
    ## hh                hh ##   |\   __  \ |\  \ |\  \      |\  \ |\   __  \ |\  \ |\  \      |\  \
    ## hh    //    \\    hh ##   \ \  \|\ /_\ \  \\ \  \     \ \  \\ \  \|\ /_\ \  \\ \  \     \ \  \
    ## hh   //      \\   hh ##    \ \   __  \\ \  \\ \  \     \ \  \\ \   __  \\ \  \\ \  \     \ \  \
    ## hh                hh ##     \ \  \|\  \\ \  \\ \  \____ \ \  \\ \  \|\  \\ \  \\ \  \____ \ \  \
    ## hh      李卓                 hh ##      \ \_______\\ \__\\ \_______\\ \__\\ \_______\\ \__\\ \_______\\ \__\
    ## hh                hh ##       \|_______| \|__| \|_______| \|__| \|_______| \|__| \|_______| \|__|
    ## MMMMMMMMMMMMMMMMMMMM ##
    ##MMMMMMMMMMMMMMMMMMMMMM##   
    */


package com.mwq;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.mwq.frame.LandFrame;

public class DrinkeryManage {
	public DrinkeryManage() {
		// Center the window
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		LandFrame landFrame = new LandFrame();
		Dimension frameSize = landFrame.getSize();
		
			frameSize.width = screenSize.width;
	
			frameSize.height = screenSize.height;
		
		landFrame.setLocation((screenSize.width - frameSize.width) / 2,
				(screenSize.height - frameSize.height) / 2);
		landFrame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager
							.getSystemLookAndFeelClassName());
				} catch (Exception exception) {
					exception.printStackTrace();
				}
				new DrinkeryManage();
			}
		});
	}

}
