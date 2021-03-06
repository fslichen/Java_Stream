package evolution.entity.sort;


public class AnyEntity {
	private String name;
	private Integer age;
	private Double salary;
	public AnyEntity(String name, Integer age, Double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public int compare(AnyEntity anyEntity) {
		return this.age - anyEntity.getAge();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
