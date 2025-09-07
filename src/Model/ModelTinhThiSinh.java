package Model;

import java.util.ArrayList;
import java.util.Iterator;

import View.ViewQLSV;

public class ModelTinhThiSinh {
	private int maTinh;
	private String  tenTinh;
	public ModelTinhThiSinh(int maTinh, String tenTinh) {
		super();
		this.maTinh = maTinh;
		this.tenTinh = tenTinh;
	}
	
	
	public ModelTinhThiSinh() {
	}


	public int getMaTinh() {
		return maTinh;
	}
	public void setMaTinh(int maTinh) {
		this.maTinh = maTinh;
	}
	public String getTenTinh() {
		return tenTinh;
	}
	public void setTenTinh(String tenTinh) {
		this.tenTinh = tenTinh;
	}
	
	public static ArrayList<ModelTinhThiSinh> getDSThiSinh(){
		String[] heThongTinh = {"Hà Nội\r\n"
				, "Vĩnh Phúc"
				, "Bắc Ninh"
				, "Quảng Ninh"
				, "Hải Dương"
				, "Hải Phòng"
				, "Hưng Yên"
				, "Thái Bình"
				, "Hà Nam"
				, "Nam Định"
				, "Ninh Bình"
				, "Hà Giang"
				, "Cao Bằng"
				, "Bắc Kạn"
				, "Tuyên Quang"
				, "Lào Cai"
				, "Yên Bái"
				, "Thái Nguyên"
				, "Lạng Sơn"
				, "Bắc Giang"
				, "Phú Thọ"
				, "Điện Biên"
				, "Lai Châu"
				, "Sơn La"
				, "Hoà Bình"
				, "Thanh Hoá"
				, "Nghệ An"
				, "Hà Tĩnh"
				, "Quảng Bình"
				, "Quảng Trị"
				, "Thừa Thiên Huế"
				, "Đà Nẵng"
				, "Quảng Nam"
				, "Quảng Ngãi"
				, "Bình Định"
				, "Phú Yên"
				, "Khánh Hoà"
				, "Ninh Thuận"
				, "Bình Thuận"
				, "Kon Tum"
				, "Gia Lai"
				, "Đắk Lắk"
				, "Đắk Nông"
				, "Lâm Đồng"
				, "Bình Phước"
				, "Tây Ninh"
				, "Bình Dương"
				, "Đồng Nai"
				, "Bà Rịa - Vũng Tàu"
				, "TP.Hồ Chí Minh"
				, "Long An"
				, "Tiền Giang"
				, "Bến Tre"
				, "Trà Vinh"
				, "Vĩnh Long"
				, "Đồng Tháp"
				, "An Giang"
				, "Kiên Giang"
				, "Cần Thơ"
				, "Hậu Giang"
				, "Sóc Trăng"
				, "Bạc Liêu"
				, "Cà Mau"};
		
		int i = 1;
		ArrayList<ModelTinhThiSinh> cacTinh = new ArrayList<ModelTinhThiSinh>();
		for (String Tinh : heThongTinh) {
			ModelTinhThiSinh MotTInh  = new ModelTinhThiSinh(i, Tinh);
			i++;
			cacTinh.add(MotTInh);
		}
		return cacTinh;
	}
	public static ModelTinhThiSinh getTinhByID(int IDTinh) {
		return ModelTinhThiSinh.getDSThiSinh().get(IDTinh);
	}
	
	public static ModelTinhThiSinh getTinhByTen(String TenTinh) {
		ArrayList<ModelTinhThiSinh> listTinh = ModelTinhThiSinh.getDSThiSinh();
		for (ModelTinhThiSinh modelTinhThiSinh : listTinh) {
			if(!modelTinhThiSinh.tenTinh.trim().equals(TenTinh.trim())) {
				return modelTinhThiSinh;
			}
		}
		return null;
	}

}
