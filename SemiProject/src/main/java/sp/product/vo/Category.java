package sp.product.vo;

public class Category {
	private int categoryNo;
	private String categoryName;
	private int categoryRef;
	private String fCategoryName;

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(int categoryNo, String categoryName, int categoryRef, String fCategoryName) {
		super();
		this.categoryNo = categoryNo;
		this.categoryName = categoryName;
		this.categoryRef = categoryRef;
		this.fCategoryName = fCategoryName;
	}

	public int getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(int categoryNo) {
		this.categoryNo = categoryNo;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getCategoryRef() {
		return categoryRef;
	}

	public void setCategoryRef(int categoryRef) {
		this.categoryRef = categoryRef;
	}

	public String getfCategoryName() {
		return fCategoryName;
	}

	public void setfCategoryName(String fCategoryName) {
		this.fCategoryName = fCategoryName;
	}

}
