package sp.product.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import sp.product.service.ProductService;
import sp.product.vo.Category;

/**
 * Servlet implementation class SubCategorySelectedServlet
 */
@WebServlet(name = "SubCategorySelected", urlPatterns = { "/subCategorySelected.do" })
public class SubCategorySelectedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubCategorySelectedServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 인코딩
		request.setCharacterEncoding("utf-8");
		// 2. 값 추출
		int categoryRef = Integer.parseInt(request.getParameter("categoryRef"));
		// 3. 비즈니스 로직
		ProductService service = new ProductService();
		ArrayList<Category> list = service.selectOneSubCategory(categoryRef);
		
		JSONArray categoryList = new JSONArray();
		if(!list.isEmpty()) {
			for(Category c : list) {
				JSONObject obj = new JSONObject();
				obj.put("categoryName", c.getCategoryName());
				obj.put("categoryNo", c.getCategoryNo());
				obj.put("categoryRef", c.getCategoryRef());
				categoryList.add(obj);
			}
		}
		
		// 4. 결과 처리
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.print(categoryList);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
