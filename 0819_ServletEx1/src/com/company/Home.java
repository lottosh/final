package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
/////////////// 와우 대박

// 이거는 web.xml에서 url-pattern 설정안했을때 사용되는듯 (같이쓰니 에러남)
@WebServlet(urlPatterns ={"/hello","/hello1"}) // 애노테이션 설정으로 이 java파일(컨트롤러)로 올수있다
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		// response.getWriter() <== 이게 jsp에 out.println과 같다
		// 여기에 append를 통해서 값을 추가할 수 있다.
		//PrintWriter pw = response.getWriter();
		// PrintWriter는 파일할때
		
		//pw.print("abcd");
		// 웹브라우저에 쓰기 = out.println()
		
		// 그냥 여기까지 실행된다면 그것은 html이 아니고 웹브라우저에 그냥 글쓰기랑 같음
		// 하지만 우리는 html로 출력을 해야지 기타등등 기능을 쓸 수 있다
		// 그래서 우리가 보내는 저 글 정보를 html이라고 설정해 주어야 하고
		// 그렇게 한다면 웹브라우저는 html 형식으로 인식하고 처리해 줄 것이다
		
		// 설정은 전부 response를 통해서 한다
		// 500 페이지 17번째 줄부터~
		response.setContentType("text/html; charset=utf-8");
		// 이게 있어야 밑에 out으로 쓰는것들이 html 코드로 바뀜, 그리고 응답시 한글처리 
		
		
		PrintWriter out = response.getWriter();
//		out.println("<input type='text'>");
		
//		out.println("<html>");
//		out.println("<head><title>현재시간</title></head>");
//		out.println("<body>");
//		out.println("현재 시간은");
//		out.println(new Date());
//		out.println("입니다.");
//		out.println("</body></html>");
		
		
		out.println("<html>");
		out.println("<head><title>인사</title></head>");
		out.println("<body>");
		out.println("안녕하세요,");
		out.println(request.getParameter("name"));
		out.println("님");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
