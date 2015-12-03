package financial;
/**
 * 财务人员，负责结算管理，财务支出，报表查询和账户管理
 * @author 孙婧
 * 2015.12.03
 * 
*/
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class accountAddition {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table;
	private JTextField textField_8;
	private JTable table_1;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTable table_2;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTable table_3;
	private JTextField textField_21;
	private JTable table_4;
	private JTextField textField_22;
	private JTable table_5;
	private JTextField textField_23;
	private JTable table_6;
	private JTable table_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					accountAddition window = new accountAddition();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public accountAddition() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 80, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		//结算管理的界面
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		tabbedPane.addTab("结算管理", null, desktopPane, null);
		
		JTextPane textPane_9 = new JTextPane();
		textPane_9.setText("查看日期（年/月/日）");
		textPane_9.setBounds(150, 43, 126, 21);
		desktopPane.add(textPane_9);
		
		textField_8 = new JTextField();
		textField_8.setBounds(286, 43, 105, 21);
		desktopPane.add(textField_8);
		textField_8.setColumns(10);
		
		JButton button_3 = new JButton("查询");
		button_3.setBounds(649, 93, 93, 23);
		desktopPane.add(button_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(150, 156, 700, 376);
		desktopPane.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"收款日期", "收款单位", "收款人", "收款方", "收款金额", "收款地点"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"请选择营业厅", "江苏省南京市仙林营业厅"}));
		comboBox.setBounds(534, 43, 158, 21);
		desktopPane.add(comboBox);
		
		//财务支出的界面
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(Color.WHITE);
		tabbedPane.addTab("财务支出", null, desktopPane_1, null);
		
		textField = new JTextField();
		textField.setText("  财务人员：");
		textField.setBounds(150, 0, 700, 21);
		desktopPane_1.add(textField);
		textField.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("付款日期(年/月/日）");
		textPane.setBounds(150, 31, 121, 21);
		desktopPane_1.add(textPane);
		
		textField_1 = new JTextField();
		textField_1.setBounds(281, 31, 139, 21);
		desktopPane_1.add(textField_1);
		textField_1.setColumns(10);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setText("付款金额");
		textPane_4.setBounds(472, 31, 54, 21);
		desktopPane_1.add(textPane_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(536, 31, 66, 21);
		desktopPane_1.add(textField_4);
		textField_4.setColumns(10);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setText("付款人");
		textPane_5.setBounds(653, 31, 42, 21);
		desktopPane_1.add(textPane_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(705, 31, 128, 21);
		desktopPane_1.add(textField_5);
		textField_5.setColumns(10);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setText("付款账号");
		textPane_6.setBounds(150, 62, 54, 21);
		desktopPane_1.add(textPane_6);
		
		JTextPane textPane_7 = new JTextPane();
		textPane_7.setText("条目");
		textPane_7.setBounds(482, 62, 31, 21);
		desktopPane_1.add(textPane_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(536, 62, 66, 21);
		desktopPane_1.add(textField_6);
		textField_6.setColumns(10);
		
		JTextPane textPane_8 = new JTextPane();
		textPane_8.setText("备注");
		textPane_8.setBounds(663, 62, 31, 21);
		desktopPane_1.add(textPane_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(705, 62, 128, 21);
		desktopPane_1.add(textField_7);
		textField_7.setColumns(10);
		
		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"中国农业银行南京仙林支行", "中国农业银行南京栖霞支行"}));
		comboBox_1.setBounds(214, 62, 206, 21);
		desktopPane_1.add(comboBox_1);
		
		//添加付款单的事件监听
		JButton button = new JButton("添加");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table.getRowCount();i++){
					if(table.getValueAt(i, 0)==null&&table.getValueAt(i, 1)==null&&table.getValueAt(i, 2)==null&&table.getValueAt(i, 3)==null&&table.getValueAt(i, 4)==null
							&&table.getValueAt(i, 5)==null&&table.getValueAt(i, 6)==null){
				           table.setValueAt(i+1, i, 0);
				           table.setValueAt(textField_1.getText(), i, 1);
				           table.setValueAt(textField_4.getText(), i, 2);
				           table.setValueAt(textField_5.getText(), i, 3);
				           table.setValueAt(comboBox_1.getSelectedItem(), i, 4);
				           table.setValueAt(textField_6.getText(), i, 5);
				           table.setValueAt(textField_7.getText(), i, 6);
				           break;
					}
				}
			}
		});
		button.setBounds(705, 116, 93, 23);
		desktopPane_1.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(150, 169, 700, 327);
		desktopPane_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"付款单ID", "付款日期", "付款金额", "付款人", "付款账户", "条目", "备注"
			}
		));
		scrollPane.setViewportView(table);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(151, 523, 21, 23);
		desktopPane_1.add(checkBox);
		
		JButton button_1 = new JButton("撤消");
		button_1.setBounds(178, 523, 93, 23);
		desktopPane_1.add(button_1);
		
		JButton button_2 = new JButton("提交");
		button_2.setBounds(705, 523, 93, 23);
		desktopPane_1.add(button_2);
		
		//报表查询的界面
		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBackground(Color.WHITE);
		tabbedPane.addTab("报表查询", null, desktopPane_2, null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(90, 76, 800, 459);
		desktopPane_2.add(tabbedPane_1);
		
		//成本收益表的查询界面
		JDesktopPane desktopPane_4 = new JDesktopPane();
		desktopPane_4.setBackground(Color.WHITE);
		tabbedPane_1.addTab("成本收益表", null, desktopPane_4, null);
		
		JTextPane textPane_24 = new JTextPane();
		textPane_24.setText("系统当前日期：");
		textPane_24.setBounds(138, 45, 90, 21);
		desktopPane_4.add(textPane_24);
		
		JButton button_17 = new JButton("查询");
		button_17.setBounds(500, 90, 93, 23);
		desktopPane_4.add(button_17);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(114, 186, 479, 43);
		desktopPane_4.add(scrollPane_7);
		
		table_7 = new JTable();
		table_7.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"总收入", "总支出", "总支出", "截止时间"
			}
		));
		scrollPane_7.setViewportView(table_7);
		
		JButton button_18 = new JButton("导出");
		button_18.setBounds(500, 357, 93, 23);
		desktopPane_4.add(button_18);
		
		//经营情况表的查询界面
		JDesktopPane desktopPane_5 = new JDesktopPane();
		desktopPane_5.setBackground(Color.WHITE);
		tabbedPane_1.addTab("经营情况表", null, desktopPane_5, null);
		
		JTextPane textPane_13 = new JTextPane();
		textPane_13.setText("开始日期（年/月/日）");
		textPane_13.setBounds(86, 32, 126, 21);
		desktopPane_5.add(textPane_13);
		
		JTextPane textPane_14 = new JTextPane();
		textPane_14.setText("结束日期（年/月/日）");
		textPane_14.setBounds(86, 66, 126, 21);
		desktopPane_5.add(textPane_14);
		
		textField_11 = new JTextField();
		textField_11.setBounds(222, 32, 126, 21);
		desktopPane_5.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(222, 66, 126, 21);
		desktopPane_5.add(textField_12);
		textField_12.setColumns(10);
		
		JButton button_4 = new JButton("查询");
		button_4.setBounds(569, 96, 93, 23);
		desktopPane_5.add(button_4);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(86, 141, 576, 250);
		desktopPane_5.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"收款单", "付款单"
			}
		));
		scrollPane_2.setViewportView(table_2);
		
		JButton button_5 = new JButton("导出");
		button_5.setBounds(676, 397, 93, 23);
		desktopPane_5.add(button_5);
		
		//账户管理的界面
		JDesktopPane desktopPane_3 = new JDesktopPane();
		desktopPane_3.setBackground(Color.WHITE);
		tabbedPane.addTab("账户管理", null, desktopPane_3, null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(91, 80, 753, 465);
		desktopPane_3.add(tabbedPane_2);
		
		//增加账户的界面
		JDesktopPane desktopPane_6 = new JDesktopPane();
		desktopPane_6.setBackground(Color.WHITE);
		tabbedPane_2.addTab("增加账户", null, desktopPane_6, null);
		
		JTextPane textPane_21 = new JTextPane();
		textPane_21.setText("账号");
		textPane_21.setBounds(80, 21, 32, 21);
		desktopPane_6.add(textPane_21);
		
		textField_18 = new JTextField();
		textField_18.setBounds(122, 21, 100, 21);
		desktopPane_6.add(textField_18);
		textField_18.setColumns(10);
		
		JTextPane textPane_22 = new JTextPane();
		textPane_22.setText("名称");
		textPane_22.setBounds(264, 21, 32, 21);
		desktopPane_6.add(textPane_22);
		
		textField_19 = new JTextField();
		textField_19.setBounds(306, 21, 66, 21);
		desktopPane_6.add(textField_19);
		textField_19.setColumns(10);
		
		JTextPane textPane_23 = new JTextPane();
		textPane_23.setText("金额");
		textPane_23.setBounds(416, 21, 32, 21);
		desktopPane_6.add(textPane_23);
		
		textField_20 = new JTextField();
		textField_20.setBounds(458, 21, 66, 21);
		desktopPane_6.add(textField_20);
		textField_20.setColumns(10);
		//添加账户信息的事件监听
		JButton button_6 = new JButton("添加");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0;i<table_3.getRowCount();i++){
				    if(table_3.getValueAt(i, 0)==null&&table_3.getValueAt(i, 1)==null&&table_3.getValueAt(i, 2)==null){
				        table_3.setValueAt(textField_18.getText(), i, 0);
				        table_3.setValueAt(textField_19.getText(), i, 1);
				        table_3.setValueAt(textField_20.getText(), i, 2);
				        break;
				    }
				}
			}
		});
		button_6.setBounds(547, 52, 93, 23);
		desktopPane_6.add(button_6);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(80, 97, 560, 274);
		desktopPane_6.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				 "账号", "名称", "金额"
			}
		));
		scrollPane_3.setViewportView(table_3);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setBounds(97, 392, 21, 23);
		desktopPane_6.add(checkBox_1);
		
		JButton button_7 = new JButton("撤消");
		button_7.setBounds(122, 392, 93, 23);
		desktopPane_6.add(button_7);
		
		JButton button_8 = new JButton("提交");
		button_8.setBounds(547, 392, 93, 23);
		desktopPane_6.add(button_8);
		
		JDesktopPane desktopPane_7 = new JDesktopPane();
		desktopPane_7.setBackground(Color.WHITE);
		tabbedPane_2.addTab("修改账户信息", null, desktopPane_7, null);
		
		textField_21 = new JTextField();
		textField_21.setText("输入账号或名称关键词搜索");
		textField_21.setBounds(164, 30, 299, 21);
		desktopPane_7.add(textField_21);
		textField_21.setColumns(10);
		
		JButton button_9 = new JButton("查询");
		button_9.setBounds(496, 29, 93, 23);
		desktopPane_7.add(button_9);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(110, 89, 534, 284);
		desktopPane_7.add(scrollPane_4);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				 "账号", "名称", "金额", "操作"
			}
		));
		scrollPane_4.setViewportView(table_4);
		
		JCheckBox checkBox_2 = new JCheckBox("");
		checkBox_2.setBounds(120, 396, 21, 23);
		desktopPane_7.add(checkBox_2);
		
		JButton button_10 = new JButton("撤消");
		button_10.setBounds(147, 396, 93, 23);
		desktopPane_7.add(button_10);
		
		JButton button_11 = new JButton("提交");
		button_11.setBounds(496, 396, 93, 23);
		desktopPane_7.add(button_11);
		
		JDesktopPane desktopPane_8 = new JDesktopPane();
		desktopPane_8.setBackground(Color.WHITE);
		tabbedPane_2.addTab("删除账户", null, desktopPane_8, null);
		
		textField_22 = new JTextField();
		textField_22.setText("输入账号或名称关键词搜索");
		textField_22.setBounds(161, 37, 286, 21);
		desktopPane_8.add(textField_22);
		textField_22.setColumns(10);
		
		JButton button_12 = new JButton("查询");
		button_12.setBounds(493, 36, 93, 23);
		desktopPane_8.add(button_12);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(93, 91, 559, 280);
		desktopPane_8.add(scrollPane_5);
		
		table_5 = new JTable();
		table_5.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				 "账号", "名称", "金额"
			}
		));
		scrollPane_5.setViewportView(table_5);
		
		JCheckBox checkBox_3 = new JCheckBox("");
		checkBox_3.setBounds(109, 393, 21, 23);
		desktopPane_8.add(checkBox_3);
		
		JButton button_13 = new JButton("撤消");
		button_13.setBounds(136, 393, 93, 23);
		desktopPane_8.add(button_13);
		
		JButton button_14 = new JButton("提交");
		button_14.setBounds(493, 393, 93, 23);
		desktopPane_8.add(button_14);
		
		JDesktopPane desktopPane_9 = new JDesktopPane();
		desktopPane_9.setBackground(Color.WHITE);
		tabbedPane_2.addTab("查找账户", null, desktopPane_9, null);
		
		textField_23 = new JTextField();
		textField_23.setText("输入账号或名称关键词搜索");
		textField_23.setBounds(140, 37, 299, 21);
		desktopPane_9.add(textField_23);
		textField_23.setColumns(10);
		
		JButton button_15 = new JButton("查询");
		button_15.setBounds(489, 36, 93, 23);
		desktopPane_9.add(button_15);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(91, 88, 559, 289);
		desktopPane_9.add(scrollPane_6);
		
		table_6 = new JTable();
		table_6.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"账号", "名称", "金额"
			}
		));
		scrollPane_6.setViewportView(table_6);
		
		JButton button_16 = new JButton("确认");
		button_16.setBounds(489, 387, 93, 23);
		desktopPane_9.add(button_16);
		
		textField_17 = new JTextField();
		textField_17.setText("  财务人员：");
		textField_17.setBounds(91, 0, 753, 21);
		desktopPane_3.add(textField_17);
		textField_17.setColumns(10);
	}
}
