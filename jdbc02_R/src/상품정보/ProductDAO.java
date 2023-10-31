package 상품정보;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import 상품정보.ProductVO;

public class ProductDAO {

	public void insert(ProductVO bag) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.커넥터 연결 성공!!");

			String url = "jdbc:mysql://localhost:3306/shop4?useUniCode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db연결 성공!!");
			
			String sql = "insert into product values (?, ?, ?, ?, ?, ?)";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId()); 
			ps.setString(2, bag.getName());
			ps.setString(3, bag.getContent());
			ps.setInt(4, bag.getPrice());
			ps.setString(5, bag.getCompany());
			ps.setString(6, bag.getImg());
			System.out.println("3. 성공");
			
			int rowCount = ps.executeUpdate(); //insert문 실행한 row수 , 
			if (rowCount ==1) {
				System.out.println("상품 추가 성공!");
			}
			System.out.println("4. sql문 생성 성공!!");

		} catch (Exception e) { 
			e.printStackTrace(); 
			System.out.println("에러발생함.!!!!");
		}

	} // insert
	
	

	
	
	
	
	
	
	
	
	
	
	
	
}
