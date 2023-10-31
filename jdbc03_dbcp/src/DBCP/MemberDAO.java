package DBCP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MemberDAO { 
	
	//new를 이용해서 객체생성시 클래스이름과 동일한 메서드가 있으면 자동실행.
	Connection con;
	DBConnectionMgr dbcp;
	
	public MemberDAO() {
		//객체 생성시 자동호출되는 메서드 == 생성자 (메서드), construtor
		//jdbc 1-2단계
		try {
			dbcp = DBConnectionMgr.getInstance();
			con = dbcp.getConnection(); //임대
		} catch (Exception e) {
			System.out.println("에러발생!!");
		}
		
	}
	
	public MemberVO one(String id) {
		MemberVO bag = new MemberVO();
		try {		
			String sql = "select * from `member` m where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			System.out.println("3. 성공");
			ResultSet table = ps.executeQuery(); //'테이블'로 mysql로 받아온다.
			System.out.println("4. sql문 생성 성공!!");
			//System.out.println(table.next()); // table안에 데이터가 있으면 true.
			if (table.next()) { // table안에 검색결과인 row가 있는지 체크.
				String id2 = table.getString("id"); //id는 컬럼명.
				String pw = table.getString("pw");
				String name = table.getString("name");
				String tel = table.getString("tel");
				System.out.println(id2);
				System.out.println(pw);
				System.out.println(name);
				System.out.println(tel);
				bag.setId(id2);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
			}else {
				System.out.println("검색 결과가 없음");
			}
			dbcp.freeConnection(con, ps, table);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러발생함.!!!!");
		}
		return bag;  //리턴값은 메서드 닫기전에
	} //one
	
	
	public void update(String id, String tel) {
		try {
	
			String sql = "update member set tel = ? where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, tel); //물음표 위치대로.
			ps.setString(2, id);
			System.out.println("3. 성공");

			ps.execute();
			System.out.println("4. sql문 생성 성공!!");
			dbcp.freeConnection(con, ps);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러발생함.!!!!");
		}

	} 

	public int delete(String id) {
		int result = 0;
		try {
	
			String sql = "delete from member where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			System.out.println("3. 성공");

			result = ps.executeUpdate();
			System.out.println("4. sql문 생성 성공!!");
			dbcp.freeConnection(con, ps);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러발생함.!!!!");
		}
		return result;
	} // delete

	public int insert(MemberVO bag) {
		// Java-DB연결 (JDBC) 4단계
		// 1. 연결할 부품(커넥터, driver, 드라이버) 설정 품
		int result = 0;
		try {
			String sql = "insert into member values (?, ?, ?, ?)";
	
			PreparedStatement ps = con.prepareStatement(sql);		
			ps.setString(1, bag.getId()); // 1번 ?에 id를 넣어라.
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());
			System.out.println("3. 성공");
		
			result = ps.executeUpdate();
			System.out.println("4. sql문 생성 성공!!");
			dbcp.freeConnection(con, ps);
		} catch (Exception e) { 
			e.printStackTrace(); 
			System.out.println("에러발생함.!!!!");
		}
		return result;
	} // insert

} // class
