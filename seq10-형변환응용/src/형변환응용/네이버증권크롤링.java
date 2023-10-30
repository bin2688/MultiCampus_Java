package 형변환응용;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class 네이버증권크롤링 {

	public static void main(String[] args) {
		Connection conn = Jsoup.connect("http://www.naver.com"); //Connection
		System.out.println(conn);
		try {
			Document doc = conn.get(); //연결한 사이트에서 코드를 다 가지고 온다. html문서에 대한 코드 Document
			System.out.println(doc);
			 Elements list = doc.select("span"); //ArrayList -->상속 --> Elements
			 //조건에 맞는 태그들의 리스트를 객체 {태그, 태그, 태그, 태그, .....}
			 //Element == tag
			 //Elements == tag리스트 {tag, tag, tag, tag, .....}
			 System.out.println(list.size()); 
			 System.out.println(list);
			 for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).text()); 
				//<span></span>태그만 가져오고 .text으로 태그중에서 텍스트만추출
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
		}

}
