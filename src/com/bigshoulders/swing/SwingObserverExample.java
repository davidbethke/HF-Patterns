package com.bigshoulders.swing;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class SwingObserverExample {

	/**
	 * @param args
	 */
	JFrame frame;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}
		public void go(){
			frame = new JFrame();
			JButton button = new JButton("Should I do it?");
			button.addActionListener(new AngelListener());
			button.addActionListener(new DevilListener());
			frame.getContentPane().add(BorderLayout.CENTER,button);
			
		}
		class AngelListener implements ActionListener {
			public void actionPerformed(ActionEvent event){
				System.out.println("don't do it");
			}
		}
		class DevilListener implements ActionListener {
			public void actionPerformed(ActionEvent event){
				System.out.println("Do it");
			}
		}

	}


