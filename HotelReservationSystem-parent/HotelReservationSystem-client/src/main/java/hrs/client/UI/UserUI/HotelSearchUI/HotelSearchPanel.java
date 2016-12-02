package hrs.client.UI.UserUI.HotelSearchUI;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import hrs.client.UI.UserUI.CommonComponents.CommonPanel;
import hrs.client.util.UIConstants;
import hrs.common.VO.UserVO;

public class HotelSearchPanel extends CommonPanel {
	private UserVO user;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private SearchPanel searchPanel;
	public HotelSearchPanel(UserVO user) {
		this.user = user;
		Init();
	}
	@Override
	public void Init() {
		contentPane = new JPanel();
		contentPane.setBounds(0, 30, this.getWidth(),this.getHeight()-30);
		contentPane.setBackground(UIConstants.jframe);
		contentPane.setLayout(null);
		
		add(contentPane);
		
		
		setSearchPanel();
		setButton();
		
		scrollPane = new JScrollPane(contentPane);

	}
	
	private void setSearchPanel() {
		searchPanel = new SearchPanel();
		searchPanel.setBounds(30,0,1020,283);
		contentPane.add(searchPanel);
	}

	private void setButton(){
		
	}
}
