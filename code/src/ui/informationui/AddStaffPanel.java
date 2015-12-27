package ui.informationui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import bl.staff.Impl.StaffManageController;
import bl.staff.Impl.UserManageController;
import vo.StaffVO;

public class AddStaffPanel extends JPanel{
	StartFrame belongsTO;
	JLabel id;
	JLabel pass;
	JLabel name;
	JLabel sex;
	JLabel age;
	JLabel pos;
	JLabel department;
	JLabel city;
	JComboBox usercity;
	JTextField userid;
	JTextField userpass;
	JTextField username;
	JTextField userage;
	JComboBox usersex; 
    JComboBox userpos;  
    JComboBox userdepartment;
    JButton okButton;
    JTable table;
	public AddStaffPanel(StartFrame belongsTO){
		this.belongsTO=belongsTO;
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
		
		name=new JLabel();
		name.setFont(new Font("微软雅黑",Font.BOLD,16));
		name.setBounds(50,50,40,30);
		name.setText("姓名");
		
		username=new JTextField();
		username.setFont(new Font("微软雅黑",Font.BOLD,16));
		username.setBounds(100,50,80,30);
		
		sex=new JLabel();
		sex.setFont(new Font("微软雅黑",Font.BOLD,16));
		sex.setBounds(240,50,40,30);
		sex.setText("性别");
		
		usersex=new JComboBox();
		usersex.setFont(new Font("微软雅黑",Font.BOLD,16));
		usersex.addItem("男");
		usersex.addItem("女");
		usersex.setBounds(290,50,60,30);
		
		age=new JLabel();
		age.setFont(new Font("微软雅黑",Font.BOLD,16));
		age.setBounds(420,50,40,30);
		age.setText("年龄");
		
		userage=new JTextField();
		userage.setFont(new Font("微软雅黑",Font.BOLD,16));
		userage.setBounds(470,50,60,30);
		age.addFocusListener(new AgeListener());
		
		pos=new JLabel();
		pos.setFont(new Font("微软雅黑",Font.BOLD,16));
		pos.setBounds(590,50,40,30);
		pos.setText("职位");
		
		userpos=new JComboBox();
		userpos.setFont(new Font("微软雅黑",Font.BOLD,16));
		userpos.addItem("快递员");
		userpos.addItem("营业厅业务员");
		userpos.addItem("中转中心业务员");
		userpos.addItem("中转中心仓库管理人员");
		userpos.addItem("总经理");
		userpos.addItem("财务人员");
		userpos.addItem("管理员");
		userpos.setBounds(650,50,180,30);
		
		city=new JLabel();
		city.setFont(new Font("微软雅黑",Font.BOLD,16));
		city.setBounds(50,110,40,30);
		city.setText("城市");
		
		usercity=new JComboBox();
		usercity.setFont(new Font("微软雅黑",Font.BOLD,16));
		usercity.addItem("南京");
		usercity.addItem("北京");
		usercity.addItem("上海");
		usercity.addItem("广州");
		usercity.setBounds(100,110,80,30);
		
		department=new JLabel();
		department.setFont(new Font("微软雅黑",Font.BOLD,16));
		department.setBounds(240,110,40,30);
		department.setText("部门");
		
		userdepartment=new JComboBox();
		userdepartment.setFont(new Font("微软雅黑",Font.BOLD,16));
		userdepartment.addItem("寿康宫");
		userdepartment.addItem("霍格沃兹");
		userdepartment.addItem("对角巷");
		userdepartment.setBounds(290,110,280,30);
		
		id=new JLabel();
		id.setFont(new Font("微软雅黑",Font.BOLD,16));
		id.setBounds(50,170,60,30);
		id.setText("用户名");
		
		userid=new JTextField();
		userid.setFont(new Font("微软雅黑",Font.BOLD,16));
		userid.setBounds(100,170,200,30);
		
		pass=new JLabel();
		pass.setFont(new Font("微软雅黑",Font.BOLD,16));
		pass.setBounds(420,170,40,30);
		pass.setText("密码");
		
		userpass=new JTextField();
		userpass.setFont(new Font("微软雅黑",Font.BOLD,16));
		userpass.setBounds(470,170,200,30);

		
		okButton=new JButton();
		okButton.setBounds(520, 210, 40, 40);
		okButton.addActionListener(new PushListener());
		
		StaffManageController staff=new StaffManageController();
		ArrayList<StaffVO> staffs=staff.getAllStaff("");
		int size=staffs.size();
		/*ArrayList<StaffVO> staffs=new ArrayList<StaffVO>();
		StaffVO A=new StaffVO();
		A.ID="laoshu";
		A.name="仓鼠";
		A.age=18;
		A.passwords="888";
		A.pos="xiaolongbao";
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);*/
		buildTable(staffs);
		
		
		
		this.add(age);
		this.add(userage);
		this.add(name);
		this.add(username);
		this.add(sex);
		this.add(usersex);
		this.add(pos);
		this.add(userpos);
		this.add(department);
		this.add(userdepartment);
		this.add(id);
		this.add(userid);
		this.add(pass);
		this.add(userpass);
		this.add(city);
		this.add(usercity);
		this.add(okButton);
	}
	
	public void buildTable(ArrayList<StaffVO> staffs){
		int size=staffs.size();
		
		Object[][] tableData=new Object[size][5];
		for(int i=0;i<size;i++){
			StaffVO mess=staffs.get(i);
			tableData[i]=new Object[]{mess.ID,mess.name,mess.age,mess.passwords,mess.pos," "};
		}
		Object[] columnTitle = {"用户名" ,"姓名","年龄","密码","职位","权限"};  
		table=new JTable(tableData,columnTitle);
		int height=table.getRowHeight()*(size+1)+9;
		int ValidMaxHeight=250;
		if(height>=400)
			height=ValidMaxHeight;
		//table.setBounds(200, 50, 600, height);
		table.setOpaque(false); 
		table.setRowSelectionAllowed(true);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(140, 270, 658, height);
		scrollPane.setOpaque(false);
		this.add(scrollPane);
		scrollPane.setViewportView(table);
	}
	 class PushListener implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			String id=userid.getText();
			String pass=userpass.getText();
			String name=username.getText();
			String age=userage.getText();
			String sex=(String)usersex.getSelectedItem();
			String pos=(String)userpos.getSelectedItem();
			String department=(String)userdepartment.getSelectedItem();
			
			if(id!=null&&pass!=null&&name!=null&&age!=null&&sex!=null&&pos!=null&&department!=null){
				boolean isBoy=true;
				if(sex.equals("女"))
					isBoy=false;
				
				StaffVO staff=new StaffVO(id,name,age,pos,department,isBoy,pass);
				StaffVO[] staffs=new StaffVO[1];
				staffs[0]=staff;
				StaffManageController user=new StaffManageController();			
				boolean result=true;
				result=result&user.addNewStaff(staffs);
				if(result){
					TimePanel.change=true;
					TimePanel.text="您已成功增加该员工！";
				}else{
					TimePanel.change=true;
					TimePanel.text="添加员工失败，可能存在网络故障！";
				}
			}else{
				TimePanel.change=true;
				TimePanel.text="请检查您的输入！";
			}
		}
		 
	 }
	 class AgeListener implements FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		 
	 }
}
