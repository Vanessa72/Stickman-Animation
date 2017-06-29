import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class StickMan extends JPanel {
	public static void main(String[] args) {
		new StickMan().run();
	}

	int i;
	int o;
	int p = -1;
	int u;

	private void run() {
		JFrame frame = new JFrame();
		frame.setSize(500, 300);
		frame.setTitle("Stickman zeichnen");
		frame.getContentPane().add(this);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (i = 0; i < 13; i++) {
			repaint();
			try {
				Thread.sleep(100);

			} catch (Exception e) {
				System.out.print("\nError");
			}

		}

		for (o = 0; o < 35; o++) {
			repaint();
			try {
				Thread.sleep(100);

			} catch (Exception e) {
				System.out.print("\nError");

			}
		}

		for (p = 0; p < 35; p++) {
			repaint();
			try {
				Thread.sleep(100);

			} catch (Exception e) {
				System.out.print("\nError");

			}
		}
		
		
		
	}

	public void paintComponent(Graphics g) {
		int[] x = new int[3];
		int[] y = new int[3];
		int n = 3;
		x[0] = 190;
		y[0] = 110;
		x[1] = 245;
		y[1] = 60;
		x[2] = 300;
		y[2] = 110;

		super.paintComponent(g);
		if(p<0) {
		g.setColor(Color.white);
		g.fillRect(90, 20, 300, 200);

		g.setColor(Color.white);
		g.fillOval(180, 200, 30, 30);

		g.setColor(new Color(255, 255, 0));
		g.fillOval(340 + (-5) * o, 30 + 5 * o, 30, 30);

		g.setColor(new Color(200, 140, 0));
		g.fillRect(200, 100, 90, 100);

		g.setColor(new Color(255, 200, 150));
		g.fillPolygon(x, y, n);

		g.setColor(Color.black);
		g.fillRect(230, 115, 40, 20);

		g.setColor(new Color(200, 140, 0));
		g.drawLine(250, 115, 250, 135);

		g.setColor(new Color(200, 140, 0));
		g.drawLine(230, 125, 270, 125);

		g.setColor(Color.black);
		g.drawLine(120 + 9 * i, 170, 120 + 9 * i, 190);

		g.setColor(Color.black);
		g.drawLine(110 + 9 * i, 175, 130 + 9 * i, 175);

		g.setColor(Color.black);
		g.drawLine(120 + 9 * i, 190, 110 + 9 * i, 200);

		g.setColor(Color.black);
		g.drawLine(120 + 9 * i, 190, 130 + 9 * i, 200);

		g.setColor(Color.black);
		g.fillOval(9 * i + 110, 150, 20, 20);

		g.setColor(new Color(220, 120, 0));
		g.fillRect(220, 150, 30, 50);

		g.setColor(Color.white);
		g.fillOval(225, 175, 5, 5);

		g.setColor(new Color(100, 180, 0));
		g.fillRect(90, 200, 300, 40);
		}

		if ((p>=0)) {
			g.setColor(Color.blue.darker());
			g.fillRect(90, 20, 300, 200);
			
			g.setColor(new Color(255, 255, 0));
			g.fillOval(340 + (-5) * o, 30 + 5 * o, 30, 30);

			g.setColor(Color.white);
			g.fillOval(180+5*p, 200+(-5)*p, 30, 30);
			
			g.setColor(new Color(200, 140, 0));
			g.fillRect(200, 100, 90, 100);

			g.setColor(new Color(255, 200, 150));
			g.fillPolygon(x, y, n);

			g.setColor(Color.white);
			g.fillRect(230, 115, 40, 20);

			g.setColor(new Color(200, 140, 0));
			g.drawLine(250, 115, 250, 135);

			g.setColor(new Color(200, 140, 0));
			g.drawLine(230, 125, 270, 125);

			g.setColor(new Color(220, 120, 0));
			g.fillRect(220, 150, 30, 50);

			g.setColor(Color.white);
			g.fillOval(225, 175, 5, 5);

			g.setColor(new Color(100, 180, 0));
			g.fillRect(90, 200, 300, 40);
			

		}
		if(p>=34) {for (int h=1; h<50;h++){
			g.setColor(Color.white);
			g.fillOval(93+(int) Math.round(Math.random()*300), 25+(int)Math.round(Math.random()*300), 5, 5);
			
			g.setColor(new Color(200, 140, 0));
			g.fillRect(200, 100, 90, 100);

			g.setColor(new Color(255, 200, 150));
			g.fillPolygon(x, y, n);

			g.setColor(Color.white);
			g.fillRect(230, 115, 40, 20);

			g.setColor(new Color(200, 140, 0));
			g.drawLine(250, 115, 250, 135);

			g.setColor(new Color(200, 140, 0));
			g.drawLine(230, 125, 270, 125);

			g.setColor(new Color(220, 120, 0));
			g.fillRect(220, 150, 30, 50);

			g.setColor(Color.white);
			g.fillOval(225, 175, 5, 5);

			g.setColor(new Color(100, 180, 0));
			g.fillRect(90, 200, 300, 40);
		
		}
		}
	
	}
}
