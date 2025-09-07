package Model;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

public class ModelThongTinSinhVien {
	private String maThiSinh;
	private String tenThiSinh;
	private ModelTinhThiSinh QueQuan;
	private String ngaySinh;
	private String gioiTinh;
	private Double diemMon1;
	private Double diemMon2;
	private Double diemMon3;
	
	


	
	public ModelThongTinSinhVien(String maThiSinh, String tenThiSinh, ModelTinhThiSinh queQuan, String ngaySinh,
			String gioiTinh, Double diemMon1, Double diemMon2, Double diemMon3) {
		super();
		this.maThiSinh = maThiSinh;
		this.tenThiSinh = tenThiSinh;
		QueQuan = queQuan;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.diemMon1 = diemMon1;
		this.diemMon2 = diemMon2;
		this.diemMon3 = diemMon3;
	}
	public String getMaThiSinh() {
		return maThiSinh;
	}
	public void setMaThiSinh(String maThiSinh) {
		this.maThiSinh = maThiSinh;
	}
	public String getTenThiSinh() {
		return tenThiSinh;
	}
	public void setTenThiSinh(String tenThiSinh) {
		this.tenThiSinh = tenThiSinh;
	}
	public ModelTinhThiSinh getQueQuan() {
		return QueQuan;
	}
	public void setQueQuan(ModelTinhThiSinh queQuan) {
		QueQuan = queQuan;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public Double getDiemMon1() {
		return diemMon1;
	}
	public void setDiemMon1(Double diemMon1) {
		this.diemMon1 = diemMon1;
	}
	public Double getDiemMon2() {
		return diemMon2;
	}
	public void setDiemMon2(Double diemMon2) {
		this.diemMon2 = diemMon2;
	}
	public Double getDiemMon3() {
		return diemMon3;
	}
	public void setDiemMon3(Double diemMon3) {
		this.diemMon3 = diemMon3;
	}
	@Override
	public int hashCode() {
		return Objects.hash(QueQuan, diemMon1, diemMon2, diemMon3, gioiTinh, maThiSinh, ngaySinh, tenThiSinh);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModelThongTinSinhVien other = (ModelThongTinSinhVien) obj;
		return Objects.equals(QueQuan, other.QueQuan) && Objects.equals(diemMon1, other.diemMon1)
				&& Objects.equals(diemMon2, other.diemMon2) && Objects.equals(diemMon3, other.diemMon3)
				&& Objects.equals(gioiTinh, other.gioiTinh) && Objects.equals(maThiSinh, other.maThiSinh)
				&& Objects.equals(ngaySinh, other.ngaySinh) && Objects.equals(tenThiSinh, other.tenThiSinh);
	}
	@Override
	public String toString() {
		return "ModelThongTinSinhVien [maThiSinh=" + maThiSinh + ", tenThiSinh=" + tenThiSinh + ", QueQuan=" + QueQuan
				+ ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", diemMon1=" + diemMon1 + ", diemMon2="
				+ diemMon2 + ", diemMon3=" + diemMon3 + "]";
	}
	
	
}
