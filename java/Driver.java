package greenlight;

import javax.swing.*; 

import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Driver {
	
	public static final String DOCTOR = "Doctor";
	public static final String USER   = "User";
	public static final String VENUE  = "Venue";
	
	private DatabaseController database;
	
	private JFrame frame;
	private JPanel panel;
	
	public Driver(){
		
		database  = new MySqlControler();
		
		frame = new JFrame("GreenLight"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,450);  
		frame.setLocationRelativeTo(null);
		
		panel = new JPanel();
		frame.add(panel);
		
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		Driver driver = new Driver();
	
		driver.createWelcomePanel();
	}
	
	private void createVenuePanel() {
		
		frame.remove(panel);
		panel = new JPanel();

		JButton home    = new JButton("");
		JButton getID    = new JButton("Become a Venue");
		JButton setEvent = new JButton("Create Event");
		JButton settings = new JButton("Settings");
		

		panel.setPreferredSize (new Dimension (240, 390));
		panel.setLayout (null);
		
		home.setBounds      (220, 10, 10, 10);
		getID.setBounds     (30,  15, 180, 50);
		setEvent.setBounds  (30, 115, 180, 50);
		settings.setBounds  (35, 215, 180, 50);
		
		panel.add(home);
		panel.add(getID);
		panel.add(setEvent);
		panel.add(settings);
		
		home.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				createWelcomePanel();
			}
		});
		
		getID.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				createGetVenueIDPanel();
			}
		});

		setEvent.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				createSetEventDoctorPanel();
			}
		});
		
		settings.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				createVenueSettingsPanel();
			}

		});
			
		
		frame.add(panel);
		panel.setVisible(true);
		frame.setVisible(true);		
	
	}

	private void createVenueSettingsPanel() {
		// TODO Auto-generated method stub
		
	}
	
	private void createGetVenueIDPanel() {
		// TODO Auto-generated method stub
		
	}
	

	private void createSetEventDoctorPanel() {
		// TODO Auto-generated method stub
		
	}
	
	private void createDoctorPanel() {
		
		frame.remove(panel);
		panel = new JPanel();

		JButton home           = new JButton("");
		JButton getID          = new JButton("Apply for ID");
		JButton setUserID      = new JButton("User Authentication");
		JButton checkCrt       = new JButton("Check Certification");
		JButton settings 	   = new JButton("Change Settings");

		panel.setPreferredSize (new Dimension (240, 390));
		panel.setLayout (null);
		
		home.setBounds      (220, 10, 10, 10);
		getID.setBounds     (30,  15, 180, 50);
		setUserID.setBounds (30, 115, 180, 50);
		checkCrt.setBounds  (30, 215, 180, 50);
		settings.setBounds  (35, 315, 180, 50);
		
		panel.add(home);
		panel.add(getID);
		panel.add(setUserID);
		panel.add(checkCrt);
		panel.add(settings);
		
		home.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				createWelcomePanel();
			}
		});
		
		getID.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				createGetDoctorIDPanel();
			}
		});

		setUserID.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				createSetUserIDDoctorPanel();
			}
		});
		
		checkCrt.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				createcheckCrtPanel();
			}
		});
		
		settings.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				createDoctorSettingsPanel();
			}
		});
			
		
		frame.add(panel);
		panel.setVisible(true);
		frame.setVisible(true);		
	}
	
	private void createDoctorSettingsPanel() {
		// TODO Auto-generated method stub
		
	}
	
	private void createcheckCrtPanel() {
		// TODO Auto-generated method stub
		
	}
	
	private void createSetUserIDDoctorPanel() {
		// TODO Auto-generated method stub
		
	}
	
	private void createGetDoctorIDPanel() {
			// TODO Auto-generated method stub
			
	} 
	private void createUserPanel() {

		frame.remove(panel);
		panel = new JPanel();
		
		JButton home      = new JButton("");
		JButton register  = new JButton("Register");
		JButton usrHealth = new JButton("Health Data");
		JButton events    = new JButton("Local Events");
		JButton settings  = new JButton("Settings");

		panel.setPreferredSize (new Dimension (240, 390));
		panel.setLayout (null);
		
		home.setBounds      (220, 10, 10, 10);
		register.setBounds  (30,  15, 180, 50);
		usrHealth.setBounds (30, 115, 180, 50);
		events.setBounds    (30, 215, 180, 50);
		settings.setBounds  (30, 315, 180, 50);
		
		panel.add(home);
		panel.add(register);
		panel.add(usrHealth);
		panel.add(events);
		panel.add(settings);
		
		home.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				createWelcomePanel();
			}
		});
		
		register.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				createRegistrationPanel();
			}
		});
		
		usrHealth.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				createGetUserHealthPanel();
			}
		});

		events.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				creategetUserEventsPanel();
			}
		});
		
		settings.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				createGetUserSettings();
			}
		});
		
		frame.add(panel);
		panel.setVisible(true);
		frame.setVisible(true);
	
	}
	

	private void createRegistrationPanel() {
		
		frame.remove(panel);
		panel = new JPanel();
		
		JButton    home      = new JButton("");
		JTextField firstname = new JTextField("First Name");
		JTextField lastname  = new JTextField("Last Name");
		JTextField phone     = new JTextField("Phone Number");
		JButton    register  = new JButton("Register");

		panel.setPreferredSize (new Dimension (240, 390));
		panel.setLayout (null);
		
		home.setBounds      (220, 10,  10, 10);
		firstname.setBounds (30,  15, 180, 25);
		lastname.setBounds  (30, 115, 180, 25);
		phone.setBounds     (30, 215, 180, 25);
		register.setBounds  (30, 315, 180, 40);
		
		panel.add(home);
		panel.add(register);
		panel.add(firstname);
		panel.add(lastname);
		panel.add(phone);
		
		home.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				createWelcomePanel();
			}
		});
		
		register.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				if(firstname.getText().equals("First Name") || 
						lastname.getText().equals("Last Name") || 
						phone.getText().equals("Phone Number") ||
						firstname.getText().equals("") || 
						lastname.getText().equals("") || 
						phone.getText().equals("")
						){
					JLabel error = new JLabel("Please fill out all feilds");
					error.setBounds(30, 250, 180, 40);
					frame.remove(panel);
					panel.add(error);
					panel.setVisible(true);
					frame.add(panel);
					frame.setVisible(true);
				}
				else{
					String   table   = "users";
					String[] columns = {"firstname", "lastname", "phone"};
					String[] values  = {"'" + firstname.getText() + "'", "'" + lastname.getText() + "'", "'" + phone.getText() + "'"};
					if(database.insert(table, columns, values))
						createSuccessPanel();
					else {
						System.err.println("Driver.createRegistrationTable: error on insert");
						createFailurePanel();
					}
					
				}
			}

			

			
		});
		
		frame.add(panel);
		panel.setVisible(true);
		frame.setVisible(true);
	
	}
	
	private void createFailurePanel() {
		frame.remove(panel);
		panel = new JPanel();
		
		JButton home    = new JButton("");
		JLabel  failure = new JLabel("Failure");

		panel.setPreferredSize (new Dimension (240, 390));
		panel.setLayout (null);
		
		home.setBounds      (220, 10, 10, 10);
		failure.setBounds  (30,  15, 180, 50);
		
		panel.add(home);
		panel.add(failure);
		
		home.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				createWelcomePanel();
			}
		});
		
		frame.add(panel);
		panel.setVisible(true);
		frame.setVisible(true);
		
	}
	
	private void createSuccessPanel() {
		
		frame.remove(panel);
		panel = new JPanel();
		
		JButton home    = new JButton("");
		JLabel  success = new JLabel("Success");

		panel.setPreferredSize (new Dimension (240, 390));
		panel.setLayout (null);
		
		home.setBounds      (220, 10, 10, 10);
		success.setBounds  (30,  15, 180, 50);
		
		panel.add(home);
		panel.add(success);
		
		home.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				createWelcomePanel();
			}
		});
		
		frame.add(panel);
		panel.setVisible(true);
		frame.setVisible(true);
		
	}
	
	private void createGetUserSettings() {
		//TODO
		
		}
	
	private void creategetUserEventsPanel() {
		// TODO Auto-generated method stub
		
	}
	
	private void createGetUserHealthPanel() {
		// TODO Auto-generated method stub
		
	}
	
	private void createWelcomePanel() {
		
		frame.remove(panel);
		panel = new JPanel();
		
		JButton home   = new JButton("");
		JButton user   = new JButton("User");
		JButton doctor = new JButton("Doctor");
		JButton venue  = new JButton("Venue");

		panel.setPreferredSize (new Dimension (240, 390));
		panel.setLayout (null);
		
		home.setBounds   (220, 10, 10, 10);
		user.setBounds   (30,  15, 180, 50);
		doctor.setBounds (30, 115, 180, 50);
		venue.setBounds  (30, 215, 180, 50);
		
		panel.add(home);
		panel.add(user);
		panel.add(doctor);
		panel.add(venue);
		
		home.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				createWelcomePanel();
			}
		});
		
		user.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				createUserPanel();
			}
		});
		
		doctor.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				createDoctorPanel();
			}
		});

		venue.addActionListener(new ActionListener() { 
			@Override public void actionPerformed(ActionEvent event) { 
				createVenuePanel();
			}
		});
		
		frame.add(panel);
		panel.setVisible(true);
		frame.setVisible(true);
	}
	
}
		