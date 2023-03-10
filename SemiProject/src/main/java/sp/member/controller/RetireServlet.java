package sp.member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sp.member.service.MemberService;
import sp.member.vo.Member;

/**
 * Servlet implementation class RetireServlet
 */
@WebServlet(name = "Retire", urlPatterns = { "/retire.do" })
public class RetireServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetireServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String memberPw= request.getParameter("memberPw");
		
		Member m = new Member();
		m.setMemberPw(memberPw);
		MemberService service = new MemberService();
		Member member = service.selectOneMemberPhone(m);
		
		PrintWriter out = response.getWriter();
		if (member == null) {
		
		}else {
			
			out.print(member.getMemberPw());
		}
	
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
