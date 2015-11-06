package ita;

import java.util.*;

public class PagingUtil {
	private int itemSize;
	private String pageLink;
	private int pageSize;
	private int maxPageNo;
	private int currentPageNo;
	private int beginIndex;
	private int endIndex;
	private int pageStartNo;
	private int pageEndNo;
	
	public PagingUtil() {}
	
	public PagingUtil(int itemSize, int pageSize, String currentPageNo, String link) {
		try {
			this.itemSize = itemSize;
			this.pageSize = pageSize;
			
			if (currentPageNo == null || currentPageNo.equals(""))
				this.currentPageNo = 1;
			else
				this.currentPageNo = Integer.parseInt(currentPageNo);
			
			maxPageNo = (int)((this.itemSize - 1) / pageSize) + 1;
			beginIndex = (this.currentPageNo - 1) * pageSize;
			endIndex = this.currentPageNo * pageSize - 1;
			
			if (endIndex > itemSize - 1)
				endIndex = itemSize - 1;
			
			pageStartNo = (int)((this.currentPageNo - 1) / 10) * 10 + 1;
			pageEndNo = pageStartNo + 9;
			
			if (pageEndNo > maxPageNo)
				pageEndNo = maxPageNo;
			
			pageLink = link;
		} catch (NumberFormatException e) {
			System.out.println("[오류:PageUtil생성자]현재 페이지 번호(currentPageNo)에 숫자가 아닌 값이 지정되었습니다.");
		}
	}
	public String getPageLink() {
		StringBuilder html = new StringBuilder();
		
		if (pageStartNo > 10)
			html.append("<a href='" + pageLink.replace("$", String.valueOf(pageStartNo - 1)) + "'>[이전]</a>");
		
		for(int i = pageStartNo ; i <= pageEndNo ; i++) {
			if (i != currentPageNo)
				html.append("<a href='" + pageLink.replace("$", String.valueOf(i)) + "'>[ " + i + " ]</a>");
			else
				html.append("<b>[ " + i + " ]</b>");
		}
		
		if (maxPageNo > pageEndNo)
			html.append("<a href='" + pageLink.replace("$", String.valueOf(pageEndNo + 1)) + "'>[다음]</a>");
		
		return html.toString();
	}
	public int getPageSize() {
		return pageSize;
	}
	public int getMaxPageNo() {
		return maxPageNo;
	}
	public int getCurrentPageNo() {
		return currentPageNo;
	}
	public int getBeginIndex() {
		return beginIndex;
	}
	public int getEndIndex() {
		return endIndex;
	}
}
