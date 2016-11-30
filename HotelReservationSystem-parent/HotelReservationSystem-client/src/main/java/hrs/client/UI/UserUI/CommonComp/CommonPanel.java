package hrs.client.UI.UserUI.CommonComp;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;

import hrs.common.util.constants;

public abstract class CommonPanel extends JPanel {
	public abstract void Init();
	Font font = constants.jlabelChinese;
	public CommonPanel(){
		setLayout(null);
		setBackground(new Color(211, 237, 249));
		setSize(1103, 768);
		setFont(font);
	}
}
