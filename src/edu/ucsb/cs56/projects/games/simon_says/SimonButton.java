//Author: Yue Xin
package edu.ucsb.cs56.projects.games.simon_says;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/** A button that can be clicked on by the user.
 *  There will be four of these, colored green, red, yellow, and blue.
 *  Curretly, this JButton subclass automatically sets the preferred size.
 *  It also has a constructor which can take as a Color as a parameter to
 *  initialize it with a certain color.
 */
public class SimonButton extends JButton {

    /** Default no-arg constructor sets preferred size to a reasonable
     *  size.
     */
    public SimonButton() {
	this.setPreferredSize(new Dimension(100,100));
    }

    /** Constructor with Color parameter.
     * Calls no-arg constructor to set size and sets button color to
     * Color passed in as an argument.
     * @param Color color
     */
    public SimonButton(Color color) { 
	this();
	this.setBackground(color);
	this.setBorderPainted(false);
	this.setOpaque(true);
    }

    /** Removes actionListeners so-as to disable user-interactivity features temporarily
     *
     */
    public void removeActionListeners() {
	for (ActionListener listener : this.getActionListeners()) {
	    this.removeActionListener(listener);
	}
    }

    /** Empty main method. If code were added to it, could be used for testing
     * if desired.
     */
    public static void main(String[] args) {
    }
}
