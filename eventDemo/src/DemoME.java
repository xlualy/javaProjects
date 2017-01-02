import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DemoME implements MouseMotionListener,KeyListener{

	/**
	 * @mouse event handling 
	 *can handle only thoes component that implement container
	 */
	JFrame fr;
	JLabel cordinates;
	public DemoME(){
		init();
		
	}
	
	public void init(){
	fr= new JFrame();	
	fr.addMouseMotionListener(this);
	fr.addKeyListener(this);
	cordinates= new JLabel();
	Container c=fr.getContentPane();
	c.setLayout(new FlowLayout());
	fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fr.add(cordinates);
	fr.setSize(200,200);
	fr.setVisible(true);
	}
	
	public void mouseDragged(MouseEvent e) {
		int x=e.getX();
		int y=e.getY();
		
		cordinates.setText("Mouse Dragged[ "+x+" "+y+" ]");
		
	}

	public void mouseMoved(MouseEvent e) {
		int x=e.getX();
		int y=e.getY();
		
		cordinates.setText("Mouse Moved[ "+x+" "+y+" ]");
		
	}
	public void keyTyped(KeyEvent e) {
		JOptionPane.showMessageDialog(null,"keyPressed");
		
	}

	public void keyPressed(KeyEvent e) {
		JOptionPane.showMessageDialog(null,"key typwed");
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String args[]){
		DemoME fr= new DemoME();
	}

	
}
