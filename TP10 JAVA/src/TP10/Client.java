package TP10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Client extends JFrame implements ActionListener{
	JFrame frame = new JFrame("Ajout d'un Client ");
	JPanel pane= new JPanel(new GridBagLayout());
	//label
	JLabel titre=new JLabel("Ajouter un nouveau Client ");
	JLabel Nom= new JLabel("nom");
	JLabel Adresse= new JLabel("Adresse");
	JLabel CodePos= new JLabel("Code Postal ");
	JLabel Ville= new JLabel("Ville");
	JLabel Tel= new JLabel("Telephone");
	JLabel Login= new JLabel("Login");
	JLabel Pwd= new JLabel("PassWord");
	
	JTextField nom = new JTextField(20);
	JTextField adresse = new JTextField(20);
	JTextField codepos= new JTextField(5);
	JTextField ville = new JTextField(20);
	JTextField tel = new JTextField(10);
	JTextField login = new JTextField(20);
	JPasswordField pwd=new JPasswordField(20);
	JButton annuler = new JButton("ANNULER"); 
	JButton valider = new JButton("valider");
	JButton chercher= new JButton(("CHERCHER"));
	public Client() {
		super("POSITION");
		frame.setSize(500,300);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.cyan);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		GridBagConstraints gc= new GridBagConstraints();
		gc.fill=GridBagConstraints.HORIZONTAL;
		gc.gridx=0;
		gc.gridy=0;
		pane.add(titre,gc);
		gc.gridx=0;
		gc.gridy=1;
		pane.add(Nom,gc);
		gc.gridx=1;
		gc.gridy=1;
		pane.add(nom,gc);
		gc.gridx=0;
		gc.gridy=3;
		pane.add(Adresse,gc);
		gc.gridx=1;
		gc.gridy=3;
		pane.add(adresse,gc);
		gc.gridx=0;
		gc.gridy=4;
		pane.add(CodePos,gc);
		gc.gridx=1;
		gc.gridy=4;
		pane.add(codepos,gc);
		gc.gridx=0;
		gc.gridy=5;
		pane.add(Ville,gc);
		gc.gridx=1;
		gc.gridy=5;
		pane.add(ville,gc);
		gc.gridx=0;
		gc.gridy=6;
		pane.add(Tel,gc);
		gc.gridx=1;
		gc.gridy=6;
		pane.add(tel,gc);
		gc.gridx=0;
		gc.gridy=7;
		pane.add(Login,gc);
		gc.gridx=1;
		gc.gridy=7;
		pane.add(login,gc);
		gc.gridx=0;
		gc.gridy=8;
		pane.add(Pwd,gc);
		gc.gridx=1;
		gc.gridy=8;
		pane.add(pwd,gc);
		gc.gridx=0;
		gc.gridy=9;
		pane.add(valider,gc);
		gc.gridx=1;
		gc.gridy=9;
		pane.add(annuler,gc);
		gc.gridx=2;
		gc.gridy=9;
		pane.add(chercher,gc);
		frame.add(pane);	
		valider.addActionListener(this);
		chercher.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e) {
			String url = "jdbc:mysql://localhost:3306/client";
			if (e.getActionCommand()=="valider") {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					try {
						Connection cnx= DriverManager.getConnection(url,"root","");
						Statement stat =cnx.createStatement();
						String sql1 = "insert into t_client values('"+nom.getText()+"','"
									+adresse.getText()+"',"+codepos.getText()+",'"+
									ville.getText()+"',"+tel.getText()+")";
						stat.executeUpdate(sql1);
						String sql2 = "insert into t_user values('"+login.getText()+"','"
								+pwd.getText()+"')";
						stat.executeUpdate(sql2);
						stat.close();
						cnx.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				}
			}
	}
	public void chercherByName() throws ClassNotFoundException {
		String nomm= nom.getText();
		String urll = "jdbc:mysql://localhost:3306/client";
		Class.forName("com.mysql.jdbc.Driver");
		try {
			Connection connect = DriverManager.getConnection(urll,"root","");
			String req="select * from t_client where nom='"+nomm+"'";
			Statement stt= connect.createStatement();
			java.sql.PreparedStatement ps = connect.prepareStatement(req);
			ResultSet result = ps.executeQuery();
			if(result.next()){
                adresse.setText(result.getString("adresse"));
                codepos.setText(result.getString("code_postal"));
                ville.setText(result.getString("ville"));
                tel.setText(result.getString("telephone"));
            }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private ActionListener searchAL= new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            try {
					chercherByName();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        }
	 } ;
}

