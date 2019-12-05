package cn.pzw.pojo;

public class QueryVo {
	    //��ѯ����
		private String custName;
		private String custSource;
		private String custIndustry;
		private String custLevel;

		// ��ǰҳ����
		private Integer page = 1;
		// ���ݿ����һ�����ݿ�ʼ��
		private Integer start;
		// ÿҳ��ʾ��������
		private Integer rows = 5;
		
		public String getCustName() {
			return custName;
		}
		public void setCustName(String custName) {
			this.custName = custName;
		}
		public String getCustSource() {
			return custSource;
		}
		public void setCustSource(String custSource) {
			this.custSource = custSource;
		}
		public String getCustIndustry() {
			return custIndustry;
		}
		public void setCustIndustry(String custIndustry) {
			this.custIndustry = custIndustry;
		}
		public String getCustLevel() {
			return custLevel;
		}
		public void setCustLevel(String custLevel) {
			this.custLevel = custLevel;
		}
		public Integer getPage() {
			return page;
		}
		public void setPage(Integer page) {
			this.page = page;
		}
		public Integer getStart() {
			return start;
		}
		public void setStart(Integer start) {
			this.start = start;
		}
		public Integer getRows() {
			return rows;
		}
		public void setRows(Integer rows) {
			this.rows = rows;
		}
}
