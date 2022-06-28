package app;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class App extends JFrame {
	public App() {
		super("My Drawing Application");

		StatusBar status = new StatusBar();
		DrawingPane drawing = new DrawingPane(status);
		ToolBar toolbar = new ToolBar(drawing);

		getContentPane().add(toolbar, BorderLayout.NORTH);
		getContentPane().add(drawing, BorderLayout.CENTER);
		getContentPane().add(status, BorderLayout.SOUTH);

		setSize(1000, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

		drawing.requestFocusInWindow();
	}

	public static void main(String[] args) {
		new App();
	}
}
