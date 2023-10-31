package 게시판정보;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BbsDAO { // member테이블에 crud를 하고 싶으면 MemberDAO를 사용하면됨.
	// DAO: db access object
	// shop4 db Member 테이블에 접근해서 처리하는 객체
	public void update(String title, String content, int no) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.커넥터 연결 성공!!");

			String url = "jdbc:mysql://localhost:3306/shop4?useUniCode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db연결 성공!!");

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
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.커넥터 연결 성공!!");

			String url = "jdbc:mysql://localhost:3306/shop4?useUniCode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db연결 성공!!");

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
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.커넥터 연결 성공!!");
			// 패키지.대표클래스
			// 외부자원연결(db, network, cpu, file,...)
			// 너무 위험한 상황!
			// 상황이 발생했을 때 어떻게 대처할지를 반드시 써주어야 함.
			// 2. 1번 설정을 커넥터로 db연결하고 승인
			// 1) url - ip + port + db명
			// 2) id, pw
			String url = "jdbc:mysql://localhost:3306/shop4?useUniCode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db연결 성공!!");
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "insert into bbs values (null, ?, ?, ?)"; //오토는 null로
			// String site = "www.naver.com";
			// 자바는 사이트라고 인식하지 않으니 해당 부품을 사용해야한다.
			// sql ==> PreparedStatement
			// site ==> URL
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title); // 물음표 순서.
			ps.setString(2, content);
			ps.setString(3, writer);
			System.out.println("3. 성공");
			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			ps.execute();
			System.out.println("4. sql문 생성 성공!!");

		} catch (Exception e) { // 전체 에러잡고싶을 땐 Exception.
			e.printStackTrace(); // 에러정보를 추적해서 프린트해줘.!
			System.out.println("에러발생함.!!!!");
		}

	} // insert

} // class
