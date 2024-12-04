package constructor;

class constructor1 {
	private int id;
	private String name;
	private long num;
	public constructor1(int id, String name, long num) {
		this.id = id;
		this.name = name;
		this.num = num;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getNum() {
		return num;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public static void main(String[] args) {
		constructor1 c=new constructor1(1,"guru",987766666);
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getNum());
	}

	
		
	}



