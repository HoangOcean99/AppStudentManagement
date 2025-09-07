package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.zip.DataFormatException;
import javax.swing.JOptionPane;
import javax.xml.crypto.Data;

import Model.ModelQLSV;
import Model.ModelThongTinSinhVien;
import Model.ModelTinhThiSinh;
import View.ViewQLSV;

public class ControllerQLSV implements ActionListener{

	private ViewQLSV viewqlsv;
	private ModelThongTinSinhVien modelthongtinsinhvien_add;
	
	public ControllerQLSV(ViewQLSV viewqlsv) {
		this.viewqlsv = viewqlsv;
	}
	
	public ModelThongTinSinhVien getThongTinSinhView() {
		String ID_add = viewqlsv.textField_ID.getText().trim();
		String Name_add = viewqlsv.textField_Name.getText();
        String NgaySinh_add = viewqlsv.comboBox_day+"/"+viewqlsv.comboBox_month+"/"+viewqlsv.comboBox_year;
		Double s1_add = Double.valueOf(viewqlsv.textField_subject1.getText());
		Double s2_add = Double.valueOf(viewqlsv.textField_subject2.getText());
		Double s3_add = Double.valueOf(viewqlsv.textField_subject3.getText());
		String gioiTinh_Add = (String) viewqlsv.comboBox_gioiTinh.getSelectedItem();
		
	    int IDTinh = Integer.valueOf(viewqlsv.comboBox_QueQuan_1.getSelectedIndex());
		ModelTinhThiSinh tinhThiSinh = ModelTinhThiSinh.getTinhByID(IDTinh-1);
		
	    modelthongtinsinhvien_add = new ModelThongTinSinhVien(ID_add, Name_add, tinhThiSinh, NgaySinh_add, gioiTinh_Add, s1_add, s2_add, s3_add);
		return modelthongtinsinhvien_add;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		int luachon = JOptionPane.showConfirmDialog(viewqlsv, "Bạn chọn "+src+"? ", "Xác nhận", 2 ,1);
		if(luachon == JOptionPane.YES_OPTION) {
			if(src.equals("Cancel")) {
				viewqlsv.LamTrangLuaChon();
			}
			else if(src.equals("Add")) {
				try {
					ModelThongTinSinhVien modelthongtinsinhvien_add = getThongTinSinhView();
					if(viewqlsv.modelqlsv.KiemtraTonTai(modelthongtinsinhvien_add) == 0) {
						JOptionPane.showMessageDialog(viewqlsv, "Mã sinh viên đã tồn tại", "Thông báo", 1);
					}
					else if(viewqlsv.modelqlsv.KiemtraTonTai(modelthongtinsinhvien_add) == 1){
						viewqlsv.AddTable(modelthongtinsinhvien_add);
						viewqlsv.modelqlsv.add(modelthongtinsinhvien_add);
						viewqlsv.modelqlsv.inRa();
						viewqlsv.LamTrangLuaChon();
					}
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
		        }
			}
			else if(src.equals("Delete")) {
				viewqlsv.XoaDiMotCot();
				ModelThongTinSinhVien sinhVienXoaArray = viewqlsv.DinhDangThiSinhSelect();
				System.out.println(sinhVienXoaArray);
				viewqlsv.modelqlsv.delete(sinhVienXoaArray);
				viewqlsv.LamTrangLuaChon();
				
				viewqlsv.modelqlsv.inRa();
				
			}
			else if(src.equals("Edit")) {
				viewqlsv.hienThiLuaChon();
			}
			else if(src.equals("Save")) {
				try {
					ModelThongTinSinhVien modelthongtinsinhvien_add = getThongTinSinhView();
					viewqlsv.modelqlsv.add(modelthongtinsinhvien_add);
					viewqlsv.AddTable(modelthongtinsinhvien_add);
					viewqlsv.LamTrangLuaChon();
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
				}
			}
		}
    }
}

	

