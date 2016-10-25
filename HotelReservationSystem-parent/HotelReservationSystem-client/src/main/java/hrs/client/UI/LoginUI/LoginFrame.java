package hrs.client.UI.LoginUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import hrs.client.util.ControllerFactory;
import hrs.common.Controller.LoginController.ILoginController;
import hrs.common.VO.UserVO;

public class LoginFrame extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel jlUsername;
	private JLabel jlPassword;
	private JButton jbConfirm;
	private ILoginController controller;
	private JTextField jtfUsername;
	private JPasswordField jtfPassword;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		controller = ControllerFactory.getLoginController();
		setTitle("登录界面");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(602, 434);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		jlUsername = new JLabel("用户名：");
		
		jtfUsername = new JTextField();
		jtfUsername.setColumns(10);
		
		jlPassword = new JLabel("密码：");
		
		jbConfirm = new JButton("确认");
		jbConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = jtfUsername.getText().trim();
				String password = String.valueOf(jtfPassword.getPassword());
				UserVO user = controller.loginUser(username, password);
				if(user != null){
					JOptionPane.showMessageDialog(null, "登录成功!");
				}else{
					JOptionPane.showMessageDialog(null, "登录失败!");
				}
			}
		});
		
		jtfPassword = new JPasswordField();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(115)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(jlUsername)
								.addComponent(jlPassword))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(jtfPassword)
								.addComponent(jtfUsername, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(221)
							.addComponent(jbConfirm, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(299, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(114)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlUsername)
						.addComponent(jtfUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlPassword)
						.addComponent(jtfPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addComponent(jbConfirm, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(188, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
}
