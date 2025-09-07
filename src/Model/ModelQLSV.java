package Model;

import java.util.ArrayList;

public class ModelQLSV {
	private ArrayList<ModelThongTinSinhVien> QLSVl;

	public ModelQLSV() {
		this.QLSVl = new ArrayList<ModelThongTinSinhVien>();
	}
	

	public ModelQLSV(ArrayList<ModelThongTinSinhVien> qLSVl) {
		super();
		QLSVl = qLSVl;
	}


	public ArrayList<ModelThongTinSinhVien> getQLSVl() {
		return QLSVl;
	}

	public void setQLSVl(ArrayList<ModelThongTinSinhVien> qLSVl) {
		QLSVl = qLSVl;
	}
	
	public void add(ModelThongTinSinhVien thiSinh) {
		this.QLSVl.add(thiSinh);
	}
	
	public void delete(ModelThongTinSinhVien sinhVienXoaArray) {
			QLSVl.remove(sinhVienXoaArray);
	}
	
	public void update(ModelThongTinSinhVien thiSinh) {
		this.QLSVl.remove(thiSinh);
		this.QLSVl.add(thiSinh);
	}
	
	public int KiemtraTonTai(ModelThongTinSinhVien thiSinh) {
		int i = 0;
		for (ModelThongTinSinhVien SinhVien : QLSVl) {
			if(thiSinh.getMaThiSinh().trim().equals( SinhVien.getMaThiSinh().trim())) {
				i += 1;
			}
		}
		if(i == 0) {
			return 1;
		}
		else {
			return 0;
		}
	}	
	
	public void inRa() {
		for (ModelThongTinSinhVien modelThongTinSinhVien : QLSVl) {
			System.out.println(modelThongTinSinhVien);
		}
	}
}
