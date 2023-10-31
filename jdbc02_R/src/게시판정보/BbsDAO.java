package 게시판정보;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BbsDAO { 
	
	Connection con;
		
	public BbsDAO(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.커넥터 연결 성공!!");

			String url = "jdbc:mysql://localhost:3306/shop4?useUniCode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db연결 성공!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public BbsVO one(int no) {
		BbsVO bag = new BbsVO();
		try {
			String sql = "select * from bbs where no = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			System.out.println("3. 성공");

			ResultSet table = ps.executeQuery(); //'테이블'로 mysql로 받아온다.
			System.out.println("4. sql문 생성 성공!!");
			//System.out.println(table.next()); // table안에 데이터가 있으면 true.
			if (table.next()) { // table안에 검색결과인 row가 있는지 체크.
				int no2 = table.getInt("no"); //id는 컬럼명.
				String title = table.getString("title");
				String content = table.getString("content");
				String writer = table.getString("writer");
				System.out.println(no2);
				System.out.println(title);
				System.out.println(content);
				System.out.println(writer);
				bag.setNo(no2);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
			}else {
				System.out.println("검색 결과가 없음");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러발생함.!!!!");
		}
		return bag;
	} //one
	
	public void update(String title, String content, int no) {
		try {

			String sql = "update bbs set title = ?, content = ? where no= ?"; //왜2?
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title); //물음표 위치대로.
			ps.setString(2, content);
			ps.setInt(3, no);
			System.out.println("3. sql문 생성 성공!!");

			ps.execute();
			System.out.println("4. sql문 mysql로 전송 성공!!");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러발생함.!!!!");
		}

	} // delete

	public void delete(int no) {
		try {

			String sql = "delete from bbs where no = ?"; //왜1?
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			System.out.println("3. 성공");

			ps.execute();
			System.out.println("4. sql문 생성 성공!!");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러발생함.!!!!");
		}

	} // delete

	public void insert(String title, String content, String writer) {
		// Java-DB연결 (JDBC) 4단계
		// 1. 연결할 부품(커넥터, driver, 드라이버) 설정 품
		try {		
			String sql = "insert into bbs values (null, ?, ?, ?)"; //오토는 null로
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title); // 물음표 순서.
			ps.setString(2, content);
			ps.setString(3, writer);
			System.out.println("3. 성공");
			
			ps.execute();
			System.out.println("4. sql문 생성 성공!!");

		} catch (Exception e) { 
			e.printStackTrace(); 
			System.out.println("에러발생함.!!!!");
		}

	} // insert

} // class
