package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Model.ModelQLSV;
import Model.ModelThongTinSinhVien;
import Model.ModelTinhThiSinh;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.util.ArrayList;
import java.util.Calendar;

import java.util.Locale;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controller.ControllerQLSV;

import javax.swing.JComboBox;

public class ViewQLSV extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textField_StudentID_find;
	public JTable table;
	public JTextField textField_ID;
	public JTextField textField_Name;
	public JTextField textField_subject1;
	public JTextField textField_subject2;
	public JTextField textField_subject3;
	public ModelTinhThiSinh modeltinhthisinh;
	public JComboBox<String> comboBox_gioiTinh;
	public JComboBox<String> comboBox_QueQuan;
	public JComboBox<String> comboBox_QueQuan_1;
	public ModelQLSV modelqlsv;
	public JComboBox<String> comboBox_year;
	public JComboBox<String> comboBox_day;
	public JComboBox<String> comboBox_month;
	public static ViewQLSV frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			

			public void run() {
				try {
					frame = new ViewQLSV();
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
	public ViewQLSV() {
		ControllerQLSV controllerqlsv = new ControllerQLSV(this);
		modelqlsv = new ModelQLSV();
		modeltinhthisinh = new ModelTinhThiSinh();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 843, 581);
		setTitle("Student Manage Student Program");
		setIconImage(Toolkit.getDefaultToolkit().createImage(ViewQLSV.class.getResource("10207-man-student-light-skin-tone-icon.png")));
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu_file = new JMenu("File\r\n");
		mnNewMenu_file.setForeground(Color.BLACK);
		mnNewMenu_file.setFont(new Font("Dialog", Font.BOLD, 14));
		menuBar.add(mnNewMenu_file);
		
		JMenuItem mntmNewMenuItem_open = new JMenuItem("Open\r\n");
		mntmNewMenuItem_open.addActionListener(controllerqlsv);
		mntmNewMenuItem_open.setFont(new Font("Segoe UI", Font.BOLD, 11));
		mnNewMenu_file.add(mntmNewMenuItem_open);
		
		JMenuItem mntmNewMenuItem_close = new JMenuItem("Save");
		mntmNewMenuItem_close.addActionListener(controllerqlsv);
		mntmNewMenuItem_close.setFont(new Font("Segoe UI", Font.BOLD, 11));
		mnNewMenu_file.add(mntmNewMenuItem_close);
		
		JSeparator separator = new JSeparator();
		mnNewMenu_file.add(separator);
		
		JMenuItem mntmNewMenuItem_exit = new JMenuItem("Exit");
		mntmNewMenuItem_exit.setFont(new Font("Segoe UI", Font.BOLD, 11));
		mnNewMenu_file.add(mntmNewMenuItem_exit);
		
		JMenu mnNewMenu_system = new JMenu("System");
		mnNewMenu_system.setForeground(Color.BLACK);
		mnNewMenu_system.setFont(new Font("Dialog", Font.BOLD, 14));
		menuBar.add(mnNewMenu_system);
		
		JMenu mnNewMenu_Background = new JMenu("Background");
		mnNewMenu_Background.setFont(new Font("Segoe UI", Font.BOLD, 11));
		mnNewMenu_system.add(mnNewMenu_Background);
		
		JMenuItem mntmNewMenuItem_light = new JMenuItem("Light");
		mntmNewMenuItem_light.addActionListener(controllerqlsv);
		mntmNewMenuItem_light.setFont(new Font("Segoe UI", Font.BOLD, 11));
		mnNewMenu_Background.add(mntmNewMenuItem_light);
		
		JMenuItem mntmNewMenuItem_dark = new JMenuItem("Dark");
		mntmNewMenuItem_dark.addActionListener(controllerqlsv);
		mntmNewMenuItem_dark.setFont(new Font("Segoe UI", Font.BOLD, 11));
		mnNewMenu_Background.add(mntmNewMenuItem_dark);
		
		JMenu mnNewMenu_language = new JMenu("Language");
		mnNewMenu_language.setFont(new Font("Segoe UI", Font.BOLD, 11));
		mnNewMenu_system.add(mnNewMenu_language);
		
		JMenuItem mntmNewMenuItem_vietnam = new JMenuItem("Vietnamese");
		mntmNewMenuItem_vietnam.addActionListener(controllerqlsv);
		mntmNewMenuItem_vietnam.setFont(new Font("Segoe UI", Font.BOLD, 11));
		mnNewMenu_language.add(mntmNewMenuItem_vietnam);
		
		JMenuItem mntmNewMenuItem_anh = new JMenuItem("English");
		mntmNewMenuItem_anh.addActionListener(controllerqlsv);
		mntmNewMenuItem_anh.setFont(new Font("Segoe UI", Font.BOLD, 11));
		mnNewMenu_language.add(mntmNewMenuItem_anh);
		
		JMenu mnNewMenu_about = new JMenu("About");
		mnNewMenu_about.setForeground(Color.BLACK);
		mnNewMenu_about.setFont(new Font("Dialog", Font.BOLD, 14));
		menuBar.add(mnNewMenu_about);
		
		JMenuItem mntmNewMenuItem_about_me = new JMenuItem("About me\r\n");
		mntmNewMenuItem_about_me.setForeground(Color.BLACK);
		mntmNewMenuItem_about_me.setFont(new Font("Dialog", Font.BOLD, 11));
		mnNewMenu_about.add(mntmNewMenuItem_about_me);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_studentFind = new JLabel("Student Find");
		lblNewLabel_studentFind.setBounds(40, 10, 119, 24);
		contentPane.add(lblNewLabel_studentFind);
		lblNewLabel_studentFind.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JLabel lblNewLabel_StudentID = new JLabel("StudentID: ");
		lblNewLabel_StudentID.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_StudentID.setBounds(389, 44, 90, 44);
		contentPane.add(lblNewLabel_StudentID);
		
		JLabel lblNewLabel_birthPlace = new JLabel("BirthPlace: ");
		lblNewLabel_birthPlace.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_birthPlace.setBounds(40, 44, 85, 44);
		contentPane.add(lblNewLabel_birthPlace);
		
		textField_StudentID_find = new JTextField();
		textField_StudentID_find.setBounds(478, 51, 200, 35);
		contentPane.add(textField_StudentID_find);
		textField_StudentID_find.setColumns(10);
		
		JButton btnNewButton_find = new JButton("Find");
		btnNewButton_find.addActionListener(controllerqlsv);
		btnNewButton_find.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_find.setBounds(711, 56, 85, 21);
		contentPane.add(btnNewButton_find);
		
		JLabel lblNewLabel_list = new JLabel("Students List");
		lblNewLabel_list.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_list.setBounds(40, 98, 125, 50);
		contentPane.add(lblNewLabel_list);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Tahoma", Font.PLAIN, 10));
		scrollPane.setBounds(40, 143, 756, 118);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"No", "ID", "Name", "Place", "Date", "Sex", "Subject 1", "Subject 2", "Subject 3"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(27);
		table.getColumnModel().getColumn(1).setPreferredWidth(62);
		table.getColumnModel().getColumn(2).setPreferredWidth(124);
		table.getColumnModel().getColumn(3).setPreferredWidth(80);
		table.getColumnModel().getColumn(4).setPreferredWidth(88);
		table.getColumnModel().getColumn(5).setPreferredWidth(51);
		table.getColumnModel().getColumn(6).setPreferredWidth(55);
		table.getColumnModel().getColumn(7).setPreferredWidth(55);
		table.getColumnModel().getColumn(8).setPreferredWidth(55);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_Information = new JLabel("Student Information");
		lblNewLabel_Information.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_Information.setBounds(40, 280, 200, 24);
		contentPane.add(lblNewLabel_Information);
		
		JLabel lblNewLabel_ID = new JLabel("ID: ");
		lblNewLabel_ID.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_ID.setBounds(50, 314, 45, 13);
		contentPane.add(lblNewLabel_ID);
		
		JLabel lblNewLabel_Name = new JLabel("Name: ");
		lblNewLabel_Name.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_Name.setBounds(50, 351, 45, 13);
		contentPane.add(lblNewLabel_Name);
		
		JLabel lblNewLabel_BirthPlace = new JLabel("BirthPlace: ");
		lblNewLabel_BirthPlace.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_BirthPlace.setBounds(50, 383, 85, 27);
		contentPane.add(lblNewLabel_BirthPlace);
		
		JLabel lblNewLabel_Date = new JLabel("Date: ");
		lblNewLabel_Date.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_Date.setBounds(50, 430, 45, 13);
		contentPane.add(lblNewLabel_Date);
		
		JLabel lblNewLabel_subject1 = new JLabel("Subject 1: ");
		lblNewLabel_subject1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_subject1.setBounds(472, 305, 80, 30);
		contentPane.add(lblNewLabel_subject1);
		
		JLabel lblNewLabel_subject2 = new JLabel("Subject 2: ");
		lblNewLabel_subject2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_subject2.setBounds(472, 345, 80, 25);
		contentPane.add(lblNewLabel_subject2);
		
		JLabel lblNewLabel_subject3 = new JLabel("Subject 3: ");
		lblNewLabel_subject3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_subject3.setBounds(472, 383, 80, 27);
		contentPane.add(lblNewLabel_subject3);
		
		textField_ID = new JTextField();
		textField_ID.setBounds(124, 307, 180, 29);
		contentPane.add(textField_ID);
		textField_ID.setColumns(10);
		
		textField_Name = new JTextField();
		textField_Name.setBounds(124, 344, 180, 29);
		contentPane.add(textField_Name);
		textField_Name.setColumns(10);
		
		textField_subject1 = new JTextField();
		textField_subject1.setBounds(562, 307, 180, 29);
		contentPane.add(textField_subject1);
		textField_subject1.setColumns(10);
		
		textField_subject2 = new JTextField();
		textField_subject2.setBounds(562, 344, 180, 29);
		contentPane.add(textField_subject2);
		textField_subject2.setColumns(10);
		
		textField_subject3 = new JTextField();
		textField_subject3.setBounds(562, 383, 180, 29);
		contentPane.add(textField_subject3);
		textField_subject3.setColumns(10);
		
		JLabel lblNewLabel_sex = new JLabel("Sex: ");
		lblNewLabel_sex.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_sex.setBounds(472, 430, 45, 13);
		contentPane.add(lblNewLabel_sex);
		
		String[] gioiTinh = {"Male", "Female", "Other"};
		comboBox_gioiTinh = new JComboBox<String>();
		ArrayList<String> Sex = new ArrayList<String>();
		comboBox_gioiTinh.addItem("");
		for (String sex : gioiTinh) {
			Sex.add(sex);
			comboBox_gioiTinh.addItem(sex);
		}		
		comboBox_gioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_gioiTinh.setBounds(562, 424, 73, 29);
		contentPane.add(comboBox_gioiTinh);
		
		JButton btnNewButton_add = new JButton("Add");
		btnNewButton_add.addActionListener(controllerqlsv);
		btnNewButton_add.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_add.setBounds(65, 474, 85, 24);
		contentPane.add(btnNewButton_add);
		
		JButton btnNewButton_delete = new JButton("Delete");
		btnNewButton_delete.addActionListener(controllerqlsv);
		btnNewButton_delete.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_delete.setBounds(230, 474, 85, 24);
		contentPane.add(btnNewButton_delete);
		
		JButton btnNewButton_edit = new JButton("Edit");
		btnNewButton_edit.addActionListener(controllerqlsv);
		btnNewButton_edit.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_edit.setBounds(389, 474, 85, 24);
		contentPane.add(btnNewButton_edit);
		
		JButton btnNewButton_cancel = new JButton("Cancel");
		btnNewButton_cancel.addActionListener(controllerqlsv);
		btnNewButton_cancel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_cancel.setBounds(689, 474, 85, 24);
		contentPane.add(btnNewButton_cancel);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(40, 463, 756, 1);
		contentPane.add(separator_3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(40, 271, 761, 13);
		contentPane.add(separator_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(40, 100, 756, 1);
		contentPane.add(separator_1);
		
		comboBox_QueQuan = new JComboBox<String>();
		ArrayList<ModelTinhThiSinh> tenTinh  = ModelTinhThiSinh.getDSThiSinh();
		comboBox_QueQuan.addItem("");
		for (ModelTinhThiSinh TinhThiSinh : tenTinh) {
			comboBox_QueQuan.addItem(TinhThiSinh.getTenTinh());
		}
		comboBox_QueQuan.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_QueQuan.setBounds(124, 49, 200, 35);
		contentPane.add(comboBox_QueQuan);
		
		comboBox_QueQuan_1 = new JComboBox<String>();
		comboBox_QueQuan_1.addItem("");
		for (ModelTinhThiSinh TinhThiSinh : tenTinh) {
			comboBox_QueQuan_1.addItem(TinhThiSinh.getTenTinh());
		}
		comboBox_QueQuan_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_QueQuan_1.setBounds(124, 384, 180, 29);
		contentPane.add(comboBox_QueQuan_1);
		
		JButton btnNewButton_save = new JButton("Save");
		btnNewButton_save.addActionListener(controllerqlsv);
		btnNewButton_save.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_save.setBounds(542, 474, 85, 24);
		contentPane.add(btnNewButton_save);
		
		comboBox_day = new JComboBox<String>();
		comboBox_day.addItem("");
		for(int i = 1; i <= 31 ; i++) {
			comboBox_day.addItem(i+"");
		}
		
		comboBox_day.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_day.setBounds(124, 424, 35, 29);
		contentPane.add(comboBox_day);
		
		comboBox_month = new JComboBox<String>();
		comboBox_month.addItem("");
		for(int i = 1; i <= 12 ; i++) {
			comboBox_month.addItem(i+"");
		}
		comboBox_month.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_month.setBounds(185, 424, 35, 29);
		contentPane.add(comboBox_month);
		
		comboBox_year = new JComboBox<String>();
		comboBox_year.addItem("");
		Locale ld = new Locale("vi", "VN");
		Calendar cl = Calendar.getInstance(ld);
		int namHienTai = cl.get(Calendar.YEAR);
		for(int i = 1; i <= namHienTai ; i++) {
			comboBox_year.addItem(i+"");
		}
		
		comboBox_year.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_year.setBounds(249, 424, 55, 29);
		contentPane.add(comboBox_year);
		
		JLabel lblNewLabel = new JLabel("/");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 70));
		lblNewLabel.setBounds(163, 430, 45, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("/");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 70));
		lblNewLabel_1.setBounds(230, 430, 45, 18);
		contentPane.add(lblNewLabel_1);
	}
	
	public void AddTable(ModelThongTinSinhVien SV) {
		DefaultTableModel tablemodel = (DefaultTableModel) table.getModel();
		tablemodel.addRow(new Object[] {"", SV.getMaThiSinh(), SV.getTenThiSinh(), SV.getQueQuan().getTenTinh(), SV.getNgaySinh(), SV.getGioiTinh() ,SV.getDiemMon1(), SV.getDiemMon2(), SV.getDiemMon3()});
		for(int i = 0 ; i < table.getRowCount(); i++) {
			tablemodel.setValueAt(i+1, i, 0);
		}
		
	}


	public void LamTrangLuaChon() {
		textField_ID.setText("");
		textField_Name.setText("");
		comboBox_day.setSelectedIndex(0);
		comboBox_month.setSelectedIndex(0);
		comboBox_year.setSelectedIndex(0);
		textField_subject1.setText("");
		textField_subject2.setText("");
		textField_subject3.setText("");
		textField_StudentID_find.setText("");
		comboBox_gioiTinh.setSelectedIndex(0);
		comboBox_QueQuan.setSelectedIndex(0);
		comboBox_QueQuan_1.setSelectedIndex(0);
	}
	
	public ModelThongTinSinhVien DinhDangThiSinhSelect() {
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
		int SelectedItem = table.getSelectedRow();
		String ID_Select = tableModel.getValueAt(SelectedItem, 1)+"";
		String name_select = tableModel.getValueAt(SelectedItem, 2)+"";
		String date_select = (String) tableModel.getValueAt(SelectedItem, 4);
		Double subject1_select = Double.valueOf(tableModel.getValueAt(SelectedItem, 6)+"");
		Double subject2_select = Double.valueOf(tableModel.getValueAt(SelectedItem, 7)+"");
		Double subject3_select = Double.valueOf(tableModel.getValueAt(SelectedItem, 8)+"");
		String GioiTinh_Select = tableModel.getValueAt(SelectedItem, 5)+"";
		ModelTinhThiSinh Tinh_select = ModelTinhThiSinh.getTinhByTen(tableModel.getValueAt(SelectedItem, 3)+"");
		
		ModelThongTinSinhVien thiSinh_select = new ModelThongTinSinhVien(ID_Select, name_select, Tinh_select, date_select, GioiTinh_Select, subject1_select, subject2_select, subject3_select);
		return thiSinh_select;
	}
	
	public void hienThiLuaChon() {
		ModelThongTinSinhVien ThiSinhDuocChon = DinhDangThiSinhSelect(); 
		
		textField_ID.setText(ThiSinhDuocChon.getMaThiSinh());
		textField_Name.setText(ThiSinhDuocChon.getTenThiSinh());
		String[] chuoiDate = ThiSinhDuocChon.getNgaySinh().split("/");
		comboBox_day.setSelectedItem(chuoiDate[0]);
		comboBox_month.setSelectedItem(chuoiDate[1]);
		comboBox_year.setSelectedItem(chuoiDate[2]);
		textField_subject1.setText(ThiSinhDuocChon.getDiemMon1()+"");
		textField_subject2.setText(ThiSinhDuocChon.getDiemMon2()+"");
		textField_subject3.setText(ThiSinhDuocChon.getDiemMon3()+"");
		comboBox_gioiTinh.setSelectedItem(ThiSinhDuocChon.getGioiTinh());
		comboBox_QueQuan_1.setSelectedItem(ThiSinhDuocChon.getQueQuan().getTenTinh());
	}
	
	public void XoaDiMotCot() {
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
		int SelectedItem = table.getSelectedRow();
		tableModel.removeRow(SelectedItem);
		for(int i = 0 ; i < table.getRowCount(); i++) {
			tableModel.setValueAt(i+1, i, 0);
		}
	}
}
