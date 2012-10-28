package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.arkumbra.game.Multiplayer.ConnectionManager;

@SuppressWarnings("serial")
public class ConnectionFrame extends JFrame {

	private JPanel contentPane;
	private JButton btnConnect 		= new JButton("Connect");
	private JButton btnOpenPort		= new JButton("Open port");
	private ConnectionManager cMan 	= null;
	private JTextField connIP		= new JTextField(10);
	private JTextField connPort		= new JTextField(10);
	private JTextField ownPort		= new JTextField(5);
	private ConnectionManager cm;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConnectionFrame frame = new ConnectionFrame();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setTitle("Game");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * Create the frame.
	 */
	public ConnectionFrame() {
		
		JLabel lblIP 	= new JLabel("IP address");
		JLabel lblPort	= new JLabel("Port #");
		JLabel lblMyPort= new JLabel("Your port #");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));

		// =====================================================================
		JPanel northPanel = new JPanel();
		northPanel.setBorder(BorderFactory.createTitledBorder("Connect to:"));
		
		northPanel.add(lblIP, BorderLayout.WEST);
		northPanel.add(connIP, BorderLayout.WEST);
		northPanel.add(lblPort, BorderLayout.EAST);
		northPanel.add(connPort, BorderLayout.EAST);
		contentPane.add(northPanel, BorderLayout.NORTH);
		
		// =====================================================================
		
		/*JPanel midPanel = new JPanel();
		midPanel.setBorder(BorderFactory.
									createTitledBorder("Personal settings"));
		
		midPanel.add(lblMyPort, BorderLayout.WEST);
		midPanel.add(ownPort, BorderLayout.WEST);
		contentPane.add(midPanel, BorderLayout.CENTER);
		
		*/// =====================================================================
		
		JPanel btmPanel = new JPanel();
		btmPanel.setBorder(BorderFactory.createTitledBorder("Connect"));
		
		//btmPanel.add(btnOpenPort, BorderLayout.WEST);
		btmPanel.add(btnConnect, BorderLayout.EAST);
		
		contentPane.add(btmPanel, BorderLayout.SOUTH);

		setContentPane(contentPane);
		// Sends on a request to connect
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				verifyConnect();
			}
		});
		
		/*btnOpenPort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				
			}
		});*/
		try {
			cm = new ConnectionManager();
		} catch (IOException e) {
			JPopupMenu error = new JPopupMenu("An error has occured. Closing.");
			error.show(this, 400, 400);
			System.exit(1);
		}
		
	}
	
	
	/**
	 * Checks the text fields for connection details and sends it on to the 
	 * connection manager.
	 */
	private void verifyConnect() {
		cm.connectTo(connIP.getText());
	}

}

		


