package maya.vocnote.controller;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import maya.vocnote.adapter.VAdapter;
import maya.vocnote.adapter.VAdapterCallback;
import maya.vocnote.adapter.VAdapterInfo;

//import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

//import dic.DicQuery;
//import note.Note;
//import util.Const;

public class VMainWindow extends JFrame implements VAdapterCallback{
	
	private JTextField inputField;
	private JTextArea wordTextArea;
	private JTextArea resulTextArea;
	private JButton search;
	private JLabel info;
	private JLabel infoTime;
	
	private VAdapter vAdapter;
	
	public VMainWindow(){
		super();
		
		vAdapter = new VAdapter(this);
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ImageIcon imageIcon = new ImageIcon(getClass().getResource("/image/icon.png"));  
        this.setIconImage(imageIcon.getImage());
		this.setTitle("Mayavac");
				
		JPanel mainPanel = new JPanel();
		this.setContentPane(mainPanel);
		
		this.setSize(900, 640);
		this.setResizable(false);
		
		BoxLayout mainPanelLayout = new BoxLayout(mainPanel, BoxLayout.Y_AXIS);
		mainPanel.setLayout(mainPanelLayout);
		
		Box searchBar = Box.createHorizontalBox();
		mainPanel.add(searchBar);
		
		inputField = new JTextField();
		search = new JButton("search");
		wordTextArea = new JTextArea();
		resulTextArea = new JTextArea();
		info = new JLabel();
		infoTime = new JLabel();
		
		inputField.setPreferredSize(new Dimension(800,30));
		inputField.setMaximumSize(new Dimension(800,30));
		inputField.setMinimumSize(new Dimension(800,30));
		Font font0 = new Font("Default",Font.PLAIN,16);
		inputField.setFont(font0);
		inputField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					inputField.selectAll();
				}
			}
		});
		inputField.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				inputField.selectAll();
			}
		});
		searchBar.add(inputField);		
		
		search.setPreferredSize(new Dimension(93,32));
		search.setMaximumSize(new Dimension(93,32));
		search.setMinimumSize(new Dimension(93,32));
		Font font2 = new Font("Default",Font.PLAIN,15);
		search.setFont(font2);
//		search.setText("search");
		search.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			}
		});
		searchBar.add(search);
		
		wordTextArea.setPreferredSize(new Dimension(900,90));
		wordTextArea.setMaximumSize(new Dimension(900,90));
		wordTextArea.setMinimumSize(new Dimension(900,90));
		wordTextArea.setEditable(false);
		Font font1 = new Font("Default",Font.BOLD,24);
		wordTextArea.setFont(font1);
		mainPanel.add(wordTextArea);
		
		resulTextArea.setEditable(false);
		Font font = new Font("Default",Font.PLAIN,16);
		resulTextArea.setFont(font);
		resulTextArea.setLineWrap(true);
		mainPanel.add(resulTextArea);
		
		Box infoBar = Box.createHorizontalBox();
		infoBar.add(info);
		infoBar.add(infoTime);
		mainPanel.add(infoBar);
		
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void callback(VAdapterInfo info) {
		// TODO Auto-generated method stub
		
	}
	
}
