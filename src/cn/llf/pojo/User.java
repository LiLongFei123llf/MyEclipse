package cn.llf.pojo;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class User {

	private Integer id; // id
	@NotEmpty(message = "不能为空")
	private String userCode; // 鐢ㄦ埛缂栫爜
	private String userName; // 鐢ㄦ埛鍚嶇О
	@NotEmpty(message = "不能为空")
	private String userPassword; // 鐢ㄦ埛瀵嗙爜
	private Integer gender; // 鎬у埆
	@Past(message="不能为空")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday; // 鍑虹敓鏃ユ湡
	private String phone; // 鐢佃瘽
	private String address; // 鍦板潃
	private Integer userRole; // 鐢ㄦ埛瑙掕壊
	private Integer createdBy; // 鍒涘缓鑰�
	private Date creationDate; // 鍒涘缓鏃堕棿
	private Integer modifyBy; // 鏇存柊鑰�
	private Date modifyDate; // 鏇存柊鏃堕棿
	
	/**
	 * 鐢ㄦ埛鐓х墖
	 */
	private String userPhoto;

	private String userRoleName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getUserRole() {
		return userRole;
	}

	public void setUserRole(Integer userRole) {
		this.userRole = userRole;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Integer getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}

	public String getUserRoleName() {
		return userRoleName;
	}

	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}

	
}
