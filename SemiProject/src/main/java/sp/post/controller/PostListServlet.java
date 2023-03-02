package sp.post.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sp.post.service.PostService;
import sp.post.vo.PostPageData;

/**
 * Servlet implementation class PostListServlet
 */
@WebServlet(name = "PostList", urlPatterns = { "/postList.do" })
public class PostListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int reqPage = Integer.parseInt(request.getParameter("reqPage"));
		String memberId = request.getParameter("memberId");
		PostService service = new PostService();
		PostPageData ppd = service.selectPostList(reqPage,memberId);
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/post/postList.jsp");
		request.setAttribute("list", ppd.getList());
		request.setAttribute("start",ppd.getStart());
		request.setAttribute("pageNavi", ppd.getPageNavi());
		request.setAttribute("totalCount", ppd.getTotalCount());
		request.setAttribute("notRead", ppd.getNotRead());
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
