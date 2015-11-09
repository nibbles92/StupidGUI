package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;
/**
 * Creates the Frame for the GUI project
 * @author droc6148
 *version 0.3 Nov 9 2015 added a reference to the GUIPanel and installed it as the content pane
 *added the setupFrame helper method.
 */
public class GUIFrame extends JFrame
{
	private GuiController baseController;
	private GUIPanel basePanel;
	
	public GUIFrame(GuiController baseContoller)
	{
		this.baseController = baseController;      //Assign parameter to data member.
		basePanel = new GUIPanel(baseController);  // Creates an instance of the GUIPanel with a reference to the
		setupFrame();
	}
	
	private void setupFrame()
	{	
		this.setContentPane(basePanel);		//Sets the panel to the GUIFrame, this is REQUIRED!!!!!
		this.setResizable(false);          //Usually a good idea but not required.
		this.setTitle("My window app");
		this.setSize(800,800);			  //sets the size.
		this.setVisible(true);           //Must be the last line of code in the setupFraem method.      
	}
}
