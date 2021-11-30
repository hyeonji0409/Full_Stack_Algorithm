package db4;

import java.sql.*;
import java.util.ArrayList;

public class ProductDAO {
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    public ProductDAO(){
        try {
            //JDBC Driver 클래스의 객체 생성 런타임시 로드
            //Class.forName("com.mysql.cj.jdbc.Driver");

            // 연결 주소, 사용자 계정, 패스워드 문자열 설정
            String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
            String user = "root";
            String pwd = "1234";

            // DB 연결하기 위한 객체 생성
            // DriverManager를 통해 Connection 객체 생성
            // MySQL 서버 연결 : 주소, 사용자 계정, 패스워드 전송
            con = DriverManager.getConnection(url, user, pwd);

            // Connection 객체가 생성되면 DB 연결 성공
            if(con != null) {
                System.out.println("DB 연결 성공!");
            }

        } catch (Exception e) {
            System.out.println("오류 발생!");
            e.printStackTrace();
        }
    }

    public ArrayList<ProductDTO> selectProduct() {

        ArrayList<ProductDTO> dataSet = null;

        try {
            String sql = "select * from product order by prdNo";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery(sql);

            while(rs.next()) {
                dataSet.add(new ProductDTO(rs.getString(1),
                                           rs.getString(2),
                                           rs.getInt(3),
                                           rs.getString(4),
                                           rs.getString(5),
                                           rs.getInt(6)
                        ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSet;
    }

    public void insertProduct(ProductDTO dto) {
        try {
            // sql문 작성
            String sql = "insert into product values(?,?,?,?,?,?)";

            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,dto.getPrdNo());
            pstmt.setString(2,dto.getPrdName());
            pstmt.setInt(3,dto.getPrdPrice());
            pstmt.setString(4,dto.getPrdMaker());
            pstmt.setString(5,dto.getPrdColor());
            pstmt.setInt(6,dto.getCtgNo());

            int result = pstmt.executeUpdate();

            if(result > 0) System.out.println("데이터 입력 성공");

        } catch (Exception e) {
            System.out.println("오류 발생");
            e.printStackTrace();
        }
    }
}
