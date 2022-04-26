package BT16;

import java.util.ArrayList;

/**
 * 	 Viết chương trình quản lý điểm cho sinh viên.
o	Lớp StudentManagement chứa danh sách sinh viên
o	Sinh viên (Student) chứa thông tin: tên sinh viên, mã số sinh viên, ngày tháng năm, danh sách điểm các môn học
o	Môn học (Subject) gồm tên môn học, mã môn học và điểm số
o	Các chức năng chính: 
•	Thêm sinh viên, 
•	Thêm điểm cho 1 sinh viên
•	Tính điểm trung bình
•	Tìm sinh viên theo họ tên và mã số sinh viên,
•	In danh sách sinh viên xắp xếp theo tên, theo điểm
o	Sử dụng ArrayList để lưu trữ danh sách.
o	Thông tin xuất ra màn hình là thông tin của sinh viên như: tên sinh viên, mã sinh viên và điểm trung bình. 

 * @author lethanhtam
 *
 */
public interface StudentManagament {
	public static ArrayList listStudent = new ArrayList();
	public void AddStudent();
	public void AddScores(Student a);
	public double AverageScores(Student a);
	public Student Find(String nameStudent);
	public Student Find(int idStudent);
	public String toString();
}
